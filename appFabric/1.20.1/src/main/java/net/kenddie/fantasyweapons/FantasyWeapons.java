package net.kenddie.fantasyweapons;

import net.fabricmc.api.ModInitializer;
import net.kenddie.fantasyweapons.item.FWCreativeModTabs;
import net.kenddie.fantasyweapons.item.FWItems;


public class FantasyWeapons implements ModInitializer {
	public static final String MOD_ID = "fantasy_weapons";

	@Override
	public void onInitialize() {
		FWItems.register();
		FWCreativeModTabs.register();
	}
}