package com.stiforr.tritmod.biome;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import com.stiforr.tritmod.init.ModBlocks;

public class TritBiomeTrit extends BiomeGenBase
{

	public TritBiomeTrit(int id) {
		super(id);
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		
		
		
		this.topBlock = Blocks.grass;
		this.fillerBlock = ModBlocks.tritOre;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));
		
	}

}
