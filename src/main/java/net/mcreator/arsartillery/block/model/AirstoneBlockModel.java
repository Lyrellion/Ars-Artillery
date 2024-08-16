package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.entity.AirstoneTileEntity;

public class AirstoneBlockModel extends GeoModel<AirstoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AirstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "textures/block/airstone.png");
	}
}
