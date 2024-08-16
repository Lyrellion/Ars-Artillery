package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.EarthTurret1Entity;

public class EarthTurret1Model extends GeoModel<EarthTurret1Entity> {
	@Override
	public ResourceLocation getAnimationResource(EarthTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EarthTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EarthTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
