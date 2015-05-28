package com.stiforr.tritmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.stiforr.tritmod.init.ModItems;
import com.stiforr.tritmod.reference.Reference;

public class CreativeTabTrit 
{
	public static CreativeTabs Trit_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		
		@Override
		public Item getTabIconItem() 
		{
			// TODO Auto-generated method stub
			return ModItems.tritLeaf;
		}
		
	};
}
