package net.enderkitty.netherite;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Netherite implements ModInitializer {
	public static final String MOD_ID = "netherite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModObjects.registerModObjects();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
			content.addAfter(Items.NETHERITE_INGOT, ModObjects.PLATED_DIAMOND);
			content.addAfter(ModObjects.PLATED_DIAMOND, ModObjects.REINFORCED_CRYSTAL);
			content.addAfter(ModObjects.REINFORCED_CRYSTAL, ModObjects.CELESTIAL_CRYSTAL);
			content.addAfter(ModObjects.CELESTIAL_CRYSTAL, ModObjects.CRACKED_CELESTIAL_CRYSTAL);
			content.addAfter(ModObjects.CRACKED_CELESTIAL_CRYSTAL, ModObjects.HARD_CRYSTAL_FRAGMENT);
			content.addAfter(ModObjects.HARD_CRYSTAL_FRAGMENT, ModObjects.LIQUIDIZED_END_CRYSTAL);
			content.addAfter(ModObjects.LIQUIDIZED_END_CRYSTAL, ModObjects.NETHER_FRAGMENT);
			content.addAfter(ModObjects.NETHER_FRAGMENT, ModObjects.NETHERITE_SCRAP_PIECE);
			content.addAfter(ModObjects.NETHERITE_SCRAP_PIECE, ModObjects.REINFORCED_CRYSTAL_DUST);
			content.addAfter(ModObjects.REINFORCED_CRYSTAL_DUST, ModObjects.BLOCK_OF_REINFORCED_CRYSTAL);
		});
	}
}
