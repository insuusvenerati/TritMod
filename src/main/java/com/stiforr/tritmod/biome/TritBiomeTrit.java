package com.stiforr.tritmod.biome;

import com.stiforr.tritmod.init.ModBlocks;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

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
