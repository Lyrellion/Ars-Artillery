package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.WaterTurret2Entity;

public class WaterTurret2Model extends GeoModel<WaterTurret2Entity> {
	@Override
	public ResourceLocation getAnimationResource(WaterTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaterTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaterTurret2Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
