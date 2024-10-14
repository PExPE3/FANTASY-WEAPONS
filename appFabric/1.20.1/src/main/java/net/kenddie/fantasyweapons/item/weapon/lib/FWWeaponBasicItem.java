package net.kenddie.fantasyweapons.item.weapon.lib;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class FWWeaponBasicItem extends SwordItem {
    public FWWeaponBasicItem() {
        super(Tiers.NETHERITE, 3, -2.4f, new Item.Properties());
    }
}