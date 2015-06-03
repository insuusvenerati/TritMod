package com.stiforr.tritmod.tileentity;

import com.stiforr.tritmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class TritTileEntity 
{
	public static void mainRegistry()
	{
		registerTileEntity();
	}

	private static void registerTileEntity() 
	{
		GameRegistry.registerTileEntity(TileEntityTritChest.class, Reference.MOD_ID);
		
	}
}
