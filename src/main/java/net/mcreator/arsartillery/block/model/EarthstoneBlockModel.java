package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.entity.EarthstoneTileEntity;

public class EarthstoneBlockModel extends GeoModel<EarthstoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EarthstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EarthstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EarthstoneTileEntity animatable) {
		return new ResourceLocation("ars_artillery", "textures/block/earthstone.png");
	}
}
