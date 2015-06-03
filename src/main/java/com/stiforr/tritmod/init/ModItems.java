package com.stiforr.tritmod.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import com.stiforr.tritmod.TritMod;
import com.stiforr.tritmod.armor.TritArmor;
import com.stiforr.tritmod.creativetab.CreativeTabTrit;
import com.stiforr.tritmod.item.ItemTrit;
import com.stiforr.tritmod.item.ItemTritCup;
import com.stiforr.tritmod.item.ItemTritDust;
import com.stiforr.tritmod.item.ItemTritIngot;
import com.stiforr.tritmod.item.ItemTritLeaf;
import com.stiforr.tritmod.item.ItemTritTea;
import com.stiforr.tritmod.reference.Reference;
import com.stiforr.tritmod.tool.ToolTritAxe;
import com.stiforr.tritmod.tool.ToolTritHoe;
import com.stiforr.tritmod.tool.ToolTritPickaxe;
import com.stiforr.tritmod.tool.ToolTritShovel;
import com.stiforr.tritmod.tool.ToolTritSword;

import cpw.mods.fml.common.registry.GameRegistry;



public class ModItems 
{
	
	//Tool Materials
	public static final Item.ToolMaterial tritToolMaterial = EnumHelper.addToolMaterial("tritToolMaterial", 3, 500, 7.0F, 2.0F, 14);
	
	// Armor Material
	public static final ItemArmor.ArmorMaterial tritArmorMaterial = EnumHelper.addArmorMaterial("tritArmor", 25, new int[]{3, 8, 6, 3}, 20);
	
	// Items
	public static final ItemTrit tritLeaf = new ItemTritLeaf();
	public static final Item tritCup = new ItemTritCup();
	public static final ItemTritTea tritTea = new ItemTritTea("tritTea", 4, 0.3F, false);
	public static final ItemTrit tritIngot = new ItemTritIngot();
	public static final ItemTrit tritDust = new ItemTritDust();
	
	
	// Armor
	public static Item tritHelmet = new TritArmor(tritArmorMaterial, TritMod.proxy.addArmor("tritArmor"), 0).setUnlocalizedName("tritHelmet").setCreativeTab(CreativeTabTrit.Trit_Tab).setTextureName(Reference.MOD_ID + ":tritHelmet");
	public static Item tritArmorChest = new TritArmor(tritArmorMaterial, TritMod.proxy.addArmor("tritArmor"), 1).setUnlocalizedName("tritArmorChest").setCreativeTab(CreativeTabTrit.Trit_Tab).setTextureName(Reference.MOD_ID + ":tritArmorChest");
	public static Item tritLegs = new TritArmor(tritArmorMaterial, TritMod.proxy.addArmor("tritArmor"), 2).setUnlocalizedName("tritLegs").setCreativeTab(CreativeTabTrit.Trit_Tab).setTextureName(Reference.MOD_ID + ":tritLegs");
	public static Item tritBoots = new TritArmor(tritArmorMaterial, TritMod.proxy.addArmor("tritArmor"), 3).setUnlocalizedName("tritBoots").setCreativeTab(CreativeTabTrit.Trit_Tab).setTextureName(Reference.MOD_ID + ":tritBoots");
	
	// Tools
	public static final ToolTritPickaxe tritPickaxe = new ToolTritPickaxe(tritToolMaterial);
	public static final ToolTritAxe tritAxe = new ToolTritAxe(tritToolMaterial);
	public static final ToolTritSword tritSword = new ToolTritSword(tritToolMaterial);
	public static final ToolTritShovel tritShovel = new ToolTritShovel(tritToolMaterial);
	public static final ToolTritHoe tritHoe = new ToolTritHoe(tritToolMaterial);
	
	
	public static void init()
	{
		GameRegistry.registerItem(tritLeaf, "tritLeaf");
		GameRegistry.registerItem(tritCup, "tritCup");
		GameRegistry.registerItem(tritTea, "tritTea");
		GameRegistry.registerItem(tritIngot, "tritIngot");
		GameRegistry.registerItem(tritPickaxe, "tritPickaxe");
		GameRegistry.registerItem(tritAxe, "tritAxe");
		GameRegistry.registerItem(tritSword, "tritSword");
		GameRegistry.registerItem(tritShovel, "tritShovel");
		GameRegistry.registerItem(tritHoe, "tritHoe");
		GameRegistry.registerItem(tritDust, "tritDust");
		
		
		// Register Armor
		GameRegistry.registerItem(tritHelmet, "tritHelmet");
		GameRegistry.registerItem(tritArmorChest, "tritArmorChest");
		GameRegistry.registerItem(tritLegs, "tritLegs");
		GameRegistry.registerItem(tritBoots, "tritBoots");
	}
			
}
