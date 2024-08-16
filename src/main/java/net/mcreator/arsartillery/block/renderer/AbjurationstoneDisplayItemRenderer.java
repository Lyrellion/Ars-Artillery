package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.AbjurationstoneDisplayModel;
import net.mcreator.arsartillery.block.display.AbjurationstoneDisplayItem;

public class AbjurationstoneDisplayItemRenderer extends GeoItemRenderer<AbjurationstoneDisplayItem> {
	public AbjurationstoneDisplayItemRenderer() {
		super(new AbjurationstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(AbjurationstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
