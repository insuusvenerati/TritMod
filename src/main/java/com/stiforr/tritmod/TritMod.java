package com.stiforr.tritmod;

import com.stiforr.tritmod.proxy.IProxy;
import com.stiforr.tritmod.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class TritMod 
{
	
	@Mod.Instance(Reference.MOD_ID)
	public static TritMod instance;
	
	@SidedProxy(clientSide = "com.stiforr.tritmod.proxy.ClientProxy", serverSide = "com.stiforr.tritmod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		
	}
}
