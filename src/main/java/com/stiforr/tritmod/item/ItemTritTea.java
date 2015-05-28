package com.stiforr.tritmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.init.ModItems;
import com.stiforr.tritmod.reference.Reference;

public class ItemTritTea extends ItemFood
{

	public ItemTritTea(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite) 
	{
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName("tritTea");
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setTextureName(Reference.MOD_ID + ":" + "tritTea");
		this.setMaxStackSize(5);
		
	}
	
	public EnumAction getItemUseAction(ItemStack itemstack)
	{
		return EnumAction.drink;
	}
	
	@Override
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
	{
		super.onEaten(itemstack, world, player);
		return new ItemStack(ModItems.tritCup);
		
	}
}
