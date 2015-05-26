package com.stiforr.tritmod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeRegistry 
{
	public static void MainClass()
	{
		initBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeTrit;
	
	public static void initBiome()
	{
		biomeTrit = new TritBiomeTrit(156).setBiomeName("Trit").setTemperatureRainfall(1.2F, 0.9F);
	}
	
	public static void registerBiome()
	{
		BiomeDictionary.registerBiomeType(biomeTrit, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeTrit);
	}
	
	
}
