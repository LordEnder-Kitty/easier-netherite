package net.enderkitty.netherite;

import com.mojang.logging.LogUtils;
import net.enderkitty.netherite.block.ModBlocks;
import net.enderkitty.netherite.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Netherite.MOD_ID)
public class Netherite {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "netherite";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Netherite() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModBlocks.BLOCK_OF_REINFORCED_CRYSTAL);
            event.accept(ModItems.PLATED_DIAMOND);
            event.accept(ModItems.CELESTIAL_CRYSTAL);
            event.accept(ModItems.CRACKED_CELESTIAL_CRYSTAL);
            event.accept(ModItems.HARD_CRYSTAL_FRAGMENT);
            event.accept(ModItems.LIQUIDIZED_END_CRYSTAL);
            event.accept(ModItems.REINFORCED_CRYSTAL);
            event.accept(ModItems.REINFORCED_CRYSTAL_DUST);
            event.accept(ModItems.NETHER_FRAGMENT);
            event.accept(ModItems.NETHERITE_SCRAP_PIECE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
