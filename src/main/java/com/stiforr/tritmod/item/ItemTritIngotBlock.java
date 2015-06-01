package com.stiforr.tritmod.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.stiforr.tritmod.block.BlockTrit;
import com.stiforr.tritmod.creativetab.CreativeTabTrit;

public class ItemTritIngotBlock extends BlockTrit
{
	
	public ItemTritIngotBlock() {
		super();
		this.setBlockName("tritIngotBlock");
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setStepSound(soundTypeMetal);				
	}

	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("PINK");
	}
	
	
}
