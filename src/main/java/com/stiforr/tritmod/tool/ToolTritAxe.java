package com.stiforr.tritmod.tool;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.reference.Reference;

import net.minecraft.item.ItemAxe;

public class ToolTritAxe extends ItemAxe
{

	public ToolTritAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setUnlocalizedName("tritAxe");
		this.setTextureName(Reference.MOD_ID + ":" + "tritAxe");
	}

}
