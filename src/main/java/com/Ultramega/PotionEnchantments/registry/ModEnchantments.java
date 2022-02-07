package com.Ultramega.PotionEnchantments.registry;

import com.Ultramega.PotionEnchantments.PotionEnchantments;
import com.Ultramega.PotionEnchantments.config.PotionEnchantmentsConfig;
import com.Ultramega.PotionEnchantments.enchantments.PotionEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = PotionEnchantments.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, PotionEnchantments.MOD_ID);

    public static void init() {
        for (Effect effect : ForgeRegistries.POTIONS) {
            ENCHANTMENTS.register(effect.getDescriptionId(), () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, new EquipmentSlotType[]{EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET, EquipmentSlotType.MAINHAND, EquipmentSlotType.OFFHAND}, PotionEnchantmentsConfig.ALL_ENCHANTMENTS_MAX_LEVEL.get(), effect, new ResourceLocation(PotionEnchantments.MOD_ID, effect.getDescriptionId()), effect.getCategory() == EffectType.HARMFUL));
        }
    }
}
