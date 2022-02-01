package com.Ultramega.PotionEnchantments;

import com.Ultramega.PotionEnchantments.registry.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("potionenchantments")
public class PotionEnchantments {
    public static final String MOD_ID = "potionenchantments";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public PotionEnchantments() {
        RegistryHandler.init();
    }
}
