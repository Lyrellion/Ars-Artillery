package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.AirstoneDisplayModel;
import net.mcreator.arsartillery.block.display.AirstoneDisplayItem;

public class AirstoneDisplayItemRenderer extends GeoItemRenderer<AirstoneDisplayItem> {
	public AirstoneDisplayItemRenderer() {
		super(new AirstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(AirstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
