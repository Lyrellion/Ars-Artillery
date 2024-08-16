package net.mcreator.arsartillery.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.arsartillery.init.ArsArtilleryModItems;
import net.mcreator.arsartillery.init.ArsArtilleryModEntities;
import net.mcreator.arsartillery.entity.WaterTurret1Entity;
import net.mcreator.arsartillery.entity.ManipulationTurret1Entity;
import net.mcreator.arsartillery.entity.FireTurret1Entity;
import net.mcreator.arsartillery.entity.EarthTurret1Entity;
import net.mcreator.arsartillery.entity.ConjurationTurret1Entity;
import net.mcreator.arsartillery.entity.AirTurret1Entity;
import net.mcreator.arsartillery.entity.AbjurationTurret1Entity;

public class Tier2UpgradeRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof FireTurret1Entity) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ArsArtilleryModEntities.FIRE_TURRET_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ArsArtilleryModItems.TIER_2_UPGRADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity instanceof AirTurret1Entity) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ArsArtilleryModEntities.AIR_TURRET_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ArsArtilleryModItems.TIER_2_UPGRADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity instanceof WaterTurret1Entity) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ArsArtilleryModEntities.WATER_TURRET_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ArsArtilleryModItems.TIER_2_UPGRADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity instanceof EarthTurret1Entity) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ArsArtilleryModEntities.EARTH_TURRET_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ArsArtilleryModItems.TIER_2_UPGRADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity instanceof ConjurationTurret1Entity) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ArsArtilleryModEntities.CONJURATION_TURRET_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ArsArtilleryModItems.TIER_2_UPGRADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity instanceof AbjurationTurret1Entity) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ArsArtilleryModEntities.ABJURATION_TURRET_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ArsArtilleryModItems.TIER_2_UPGRADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (entity instanceof ManipulationTurret1Entity) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ArsArtilleryModEntities.MANIPULATION_TURRET_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ArsArtilleryModItems.TIER_2_UPGRADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
