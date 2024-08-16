package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.ManipulationstoneDisplayModel;
import net.mcreator.arsartillery.block.display.ManipulationstoneDisplayItem;

public class ManipulationstoneDisplayItemRenderer extends GeoItemRenderer<ManipulationstoneDisplayItem> {
	public ManipulationstoneDisplayItemRenderer() {
		super(new ManipulationstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(ManipulationstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
