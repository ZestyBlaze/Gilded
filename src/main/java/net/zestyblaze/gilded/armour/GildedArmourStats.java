package net.zestyblaze.gilded.armour;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import org.jetbrains.annotations.NotNull;

public class GildedArmourStats implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};

    @Override
    public int getDurability(@NotNull EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 38;
    }
    @Override
    public int getProtectionAmount(@NotNull EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 20;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
    @Override
    public String getName() {
        return "gilded";
    }
    @Override
    public float getToughness() {
        return 3.0F;
    }
    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }
}
