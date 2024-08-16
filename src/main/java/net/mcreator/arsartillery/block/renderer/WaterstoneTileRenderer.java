package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.WaterstoneBlockModel;
import net.mcreator.arsartillery.block.entity.WaterstoneTileEntity;

public class WaterstoneTileRenderer extends GeoBlockRenderer<WaterstoneTileEntity> {
	public WaterstoneTileRenderer() {
		super(new WaterstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(WaterstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
