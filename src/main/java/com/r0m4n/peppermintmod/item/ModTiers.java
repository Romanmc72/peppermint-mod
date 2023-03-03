package com.r0m4n.peppermintmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
  public static final ForgeTier CANDY = new ForgeTier(
    4,
    100,
    12,
    3,
    30,
    BlockTags.NEEDS_DIAMOND_TOOL,
    () -> Ingredient.of(ModItems.PEPPERMINT.get())
  );
}
