package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.entity.ConjurationstoneTileEntity;

public class ConjurationstoneBlockModel extends GeoModel<ConjurationstoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ConjurationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConjurationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConjurationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "textures/block/conjurationstone.png");
	}
}
