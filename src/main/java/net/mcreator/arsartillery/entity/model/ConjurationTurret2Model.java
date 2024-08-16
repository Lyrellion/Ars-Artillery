package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.ConjurationTurret2Entity;

public class ConjurationTurret2Model extends GeoModel<ConjurationTurret2Entity> {
	@Override
	public ResourceLocation getAnimationResource(ConjurationTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConjurationTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConjurationTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
