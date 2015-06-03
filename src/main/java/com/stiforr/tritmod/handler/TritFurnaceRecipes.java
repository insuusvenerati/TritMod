package com.stiforr.tritmod.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.stiforr.tritmod.init.ModBlocks;
import com.stiforr.tritmod.init.ModItems;


public class TritFurnaceRecipes 
{
	private static final TritFurnaceRecipes SMELTING_BASE = new TritFurnaceRecipes();

	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();

	public static TritFurnaceRecipes smelting() {
		return SMELTING_BASE;
	}
	
	private TritFurnaceRecipes(){
		this.addRecipie(ModBlocks.tritOre, new ItemStack(ModItems.tritIngot), 0.8F);
		
	}
	
	public void addRecipie(Block block, ItemStack itemstack, float experience){
		this.addLists(block, itemstack, experience);
	}
	
	public void addLists(Block block, ItemStack itemstack, float experience){
		this.putLists(new ItemStack(block, 1, 32767), itemstack, experience);
	}
	
	public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience){
		this.smeltingList.put(itemstack, itemstack2);
		this.experienceList.put(itemstack2, Float.valueOf(experience));
	}

	public ItemStack getSmeltingResult(ItemStack itemstack) {
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;

		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Entry) iterator.next();
		} while (!canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		return (ItemStack) entry.getValue();
	}

	private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
		return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
	}
	
	public float giveExperience(ItemStack itemstack){
		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;
		
		do{
			if(!iterator.hasNext()){
				return 0.0f;
			}
			
			entry = (Entry) iterator.next();
		}
		while(!this.canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		
		if(itemstack.getItem().getSmeltingExperience(itemstack) != -1){
				return itemstack.getItem().getSmeltingExperience(itemstack);
		}
		
		return ((Float) entry.getValue()).floatValue();
	}
}
