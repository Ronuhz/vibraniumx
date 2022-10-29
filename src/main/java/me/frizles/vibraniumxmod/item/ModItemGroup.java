package me.frizles.vibraniumxmod.item;

import me.frizles.vibraniumxmod.VibraniumxMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup VIBRANIUM = FabricItemGroupBuilder.build(
            new Identifier(VibraniumxMod.MOD_ID, "vibranium"), () -> new ItemStack(ModItems.VIBRANIUM_INGOT));
}
