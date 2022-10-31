package me.frizles.vibraniumxmod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SuperHeartShapedHerbItem extends Item {
    public SuperHeartShapedHerbItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
