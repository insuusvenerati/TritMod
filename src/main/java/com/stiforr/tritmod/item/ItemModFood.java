package com.stiforr.tritmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.stiforr.tritmod.TritMod;
import com.stiforr.tritmod.reference.Reference;

public class ItemModFood extends ItemFood 
	{

	private PotionEffect[] effects;

	public ItemModFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) 
	{
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName("tritTea");
		this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.effects = effects;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) 
		{
		super.onFoodEaten(stack, world, player);

		for (int i = 0; i < this.effects.length; i++) 
		{
			if (!world.isRemote && this.effects[i] != null && this.effects[i].getPotionID() > 0)
				player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
		}
	}
}
