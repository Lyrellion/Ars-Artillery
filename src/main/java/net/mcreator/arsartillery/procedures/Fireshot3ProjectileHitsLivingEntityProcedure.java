package net.mcreator.arsartillery.procedures;

import net.minecraft.world.entity.Entity;

public class Fireshot3ProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
