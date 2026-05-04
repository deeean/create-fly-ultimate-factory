package com.deeean.createflyessential;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateFlyEssential implements ModInitializer {
    public static final String MOD_ID = "create_fly_essential";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Create: Fly Essential loaded!");
    }
}
