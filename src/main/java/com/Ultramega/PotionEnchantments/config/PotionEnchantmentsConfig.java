package com.Ultramega.PotionEnchantments.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class PotionEnchantmentsConfig {

    public static ForgeConfigSpec.IntValue ALL_ENCHANTMENTS_MAX_LEVEL;

    public static void init(ForgeConfigSpec.Builder common) {
        common.comment("Potion Enchantments Options");

        ALL_ENCHANTMENTS_MAX_LEVEL = common
                .comment("\nThe maximum level of the enchantments")
                .defineInRange("allEnchantmentsMaxLevel", 5, 1, Integer.MAX_VALUE);
    }
}