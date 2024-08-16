
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arsartillery.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.arsartillery.block.entity.WaterstoneTileEntity;
import net.mcreator.arsartillery.block.entity.ManipulationstoneTileEntity;
import net.mcreator.arsartillery.block.entity.FirestoneTileEntity;
import net.mcreator.arsartillery.block.entity.EarthstoneTileEntity;
import net.mcreator.arsartillery.block.entity.ConjurationstoneTileEntity;
import net.mcreator.arsartillery.block.entity.AirstoneTileEntity;
import net.mcreator.arsartillery.block.entity.AbjurationstoneTileEntity;
import net.mcreator.arsartillery.ArsArtilleryMod;

public class ArsArtilleryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ArsArtilleryMod.MODID);
	public static final RegistryObject<BlockEntityType<FirestoneTileEntity>> FIRESTONE = REGISTRY.register("firestone", () -> BlockEntityType.Builder.of(FirestoneTileEntity::new, ArsArtilleryModBlocks.FIRESTONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AirstoneTileEntity>> AIRSTONE = REGISTRY.register("airstone", () -> BlockEntityType.Builder.of(AirstoneTileEntity::new, ArsArtilleryModBlocks.AIRSTONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<WaterstoneTileEntity>> WATERSTONE = REGISTRY.register("waterstone", () -> BlockEntityType.Builder.of(WaterstoneTileEntity::new, ArsArtilleryModBlocks.WATERSTONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<EarthstoneTileEntity>> EARTHSTONE = REGISTRY.register("earthstone", () -> BlockEntityType.Builder.of(EarthstoneTileEntity::new, ArsArtilleryModBlocks.EARTHSTONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AbjurationstoneTileEntity>> ABJURATIONSTONE = REGISTRY.register("abjurationstone",
			() -> BlockEntityType.Builder.of(AbjurationstoneTileEntity::new, ArsArtilleryModBlocks.ABJURATIONSTONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ConjurationstoneTileEntity>> CONJURATIONSTONE = REGISTRY.register("conjurationstone",
			() -> BlockEntityType.Builder.of(ConjurationstoneTileEntity::new, ArsArtilleryModBlocks.CONJURATIONSTONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ManipulationstoneTileEntity>> MANIPULATIONSTONE = REGISTRY.register("manipulationstone",
			() -> BlockEntityType.Builder.of(ManipulationstoneTileEntity::new, ArsArtilleryModBlocks.MANIPULATIONSTONE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
