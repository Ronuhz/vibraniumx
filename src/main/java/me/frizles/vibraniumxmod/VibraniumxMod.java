package me.frizles.vibraniumxmod;

import me.frizles.vibraniumxmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VibraniumxMod implements ModInitializer {
    public static final String MOD_ID = "vibraniumxmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}