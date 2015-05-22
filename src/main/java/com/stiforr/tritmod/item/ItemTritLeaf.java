package com.stiforr.tritmod.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemTritLeaf extends ItemTrit
{
	public ItemTritLeaf()
	{
		super();
		this.setUnlocalizedName("tritLeaf");
		
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("Make some leaf soup!");
	}
}
