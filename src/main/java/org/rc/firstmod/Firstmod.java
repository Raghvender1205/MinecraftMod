package org.rc.firstmod;

import net.fabricmc.api.ModInitializer;
import org.rc.firstmod.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Firstmod implements ModInitializer {

    public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        LOGGER.info("Firstmod initialized");
    }
}
