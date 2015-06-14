package com.stiforr.tritmod.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.stiforr.tritmod.TritMod;
import com.stiforr.tritmod.entities.EntityTritMob;
import com.stiforr.tritmod.init.ModBlocks;
import com.stiforr.tritmod.render.entity.RenderHuman;
import com.stiforr.tritmod.render.item.ItemRenderTritChest;
import com.stiforr.tritmod.render.tileentity.TritChestRenderer;
import com.stiforr.tritmod.tileentity.TileEntityTritChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy
{
	int ModEntityID;
	
	public void registerRenderInfo()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTritChest.class, new TritChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.tritChest), new ItemRenderTritChest());
	}
	
	public int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTritMob.class, new RenderHuman(new ModelBiped(), 0));
	}
	
	public void registerEntities(){
		ModEntityID = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerModEntity(EntityTritMob.class, "EntityTrit", ModEntityID++, TritMod.instance, 80, 1, false);
	}
	
}
