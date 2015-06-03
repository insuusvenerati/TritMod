package com.stiforr.tritmod.init;

import net.minecraft.block.Block;

import com.stiforr.tritmod.biome.WorldGen;
import com.stiforr.tritmod.block.BlockTrit;
import com.stiforr.tritmod.block.BlockTritOre;
import com.stiforr.tritmod.block.TritFurnace;
import com.stiforr.tritmod.block.TritPortal;
import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.item.ItemTritIngotBlock;
import com.stiforr.tritmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockTrit tritOre = new BlockTritOre();
	public static Block tritPortal;
	public static Block tritIngotBlock = new ItemTritIngotBlock().setHardness(5.0F).setResistance(10.0F);
	public static Block tritFurnace;
	public static Block tritFurnaceActive;
	
	
	
	public static void init()
	{
		GameRegistry.registerBlock(tritOre, "tritOre");
		GameRegistry.registerWorldGenerator(new WorldGen(), 4);
		GameRegistry.registerBlock(tritPortal, "tritPortal");
		GameRegistry.registerBlock(tritIngotBlock, "tritBlock");
		GameRegistry.registerBlock(tritFurnace, "tritFurnace");
		GameRegistry.registerBlock(tritFurnaceActive, "tritFurnaceActive");
		
		
		
	}
	
	public static void initBlocks()
	{
		tritPortal = new TritPortal();
		tritFurnace = new TritFurnace(false).setBlockName("TritFurnace").setCreativeTab(CreativeTabTrit.Trit_Tab);
		tritFurnaceActive = new TritFurnace(true).setBlockName("TritFurnaceActive");
		
		
		
	}
	
}
