package com.stiforr.tritmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

import com.stiforr.tritmod.init.ModItems;

public class EntityTritMob extends EntityAnimal{

	public EntityTritMob(World world) {
		super(world);
		setSize(1, 2);
		preventEntitySpawning = true;
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.0D));
		this.tasks.addTask(2, new EntityAITempt(this, 1.0D, ModItems.tritLeaf, false));
		this.tasks.addTask(3, new EntityAIFollowParent(this, 1.1D));
	}
	
	public EntityTritMob(World world, double x, double y, double z) {
		this(world);
		setPosition(x, y, z);
	}
	
	public boolean isAIEnabled() {
		return true;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return new EntityTritMob(worldObj);
	}

}
