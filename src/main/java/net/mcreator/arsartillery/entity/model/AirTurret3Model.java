package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.AirTurret3Entity;

public class AirTurret3Model extends GeoModel<AirTurret3Entity> {
	@Override
	public ResourceLocation getAnimationResource(AirTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
