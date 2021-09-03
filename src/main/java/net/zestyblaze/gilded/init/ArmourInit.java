package net.zestyblaze.gilded.init;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.gilded.GildedMod;
import net.zestyblaze.gilded.armour.GildedArmourStats;

public class ArmourInit {

    public static final ArmorMaterial GILDED_NETHERITE = new GildedArmourStats();

    public static final Item GILDED_NETHERITE_HELMET = new ArmorItem(
            GILDED_NETHERITE,
            EquipmentSlot.HEAD,
            new Item.Settings()
                    .group(ItemGroup.COMBAT)
                    .fireproof()
    );

    public static final Item GILDED_NETHERITE_CHESTPLATE = new ArmorItem(
            GILDED_NETHERITE,
            EquipmentSlot.CHEST,
            new Item.Settings()
                    .group(ItemGroup.COMBAT)
                    .fireproof()
    );

    public static final Item GILDED_NETHERITE_LEGGINGS = new ArmorItem(
            GILDED_NETHERITE,
            EquipmentSlot.LEGS,
            new Item.Settings()
                    .group(ItemGroup.COMBAT)
                    .fireproof()
    );

    public static final Item GILDED_NETHERITE_BOOTS = new ArmorItem(
            GILDED_NETHERITE,
            EquipmentSlot.FEET,
            new Item.Settings()
                    .group(ItemGroup.COMBAT)
                    .fireproof()
    );

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(GildedMod.MOD_ID, "gilded_netherite_helmet"), GILDED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(GildedMod.MOD_ID, "gilded_netherite_chestplate"), GILDED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(GildedMod.MOD_ID, "gilded_netherite_leggings"), GILDED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(GildedMod.MOD_ID, "gilded_netherite_boots"), GILDED_NETHERITE_BOOTS);
    }
}
