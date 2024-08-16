package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.FireTurret2Entity;

public class FireTurret2Model extends GeoModel<FireTurret2Entity> {
	@Override
	public ResourceLocation getAnimationResource(FireTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
