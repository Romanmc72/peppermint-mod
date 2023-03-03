package com.r0m4n.peppermintmod;

import com.mojang.logging.LogUtils;
import com.r0m4n.peppermintmod.block.ModBlocks;
import com.r0m4n.peppermintmod.item.ModItems;

import net.minecraft.world.item.CreativeModeTab;
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

@Mod(PeppermintMod.MOD_ID)
public class PeppermintMod {
    public static final String MOD_ID = "peppermintmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PeppermintMod() {
        LOGGER.debug("Initializing the mod '{}'...", PeppermintMod.MOD_ID);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.debug("The mod '{}' is initialized!", PeppermintMod.MOD_ID);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        CreativeModeTab tab = event.getTab();
        if (tab == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.PEPPERMINT);
        } else if (tab == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.CANDY_CANE);
        } else if (tab == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(ModBlocks.PEPPERMINT_BLOCK);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
