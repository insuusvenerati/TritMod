package com.stiforr.tritmod.handler;

import com.stiforr.tritmod.client.gui.GuiTritFurnace;
import com.stiforr.tritmod.inventory.ContainerTritFurnace;
import com.stiforr.tritmod.tileentity.TileEntityTritFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler 
{
	
	public GuiHandler ()
	{
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityTritFurnace tileEntityFurnace = (TileEntityTritFurnace) world.getTileEntity(x, y, z);
			return new ContainerTritFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityTritFurnace tileEntityTestContainer = (TileEntityTritFurnace) world.getTileEntity(x, y, z);
			return new GuiTritFurnace(player.inventory, tileEntityTestContainer);
		}
		return null;
	}
	
}
