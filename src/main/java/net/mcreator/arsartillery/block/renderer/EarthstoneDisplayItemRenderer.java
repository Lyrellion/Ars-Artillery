package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.EarthstoneDisplayModel;
import net.mcreator.arsartillery.block.display.EarthstoneDisplayItem;

public class EarthstoneDisplayItemRenderer extends GeoItemRenderer<EarthstoneDisplayItem> {
	public EarthstoneDisplayItemRenderer() {
		super(new EarthstoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(EarthstoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
