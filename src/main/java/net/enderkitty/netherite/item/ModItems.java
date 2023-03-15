package net.enderkitty.netherite.item;

import net.enderkitty.netherite.Netherite;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Netherite.MOD_ID);

    public static final RegistryObject<Item> PLATED_DIAMOND = ITEMS.register("plated_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_CRYSTAL = ITEMS.register("reinforced_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL_CRYSTAL = ITEMS.register("celestial_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_CELESTIAL_CRYSTAL = ITEMS.register("cracked_celestial_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARD_CRYSTAL_FRAGMENT = ITEMS.register("hard_crystal_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIQUIDIZED_END_CRYSTAL = ITEMS.register("liquidized_end_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_FRAGMENT = ITEMS.register("nether_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SCRAP_PIECE = ITEMS.register("netherite_scrap_piece",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_CRYSTAL_DUST = ITEMS.register("reinforced_crystal_dust",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
