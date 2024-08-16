package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.WaterstoneDisplayModel;
import net.mcreator.arsartillery.block.display.WaterstoneDisplayItem;

public class WaterstoneDisplayItemRenderer extends GeoItemRenderer<WaterstoneDisplayItem> {
	public WaterstoneDisplayItemRenderer() {
		super(new WaterstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(WaterstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
