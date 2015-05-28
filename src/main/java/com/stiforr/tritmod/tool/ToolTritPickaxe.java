package com.stiforr.tritmod.tool;

import net.minecraft.item.ItemPickaxe;

import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.reference.Reference;

public class ToolTritPickaxe extends ItemPickaxe
{

	public ToolTritPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTrit.Trit_Tab);
		this.setUnlocalizedName("tritPickaxe");
		this.setTextureName(Reference.MOD_ID + ":" + "tritPickaxe");
	}

}
