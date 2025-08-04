package com.example.tutonalmod;

import com.example.tutonalmod.block.ModBlocks;
import com.example.tutonalmod.item.ModItemGroups;
import com.example.tutonalmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutonalMod implements ModInitializer {
	public static final String MOD_ID = "tutonalmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//注册道具
		ModItems.registerModItems();
		//注册方块
		ModBlocks.registerModBlocks();
		//注册道具组
		ModItemGroups.registerModItemGroups();
	}
}