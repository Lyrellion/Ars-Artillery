package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.FireTurret3Entity;

public class FireTurret3Model extends GeoModel<FireTurret3Entity> {
	@Override
	public ResourceLocation getAnimationResource(FireTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
