package net.glossy.tools;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlossyTools implements ModInitializer {
	public static final String MOD_ID = "glossytools";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("g world!");
	}
}