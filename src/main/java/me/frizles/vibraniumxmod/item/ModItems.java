package me.frizles.vibraniumxmod.item;

import me.frizles.vibraniumxmod.VibraniumxMod;
import me.frizles.vibraniumxmod.block.ModBlocks;
import me.frizles.vibraniumxmod.item.custom.SuperHeartShapedHerbItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item VIBRANIUM_INGOT = registerItem("vibranium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

    public static final Item HEART_SHAPED_HERB = registerItem("heart_shaped_herb",
            new AliasedBlockItem(ModBlocks.HEART_SHAPED_HERB_BUSH,
                    (new FabricItemSettings()).group(ModItemGroup.VIBRANIUM)
                            .food(new FoodComponent.Builder().hunger(6).saturationModifier(4f).build())));

    public static Item SUPER_HEART_SHAPED_HERB = registerItem("super_heart_shaped_herb",
            new SuperHeartShapedHerbItem(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VibraniumxMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VibraniumxMod.LOGGER.debug("Registering Mod items for " + VibraniumxMod.MOD_ID);
    }
}
