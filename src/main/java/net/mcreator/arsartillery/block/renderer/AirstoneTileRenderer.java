package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.AirstoneBlockModel;
import net.mcreator.arsartillery.block.entity.AirstoneTileEntity;

public class AirstoneTileRenderer extends GeoBlockRenderer<AirstoneTileEntity> {
	public AirstoneTileRenderer() {
		super(new AirstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(AirstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
