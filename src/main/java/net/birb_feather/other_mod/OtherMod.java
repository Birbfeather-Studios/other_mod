package net.birb_feather.other_mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OtherMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("other-mod");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}