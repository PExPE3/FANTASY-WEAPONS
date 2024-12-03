package net.kenddie.fantasyweapons.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static net.kenddie.fantasyweapons.item.ItemManager.itemManager;

public record DeclaredItem(ResourceLocation id) {

    public Item get() {
        return itemManager.getRegistered(id);
    }
}
