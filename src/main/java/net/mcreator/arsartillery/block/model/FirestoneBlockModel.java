package net.mcreator.arsartillery.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.arsartillery.block.entity.FirestoneTileEntity;

public class FirestoneBlockModel extends GeoModel<FirestoneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FirestoneTileEntity animatable) {
		return ResourceLocation.parse("ars_artillery:animations/runicstone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FirestoneTileEntity animatable) {
		return ResourceLocation.parse("ars_artillery:geo/runicstone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FirestoneTileEntity animatable) {
		return ResourceLocation.parse("ars_artillery:textures/block/firestone.png");
	}
}
