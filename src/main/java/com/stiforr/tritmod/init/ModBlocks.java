package com.stiforr.tritmod.init;

import net.minecraft.block.Block;

import com.stiforr.tritmod.WorldGen;
import com.stiforr.tritmod.block.BlockTrit;
import com.stiforr.tritmod.block.BlockTritOre;
import com.stiforr.tritmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockTrit tritOre = new BlockTritOre();
	public static Block tritPortal;
	
	
	public static void init()
	{
		GameRegistry.registerBlock(tritOre, "tritOre");
		GameRegistry.registerWorldGenerator(new WorldGen(), 4);
		GameRegistry.registerBlock(tritPortal, "tritPortal");
		
	}
	
	public static void initBlocks()
	{
		tritPortal = new TritPortal();
	}
	
}
