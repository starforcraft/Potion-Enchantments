package com.Ultramega.PotionEnchantments.enchantments;

import com.Ultramega.PotionEnchantments.PotionEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = PotionEnchantments.MOD_ID)
public class PotionEnchantment extends Enchantment {

    public int maxLevel;
    public Effect effect;
    public RegistryObject<Enchantment> enchantment;
    public EquipmentSlotType[] slotTypes;
    public boolean cursed;

    public PotionEnchantment(Rarity rarity, EnchantmentType type, EquipmentSlotType[] slotTypes, int maxLevel, Effect effect, RegistryObject<Enchantment> enchantment, boolean cursed) {
        super(rarity, type, slotTypes);
        this.maxLevel = maxLevel;
        this.effect = effect;
        this.enchantment = enchantment;
        this.slotTypes = slotTypes;
        this.cursed = cursed;
    }

    @Override
    public int getMaxLevel() {
        return maxLevel;
    }

    @Override
    public boolean isTreasureOnly() {
        return true;
    }

    @Override
    public boolean isCurse() {
        return cursed;
    }

    private static final EquipmentSlotType[] allSlotTypes = new EquipmentSlotType[]{EquipmentSlotType.HEAD,
            EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET,
            EquipmentSlotType.MAINHAND, EquipmentSlotType.OFFHAND};

    @SubscribeEvent
    public static void giveEffect(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        for (EquipmentSlotType allSlots : allSlotTypes) {
            for(Enchantment e : EnchantmentHelper.getEnchantments(player.getItemBySlot(allSlots)).keySet()) {
                if (e instanceof PotionEnchantment) {
                    for (EquipmentSlotType slot : ((PotionEnchantment) e).slotTypes) {
                        ItemStack stack = player.getItemBySlot(slot);
                        int level = EnchantmentHelper.getItemEnchantmentLevel(((PotionEnchantment) e).enchantment.get(), stack);
                        if (player.hasItemInSlot(slot) && level > 0) {
                            player.addEffect(new EffectInstance(((PotionEnchantment) e).effect, 1, level - 1));
                        }
                    }
                }
            }
        }
    }
}
