package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.ManipulationstoneBlockModel;
import net.mcreator.arsartillery.block.entity.ManipulationstoneTileEntity;

public class ManipulationstoneTileRenderer extends GeoBlockRenderer<ManipulationstoneTileEntity> {
	public ManipulationstoneTileRenderer() {
		super(new ManipulationstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(ManipulationstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
