package net.zestyblaze.gilded;

import net.fabricmc.api.ModInitializer;
import net.zestyblaze.gilded.init.ArmourInit;

public class GildedMod implements ModInitializer {
	public static String MOD_ID = "gilded";

	@Override
	public void onInitialize() {
		ArmourInit.register();
	}
}
