
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.arsartillery.entity.Watershot3Entity;
import net.mcreator.arsartillery.entity.Watershot2Entity;
import net.mcreator.arsartillery.entity.Watershot1Entity;
import net.mcreator.arsartillery.entity.WaterTurret3Entity;
import net.mcreator.arsartillery.entity.WaterTurret2Entity;
import net.mcreator.arsartillery.entity.WaterTurret1Entity;
import net.mcreator.arsartillery.entity.ManipulationTurret3Entity;
import net.mcreator.arsartillery.entity.ManipulationTurret2Entity;
import net.mcreator.arsartillery.entity.ManipulationTurret1Entity;
import net.mcreator.arsartillery.entity.ManipulationShotEntity;
import net.mcreator.arsartillery.entity.Fireshot3Entity;
import net.mcreator.arsartillery.entity.Fireshot2Entity;
import net.mcreator.arsartillery.entity.FireTurret3Entity;
import net.mcreator.arsartillery.entity.FireTurret2Entity;
import net.mcreator.arsartillery.entity.FireTurret1Entity;
import net.mcreator.arsartillery.entity.FireShotEntity;
import net.mcreator.arsartillery.entity.EarthshotEntity;
import net.mcreator.arsartillery.entity.Earthshot3Entity;
import net.mcreator.arsartillery.entity.Earthshot2Entity;
import net.mcreator.arsartillery.entity.EarthTurret3Entity;
import net.mcreator.arsartillery.entity.EarthTurret2Entity;
import net.mcreator.arsartillery.entity.EarthTurret1Entity;
import net.mcreator.arsartillery.entity.DaggerCloudEntity;
import net.mcreator.arsartillery.entity.ConjurationTurret3Entity;
import net.mcreator.arsartillery.entity.ConjurationTurret2Entity;
import net.mcreator.arsartillery.entity.ConjurationTurret1Entity;
import net.mcreator.arsartillery.entity.ConjurationShotEntity;
import net.mcreator.arsartillery.entity.AirshotEntity;
import net.mcreator.arsartillery.entity.Airshot3Entity;
import net.mcreator.arsartillery.entity.Airshot2Entity;
import net.mcreator.arsartillery.entity.AirTurret3Entity;
import net.mcreator.arsartillery.entity.AirTurret2Entity;
import net.mcreator.arsartillery.entity.AirTurret1Entity;
import net.mcreator.arsartillery.entity.AbjurationTurret3Entity;
import net.mcreator.arsartillery.entity.AbjurationTurret2Entity;
import net.mcreator.arsartillery.entity.AbjurationTurret1Entity;
import net.mcreator.arsartillery.ArsArtilleryMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArsArtilleryModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ArsArtilleryMod.MODID);
	public static final RegistryObject<EntityType<FireTurret1Entity>> FIRE_TURRET_1 = register("fire_turret_1", EntityType.Builder.<FireTurret1Entity>of(FireTurret1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireTurret1Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<FireTurret2Entity>> FIRE_TURRET_2 = register("fire_turret_2", EntityType.Builder.<FireTurret2Entity>of(FireTurret2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireTurret2Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<FireTurret3Entity>> FIRE_TURRET_3 = register("fire_turret_3", EntityType.Builder.<FireTurret3Entity>of(FireTurret3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireTurret3Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<WaterTurret1Entity>> WATER_TURRET_1 = register("water_turret_1",
			EntityType.Builder.<WaterTurret1Entity>of(WaterTurret1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WaterTurret1Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<EarthTurret1Entity>> EARTH_TURRET_1 = register("earth_turret_1",
			EntityType.Builder.<EarthTurret1Entity>of(EarthTurret1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthTurret1Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AbjurationTurret1Entity>> ABJURATION_TURRET_1 = register("abjuration_turret_1",
			EntityType.Builder.<AbjurationTurret1Entity>of(AbjurationTurret1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AbjurationTurret1Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ConjurationTurret1Entity>> CONJURATION_TURRET_1 = register("conjuration_turret_1",
			EntityType.Builder.<ConjurationTurret1Entity>of(ConjurationTurret1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ConjurationTurret1Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ManipulationTurret1Entity>> MANIPULATION_TURRET_1 = register("manipulation_turret_1",
			EntityType.Builder.<ManipulationTurret1Entity>of(ManipulationTurret1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ManipulationTurret1Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<FireShotEntity>> FIRE_SHOT = register("fire_shot",
			EntityType.Builder.<FireShotEntity>of(FireShotEntity::new, MobCategory.MISC).setCustomClientFactory(FireShotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Fireshot2Entity>> FIRESHOT_2 = register("fireshot_2",
			EntityType.Builder.<Fireshot2Entity>of(Fireshot2Entity::new, MobCategory.MISC).setCustomClientFactory(Fireshot2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Fireshot3Entity>> FIRESHOT_3 = register("fireshot_3",
			EntityType.Builder.<Fireshot3Entity>of(Fireshot3Entity::new, MobCategory.MISC).setCustomClientFactory(Fireshot3Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AirTurret1Entity>> AIR_TURRET_1 = register("air_turret_1", EntityType.Builder.<AirTurret1Entity>of(AirTurret1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AirTurret1Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AirTurret2Entity>> AIR_TURRET_2 = register("air_turret_2", EntityType.Builder.<AirTurret2Entity>of(AirTurret2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AirTurret2Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AirTurret3Entity>> AIR_TURRET_3 = register("air_turret_3", EntityType.Builder.<AirTurret3Entity>of(AirTurret3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AirTurret3Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<Watershot1Entity>> WATERSHOT_1 = register("watershot_1",
			EntityType.Builder.<Watershot1Entity>of(Watershot1Entity::new, MobCategory.MISC).setCustomClientFactory(Watershot1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthshotEntity>> EARTHSHOT = register("earthshot",
			EntityType.Builder.<EarthshotEntity>of(EarthshotEntity::new, MobCategory.MISC).setCustomClientFactory(EarthshotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Earthshot2Entity>> EARTHSHOT_2 = register("earthshot_2",
			EntityType.Builder.<Earthshot2Entity>of(Earthshot2Entity::new, MobCategory.MISC).setCustomClientFactory(Earthshot2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Earthshot3Entity>> EARTHSHOT_3 = register("earthshot_3",
			EntityType.Builder.<Earthshot3Entity>of(Earthshot3Entity::new, MobCategory.MISC).setCustomClientFactory(Earthshot3Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Watershot2Entity>> WATERSHOT_2 = register("watershot_2",
			EntityType.Builder.<Watershot2Entity>of(Watershot2Entity::new, MobCategory.MISC).setCustomClientFactory(Watershot2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Watershot3Entity>> WATERSHOT_3 = register("watershot_3",
			EntityType.Builder.<Watershot3Entity>of(Watershot3Entity::new, MobCategory.MISC).setCustomClientFactory(Watershot3Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterTurret2Entity>> WATER_TURRET_2 = register("water_turret_2",
			EntityType.Builder.<WaterTurret2Entity>of(WaterTurret2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WaterTurret2Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<EarthTurret2Entity>> EARTH_TURRET_2 = register("earth_turret_2",
			EntityType.Builder.<EarthTurret2Entity>of(EarthTurret2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthTurret2Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<WaterTurret3Entity>> WATER_TURRET_3 = register("water_turret_3", EntityType.Builder.<WaterTurret3Entity>of(WaterTurret3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WaterTurret3Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<EarthTurret3Entity>> EARTH_TURRET_3 = register("earth_turret_3", EntityType.Builder.<EarthTurret3Entity>of(EarthTurret3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthTurret3Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AirshotEntity>> AIRSHOT = register("airshot",
			EntityType.Builder.<AirshotEntity>of(AirshotEntity::new, MobCategory.MISC).setCustomClientFactory(AirshotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Airshot2Entity>> AIRSHOT_2 = register("airshot_2",
			EntityType.Builder.<Airshot2Entity>of(Airshot2Entity::new, MobCategory.MISC).setCustomClientFactory(Airshot2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Airshot3Entity>> AIRSHOT_3 = register("airshot_3",
			EntityType.Builder.<Airshot3Entity>of(Airshot3Entity::new, MobCategory.MISC).setCustomClientFactory(Airshot3Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DaggerCloudEntity>> DAGGER_CLOUD = register("dagger_cloud", EntityType.Builder.<DaggerCloudEntity>of(DaggerCloudEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(2).setUpdateInterval(3).setCustomClientFactory(DaggerCloudEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ConjurationShotEntity>> CONJURATION_SHOT = register("conjuration_shot", EntityType.Builder.<ConjurationShotEntity>of(ConjurationShotEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ConjurationShotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ConjurationTurret2Entity>> CONJURATION_TURRET_2 = register("conjuration_turret_2",
			EntityType.Builder.<ConjurationTurret2Entity>of(ConjurationTurret2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ConjurationTurret2Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ConjurationTurret3Entity>> CONJURATION_TURRET_3 = register("conjuration_turret_3",
			EntityType.Builder.<ConjurationTurret3Entity>of(ConjurationTurret3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ConjurationTurret3Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AbjurationTurret2Entity>> ABJURATION_TURRET_2 = register("abjuration_turret_2",
			EntityType.Builder.<AbjurationTurret2Entity>of(AbjurationTurret2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AbjurationTurret2Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AbjurationTurret3Entity>> ABJURATION_TURRET_3 = register("abjuration_turret_3",
			EntityType.Builder.<AbjurationTurret3Entity>of(AbjurationTurret3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AbjurationTurret3Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ManipulationTurret2Entity>> MANIPULATION_TURRET_2 = register("manipulation_turret_2",
			EntityType.Builder.<ManipulationTurret2Entity>of(ManipulationTurret2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ManipulationTurret2Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ManipulationTurret3Entity>> MANIPULATION_TURRET_3 = register("manipulation_turret_3",
			EntityType.Builder.<ManipulationTurret3Entity>of(ManipulationTurret3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ManipulationTurret3Entity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ManipulationShotEntity>> MANIPULATION_SHOT = register("manipulation_shot", EntityType.Builder.<ManipulationShotEntity>of(ManipulationShotEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ManipulationShotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireTurret1Entity.init();
			FireTurret2Entity.init();
			FireTurret3Entity.init();
			WaterTurret1Entity.init();
			EarthTurret1Entity.init();
			AbjurationTurret1Entity.init();
			ConjurationTurret1Entity.init();
			ManipulationTurret1Entity.init();
			AirTurret1Entity.init();
			AirTurret2Entity.init();
			AirTurret3Entity.init();
			WaterTurret2Entity.init();
			EarthTurret2Entity.init();
			WaterTurret3Entity.init();
			EarthTurret3Entity.init();
			DaggerCloudEntity.init();
			ConjurationTurret2Entity.init();
			ConjurationTurret3Entity.init();
			AbjurationTurret2Entity.init();
			AbjurationTurret3Entity.init();
			ManipulationTurret2Entity.init();
			ManipulationTurret3Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FIRE_TURRET_1.get(), FireTurret1Entity.createAttributes().build());
		event.put(FIRE_TURRET_2.get(), FireTurret2Entity.createAttributes().build());
		event.put(FIRE_TURRET_3.get(), FireTurret3Entity.createAttributes().build());
		event.put(WATER_TURRET_1.get(), WaterTurret1Entity.createAttributes().build());
		event.put(EARTH_TURRET_1.get(), EarthTurret1Entity.createAttributes().build());
		event.put(ABJURATION_TURRET_1.get(), AbjurationTurret1Entity.createAttributes().build());
		event.put(CONJURATION_TURRET_1.get(), ConjurationTurret1Entity.createAttributes().build());
		event.put(MANIPULATION_TURRET_1.get(), ManipulationTurret1Entity.createAttributes().build());
		event.put(AIR_TURRET_1.get(), AirTurret1Entity.createAttributes().build());
		event.put(AIR_TURRET_2.get(), AirTurret2Entity.createAttributes().build());
		event.put(AIR_TURRET_3.get(), AirTurret3Entity.createAttributes().build());
		event.put(WATER_TURRET_2.get(), WaterTurret2Entity.createAttributes().build());
		event.put(EARTH_TURRET_2.get(), EarthTurret2Entity.createAttributes().build());
		event.put(WATER_TURRET_3.get(), WaterTurret3Entity.createAttributes().build());
		event.put(EARTH_TURRET_3.get(), EarthTurret3Entity.createAttributes().build());
		event.put(DAGGER_CLOUD.get(), DaggerCloudEntity.createAttributes().build());
		event.put(CONJURATION_TURRET_2.get(), ConjurationTurret2Entity.createAttributes().build());
		event.put(CONJURATION_TURRET_3.get(), ConjurationTurret3Entity.createAttributes().build());
		event.put(ABJURATION_TURRET_2.get(), AbjurationTurret2Entity.createAttributes().build());
		event.put(ABJURATION_TURRET_3.get(), AbjurationTurret3Entity.createAttributes().build());
		event.put(MANIPULATION_TURRET_2.get(), ManipulationTurret2Entity.createAttributes().build());
		event.put(MANIPULATION_TURRET_3.get(), ManipulationTurret3Entity.createAttributes().build());
	}
}
