package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.DaggerCloudEntity;

public class DaggerCloudModel extends GeoModel<DaggerCloudEntity> {
	@Override
	public ResourceLocation getAnimationResource(DaggerCloudEntity entity) {
		return new ResourceLocation("ars_artillery", "animations/daggercloud.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DaggerCloudEntity entity) {
		return new ResourceLocation("ars_artillery", "geo/daggercloud.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DaggerCloudEntity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
