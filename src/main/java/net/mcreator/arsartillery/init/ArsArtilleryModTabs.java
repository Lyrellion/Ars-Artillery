
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.arsartillery.ArsArtilleryMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArsArtilleryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArsArtilleryMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ArsArtilleryModBlocks.FIRESTONE.get().asItem());
			tabData.accept(ArsArtilleryModBlocks.AIRSTONE.get().asItem());
			tabData.accept(ArsArtilleryModBlocks.WATERSTONE.get().asItem());
			tabData.accept(ArsArtilleryModBlocks.EARTHSTONE.get().asItem());
			tabData.accept(ArsArtilleryModBlocks.ABJURATIONSTONE.get().asItem());
			tabData.accept(ArsArtilleryModBlocks.CONJURATIONSTONE.get().asItem());
			tabData.accept(ArsArtilleryModBlocks.MANIPULATIONSTONE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ArsArtilleryModItems.TURRET_SCRAP.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ArsArtilleryModItems.FIRE_TURRET_CRATE.get());
			tabData.accept(ArsArtilleryModItems.AIR_TURRET_CRATE.get());
			tabData.accept(ArsArtilleryModItems.TIER_2_UPGRADE.get());
			tabData.accept(ArsArtilleryModItems.WATER_TURRET_CRATE.get());
			tabData.accept(ArsArtilleryModItems.EARTH_TURRET_CRATE.get());
			tabData.accept(ArsArtilleryModItems.CONJURATION_TURRET_CRATE.get());
			tabData.accept(ArsArtilleryModItems.ABJURATION_TURRET_CRATE.get());
			tabData.accept(ArsArtilleryModItems.MANIPULATION_TURRET_CRATE.get());
			tabData.accept(ArsArtilleryModItems.TIER_3_UPGRADE.get());
		}
	}
}
