
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.arsartillery.block.WaterstoneBlock;
import net.mcreator.arsartillery.block.ManipulationstoneBlock;
import net.mcreator.arsartillery.block.FirestoneBlock;
import net.mcreator.arsartillery.block.EarthstoneBlock;
import net.mcreator.arsartillery.block.ConjurationstoneBlock;
import net.mcreator.arsartillery.block.AirstoneBlock;
import net.mcreator.arsartillery.block.AbjurationstoneBlock;
import net.mcreator.arsartillery.ArsArtilleryMod;

public class ArsArtilleryModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ArsArtilleryMod.MODID);
	public static final DeferredBlock<Block> FIRESTONE = REGISTRY.register("firestone", FirestoneBlock::new);
	public static final DeferredBlock<Block> AIRSTONE = REGISTRY.register("airstone", AirstoneBlock::new);
	public static final DeferredBlock<Block> WATERSTONE = REGISTRY.register("waterstone", WaterstoneBlock::new);
	public static final DeferredBlock<Block> EARTHSTONE = REGISTRY.register("earthstone", EarthstoneBlock::new);
	public static final DeferredBlock<Block> ABJURATIONSTONE = REGISTRY.register("abjurationstone", AbjurationstoneBlock::new);
	public static final DeferredBlock<Block> CONJURATIONSTONE = REGISTRY.register("conjurationstone", ConjurationstoneBlock::new);
	public static final DeferredBlock<Block> MANIPULATIONSTONE = REGISTRY.register("manipulationstone", ManipulationstoneBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
