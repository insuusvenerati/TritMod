package com.stiforr.tritmod.dimension;

import com.stiforr.tritmod.biome.BiomeRegistry;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTrit extends WorldProvider
{

	public void RegisterWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeTrit, 1.2F);
		this.dimensionId = DimensionRegistry.dimensionID;
	}
	
	public IChunkProvider createChunkGeneration()
	{
		return null;
	}
	
	@Override
	public String getDimensionName() {
		
		return "Trit";
	}
	
}
