package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.EarthTurret2Entity;

public class EarthTurret2Model extends GeoModel<EarthTurret2Entity> {
	@Override
	public ResourceLocation getAnimationResource(EarthTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EarthTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EarthTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
