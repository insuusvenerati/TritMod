package com.stiforr.tritmod.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;


public class ItemTritDust extends ItemTrit 
{
	public ItemTritDust()
	{
		super();
		this.setUnlocalizedName("tritDust");
		this.maxStackSize = 64;
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("WIP");
	}
	
}
