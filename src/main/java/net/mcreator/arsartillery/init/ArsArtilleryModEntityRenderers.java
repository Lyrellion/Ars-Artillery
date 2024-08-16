
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.arsartillery.client.renderer.WaterTurret3Renderer;
import net.mcreator.arsartillery.client.renderer.WaterTurret2Renderer;
import net.mcreator.arsartillery.client.renderer.WaterTurret1Renderer;
import net.mcreator.arsartillery.client.renderer.ManipulationTurret3Renderer;
import net.mcreator.arsartillery.client.renderer.ManipulationTurret2Renderer;
import net.mcreator.arsartillery.client.renderer.ManipulationTurret1Renderer;
import net.mcreator.arsartillery.client.renderer.FireTurret3Renderer;
import net.mcreator.arsartillery.client.renderer.FireTurret2Renderer;
import net.mcreator.arsartillery.client.renderer.FireTurret1Renderer;
import net.mcreator.arsartillery.client.renderer.EarthTurret3Renderer;
import net.mcreator.arsartillery.client.renderer.EarthTurret2Renderer;
import net.mcreator.arsartillery.client.renderer.EarthTurret1Renderer;
import net.mcreator.arsartillery.client.renderer.DaggerCloudRenderer;
import net.mcreator.arsartillery.client.renderer.ConjurationTurret3Renderer;
import net.mcreator.arsartillery.client.renderer.ConjurationTurret2Renderer;
import net.mcreator.arsartillery.client.renderer.ConjurationTurret1Renderer;
import net.mcreator.arsartillery.client.renderer.AirTurret3Renderer;
import net.mcreator.arsartillery.client.renderer.AirTurret2Renderer;
import net.mcreator.arsartillery.client.renderer.AirTurret1Renderer;
import net.mcreator.arsartillery.client.renderer.AbjurationTurret3Renderer;
import net.mcreator.arsartillery.client.renderer.AbjurationTurret2Renderer;
import net.mcreator.arsartillery.client.renderer.AbjurationTurret1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArsArtilleryModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ArsArtilleryModEntities.FIRE_TURRET_1.get(), FireTurret1Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.FIRE_TURRET_2.get(), FireTurret2Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.FIRE_TURRET_3.get(), FireTurret3Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.WATER_TURRET_1.get(), WaterTurret1Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.EARTH_TURRET_1.get(), EarthTurret1Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.ABJURATION_TURRET_1.get(), AbjurationTurret1Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.CONJURATION_TURRET_1.get(), ConjurationTurret1Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.MANIPULATION_TURRET_1.get(), ManipulationTurret1Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.FIRE_SHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.FIRESHOT_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.FIRESHOT_3.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.AIR_TURRET_1.get(), AirTurret1Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.AIR_TURRET_2.get(), AirTurret2Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.AIR_TURRET_3.get(), AirTurret3Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.WATERSHOT_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.EARTHSHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.EARTHSHOT_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.EARTHSHOT_3.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.WATERSHOT_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.WATERSHOT_3.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.WATER_TURRET_2.get(), WaterTurret2Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.EARTH_TURRET_2.get(), EarthTurret2Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.WATER_TURRET_3.get(), WaterTurret3Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.EARTH_TURRET_3.get(), EarthTurret3Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.AIRSHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.AIRSHOT_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.AIRSHOT_3.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.DAGGER_CLOUD.get(), DaggerCloudRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.CONJURATION_SHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.CONJURATION_TURRET_2.get(), ConjurationTurret2Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.CONJURATION_TURRET_3.get(), ConjurationTurret3Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.ABJURATION_TURRET_2.get(), AbjurationTurret2Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.ABJURATION_TURRET_3.get(), AbjurationTurret3Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.MANIPULATION_TURRET_2.get(), ManipulationTurret2Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.MANIPULATION_TURRET_3.get(), ManipulationTurret3Renderer::new);
		event.registerEntityRenderer(ArsArtilleryModEntities.MANIPULATION_SHOT.get(), ThrownItemRenderer::new);
	}
}
