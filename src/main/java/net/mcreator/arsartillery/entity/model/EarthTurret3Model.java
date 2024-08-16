package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.EarthTurret3Entity;

public class EarthTurret3Model extends GeoModel<EarthTurret3Entity> {
	@Override
	public ResourceLocation getAnimationResource(EarthTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EarthTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EarthTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
