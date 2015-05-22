package com.stiforr.tritmod.init;

import com.stiforr.tritmod.item.ItemTrit;
import com.stiforr.tritmod.item.ItemTritLeaf;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemTrit tritLeaf = new ItemTritLeaf();
	
	public static void init()
	{
		GameRegistry.registerItem(tritLeaf, "tritLeaf");
	}
}
