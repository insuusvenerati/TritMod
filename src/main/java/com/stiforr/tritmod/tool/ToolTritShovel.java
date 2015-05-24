package com.stiforr.tritmod.tool;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.reference.Reference;

import net.minecraft.item.ItemSpade;

public class ToolTritShovel extends ItemSpade
{

	public ToolTritShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setUnlocalizedName("tritShovel");
		this.setTextureName(Reference.MOD_ID + ":" + "tritShovel");
	}

}
