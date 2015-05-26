package com.stiforr.tritmod.dimension;

import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry 
{
	public static void mainRegistry()
	{
		registerDimension();
	}
	
	public static final int dimensionID = 8;
	
	public static void registerDimension()
	{
		DimensionManager.registerProviderType(dimensionID, WorldProviderTrit.class, false);
		DimensionManager.registerDimension(dimensionID, dimensionID);
	}
	
}
