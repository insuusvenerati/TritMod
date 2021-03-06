package com.stiforr.tritmod;

import net.minecraft.world.WorldType;

import com.stiforr.tritmod.biome.BiomeRegistry;
import com.stiforr.tritmod.biome.WorldGen;
import com.stiforr.tritmod.biome.WorldTypeTrit;
import com.stiforr.tritmod.dimension.DimensionRegistry;
import com.stiforr.tritmod.handler.ConfigHandler;
import com.stiforr.tritmod.init.ModBlocks;
import com.stiforr.tritmod.init.ModItems;
import com.stiforr.tritmod.init.Recipes;
import com.stiforr.tritmod.proxy.CommonProxy;
import com.stiforr.tritmod.reference.Reference;
import com.stiforr.tritmod.tileentity.TritTileEntity;
import com.stiforr.tritmod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
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
	public static CommonProxy proxy;
	
	// Starting Init stuff
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{	
		// Create and load config file
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
		// Register items
		ModItems.init();
		
		// Register blocks
		proxy.registerRenderInfo();
		TritTileEntity.mainRegistry();
		ModBlocks.initBlocks();
		ModBlocks.init();
		
		// Register WorldGen
		WorldGen.init();
		
		// Register Tile Entities
		proxy.registerTileEntities();
		
		// Register Entities
		proxy.registerRenderers();
		proxy.registerEntities();
		
		
		// Register Biome
		BiomeRegistry.MainClass();
		
		
		// Register Dimension
		DimensionRegistry.mainRegistry();
		
		
		// Just some log stuff
		LogHelper.info("Pre Init Complete");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Register recipes obvs
		Recipes.init();
		
		
		proxy.registerNetworkStuff();
		
		// Register Biome
		
		
		// Some log stuff
		LogHelper.info("Init Complete");
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		// Some log stuff
		LogHelper.info("Post Init Complete");
		
		WorldType TRIT = new WorldTypeTrit(3, "Trit");
		
	}
	
}
