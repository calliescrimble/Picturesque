package calliescrimble.picturesque.block;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.particle.ModParticles;
import calliescrimble.picturesque.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.ShelfBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import java.util.function.Function;

public class ModBlocks {

    static BlockSetType ASPEN_BLOCK_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.BIRCH).register(Picturesque.id("aspen"));
    static WoodType ASPEN_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.BIRCH).register(Picturesque.id("aspen"), ASPEN_BLOCK_SET_TYPE);

    public static final Block ASPEN_PLANKS = registerBlock("aspen_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_STAIRS = registerBlock("aspen_stairs",
            properties -> new StairBlock(ModBlocks.ASPEN_PLANKS.defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_SLAB = registerBlock("aspen_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_BUTTON = registerBlock("aspen_button",
            properties -> new ButtonBlock(BlockSetType.BIRCH, 30, properties
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .noCollision()));
    public static final Block ASPEN_PRESSURE_PLATE = registerBlock("aspen_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.BIRCH, properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)));
    public static final Block ASPEN_FENCE = registerBlock("aspen_fence",
            properties -> new FenceBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_FENCE_GATE = registerBlock("aspen_fence_gate",
            properties -> new FenceGateBlock(WoodType.BIRCH, properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_DOOR = registerBlock("aspen_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Block ASPEN_TRAPDOOR = registerBlock("aspen_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BIRCH, properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final Block ASPEN_LOG = registerBlock("aspen_log",
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.SNOW)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_WOOD = registerBlock("aspen_wood",
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.SNOW)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block STRIPPED_ASPEN_LOG = registerBlock("stripped_aspen_log",
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block STRIPPED_ASPEN_WOOD = registerBlock("stripped_aspen_wood",
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_LEAVES = registerBlock("aspen_leaves",
            properties -> new AspenLeavesBlock(0.01f, properties
                    .mapColor(MapColor.GOLD)
                    .strength(0.2f)
                    .randomTicks()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor(Blocks::never)));
    public static final Block ASPEN_SAPLING = registerBlock("aspen_sapling",
            properties -> new SaplingBlock(ModSaplingGenerators.ASPEN, properties
                    .mapColor(MapColor.GOLD)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block ASPEN_SAPLING_POT = registerBlockWithoutBlockItem("aspen_sapling_pot",
            properties -> new FlowerPotBlock(ModBlocks.ASPEN_SAPLING, properties
                    .instabreak()
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block ASPEN_SHELF = registerBlock("aspen_shelf",
            properties -> new ShelfBlock(properties
            .mapColor(MapColor.DIRT)
            .sound(SoundType.SHELF)
            .strength(2, 3)
            .ignitedByLava()));
    public static final Block ASPEN_SIGN = registerBlockWithoutBlockItem("aspen_sign",
            properties -> new StandingSignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT)
            .forceSolidOn()
            .noCollision()
            .strength(1)
            .ignitedByLava()));
    public static final Block ASPEN_WALL_SIGN = registerBlockWithoutBlockItem("aspen_wall_sign",
            properties -> new WallSignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT)
            .forceSolidOn()
            .noCollision()
            .strength(1)
            .overrideLootTable(ASPEN_SIGN.getLootTable())
            .ignitedByLava()));
    public static final Block ASPEN_HANGING_SIGN = registerBlockWithoutBlockItem("aspen_hanging_sign",
            properties -> new CeilingHangingSignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT)
            .forceSolidOn()
            .noCollision()
            .strength(1)
            .ignitedByLava()));
    public static final Block ASPEN_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("aspen_wall_hanging_sign",
            properties -> new WallHangingSignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT)
            .forceSolidOn()
            .noCollision()
            .strength(1)
            .overrideLootTable(ASPEN_HANGING_SIGN.getLootTable())
            .ignitedByLava()));
    public static final Block OAK_HERRINGBONE = registerBlock("oak_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.WOOD)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block SPRUCE_HERRINGBONE = registerBlock("spruce_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.PODZOL)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block BIRCH_HERRINGBONE = registerBlock("birch_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.SAND)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block JUNGLE_HERRINGBONE = registerBlock("jungle_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ACACIA_HERRINGBONE = registerBlock("acacia_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block DARK_OAK_HERRINGBONE = registerBlock("dark_oak_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block MANGROVE_HERRINGBONE = registerBlock("mangrove_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CHERRY_HERRINGBONE = registerBlock("cherry_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block PALE_OAK_HERRINGBONE = registerBlock("pale_oak_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.SNOW)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block BAMBOO_HERRINGBONE = registerBlock("bamboo_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(2f, 3f)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()));
    public static final Block CRIMSON_HERRINGBONE = registerBlock("crimson_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.CRIMSON_HYPHAE)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block WARPED_HERRINGBONE = registerBlock("warped_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_HERRINGBONE = registerBlock("aspen_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.WOOD)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.PODZOL)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.SAND)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block PALE_OAK_MOSAIC = registerBlock("pale_oak_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.SNOW)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.CRIMSON_HYPHAE)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_MOSAIC = registerBlock("aspen_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.WOOD)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.PODZOL)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block PALE_OAK_MOSAIC_SLAB = registerBlock("pale_oak_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SNOW)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.CRIMSON_HYPHAE)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_MOSAIC_SLAB = registerBlock("aspen_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.OAK_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.WOOD)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.SPRUCE_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.PODZOL)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.BIRCH_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.SAND)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.JUNGLE_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.ACACIA_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.DARK_OAK_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.MANGROVE_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.CHERRY_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final Block PALE_OAK_MOSAIC_STAIRS = registerBlock("pale_oak_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.PALE_OAK_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.SNOW)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.CRIMSON_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.CRIMSON_HYPHAE)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.WARPED_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(2f, 3f)
                    .sound(SoundType.NETHER_WOOD)
                    .ignitedByLava()));
    public static final Block ASPEN_MOSAIC_STAIRS = registerBlock("aspen_mosaic_stairs",
            properties -> new StairBlock(ModBlocks.ASPEN_MOSAIC.defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .strength(2f, 3f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairBlock(ModBlocks.CALCITE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs",
            properties -> new StairBlock(ModBlocks.CALCITE_TILES.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_BRICKS = registerBlock("smooth_basalt_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_BRICK_STAIRS = registerBlock("smooth_basalt_brick_stairs",
            properties -> new StairBlock(ModBlocks.SMOOTH_BASALT_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_BRICK_SLAB = registerBlock("smooth_basalt_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)));
    public static final Block SMOOTH_BASALT_BRICK_WALL = registerBlock("smooth_basalt_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.75f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_GRANITE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.DIRT)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.WOOL)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.WOOL)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_DIORITE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.WOOL)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.WOOL)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.WOOL)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.STONE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block WHITE_BRICKS = registerBlock("white_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GRAY_BRICKS = registerBlock("gray_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLACK_BRICKS = registerBlock("black_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BROWN_BRICKS = registerBlock("brown_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block RED_BRICKS = registerBlock("red_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block ORANGE_BRICKS = registerBlock("orange_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block YELLOW_BRICKS = registerBlock("yellow_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIME_BRICKS = registerBlock("lime_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GREEN_BRICKS = registerBlock("green_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block CYAN_BRICKS = registerBlock("cyan_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_BLUE_BRICKS = registerBlock("light_blue_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLUE_BRICKS = registerBlock("blue_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PURPLE_BRICKS = registerBlock("purple_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block MAGENTA_BRICKS = registerBlock("magenta_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PINK_BRICKS = registerBlock("pink_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block WHITE_BRICK_WALL = registerBlock("white_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            properties -> new StairBlock(ModBlocks.LIGHT_GRAY_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_GRAY_BRICK_WALL = registerBlock("light_gray_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            properties -> new StairBlock(ModBlocks.GRAY_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GRAY_BRICK_WALL = registerBlock("gray_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            properties -> new StairBlock(ModBlocks.BLACK_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLACK_BRICK_WALL = registerBlock("black_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BROWN_BRICK_STAIRS = registerBlock("brown_brick_stairs",
            properties -> new StairBlock(ModBlocks.BROWN_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BROWN_BRICK_SLAB = registerBlock("brown_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BROWN_BRICK_WALL = registerBlock("brown_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            properties -> new StairBlock(ModBlocks.RED_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block RED_BRICK_SLAB = registerBlock("red_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block RED_BRICK_WALL = registerBlock("red_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs",
            properties -> new StairBlock(ModBlocks.ORANGE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block ORANGE_BRICK_WALL = registerBlock("orange_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            properties -> new StairBlock(ModBlocks.YELLOW_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block YELLOW_BRICK_WALL = registerBlock("yellow_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs",
            properties -> new StairBlock(ModBlocks.LIME_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIME_BRICK_SLAB = registerBlock("lime_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIME_BRICK_WALL = registerBlock("lime_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs",
            properties -> new StairBlock(ModBlocks.GREEN_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GREEN_BRICK_SLAB = registerBlock("green_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block GREEN_BRICK_WALL = registerBlock("green_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block CYAN_BRICK_STAIRS = registerBlock("cyan_brick_stairs",
            properties -> new StairBlock(ModBlocks.CYAN_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block CYAN_BRICK_SLAB = registerBlock("cyan_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block CYAN_BRICK_WALL = registerBlock("cyan_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerBlock("light_blue_brick_stairs",
            properties -> new StairBlock(ModBlocks.LIGHT_BLUE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_BLUE_BRICK_SLAB = registerBlock("light_blue_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block LIGHT_BLUE_BRICK_WALL = registerBlock("light_blue_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            properties -> new StairBlock(ModBlocks.BLUE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block BLUE_BRICK_WALL = registerBlock("blue_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PURPLE_BRICK_STAIRS = registerBlock("purple_brick_stairs",
            properties -> new StairBlock(ModBlocks.PURPLE_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PURPLE_BRICK_SLAB = registerBlock("purple_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PURPLE_BRICK_WALL = registerBlock("purple_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block MAGENTA_BRICK_STAIRS = registerBlock("magenta_brick_stairs",
            properties -> new StairBlock(ModBlocks.MAGENTA_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block MAGENTA_BRICK_SLAB = registerBlock("magenta_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block MAGENTA_BRICK_WALL = registerBlock("magenta_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PINK_BRICK_STAIRS = registerBlock("pink_brick_stairs",
            properties -> new StairBlock(ModBlocks.PINK_BRICKS.defaultBlockState(), properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PINK_BRICK_SLAB = registerBlock("pink_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    public static final Block PINK_BRICK_WALL = registerBlock("pink_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block MARIGOLD = registerBlock("marigold",
            properties -> new FlowerBlock(MobEffects.FIRE_RESISTANCE, 3f, properties
                    .mapColor(MapColor.GOLD)
                    .noCollision()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block MARIGOLD_POT = registerBlockWithoutBlockItem("marigold_pot",
           properties -> new FlowerPotBlock(ModBlocks.MARIGOLD, properties
                   .instabreak()
                   .noOcclusion()
                   .pushReaction(PushReaction.DESTROY)));
    public static final Block VIOLET_HEATHER = registerBlock("violet_heather",
            properties -> new FlowerBlock(MobEffects.SPEED, 5f, properties
                    .mapColor(MapColor.CRIMSON_HYPHAE)
                    .noCollision()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block MAUVE_HEATHER = registerBlock("mauve_heather",
            properties -> new FlowerBlock(MobEffects.SPEED, 5f, properties
                    .mapColor(MapColor.ICE)
                    .noCollision()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block WHITE_HEATHER = registerBlock("white_heather",
            properties -> new FlowerBlock(MobEffects.SPEED, 5f, properties
                    .mapColor(MapColor.SNOW)
                    .noCollision()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            properties -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));

    public static final Block WHITE_CHERRY_LEAVES = registerBlock("white_cherry_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1f, ModParticles.WHITE_CHERRY_PETAL, properties
                    .mapColor(MapColor.SNOW)
                    .strength(0.2f)
                    .randomTicks()
                    .sound(SoundType.CHERRY_LEAVES)
                    .noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
                    .isRedstoneConductor(Blocks::never)));
    public static final Block WHITE_CHERRY_SAPLING = registerBlock("white_cherry_sapling",
            properties -> new SaplingBlock(ModSaplingGenerators.WHITE_CHERRY, properties
                    .mapColor(MapColor.SNOW)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CHERRY_SAPLING)
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block WHITE_CHERRY_SAPLING_POT = registerBlockWithoutBlockItem("white_cherry_sapling_pot",
            properties -> new FlowerPotBlock(ModBlocks.WHITE_CHERRY_SAPLING, properties
                    .instabreak()
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block OAK_LEAF_PILE = registerBlock("oak_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block SPRUCE_LEAF_PILE = registerBlock("spruce_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block BIRCH_LEAF_PILE = registerBlock("birch_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block ASPEN_LEAF_PILE = registerBlock("aspen_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.GOLD)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block JUNGLE_LEAF_PILE = registerBlock("jungle_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block ACACIA_LEAF_PILE = registerBlock("acacia_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block DARK_OAK_LEAF_PILE = registerBlock("dark_oak_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block MANGROVE_LEAF_PILE = registerBlock("mangrove_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block AZALEA_LEAF_PILE = registerBlock("azalea_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.AZALEA_LEAVES)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block FLOWERING_AZALEA_LEAF_PILE = registerBlock("flowering_azalea_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .sound(SoundType.FLOWERING_AZALEA)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block CHERRY_LEAF_PILE = registerBlock("cherry_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.2f)
                    .sound(SoundType.CHERRY_LEAVES)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block WHITE_CHERRY_LEAF_PILE = registerBlock("white_cherry_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.SNOW)
                    .strength(0.2f)
                    .sound(SoundType.CHERRY_LEAVES)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block PALE_OAK_LEAF_PILE = registerBlock("pale_oak_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.METAL)
                    .strength(0.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block REDSTONE_LANTERN = registerBlock("redstone_lantern",
            properties -> new LanternBlock(properties
                    .mapColor(MapColor.METAL)
                    .strength(3.5f, 3.5f)
                    .sound(SoundType.LANTERN)
                    .pushReaction(PushReaction.DESTROY)
                    .lightLevel(state -> 8)));
    public static final Block CALLIE_PLUSHIE = registerBlock("callie_plushie",
            properties -> new CalliePlushieBlock(properties
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(0.8f, 0.8f)
                    .sound(SoundType.WOOL)
                    .noOcclusion()));
    public static final Block CYNTHIA_PLUSHIE = registerBlock("cynthia_plushie",
            properties -> new CynthiaPlushieBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(0.8f, 0.8f)
                    .sound(SoundType.WOOL)
                    .noOcclusion()));

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name),
                function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name)))));
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name)))));
    }

    public static void initialize() {

        StrippableBlockRegistry.register(ModBlocks.ASPEN_LOG, ModBlocks.STRIPPED_ASPEN_LOG);
        StrippableBlockRegistry.register(ModBlocks.ASPEN_WOOD, ModBlocks.STRIPPED_ASPEN_WOOD);

        BlockEntityType.SHELF.addValidBlock(ModBlocks.ASPEN_SHELF);
        BlockEntityType.SIGN.addValidBlock(ModBlocks.ASPEN_SIGN);
        BlockEntityType.SIGN.addValidBlock(ModBlocks.ASPEN_WALL_SIGN);
        BlockEntityType.HANGING_SIGN.addValidBlock(ModBlocks.ASPEN_HANGING_SIGN);
        BlockEntityType.HANGING_SIGN.addValidBlock(ModBlocks.ASPEN_WALL_HANGING_SIGN);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ASPEN_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ASPEN_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_CHERRY_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_CHERRY_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FLOWERING_AZALEA_LEAF_PILE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_HERRINGBONE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_MOSAIC_SLAB, 5, 20);

    }
}
