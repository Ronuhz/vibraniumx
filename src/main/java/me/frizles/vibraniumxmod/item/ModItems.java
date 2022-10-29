package me.frizles.vibraniumxmod.item;

import me.frizles.vibraniumxmod.VibraniumxMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item VIBRANIUM_INGOT = registerItem("vibranium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.VIBRANIUM)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VibraniumxMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VibraniumxMod.LOGGER.debug("Registering Mod items for " + VibraniumxMod.MOD_ID);
    }
}
