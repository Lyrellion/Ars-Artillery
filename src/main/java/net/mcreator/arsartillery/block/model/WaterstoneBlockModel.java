package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.entity.WaterstoneTileEntity;

public class WaterstoneBlockModel extends GeoModel<WaterstoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WaterstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "textures/block/waterstone.png");
	}
}
