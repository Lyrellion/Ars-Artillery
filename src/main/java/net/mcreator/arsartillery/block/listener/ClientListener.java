package net.mcreator.arsartillery.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.arsartillery.init.ArsArtilleryModBlockEntities;
import net.mcreator.arsartillery.block.renderer.WaterstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.ManipulationstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.FirestoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.EarthstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.ConjurationstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.AirstoneTileRenderer;
import net.mcreator.arsartillery.block.renderer.AbjurationstoneTileRenderer;
import net.mcreator.arsartillery.block.entity.WaterstoneTileEntity;
import net.mcreator.arsartillery.block.entity.ManipulationstoneTileEntity;
import net.mcreator.arsartillery.block.entity.FirestoneTileEntity;
import net.mcreator.arsartillery.block.entity.EarthstoneTileEntity;
import net.mcreator.arsartillery.block.entity.ConjurationstoneTileEntity;
import net.mcreator.arsartillery.block.entity.AirstoneTileEntity;
import net.mcreator.arsartillery.block.entity.AbjurationstoneTileEntity;
import net.mcreator.arsartillery.ArsArtilleryMod;

@EventBusSubscriber(modid = ArsArtilleryMod.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<FirestoneTileEntity>) ArsArtilleryModBlockEntities.FIRESTONE.get(), context -> new FirestoneTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<AirstoneTileEntity>) ArsArtilleryModBlockEntities.AIRSTONE.get(), context -> new AirstoneTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<WaterstoneTileEntity>) ArsArtilleryModBlockEntities.WATERSTONE.get(), context -> new WaterstoneTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<EarthstoneTileEntity>) ArsArtilleryModBlockEntities.EARTHSTONE.get(), context -> new EarthstoneTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<AbjurationstoneTileEntity>) ArsArtilleryModBlockEntities.ABJURATIONSTONE.get(), context -> new AbjurationstoneTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<ConjurationstoneTileEntity>) ArsArtilleryModBlockEntities.CONJURATIONSTONE.get(), context -> new ConjurationstoneTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<ManipulationstoneTileEntity>) ArsArtilleryModBlockEntities.MANIPULATIONSTONE.get(), context -> new ManipulationstoneTileRenderer());
	}
}
