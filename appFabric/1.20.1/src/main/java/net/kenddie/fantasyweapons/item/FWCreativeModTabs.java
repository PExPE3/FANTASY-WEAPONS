package net.kenddie.fantasyweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kenddie.fantasyweapons.FantasyWeapons;
import net.minecraft.core.Registry;
        import net.minecraft.core.registries.BuiltInRegistries;
        import net.minecraft.network.chat.Component;
        import net.minecraft.resources.ResourceLocation;
        import net.minecraft.world.item.CreativeModeTab;
        import net.minecraft.world.item.ItemStack;

@SuppressWarnings("WeakerAccess")
public class FWCreativeModTabs {
    public static final CreativeModeTab FANTASY_WEAPONS_TAB = FabricItemGroup.builder().icon(() -> new ItemStack(FWItems.WEAPON_ECLIPSE_SOLDIER_SPEAR)).title(Component.translatable("itemGroup." + FantasyWeapons.MOD_ID + ".fw_tab")).displayItems((context, populator) -> {
        for (var item : FWItems.ITEMS) {
            populator.accept(item);
        }
    }).build();

    private FWCreativeModTabs() {
    }

    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(FantasyWeapons.MOD_ID, ".fw_tab"), FANTASY_WEAPONS_TAB);
    }
}