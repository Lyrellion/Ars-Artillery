package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.entity.AbjurationstoneTileEntity;

public class AbjurationstoneBlockModel extends GeoModel<AbjurationstoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AbjurationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AbjurationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AbjurationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "textures/block/abjurationstone.png");
	}
}
