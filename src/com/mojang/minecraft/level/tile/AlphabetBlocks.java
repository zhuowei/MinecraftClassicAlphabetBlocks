package com.mojang.minecraft.level.tile;

import com.mojang.minecraft.level.tile.*;
import com.mojang.minecraft.AvailableBlockType;

public class AlphabetBlocks {

	public static final Block[] alphabetBlock = new Block[26];

	private static boolean hasInited = false;

	public static final int BEGIN_DATA_VALUE = 50;

	public static final int BEGIN_TEXTURE_VALUE = 80;

	public static void initBlocks() {
		if (hasInited) 
			return;
		for (int i = 0; i < 26; i++) {
			Block block = new Block(BEGIN_DATA_VALUE + i, BEGIN_TEXTURE_VALUE + i);
			block.a(Tile$SoundType.wood, 1.0F, 1.0F, 1.5F);
			alphabetBlock[i] = block;
		}
		hasInited = true;
	}

	public static void addBlocksToDisplayList() {
		if (!hasInited) 
			initBlocks();
		for (Block block : alphabetBlock) {
			AvailableBlockType.a.add(block);
		}
	}
}
