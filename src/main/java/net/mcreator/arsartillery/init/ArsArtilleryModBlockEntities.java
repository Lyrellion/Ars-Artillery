
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.arsartillery.block.entity.WaterstoneTileEntity;
import net.mcreator.arsartillery.block.entity.ManipulationstoneTileEntity;
import net.mcreator.arsartillery.block.entity.FirestoneTileEntity;
import net.mcreator.arsartillery.block.entity.EarthstoneTileEntity;
import net.mcreator.arsartillery.block.entity.ConjurationstoneTileEntity;
import net.mcreator.arsartillery.block.entity.AirstoneTileEntity;
import net.mcreator.arsartillery.block.entity.AbjurationstoneTileEntity;
import net.mcreator.arsartillery.ArsArtilleryMod;

public class ArsArtilleryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ArsArtilleryMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FIRESTONE = register("firestone", ArsArtilleryModBlocks.FIRESTONE, FirestoneTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> AIRSTONE = register("airstone", ArsArtilleryModBlocks.AIRSTONE, AirstoneTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> WATERSTONE = register("waterstone", ArsArtilleryModBlocks.WATERSTONE, WaterstoneTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> EARTHSTONE = register("earthstone", ArsArtilleryModBlocks.EARTHSTONE, EarthstoneTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ABJURATIONSTONE = register("abjurationstone", ArsArtilleryModBlocks.ABJURATIONSTONE, AbjurationstoneTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CONJURATIONSTONE = register("conjurationstone", ArsArtilleryModBlocks.CONJURATIONSTONE, ConjurationstoneTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> MANIPULATIONSTONE = register("manipulationstone", ArsArtilleryModBlocks.MANIPULATIONSTONE, ManipulationstoneTileEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
