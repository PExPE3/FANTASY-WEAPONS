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

    public static final RegistryObject<Item> WEAPON_DARK_LORD_SWORD = ITEMS.register("weapon_dark_lord_sword", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_SUNSET_WINGS_CLAYMORE = ITEMS.register("weapon_sunset_wings_claymore", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_CHESS_BOARD_KNIGHT_POLEARM = ITEMS.register("weapon_chess_board_knight_polearm", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_HEFTY_CLUB = ITEMS.register("weapon_hefty_club", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_GOLDEN_HALBERD = ITEMS.register("weapon_golden_halberd", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_OLD_BROADSWORD = ITEMS.register("weapon_old_broadsword", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_OLD_DAGGER = ITEMS.register("weapon_old_dagger", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_OLD_BLADE = ITEMS.register("weapon_old_blade", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_KINGSLAAYER = ITEMS.register("weapon_kingslayer", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_CURSED_BLADE = ITEMS.register("weapon_cursed_blade", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_FURY_OF_THE_STORM = ITEMS.register("weapon_fury_of_the_storm", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_DRAGONS_DOOM = ITEMS.register("weapon_dragons_doom", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_CRIMSON_REAPER = ITEMS.register("weapon_crimson_reaper", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_SHARP_SWORD = ITEMS.register("weapon_sharp_sword", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_INFECTED_SHARP_SWORD = ITEMS.register("weapon_infected_sharp_sword", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_SHARP_CURVED_SWORD = ITEMS.register("weapon_sharp_curved_sword", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_INFECTED_SHARP_CURVED_SWORD = ITEMS.register("weapon_infected_sharp_curved_sword", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_SHARP_SPEAR = ITEMS.register("weapon_sharp_spear", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_INFECTED_SHARP_SPEAR = ITEMS.register("weapon_infected_sharp_spear", FWWeaponBasicItem::new);
    public static final RegistryObject<Item> WEAPON_BLACK_KATANA = ITEMS.register("weapon_black_katana", FWWeaponBasicItem::new);


    private FWItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}