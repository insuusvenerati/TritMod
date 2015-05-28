package com.stiforr.tritmod.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.stiforr.tritmod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;



public class ConfigHandler 
{
	
	public static Configuration configuration;
	public static boolean testValue = false;
		
	public static void init(File configFile)
	{
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
		
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()
	{
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example config value");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
