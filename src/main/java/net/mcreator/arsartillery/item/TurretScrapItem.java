
package net.mcreator.arsartillery.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TurretScrapItem extends Item {
	public TurretScrapItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
