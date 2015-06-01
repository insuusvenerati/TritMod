package com.stiforr.tritmod.init;

import net.minecraft.block.Block;

import com.stiforr.tritmod.WorldGen;
import com.stiforr.tritmod.block.BlockTrit;
import com.stiforr.tritmod.block.BlockTritOre;
import com.stiforr.tritmod.item.ItemTritIngotBlock;
import com.stiforr.tritmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockTrit tritOre = new BlockTritOre();
	public static Block tritPortal;
	public static Block tritIngotBlock = new ItemTritIngotBlock().setHardness(5.0F).setResistance(10.0F);
	
	
	public static void init()
	{
		GameRegistry.registerBlock(tritOre, "tritOre");
		GameRegistry.registerWorldGenerator(new WorldGen(), 4);
		GameRegistry.registerBlock(tritPortal, "tritPortal");
		GameRegistry.registerBlock(tritIngotBlock, "tritBlock");
		
	}
	
	public static void initBlocks()
	{
		tritPortal = new TritPortal();
	}
	
}
