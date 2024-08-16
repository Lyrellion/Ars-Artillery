package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.ManipulationTurret1Entity;

public class ManipulationTurret1Model extends GeoModel<ManipulationTurret1Entity> {
	@Override
	public ResourceLocation getAnimationResource(ManipulationTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ManipulationTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ManipulationTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
