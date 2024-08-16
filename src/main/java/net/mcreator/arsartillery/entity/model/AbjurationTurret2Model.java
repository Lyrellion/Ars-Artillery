package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.AbjurationTurret2Entity;

public class AbjurationTurret2Model extends GeoModel<AbjurationTurret2Entity> {
	@Override
	public ResourceLocation getAnimationResource(AbjurationTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AbjurationTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AbjurationTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
