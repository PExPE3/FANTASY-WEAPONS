package net.kenddie.fantasyweapons.item;

import net.kenddie.fantasyweapons.FantasyWeapons;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FWCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FantasyWeapons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FANTASY_WEAPONS_TAB =
            CREATIVE_MODE_TABS.register(
                    "fw_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(FWItems.WEAPON_ECLIPSE_SOLDIER_SPEAR.get()))
                            .title(Component.translatable("itemGroup." + FantasyWeapons.MOD_ID + ".fw_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(FWItems.BLAZING_STONE.get());
                                pOutput.accept(FWItems.WEAPON_FATES_BEACON.get());
                                pOutput.accept(FWItems.WEAPON_DRAGONSLAYER_HALBERD.get());
                                pOutput.accept(FWItems.WEAPON_ECLIPSE_SOLDIER_SPEAR.get());
                                pOutput.accept(FWItems.WEAPON_HERO_CLAYMORE.get());
                                pOutput.accept(FWItems.WEAPON_THIEF_DAGGER.get());
                                pOutput.accept(FWItems.WEAPON_GOLDEN_HORNS_BATTLEAXE.get());
                                pOutput.accept(FWItems.WEAPON_WANDERING_WIZARD_SWORD.get());
                            })
                            .build()
            );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
