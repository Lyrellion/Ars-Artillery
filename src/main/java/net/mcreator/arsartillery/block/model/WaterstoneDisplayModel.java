package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.display.WaterstoneDisplayItem;

public class WaterstoneDisplayModel extends GeoModel<WaterstoneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WaterstoneDisplayItem animatable) {
		return ResourceLocation.parse("ars_artillery:animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterstoneDisplayItem animatable) {
		return ResourceLocation.parse("ars_artillery:geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterstoneDisplayItem entity) {
		return ResourceLocation.parse("ars_artillery:textures/block/waterstone.png");
	}
}
