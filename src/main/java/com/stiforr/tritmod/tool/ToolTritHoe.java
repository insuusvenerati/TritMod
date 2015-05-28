package com.stiforr.tritmod.tool;

import net.minecraft.item.ItemHoe;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.reference.Reference;

public class ToolTritHoe extends ItemHoe
{

	public ToolTritHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setUnlocalizedName("tritHoe");
		this.setTextureName(Reference.MOD_ID + ":" + "tritHoe");
	}

}
