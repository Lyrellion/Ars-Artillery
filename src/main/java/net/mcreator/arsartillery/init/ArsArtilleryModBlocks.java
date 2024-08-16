
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArsArtilleryMod.MODID);
	public static final RegistryObject<Block> FIRESTONE = REGISTRY.register("firestone", () -> new FirestoneBlock());
	public static final RegistryObject<Block> AIRSTONE = REGISTRY.register("airstone", () -> new AirstoneBlock());
	public static final RegistryObject<Block> WATERSTONE = REGISTRY.register("waterstone", () -> new WaterstoneBlock());
	public static final RegistryObject<Block> EARTHSTONE = REGISTRY.register("earthstone", () -> new EarthstoneBlock());
	public static final RegistryObject<Block> ABJURATIONSTONE = REGISTRY.register("abjurationstone", () -> new AbjurationstoneBlock());
	public static final RegistryObject<Block> CONJURATIONSTONE = REGISTRY.register("conjurationstone", () -> new ConjurationstoneBlock());
	public static final RegistryObject<Block> MANIPULATIONSTONE = REGISTRY.register("manipulationstone", () -> new ManipulationstoneBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
