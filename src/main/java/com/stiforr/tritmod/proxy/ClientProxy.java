package com.stiforr.tritmod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.stiforr.tritmod.init.ModBlocks;
import com.stiforr.tritmod.render.item.ItemRenderTritChest;
import com.stiforr.tritmod.render.tileentity.TritChestRenderer;
import com.stiforr.tritmod.tileentity.TileEntityTritChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy
{
	public void registerRenderInfo()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTritChest.class, new TritChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.tritChest), new ItemRenderTritChest());
	}
	
	public int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
}
