package net.mcreator.arsartillery.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.arsartillery.init.ArsArtilleryModBlockEntities;
import net.mcreator.arsartillery.block.renderer.WaterstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.ManipulationstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.FirestoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.EarthstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.ConjurationstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.AirstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.AbjurationstoneTileRenderer;
import net.mcreator.arsartillery.ArsArtilleryMod;

@Mod.EventBusSubscriber(modid = ArsArtilleryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(ArsArtilleryModBlockEntities.FIRESTONE.get(), context -> new FirestoneTileRenderer());
		event.registerBlockEntityRenderer(ArsArtilleryModBlockEntities.AIRSTONE.get(), context -> new AirstoneTileRenderer());
		event.registerBlockEntityRenderer(ArsArtilleryModBlockEntities.WATERSTONE.get(), context -> new WaterstoneTileRenderer());
		event.registerBlockEntityRenderer(ArsArtilleryModBlockEntities.EARTHSTONE.get(), context -> new EarthstoneTileRenderer());
		event.registerBlockEntityRenderer(ArsArtilleryModBlockEntities.ABJURATIONSTONE.get(), context -> new AbjurationstoneTileRenderer());
		event.registerBlockEntityRenderer(ArsArtilleryModBlockEntities.CONJURATIONSTONE.get(), context -> new ConjurationstoneTileRenderer());
		event.registerBlockEntityRenderer(ArsArtilleryModBlockEntities.MANIPULATIONSTONE.get(), context -> new ManipulationstoneTileRenderer());
	}
}
