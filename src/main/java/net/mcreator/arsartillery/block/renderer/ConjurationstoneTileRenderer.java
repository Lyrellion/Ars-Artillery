package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.ConjurationstoneBlockModel;
import net.mcreator.arsartillery.block.entity.ConjurationstoneTileEntity;

public class ConjurationstoneTileRenderer extends GeoBlockRenderer<ConjurationstoneTileEntity> {
	public ConjurationstoneTileRenderer() {
		super(new ConjurationstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(ConjurationstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
