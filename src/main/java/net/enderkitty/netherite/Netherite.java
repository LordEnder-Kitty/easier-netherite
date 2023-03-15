package net.enderkitty.netherite;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Netherite implements ModInitializer {
	public static final String MOD_ID = "netherite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModObjects.registerModItems();
	}
}
