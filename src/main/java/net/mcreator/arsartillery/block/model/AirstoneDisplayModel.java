package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.display.AirstoneDisplayItem;

public class AirstoneDisplayModel extends GeoModel<AirstoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AirstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirstoneDisplayItem entity) {
		return new ResourceLocation("ars_artillery", "textures/block/airstone.png");
	}
}
