package com.stiforr.tritmod.proxy;

import com.stiforr.tritmod.TritMod;
import com.stiforr.tritmod.handler.GuiHandler;
import com.stiforr.tritmod.reference.Reference;
import com.stiforr.tritmod.tileentity.TileEntityTritFurnace;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy
{
 public void registerRenderInfo()
 {
	 
 }
 
 public int addArmor(String armor)
 {
	return 0;
	
 }
 
 public void registerNetworkStuff()
 {
	 NetworkRegistry.INSTANCE.registerGuiHandler(TritMod.instance, new GuiHandler());
 }
 
 public void registerTileEntities()
 {
	 GameRegistry.registerTileEntity(TileEntityTritFurnace.class, Reference.MOD_ID + "TileEntityTritFurnace");
 }
 	
}
