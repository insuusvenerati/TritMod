package com.stiforr.tritmod.block;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;

public class BlockTritOre extends BlockTrit
{
	public BlockTritOre()
	{
		super();
		this.setBlockName("tritOre");
		this.setHardness(3.0F);
		this.setStepSound(soundTypePiston);
		this.setHarvestLevel("pickaxe", 2);
	}
}
