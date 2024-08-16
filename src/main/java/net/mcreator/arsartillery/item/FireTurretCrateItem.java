
package net.mcreator.arsartillery.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.arsartillery.procedures.FireTurret1CrateRightclickedOnBlockProcedure;

public class FireTurretCrateItem extends Item {
	public FireTurretCrateItem() {
		super(new Item.Properties().durability(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		FireTurret1CrateRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
