package com.stiforr.tritmod.tool;

import net.minecraft.item.ItemSpade;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.reference.Reference;

public class ToolTritShovel extends ItemSpade
{

	public ToolTritShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setUnlocalizedName("tritShovel");
		this.setTextureName(Reference.MOD_ID + ":" + "tritShovel");
	}

}
