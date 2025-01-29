
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.arsartillery.item.WaterTurretCrateItem;
import net.mcreator.arsartillery.item.TurretScrapItem;
import net.mcreator.arsartillery.item.Tier3UpgradeItem;
import net.mcreator.arsartillery.item.Tier2UpgradeItem;
import net.mcreator.arsartillery.item.ManipulationTurretCrateItem;
import net.mcreator.arsartillery.item.FireTurretCrateItem;
import net.mcreator.arsartillery.item.EarthTurretCrateItem;
import net.mcreator.arsartillery.item.ConjurationTurretCrateItem;
import net.mcreator.arsartillery.item.AirTurretCrateItem;
import net.mcreator.arsartillery.item.AbjurationTurretCrateItem;
import net.mcreator.arsartillery.block.display.WaterstoneDisplayItem;
import net.mcreator.arsartillery.block.display.ManipulationstoneDisplayItem;
import net.mcreator.arsartillery.block.display.FirestoneDisplayItem;
import net.mcreator.arsartillery.block.display.EarthstoneDisplayItem;
import net.mcreator.arsartillery.block.display.ConjurationstoneDisplayItem;
import net.mcreator.arsartillery.block.display.AirstoneDisplayItem;
import net.mcreator.arsartillery.block.display.AbjurationstoneDisplayItem;
import net.mcreator.arsartillery.ArsArtilleryMod;

public class ArsArtilleryModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ArsArtilleryMod.MODID);
	public static final DeferredItem<Item> FIRESTONE = REGISTRY.register(ArsArtilleryModBlocks.FIRESTONE.getId().getPath(), () -> new FirestoneDisplayItem(ArsArtilleryModBlocks.FIRESTONE.get(), new Item.Properties()));
	public static final DeferredItem<Item> AIRSTONE = REGISTRY.register(ArsArtilleryModBlocks.AIRSTONE.getId().getPath(), () -> new AirstoneDisplayItem(ArsArtilleryModBlocks.AIRSTONE.get(), new Item.Properties()));
	public static final DeferredItem<Item> WATERSTONE = REGISTRY.register(ArsArtilleryModBlocks.WATERSTONE.getId().getPath(), () -> new WaterstoneDisplayItem(ArsArtilleryModBlocks.WATERSTONE.get(), new Item.Properties()));
	public static final DeferredItem<Item> EARTHSTONE = REGISTRY.register(ArsArtilleryModBlocks.EARTHSTONE.getId().getPath(), () -> new EarthstoneDisplayItem(ArsArtilleryModBlocks.EARTHSTONE.get(), new Item.Properties()));
	public static final DeferredItem<Item> ABJURATIONSTONE = REGISTRY.register(ArsArtilleryModBlocks.ABJURATIONSTONE.getId().getPath(), () -> new AbjurationstoneDisplayItem(ArsArtilleryModBlocks.ABJURATIONSTONE.get(), new Item.Properties()));
	public static final DeferredItem<Item> CONJURATIONSTONE = REGISTRY.register(ArsArtilleryModBlocks.CONJURATIONSTONE.getId().getPath(), () -> new ConjurationstoneDisplayItem(ArsArtilleryModBlocks.CONJURATIONSTONE.get(), new Item.Properties()));
	public static final DeferredItem<Item> MANIPULATIONSTONE = REGISTRY.register(ArsArtilleryModBlocks.MANIPULATIONSTONE.getId().getPath(), () -> new ManipulationstoneDisplayItem(ArsArtilleryModBlocks.MANIPULATIONSTONE.get(), new Item.Properties()));
	public static final DeferredItem<Item> FIRE_TURRET_CRATE = REGISTRY.register("fire_turret_crate", FireTurretCrateItem::new);
	public static final DeferredItem<Item> TURRET_SCRAP = REGISTRY.register("turret_scrap", TurretScrapItem::new);
	public static final DeferredItem<Item> AIR_TURRET_CRATE = REGISTRY.register("air_turret_crate", AirTurretCrateItem::new);
	public static final DeferredItem<Item> TIER_2_UPGRADE = REGISTRY.register("tier_2_upgrade", Tier2UpgradeItem::new);
	public static final DeferredItem<Item> WATER_TURRET_CRATE = REGISTRY.register("water_turret_crate", WaterTurretCrateItem::new);
	public static final DeferredItem<Item> EARTH_TURRET_CRATE = REGISTRY.register("earth_turret_crate", EarthTurretCrateItem::new);
	public static final DeferredItem<Item> CONJURATION_TURRET_CRATE = REGISTRY.register("conjuration_turret_crate", ConjurationTurretCrateItem::new);
	public static final DeferredItem<Item> ABJURATION_TURRET_CRATE = REGISTRY.register("abjuration_turret_crate", AbjurationTurretCrateItem::new);
	public static final DeferredItem<Item> MANIPULATION_TURRET_CRATE = REGISTRY.register("manipulation_turret_crate", ManipulationTurretCrateItem::new);
	public static final DeferredItem<Item> TIER_3_UPGRADE = REGISTRY.register("tier_3_upgrade", Tier3UpgradeItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
