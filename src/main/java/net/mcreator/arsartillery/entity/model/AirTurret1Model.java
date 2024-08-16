package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.AirTurret1Entity;

public class AirTurret1Model extends GeoModel<AirTurret1Entity> {
	@Override
	public ResourceLocation getAnimationResource(AirTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
