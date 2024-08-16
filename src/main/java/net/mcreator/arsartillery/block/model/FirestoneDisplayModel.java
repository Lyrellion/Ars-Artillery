package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.display.FirestoneDisplayItem;

public class FirestoneDisplayModel extends GeoModel<FirestoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FirestoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FirestoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FirestoneDisplayItem entity) {
		return new ResourceLocation("ars_artillery", "textures/block/firestone.png");
	}
}
