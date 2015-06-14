package com.stiforr.tritmod.render.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderHuman extends RenderBiped{

	public RenderHuman(ModelBiped model, float shadowSize) {
		super(model, shadowSize);
	}
	
	
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return new ResourceLocation("tritmod:textures/entity/steve.png");
    }

    
    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
    {
        super.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
    }


}
