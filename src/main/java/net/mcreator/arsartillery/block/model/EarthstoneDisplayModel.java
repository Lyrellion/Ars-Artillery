package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.display.EarthstoneDisplayItem;

public class EarthstoneDisplayModel extends GeoModel<EarthstoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EarthstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EarthstoneDisplayItem animatable) {
		return new ResourceLocation("ars_artillery", "geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EarthstoneDisplayItem entity) {
		return new ResourceLocation("ars_artillery", "textures/block/earthstone.png");
	}
}
