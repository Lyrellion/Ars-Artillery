package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.ManipulationTurret3Entity;

public class ManipulationTurret3Model extends GeoModel<ManipulationTurret3Entity> {
	@Override
	public ResourceLocation getAnimationResource(ManipulationTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManipulationTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManipulationTurret3Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
