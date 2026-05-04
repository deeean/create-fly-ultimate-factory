package com.deeean.createflyultimatefactory;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateFlyUltimateFactory implements ModInitializer {
    public static final String MOD_ID = "create_fly_ultimate_factory";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Create: Ultimate Factory Fly recipes loaded!");
    }
}
