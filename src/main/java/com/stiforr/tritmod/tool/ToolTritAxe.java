package com.stiforr.tritmod.tool;

import net.minecraft.item.ItemAxe;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.reference.Reference;

public class ToolTritAxe extends ItemAxe
{

	public ToolTritAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setUnlocalizedName("tritAxe");
		this.setTextureName(Reference.MOD_ID + ":" + "tritAxe");
	}

}
