package me.frizles.vibraniumxmod.world.feature;

import me.frizles.vibraniumxmod.VibraniumxMod;
import me.frizles.vibraniumxmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEPSLATE_VIBRANIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_VIBRANIUM_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_VIBRANIUM_ORE =
            ConfiguredFeatures.register("deepslate_vibranium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DEEPSLATE_VIBRANIUM_ORE, 9));
    public static void registerConfiguredFeatures() {
        VibraniumxMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + VibraniumxMod.MOD_ID);
    }
}
