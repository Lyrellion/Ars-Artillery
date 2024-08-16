
package net.mcreator.arsartillery.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.arsartillery.procedures.AirTurretCrateRightClickProcedure;

public class AirTurretCrateItem extends Item {
	public AirTurretCrateItem() {
		super(new Item.Properties().durability(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		AirTurretCrateRightClickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
