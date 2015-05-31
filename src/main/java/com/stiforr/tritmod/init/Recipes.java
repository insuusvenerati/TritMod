package com.stiforr.tritmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init()
	{
		
		// Item Recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.tritCup), "   ", "s s", " s ", 's', new ItemStack(Items.stick));
		
		// Ore/Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.tritOre, new ItemStack(ModItems.tritIngot, 1), 1.0F);
		
		
		// Food Recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.tritTea), "ct ", "b  ", "   ", 'c', new ItemStack(ModItems.tritCup), 't', new ItemStack(ModItems.tritLeaf), 'b', new ItemStack(Items.potionitem));
		
		// Tools Recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.tritAxe), "ii ", "is ", " s ", 'i', new ItemStack(ModItems.tritIngot), 's', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.tritHoe), "ii ", " s ", " s ", 'i', new ItemStack(ModItems.tritIngot), 's', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.tritPickaxe), "iii", " s ", " s ", 'i', new ItemStack(ModItems.tritIngot), 's', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.tritShovel), " i ", " s ", " s ", 'i', new ItemStack(ModItems.tritIngot), 's', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.tritSword), " i ", " i ", " s ", 'i', new ItemStack(ModItems.tritIngot), 's', new ItemStack(Items.stick));
		
		// Armor Recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.tritHelmet), 
														"   ",		
														"iii",
														"i i",
														'i', new ItemStack(ModItems.tritIngot));
		
		GameRegistry.addRecipe(new ItemStack(ModItems.tritChest), 
														"i i",
														"iii",
														"iii",
														'i', new ItemStack(ModItems.tritIngot));
		
		GameRegistry.addRecipe(new ItemStack(ModItems.tritLegs), 
														"iii",
														"i i",
														"i i",
														'i', new ItemStack(ModItems.tritIngot));
		
		GameRegistry.addRecipe(new ItemStack(ModItems.tritBoots), 
														"   ",
														"i i",
														"i i",
														'i', new ItemStack(ModItems.tritIngot));
		
	}
}