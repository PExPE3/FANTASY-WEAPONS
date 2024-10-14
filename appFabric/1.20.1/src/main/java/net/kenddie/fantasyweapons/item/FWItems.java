package net.kenddie.fantasyweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kenddie.fantasyweapons.FantasyWeapons;
import net.kenddie.fantasyweapons.item.weapon.lib.FWWeaponBasicItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.Collection;

public final class FWItems {
    public static final Collection<Item> ITEMS = new ArrayList<>();

    public static final Item BLAZING_STONE = new Item(new FabricItemSettings());
    public static final Item WEAPON_FATES_BEACON = new FWWeaponBasicItem();
    public static final Item WEAPON_DRAGONSLAYER_HALBERD = new FWWeaponBasicItem();
    public static final Item WEAPON_ECLIPSE_SOLDIER_SPEAR = new FWWeaponBasicItem();
    public static final Item WEAPON_GOLDEN_HORNS_BATTLEAXE = new FWWeaponBasicItem();
    public static final Item WEAPON_HERO_CLAYMORE = new FWWeaponBasicItem();
    public static final Item WEAPON_THIEF_DAGGER = new FWWeaponBasicItem();
    public static final Item WEAPON_WANDERING_WIZARD_SWORD = new FWWeaponBasicItem();
    public static final Item WEAPON_DARK_LORD_SWORD = new FWWeaponBasicItem();
    public static final Item WEAPON_SUNSET_WINGS_CLAYMORE = new FWWeaponBasicItem();
    public static final Item WEAPON_CHESS_BOARD_KNIGHT_POLEARM = new FWWeaponBasicItem();
    public static final Item WEAPON_HEFTY_CLUB = new FWWeaponBasicItem();
    public static final Item WEAPON_GOLDEN_HALBERD = new FWWeaponBasicItem();
    public static final Item WEAPON_OLD_BROADSWORD = new FWWeaponBasicItem();
    public static final Item WEAPON_OLD_DAGGER = new FWWeaponBasicItem();
    public static final Item WEAPON_OLD_BLADE = new FWWeaponBasicItem();
    public static final Item WEAPON_KINGSLAYER = new FWWeaponBasicItem();
    public static final Item WEAPON_CURSED_BLADE = new FWWeaponBasicItem();
    public static final Item WEAPON_FURY_OF_THE_STORM = new FWWeaponBasicItem();
    public static final Item WEAPON_DRAGONS_DOOM = new FWWeaponBasicItem();
    public static final Item WEAPON_CRIMSON_REAPER = new FWWeaponBasicItem();
    public static final Item WEAPON_SHARP_SWORD = new FWWeaponBasicItem();
    public static final Item WEAPON_INFECTED_SHARP_SWORD = new FWWeaponBasicItem();
    public static final Item WEAPON_SHARP_CURVED_SWORD = new FWWeaponBasicItem();
    public static final Item WEAPON_INFECTED_SHARP_CURVED_SWORD = new FWWeaponBasicItem();
    public static final Item WEAPON_SHARP_SPEAR = new FWWeaponBasicItem();
    public static final Item WEAPON_INFECTED_SHARP_SPEAR = new FWWeaponBasicItem();
    public static final Item WEAPON_BLACK_KATANA = new FWWeaponBasicItem();

    private FWItems() {
    }

    public static void register() {
        register("blazing_stone", BLAZING_STONE);
        register("weapon_fates_beacon", WEAPON_FATES_BEACON);
        register("weapon_dragonslayer_halberd", WEAPON_DRAGONSLAYER_HALBERD);
        register("weapon_eclipse_soldier_spear", WEAPON_ECLIPSE_SOLDIER_SPEAR);
        register("weapon_golden_horns_battleaxe", WEAPON_GOLDEN_HORNS_BATTLEAXE);
        register("weapon_hero_claymore", WEAPON_HERO_CLAYMORE);
        register("weapon_thief_dagger", WEAPON_THIEF_DAGGER);
        register("weapon_wandering_wizard_sword", WEAPON_WANDERING_WIZARD_SWORD);
        register("weapon_dark_lord_sword", WEAPON_DARK_LORD_SWORD);
        register("weapon_sunset_wings_claymore", WEAPON_SUNSET_WINGS_CLAYMORE);
        register("weapon_chess_board_knight_polearm", WEAPON_CHESS_BOARD_KNIGHT_POLEARM);
        register("weapon_hefty_club", WEAPON_HEFTY_CLUB);
        register("weapon_golden_halberd", WEAPON_GOLDEN_HALBERD);
        register("weapon_old_broadsword", WEAPON_OLD_BROADSWORD);
        register("weapon_old_dagger", WEAPON_OLD_DAGGER);
        register("weapon_old_blade", WEAPON_OLD_BLADE);
        register("weapon_kingslayer", WEAPON_KINGSLAYER);
        register("weapon_cursed_blade", WEAPON_CURSED_BLADE);
        register("weapon_fury_of_the_storm", WEAPON_FURY_OF_THE_STORM);
        register("weapon_dragons_doom", WEAPON_DRAGONS_DOOM);
        register("weapon_crimson_reaper", WEAPON_CRIMSON_REAPER);
        register("weapon_sharp_sword", WEAPON_SHARP_SWORD);
        register("weapon_infected_sharp_sword", WEAPON_INFECTED_SHARP_SWORD);
        register("weapon_sharp_curved_sword", WEAPON_SHARP_CURVED_SWORD);
        register("weapon_infected_sharp_curved_sword", WEAPON_INFECTED_SHARP_CURVED_SWORD);
        register("weapon_sharp_spear", WEAPON_SHARP_SPEAR);
        register("weapon_infected_sharp_spear", WEAPON_INFECTED_SHARP_SPEAR);
        register("weapon_black_katana", WEAPON_BLACK_KATANA);
    }

    private static void register(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FantasyWeapons.MOD_ID, name), item);
        ITEMS.add(item);
    }
}