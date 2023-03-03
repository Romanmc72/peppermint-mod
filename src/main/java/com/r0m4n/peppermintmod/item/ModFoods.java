package com.r0m4n.peppermintmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
  public static final FoodProperties CANDY = (
    new FoodProperties.Builder()
  )
    .nutrition(3)
    .saturationMod(0.1f)
    .fast()
    .build();
}