package net.kenddie.fantasyweapons.handlers;

import net.kenddie.fantasyweapons.FantasyWeapons;
import net.kenddie.fantasyweapons.item.FWItems;
import net.kenddie.fantasyweapons.model.EpicBakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

public class FWEventHandler {
    private static final Map<ModelResourceLocation, ModelResourceLocation> COMPLIANCES = new HashMap<>();

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    @SuppressWarnings("MethodMayBeStatic")
    public void onRegisterAdditional(ModelEvent.RegisterAdditional event) {
        for (var registryObject : FWItems.ITEMS.getEntries()) {
            var itemName = registryObject.get().getDescriptionId().substring("item.fantasy_weapons.".length());
            var largeJsonPath = String.format("/assets/fantasy_weapons/models/item/%s_large.json", itemName);

            try (var inputStream = FantasyWeapons.class.getResourceAsStream(largeJsonPath)) {
                if (inputStream != null) {
                    var smallResourceName = String.format("%s", itemName);
                    var largeResourceName = String.format("%s_large", itemName);

                    var smallResourceLocation = new ResourceLocation("fantasy_weapons", smallResourceName);
                    var largeResourceLocation = new ResourceLocation("fantasy_weapons", largeResourceName);

                    var smallModelResourceLocation = new ModelResourceLocation(smallResourceLocation, "inventory");
                    var largeModelResourceLocation = new ModelResourceLocation(largeResourceLocation, "inventory");

                    COMPLIANCES.put(smallModelResourceLocation, largeModelResourceLocation);

                    event.register(largeModelResourceLocation);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    @SuppressWarnings("MethodMayBeStatic")
    public void onModifyBakingResult(ModelEvent.ModifyBakingResult event) {
        var models = event.getModels();
        for (var compliance : COMPLIANCES.entrySet()) {
            var smallModelResourceLocation = compliance.getKey();
            var smallBakedModel = models.get(smallModelResourceLocation);
            if (smallBakedModel != null) {
                var largeModelResourceLocation = compliance.getValue();
                var largeBakedModel = models.get(largeModelResourceLocation);
                if (largeBakedModel != null) {
                    var epicBakedModel = new EpicBakedModel(smallBakedModel, largeBakedModel);
                    models.put(smallModelResourceLocation, epicBakedModel);
                }
            }
        }
    }
}