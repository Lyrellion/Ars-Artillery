
package net.mcreator.arsartillery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.arsartillery.procedures.Tier2UpgradeRightclickedProcedure;

public class Tier2UpgradeItem extends Item {
	public Tier2UpgradeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Tier2UpgradeRightclickedProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}
}
