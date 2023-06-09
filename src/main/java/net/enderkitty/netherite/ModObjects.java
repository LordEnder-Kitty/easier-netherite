package net.enderkitty.netherite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModObjects {

    public static final Item PLATED_DIAMOND = registerItem("plated_diamond",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item REINFORCED_CRYSTAL = registerItem("reinforced_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CELESTIAL_CRYSTAL = registerItem("celestial_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CRACKED_CELESTIAL_CRYSTAL = registerItem("cracked_celestial_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item HARD_CRYSTAL_FRAGMENT = registerItem("hard_crystal_fragment",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item LIQUIDIZED_END_CRYSTAL = registerItem("liquidized_end_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item NETHER_FRAGMENT = registerItem("nether_fragment",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item NETHERITE_SCRAP_PIECE = registerItem("netherite_scrap_piece",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item REINFORCED_CRYSTAL_DUST = registerItem("reinforced_crystal_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Block BLOCK_OF_REINFORCED_CRYSTAL = registerBlock("block_of_reinforced_crystal",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).requiresTool()
                    .sounds(BlockSoundGroup.COPPER), UniformIntProvider.create(1, 10)), ItemGroup.MISC);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Netherite.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Netherite.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Netherite.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Netherite.LOGGER.debug("Registering blocks/items for Easier Netherite");
    }
}
