package com.stiforr.tritmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.stiforr.tritmod.biome.BiomeRegistry;
import com.stiforr.tritmod.biome.WorldTypeTrit;
import com.stiforr.tritmod.dimension.DimensionRegistry;
import com.stiforr.tritmod.handler.ConfigHandler;
import com.stiforr.tritmod.init.ModBlocks;
import com.stiforr.tritmod.init.ModItems;
import com.stiforr.tritmod.init.Recipes;
import com.stiforr.tritmod.item.ItemTritTea;
import com.stiforr.tritmod.proxy.IProxy;
import com.stiforr.tritmod.reference.Reference;
import com.stiforr.tritmod.utility.LogHelper;


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
		if(event.getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			renderItem.getItemModelMesher().register(ModItems.tritTea, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((ItemTritTea) tritTea).getName(), "inventory"));
		}
		
		// Create and load config file
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		// Register items
		ModItems.init();
		// Register blocks
		ModBlocks.initBlocks();
		ModBlocks.init();
		
		
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
