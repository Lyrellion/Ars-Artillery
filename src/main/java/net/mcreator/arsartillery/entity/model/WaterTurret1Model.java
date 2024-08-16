package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.WaterTurret1Entity;

public class WaterTurret1Model extends GeoModel<WaterTurret1Entity> {
	@Override
	public ResourceLocation getAnimationResource(WaterTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
