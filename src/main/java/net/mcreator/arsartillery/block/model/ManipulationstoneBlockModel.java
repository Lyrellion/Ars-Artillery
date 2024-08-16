package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.entity.ManipulationstoneTileEntity;

public class ManipulationstoneBlockModel extends GeoModel<ManipulationstoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ManipulationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManipulationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManipulationstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "textures/block/manipulationstone.png");
	}
}
