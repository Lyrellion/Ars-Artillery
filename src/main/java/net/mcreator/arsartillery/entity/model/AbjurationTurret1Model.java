package net.mcreator.arsartillery.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.entity.AbjurationTurret1Entity;

public class AbjurationTurret1Model extends GeoModel<AbjurationTurret1Entity> {
	@Override
	public ResourceLocation getAnimationResource(AbjurationTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "animations/turret1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AbjurationTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "geo/turret1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AbjurationTurret1Entity entity) {
		return new ResourceLocation("ars_artillery", "textures/entities/" + entity.getTexture() + ".png");
	}

}
