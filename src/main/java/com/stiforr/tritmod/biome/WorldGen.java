package com.stiforr.tritmod.biome;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.stiforr.tritmod.init.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGen implements IWorldGenerator


	{
	
		
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case -1:
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
	}

	private void generateEnd(World world, Random random, int i, int j) 
	{
		// TODO Auto-generated method stub
		
	}

	private void generateSurface(World world, Random random, int i, int j) 
	{
		for(int k = 0; k < 10; k++) 
		{
			int tritOreXCoord = i + random.nextInt(16);
			int tritOreYCoord = random.nextInt(20);
			int tritOreZCoord = j + random.nextInt(16);
			(new WorldGenMinable(ModBlocks.tritOre, 13)).generate(world, random, tritOreXCoord, tritOreYCoord, tritOreZCoord);
		}
		
	}

	private void generateNether(World world, Random random, int i, int j) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public static void init()
	{
		GameRegistry.registerWorldGenerator(new WorldGen(), 4);
	}

}
