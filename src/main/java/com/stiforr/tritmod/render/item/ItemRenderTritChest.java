package com.stiforr.tritmod.render.item;

import com.stiforr.tritmod.tileentity.TileEntityTritChest;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderTritChest implements IItemRenderer{

	private ModelChest chestModel;
	
	public ItemRenderTritChest()
	{
		chestModel = new ModelChest();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityTritChest(), 0.0D, 0.0D, 0.0D, 0.0F);
	}

}
