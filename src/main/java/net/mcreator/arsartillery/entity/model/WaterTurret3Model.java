package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.WaterTurret3Entity;

public class WaterTurret3Model extends GeoModel<WaterTurret3Entity> {
	@Override
	public ResourceLocation getAnimationResource(WaterTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
