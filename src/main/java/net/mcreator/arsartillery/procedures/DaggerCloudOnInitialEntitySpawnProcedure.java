package net.mcreator.arsartillery.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.arsartillery.ArsArtilleryMod;

public class DaggerCloudOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ArsArtilleryMod.queueServerWork(200, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
