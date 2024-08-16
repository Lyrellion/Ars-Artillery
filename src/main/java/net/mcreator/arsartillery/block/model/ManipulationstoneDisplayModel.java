package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.display.ManipulationstoneDisplayItem;

public class ManipulationstoneDisplayModel extends GeoModel<ManipulationstoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ManipulationstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManipulationstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManipulationstoneDisplayItem entity) {
		return new ResourceLocation("ars_artillery", "textures/block/manipulationstone.png");
	}
}
