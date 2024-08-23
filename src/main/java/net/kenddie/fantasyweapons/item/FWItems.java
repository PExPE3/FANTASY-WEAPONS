package net.kenddie.fantasyweapons.item;

import net.kenddie.fantasyweapons.FantasyWeapons;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class FWItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FantasyWeapons.MOD_ID);

    public static final RegistryObject<Item> BLAZING_STONE = ITEMS.register("blazing_stone", () -> new Item(new Item.Properties()));

    private FWItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}