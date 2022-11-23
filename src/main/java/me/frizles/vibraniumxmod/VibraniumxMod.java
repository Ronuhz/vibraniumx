package me.frizles.vibraniumxmod;

import me.frizles.vibraniumxmod.block.ModBlocks;
import me.frizles.vibraniumxmod.item.ModItems;
import me.frizles.vibraniumxmod.world.feature.ModConfiguredFeatures;
import me.frizles.vibraniumxmod.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VibraniumxMod implements ModInitializer {
    public static final String MOD_ID = "vibraniumxmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfiguredFeatures.registerConfiguredFeatures();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModOreGeneration.generateOres();
    }
}
