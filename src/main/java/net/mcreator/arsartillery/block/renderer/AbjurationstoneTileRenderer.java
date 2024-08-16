package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.AbjurationstoneBlockModel;
import net.mcreator.arsartillery.block.entity.AbjurationstoneTileEntity;

public class AbjurationstoneTileRenderer extends GeoBlockRenderer<AbjurationstoneTileEntity> {
	public AbjurationstoneTileRenderer() {
		super(new AbjurationstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(AbjurationstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
