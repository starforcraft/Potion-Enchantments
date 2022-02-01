package com.Ultramega.PotionEnchantments.registry;

import com.Ultramega.PotionEnchantments.PotionEnchantments;
import com.Ultramega.PotionEnchantments.enchantments.PotionEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, PotionEnchantments.MOD_ID);

    private static final EquipmentSlotType[] ALL_ARMOR_SLOTS = new EquipmentSlotType[]{EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET};

    //Potions
    public static final RegistryObject<Enchantment> NIGHT_VISION = ENCHANTMENTS.register("night_vision", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_HEAD, new EquipmentSlotType[]{EquipmentSlotType.HEAD}, 1, Effects.NIGHT_VISION, ModEnchantments.NIGHT_VISION, false));
    public static final RegistryObject<Enchantment> INVISIBILITY = ENCHANTMENTS.register("invisibility", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_HEAD, new EquipmentSlotType[]{EquipmentSlotType.HEAD}, 1, Effects.INVISIBILITY, ModEnchantments.INVISIBILITY, false));
    public static final RegistryObject<Enchantment> JUMP = ENCHANTMENTS.register("jump", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{EquipmentSlotType.FEET}, 5, Effects.JUMP, ModEnchantments.JUMP, false));
    public static final RegistryObject<Enchantment> FIRE_RESISTANCE = ENCHANTMENTS.register("fire_resistance", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST, EquipmentSlotType.LEGS}, 1, Effects.FIRE_RESISTANCE, ModEnchantments.FIRE_RESISTANCE, false));
    public static final RegistryObject<Enchantment> MOVEMENT_SPEED = ENCHANTMENTS.register("movement_speed", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{EquipmentSlotType.FEET}, 5, Effects.MOVEMENT_SPEED, ModEnchantments.MOVEMENT_SPEED, false));
    public static final RegistryObject<Enchantment> WATER_BREATHING = ENCHANTMENTS.register("water_breathing", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_HEAD, new EquipmentSlotType[]{EquipmentSlotType.HEAD}, 1, Effects.WATER_BREATHING, ModEnchantments.WATER_BREATHING, false));
    public static final RegistryObject<Enchantment> HEALING = ENCHANTMENTS.register("healing", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.HEAL, ModEnchantments.HEALING, false));
    public static final RegistryObject<Enchantment> REGENERATION = ENCHANTMENTS.register("regeneration", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.REGENERATION, ModEnchantments.REGENERATION, false));
    public static final RegistryObject<Enchantment> STRENGTH = ENCHANTMENTS.register("strength", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.DAMAGE_BOOST, ModEnchantments.STRENGTH, false));
    public static final RegistryObject<Enchantment> LUCK = ENCHANTMENTS.register("luck", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.LUCK, ModEnchantments.LUCK, false));
    public static final RegistryObject<Enchantment> SLOW_FALLING = ENCHANTMENTS.register("slow_falling", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{EquipmentSlotType.FEET}, 5, Effects.SLOW_FALLING, ModEnchantments.SLOW_FALLING, false));

    //Cursed Potions
    public static final RegistryObject<Enchantment> SLOWNESS = ENCHANTMENTS.register("slowness", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{EquipmentSlotType.FEET}, 5, Effects.MOVEMENT_SLOWDOWN, ModEnchantments.SLOWNESS, true));
    public static final RegistryObject<Enchantment> HARMING = ENCHANTMENTS.register("harming", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.HARM, ModEnchantments.HARMING, true));
    public static final RegistryObject<Enchantment> POISON = ENCHANTMENTS.register("poison", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST, EquipmentSlotType.LEGS}, 5, Effects.POISON, ModEnchantments.POISON, true));
    public static final RegistryObject<Enchantment> WEAKNESS = ENCHANTMENTS.register("weakness", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.WEAKNESS, ModEnchantments.WEAKNESS, true));

    //Effects
    public static final RegistryObject<Enchantment> HASTE = ENCHANTMENTS.register("haste", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}, 5, Effects.DIG_SPEED, ModEnchantments.HASTE, false));
    public static final RegistryObject<Enchantment> RESISTANCE = ENCHANTMENTS.register("resistance", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.DAMAGE_RESISTANCE, ModEnchantments.RESISTANCE, false));
    public static final RegistryObject<Enchantment> HEALTH_BOOST = ENCHANTMENTS.register("health_boost", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 1, Effects.HEALTH_BOOST, ModEnchantments.HEALTH_BOOST, false));
    public static final RegistryObject<Enchantment> ABSORPTION = ENCHANTMENTS.register("absorption", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 1, Effects.ABSORPTION, ModEnchantments.ABSORPTION, false));
    public static final RegistryObject<Enchantment> SATURATION = ENCHANTMENTS.register("saturation", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.SATURATION, ModEnchantments.SATURATION, false));
    public static final RegistryObject<Enchantment> CONDUIT_POWER = ENCHANTMENTS.register("conduit_power", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 1, Effects.CONDUIT_POWER, ModEnchantments.CONDUIT_POWER, false));
    public static final RegistryObject<Enchantment> DOLPHINS_GRACE = ENCHANTMENTS.register("dolphins_grace", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 1, Effects.DOLPHINS_GRACE, ModEnchantments.DOLPHINS_GRACE, false));
    public static final RegistryObject<Enchantment> HERO_OF_THE_VILLAGE = ENCHANTMENTS.register("hero_of_the_village", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 3, Effects.HERO_OF_THE_VILLAGE, ModEnchantments.HERO_OF_THE_VILLAGE, false));

    //Cursed Effects
    public static final RegistryObject<Enchantment> MINING_FATIGUE = ENCHANTMENTS.register("mining_fatigue", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND}, 5, Effects.DIG_SLOWDOWN, ModEnchantments.MINING_FATIGUE, true));
    public static final RegistryObject<Enchantment> NAUSEA = ENCHANTMENTS.register("nausea", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_HEAD, new EquipmentSlotType[]{EquipmentSlotType.HEAD}, 5, Effects.CONFUSION, ModEnchantments.NAUSEA, true));
    public static final RegistryObject<Enchantment> BLINDNESS = ENCHANTMENTS.register("blindness", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_HEAD, new EquipmentSlotType[]{EquipmentSlotType.HEAD}, 5, Effects.BLINDNESS, ModEnchantments.BLINDNESS, true));
    public static final RegistryObject<Enchantment> HUNGER = ENCHANTMENTS.register("hunger", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.HUNGER, ModEnchantments.HUNGER, true));
    public static final RegistryObject<Enchantment> WITHER = ENCHANTMENTS.register("wither", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.WITHER, ModEnchantments.WITHER, true));
    public static final RegistryObject<Enchantment> GLOWING = ENCHANTMENTS.register("glowing", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 1, Effects.GLOWING, ModEnchantments.GLOWING, true));
    public static final RegistryObject<Enchantment> LEVITATION = ENCHANTMENTS.register("levitation", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{EquipmentSlotType.FEET}, 5, Effects.LEVITATION, ModEnchantments.LEVITATION, true));
    public static final RegistryObject<Enchantment> UNLUCK = ENCHANTMENTS.register("unluck", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 5, Effects.UNLUCK, ModEnchantments.UNLUCK, true));
    public static final RegistryObject<Enchantment> BAD_OMEN = ENCHANTMENTS.register("bad_omen", () -> new PotionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new EquipmentSlotType[]{EquipmentSlotType.CHEST}, 3, Effects.BAD_OMEN, ModEnchantments.BAD_OMEN, true));
}
