package com.Ultramega.PotionEnchantments.config;

import com.Ultramega.PotionEnchantments.PotionEnchantments;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

import java.io.File;

@Mod.EventBusSubscriber(modid = PotionEnchantments.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    public static final ForgeConfigSpec common_config;

    private static final ForgeConfigSpec.Builder common_builder = new ForgeConfigSpec.Builder();

    static {
        PotionEnchantmentsConfig.init(common_builder);
        common_config = common_builder.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        PotionEnchantments.LOGGER.info("Loading config: " + path);
        CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        PotionEnchantments.LOGGER.info("Built config: " + path);
        file.load();
        PotionEnchantments.LOGGER.info("Loaded config: " + path);
        config.setConfig(file);
    }

    @SubscribeEvent
    public static void onLoad(ModConfig.Loading event) {
        PotionEnchantments.LOGGER.debug("Loaded config file {}", event.getConfig().getFileName());
    }

    @SubscribeEvent
    public static void onFileChange(ModConfig.Reloading event) {
        PotionEnchantments.LOGGER.debug("Config {} just got changed on the file system!", event.getConfig().getFileName());
    }
}