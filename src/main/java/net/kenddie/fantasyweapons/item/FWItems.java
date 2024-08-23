package net.kenddie.fantasyweapons.item;

import net.kenddie.fantasyweapons.FantasyWeapons;
import net.kenddie.fantasyweapons.item.weapon.lib.FWWeaponBasicItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class FWItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FantasyWeapons.MOD_ID);

    public static final RegistryObject<Item> BLAZING_STONE = ITEMS.register("blazing_stone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEAPON_FATES_BEACON = ITEMS.register("weapon_fates_beacon", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_DRAGONSLAYER_HALBERD = ITEMS.register("weapon_dragonslayer_halberd", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_ECLIPSE_SOLDIER_SPEAR = ITEMS.register("weapon_eclipse_soldier_spear", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_GOLDEN_HORNS_BATTLEAXE = ITEMS.register("weapon_golden_horns_battleaxe", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_HERO_CLAYMORE = ITEMS.register("weapon_hero_claymore", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_THIEF_DAGGER = ITEMS.register("weapon_thief_dagger", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_WANDERING_WIZARD_SWORD = ITEMS.register("weapon_wandering_wizard_sword", FWWeaponBasicItem::new);

    private FWItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}