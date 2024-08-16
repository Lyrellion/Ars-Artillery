package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.ConjurationstoneDisplayModel;
import net.mcreator.arsartillery.block.display.ConjurationstoneDisplayItem;

public class ConjurationstoneDisplayItemRenderer extends GeoItemRenderer<ConjurationstoneDisplayItem> {
	public ConjurationstoneDisplayItemRenderer() {
		super(new ConjurationstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(ConjurationstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
