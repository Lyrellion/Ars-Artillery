package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.display.ConjurationstoneDisplayItem;

public class ConjurationstoneDisplayModel extends GeoModel<ConjurationstoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ConjurationstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConjurationstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConjurationstoneDisplayItem entity) {
		return new ResourceLocation("ars_artillery", "textures/block/conjurationstone.png");
	}
}
