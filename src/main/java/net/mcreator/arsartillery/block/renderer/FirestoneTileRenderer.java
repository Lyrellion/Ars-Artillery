package net.mcreator.arsartillery.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.arsartillery.block.model.FirestoneBlockModel;
import net.mcreator.arsartillery.block.entity.FirestoneTileEntity;

public class FirestoneTileRenderer extends GeoBlockRenderer<FirestoneTileEntity> {
	public FirestoneTileRenderer() {
		super(new FirestoneBlockModel());
	}

	@Override
	public RenderType getRenderType(FirestoneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
