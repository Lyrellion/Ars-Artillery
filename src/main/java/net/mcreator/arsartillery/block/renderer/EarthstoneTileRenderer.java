package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.EarthstoneBlockModel;
import net.mcreator.arsartillery.block.entity.EarthstoneTileEntity;

public class EarthstoneTileRenderer extends GeoBlockRenderer<EarthstoneTileEntity> {
	public EarthstoneTileRenderer() {
		super(new EarthstoneBlockModel());
	}

	@Override
	public RenderType getRenderType(EarthstoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
