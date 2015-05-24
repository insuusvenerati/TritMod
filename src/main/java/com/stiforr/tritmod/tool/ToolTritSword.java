package com.stiforr.tritmod.tool;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.reference.Reference;

import net.minecraft.item.ItemSword;

public class ToolTritSword extends ItemSword
{

	public ToolTritSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setUnlocalizedName("tritSword");
		this.setTextureName(Reference.MOD_ID + ":" + "tritSword");
	}

}
