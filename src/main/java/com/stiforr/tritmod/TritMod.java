package com.stiforr.tritmod;

import com.stiforr.tritmod.handler.ConfigHandler;
import com.stiforr.tritmod.init.ModBlocks;
import com.stiforr.tritmod.init.ModItems;
import com.stiforr.tritmod.proxy.IProxy;
import com.stiforr.tritmod.reference.Reference;
import com.stiforr.tritmod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TritMod 
{
	
	@Mod.Instance(Reference.MOD_ID)
	public static TritMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	// Starting Init stuff
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{	
		// Create and load config file
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		LogHelper.info("Pre Init Complete");
		// Register items
		ModItems.init();
		// Register blocks
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		LogHelper.info("Init Complete");
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Init Complete");
	}
}
