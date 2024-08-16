package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.display.AbjurationstoneDisplayItem;

public class AbjurationstoneDisplayModel extends GeoModel<AbjurationstoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AbjurationstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AbjurationstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AbjurationstoneDisplayItem entity) {
		return new ResourceLocation("ars_artillery", "textures/block/abjurationstone.png");
	}
}
