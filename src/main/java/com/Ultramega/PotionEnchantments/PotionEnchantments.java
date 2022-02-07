package com.Ultramega.PotionEnchantments;

import com.Ultramega.PotionEnchantments.config.Config;
import com.Ultramega.PotionEnchantments.registry.ModEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("potionenchantments")
public class PotionEnchantments {
    public static final String MOD_ID = "potionenchantments";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public PotionEnchantments() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.common_config);
        Config.loadConfig(Config.common_config, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-common.toml").toString());

        ModEnchantments.ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEnchantments.init();
    }
}
