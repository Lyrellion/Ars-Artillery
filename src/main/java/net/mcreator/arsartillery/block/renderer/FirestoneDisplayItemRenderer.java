package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.FirestoneDisplayModel;
import net.mcreator.arsartillery.block.display.FirestoneDisplayItem;

public class FirestoneDisplayItemRenderer extends GeoItemRenderer<FirestoneDisplayItem> {
	public FirestoneDisplayItemRenderer() {
		super(new FirestoneDisplayModel());
	}

	@Override
	public RenderType getRenderType(FirestoneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
