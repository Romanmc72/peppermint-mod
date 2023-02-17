package com.r0m4n.tutorialmod.item;

import com.r0m4n.tutorialmod.TutorialMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
    ForgeRegistries.ITEMS,
    TutorialMod.MOD_ID
  );

  public static final RegistryObject<Item> BUTTS = ITEMS.register(
    "butts",
    () -> new Item(new Item.Properties())
  );

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}