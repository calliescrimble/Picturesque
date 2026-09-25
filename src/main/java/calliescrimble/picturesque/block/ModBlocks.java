package calliescrimble.picturesque.block;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.particle.ModParticles;
import calliescrimble.picturesque.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class ModBlocks {

    static BlockSetType ASPEN_BLOCK_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.BIRCH).register(Picturesque.id("aspen"));
    static WoodType ASPEN_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.BIRCH).register(Picturesque.id("aspen"), ASPEN_BLOCK_SET_TYPE);

    public static final Block ASPEN_PLANKS = registerBlock("aspen_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ASPEN_STAIRS = registerBlock("aspen_stairs",
            properties -> new StairsBlock(ModBlocks.ASPEN_PLANKS.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ASPEN_SLAB = registerBlock("aspen_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ASPEN_BUTTON = registerBlock("aspen_button",
            properties -> new ButtonBlock(BlockSetType.BIRCH, 30, properties
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .noCollision()));
    public static final Block ASPEN_PRESSURE_PLATE = registerBlock("aspen_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.BIRCH, properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block ASPEN_FENCE = registerBlock("aspen_fence",
            properties -> new FenceBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ASPEN_FENCE_GATE = registerBlock("aspen_fence_gate",
            properties -> new FenceGateBlock(WoodType.BIRCH, properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ASPEN_DOOR = registerBlock("aspen_door",
            properties -> new DoorBlock(BlockSetType.BIRCH, properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .nonOpaque()));
    public static final Block ASPEN_TRAPDOOR = registerBlock("aspen_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.BIRCH, properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .nonOpaque()));
    public static final Block ASPEN_LOG = registerBlock("aspen_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.WHITE)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ASPEN_WOOD = registerBlock("aspen_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.WHITE)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_ASPEN_LOG = registerBlock("stripped_aspen_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_ASPEN_WOOD = registerBlock("stripped_aspen_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ASPEN_LEAVES = registerBlock("aspen_leaves",
            properties -> new AspenLeavesBlock(0.01f, properties
                    .mapColor(MapColor.GOLD)
                    .strength(0.2f)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block ASPEN_SAPLING = registerBlock("aspen_sapling",
            properties -> new SaplingBlock(ModSaplingGenerators.ASPEN, properties
                    .mapColor(MapColor.GOLD)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ASPEN_SAPLING_POT = registerBlockWithoutBlockItem("aspen_sapling_pot",
            properties -> new FlowerPotBlock(ModBlocks.ASPEN_SAPLING, properties
                    .breakInstantly()
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ASPEN_SHELF = registerBlock("aspen_shelf",
            properties -> new ShelfBlock(properties
            .mapColor(MapColor.DIRT_BROWN)
            .sounds(BlockSoundGroup.SHELF)
            .strength(2, 3)
            .burnable()));
    public static final Block ASPEN_SIGN = registerBlockWithoutBlockItem("aspen_sign",
            properties -> new SignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT_BROWN)
            .solid()
            .noCollision()
            .strength(1)
            .burnable()));
    public static final Block ASPEN_WALL_SIGN = registerBlockWithoutBlockItem("aspen_wall_sign",
            properties -> new WallSignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT_BROWN)
            .solid()
            .noCollision()
            .strength(1)
            .lootTable(ASPEN_SIGN.getLootTableKey())
            .burnable()));
    public static final Block ASPEN_HANGING_SIGN = registerBlockWithoutBlockItem("aspen_hanging_sign",
            properties -> new HangingSignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT_BROWN)
            .solid()
            .noCollision()
            .strength(1)
            .burnable()));
    public static final Block ASPEN_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("aspen_wall_hanging_sign",
            properties -> new WallHangingSignBlock(ASPEN_WOOD_TYPE, properties
            .mapColor(MapColor.DIRT_BROWN)
            .solid()
            .noCollision()
            .strength(1)
            .lootTable(ASPEN_HANGING_SIGN.getLootTableKey())
            .burnable()));
    public static final Block OAK_HERRINGBONE = registerBlock("oak_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block SPRUCE_HERRINGBONE = registerBlock("spruce_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block BIRCH_HERRINGBONE = registerBlock("birch_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block JUNGLE_HERRINGBONE = registerBlock("jungle_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ACACIA_HERRINGBONE = registerBlock("acacia_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.ORANGE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block DARK_OAK_HERRINGBONE = registerBlock("dark_oak_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block MANGROVE_HERRINGBONE = registerBlock("mangrove_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.RED)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHERRY_HERRINGBONE = registerBlock("cherry_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block PALE_OAK_HERRINGBONE = registerBlock("pale_oak_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block BAMBOO_HERRINGBONE = registerBlock("bamboo_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.YELLOW)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .burnable()));
    public static final Block CRIMSON_HERRINGBONE = registerBlock("crimson_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.DARK_CRIMSON)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block WARPED_HERRINGBONE = registerBlock("warped_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.CYAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block ASPEN_HERRINGBONE = registerBlock("aspen_herringbone",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block OAK_MOSAIC = registerBlock("oak_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block BIRCH_MOSAIC = registerBlock("birch_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.ORANGE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.RED)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block PALE_OAK_MOSAIC = registerBlock("pale_oak_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.DARK_CRIMSON)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block WARPED_MOSAIC = registerBlock("warped_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.CYAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block ASPEN_MOSAIC = registerBlock("aspen_mosaic",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.ORANGE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.RED)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block PALE_OAK_MOSAIC_SLAB = registerBlock("pale_oak_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DARK_CRIMSON)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.CYAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block ASPEN_MOSAIC_SLAB = registerBlock("aspen_mosaic_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.OAK_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.SPRUCE_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.BIRCH_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.JUNGLE_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.ACACIA_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.ORANGE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.DARK_OAK_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.MANGROVE_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.RED)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.CHERRY_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block PALE_OAK_MOSAIC_STAIRS = registerBlock("pale_oak_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.PALE_OAK_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.WHITE)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.CRIMSON_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.DARK_CRIMSON)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.WARPED_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.CYAN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable()));
    public static final Block ASPEN_MOSAIC_STAIRS = registerBlock("aspen_mosaic_stairs",
            properties -> new StairsBlock(ModBlocks.ASPEN_MOSAIC.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(2f, 3f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairsBlock(Blocks.CALCITE.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs",
            properties -> new StairsBlock(ModBlocks.CALCITE_TILES.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties -> new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), properties
                    .mapColor(MapColor.BLACK)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.BLACK)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.BLACK)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_BRICKS = registerBlock("smooth_basalt_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.BLACK)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_BRICK_STAIRS = registerBlock("smooth_basalt_brick_stairs",
            properties -> new StairsBlock(ModBlocks.SMOOTH_BASALT_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.BLACK)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_BRICK_SLAB = registerBlock("smooth_basalt_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.BLACK)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_BRICK_WALL = registerBlock("smooth_basalt_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.BLACK)
                    .strength(0.75f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.BASALT)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_GRANITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.WHITE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.WHITE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_DIORITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.WHITE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.WHITE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.WHITE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_BRICKS = registerBlock("white_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_BRICKS = registerBlock("gray_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_BRICKS = registerBlock("black_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_BRICKS = registerBlock("brown_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RED_BRICKS = registerBlock("red_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_BRICKS = registerBlock("orange_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_BRICKS = registerBlock("yellow_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_BRICKS = registerBlock("lime_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIME)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_BRICKS = registerBlock("green_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_BRICKS = registerBlock("cyan_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_BRICKS = registerBlock("light_blue_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_BRICKS = registerBlock("blue_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_BRICKS = registerBlock("purple_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_BRICKS = registerBlock("magenta_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_BRICKS = registerBlock("pink_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            properties -> new StairsBlock(ModBlocks.WHITE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_BRICK_WALL = registerBlock("white_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            properties -> new StairsBlock(ModBlocks.LIGHT_GRAY_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_GRAY_BRICK_WALL = registerBlock("light_gray_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            properties -> new StairsBlock(ModBlocks.GRAY_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GRAY_BRICK_WALL = registerBlock("gray_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            properties -> new StairsBlock(ModBlocks.BLACK_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLACK_BRICK_WALL = registerBlock("black_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_BRICK_STAIRS = registerBlock("brown_brick_stairs",
            properties -> new StairsBlock(ModBlocks.BROWN_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_BRICK_SLAB = registerBlock("brown_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BROWN_BRICK_WALL = registerBlock("brown_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            properties -> new StairsBlock(ModBlocks.RED_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RED_BRICK_SLAB = registerBlock("red_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RED_BRICK_WALL = registerBlock("red_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs",
            properties -> new StairsBlock(ModBlocks.ORANGE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_BRICK_WALL = registerBlock("orange_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            properties -> new StairsBlock(ModBlocks.YELLOW_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block YELLOW_BRICK_WALL = registerBlock("yellow_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs",
            properties -> new StairsBlock(ModBlocks.LIME_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_LIME)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_BRICK_SLAB = registerBlock("lime_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIME)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIME_BRICK_WALL = registerBlock("lime_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIME)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs",
            properties -> new StairsBlock(ModBlocks.GREEN_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_BRICK_SLAB = registerBlock("green_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_BRICK_WALL = registerBlock("green_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_BRICK_STAIRS = registerBlock("cyan_brick_stairs",
            properties -> new StairsBlock(ModBlocks.CYAN_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_BRICK_SLAB = registerBlock("cyan_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CYAN_BRICK_WALL = registerBlock("cyan_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerBlock("light_blue_brick_stairs",
            properties -> new StairsBlock(ModBlocks.LIGHT_BLUE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_BRICK_SLAB = registerBlock("light_blue_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block LIGHT_BLUE_BRICK_WALL = registerBlock("light_blue_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            properties -> new StairsBlock(ModBlocks.BLUE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_BRICK_WALL = registerBlock("blue_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_BRICK_STAIRS = registerBlock("purple_brick_stairs",
            properties -> new StairsBlock(ModBlocks.PURPLE_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_BRICK_SLAB = registerBlock("purple_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PURPLE_BRICK_WALL = registerBlock("purple_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_BRICK_STAIRS = registerBlock("magenta_brick_stairs",
            properties -> new StairsBlock(ModBlocks.MAGENTA_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_BRICK_SLAB = registerBlock("magenta_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MAGENTA_BRICK_WALL = registerBlock("magenta_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_BRICK_STAIRS = registerBlock("pink_brick_stairs",
            properties -> new StairsBlock(ModBlocks.PINK_BRICKS.getDefaultState(), properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_BRICK_SLAB = registerBlock("pink_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_BRICK_WALL = registerBlock("pink_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MARIGOLD = registerBlock("marigold",
            properties -> new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 3f, properties
                    .mapColor(MapColor.GOLD)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MARIGOLD_POT = registerBlockWithoutBlockItem("marigold_pot",
           properties -> new FlowerPotBlock(ModBlocks.MARIGOLD, properties
                   .breakInstantly()
                   .nonOpaque()
                   .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block VIOLET_HEATHER = registerBlock("violet_heather",
            properties -> new FlowerBlock(StatusEffects.SPEED, 5f, properties
                    .mapColor(MapColor.DARK_CRIMSON)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAUVE_HEATHER = registerBlock("mauve_heather",
            properties -> new FlowerBlock(StatusEffects.SPEED, 5f, properties
                    .mapColor(MapColor.PALE_PURPLE)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_HEATHER = registerBlock("white_heather",
            properties -> new FlowerBlock(StatusEffects.SPEED, 5f, properties
                    .mapColor(MapColor.WHITE)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            properties -> new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), properties
                    .mapColor(MapColor.PURPLE)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.PURPLE)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.PURPLE)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block WHITE_CHERRY_LEAVES = registerBlock("white_cherry_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1f, ModParticles.WHITE_CHERRY_PETAL, properties
                    .mapColor(MapColor.WHITE)
                    .strength(0.2f)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block WHITE_CHERRY_SAPLING = registerBlock("white_cherry_sapling",
            properties -> new SaplingBlock(ModSaplingGenerators.WHITE_CHERRY, properties
                    .mapColor(MapColor.WHITE)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_CHERRY_SAPLING_POT = registerBlockWithoutBlockItem("white_cherry_sapling_pot",
            properties -> new FlowerPotBlock(ModBlocks.WHITE_CHERRY_SAPLING, properties
                    .breakInstantly()
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block OAK_LEAF_PILE = registerBlock("oak_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SPRUCE_LEAF_PILE = registerBlock("spruce_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BIRCH_LEAF_PILE = registerBlock("birch_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ASPEN_LEAF_PILE = registerBlock("aspen_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.GOLD)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block JUNGLE_LEAF_PILE = registerBlock("jungle_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ACACIA_LEAF_PILE = registerBlock("acacia_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DARK_OAK_LEAF_PILE = registerBlock("dark_oak_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MANGROVE_LEAF_PILE = registerBlock("mangrove_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block AZALEA_LEAF_PILE = registerBlock("azalea_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block FLOWERING_AZALEA_LEAF_PILE = registerBlock("flowering_azalea_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.FLOWERING_AZALEA)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CHERRY_LEAF_PILE = registerBlock("cherry_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.PINK)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_CHERRY_LEAF_PILE = registerBlock("white_cherry_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.WHITE)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PALE_OAK_LEAF_PILE = registerBlock("pale_oak_leaf_pile",
            properties -> new CarpetBlock(properties
                    .mapColor(MapColor.IRON_GRAY)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block REDSTONE_LANTERN = registerBlock("redstone_lantern",
            properties -> new LanternBlock(properties
                    .mapColor(MapColor.IRON_GRAY)
                    .strength(3.5f, 3.5f)
                    .sounds(BlockSoundGroup.LANTERN)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance(state -> 8)));
    public static final Block CALLIE_PLUSHIE = registerBlock("callie_plushie",
            properties -> new CalliePlushieBlock(properties
                    .mapColor(MapColor.GRAY)
                    .strength(0.8f, 0.8f)
                    .sounds(BlockSoundGroup.WOOL)
                    .nonOpaque()));
    public static final Block CYNTHIA_PLUSHIE = registerBlock("cynthia_plushie",
            properties -> new CynthiaPlushieBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(0.8f, 0.8f)
                    .sounds(BlockSoundGroup.WOOL)
                    .nonOpaque()));

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(Picturesque.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Picturesque.MOD_ID, name)))));
    }

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Picturesque.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Picturesque.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Picturesque.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Picturesque.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

            entries.addAfter(Blocks.BIRCH_BUTTON, ModBlocks.ASPEN_LOG);
            entries.addAfter(ModBlocks.ASPEN_LOG, ModBlocks.ASPEN_WOOD);
            entries.addAfter(ModBlocks.ASPEN_WOOD, ModBlocks.STRIPPED_ASPEN_LOG);
            entries.addAfter(ModBlocks.STRIPPED_ASPEN_LOG, ModBlocks.STRIPPED_ASPEN_WOOD);
            entries.addAfter(ModBlocks.STRIPPED_ASPEN_WOOD, ModBlocks.ASPEN_PLANKS);
            entries.addAfter(ModBlocks.ASPEN_PLANKS, ModBlocks.ASPEN_STAIRS);
            entries.addAfter(ModBlocks.ASPEN_STAIRS, ModBlocks.ASPEN_SLAB);
            entries.addAfter(ModBlocks.ASPEN_SLAB, ModBlocks.ASPEN_FENCE);
            entries.addAfter(ModBlocks.ASPEN_FENCE, ModBlocks.ASPEN_FENCE_GATE);
            entries.addAfter(ModBlocks.ASPEN_FENCE_GATE, ModBlocks.ASPEN_DOOR);
            entries.addAfter(ModBlocks.ASPEN_DOOR, ModBlocks.ASPEN_TRAPDOOR);
            entries.addAfter(ModBlocks.ASPEN_TRAPDOOR, ModBlocks.ASPEN_PRESSURE_PLATE);
            entries.addAfter(ModBlocks.ASPEN_PRESSURE_PLATE, ModBlocks.ASPEN_BUTTON);
            entries.addAfter(Blocks.OAK_PLANKS, ModBlocks.OAK_HERRINGBONE, ModBlocks.OAK_MOSAIC);
            entries.addAfter(Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_HERRINGBONE, ModBlocks.SPRUCE_MOSAIC);
            entries.addAfter(Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_HERRINGBONE, ModBlocks.BIRCH_MOSAIC);
            entries.addAfter(Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_HERRINGBONE, ModBlocks.JUNGLE_MOSAIC);
            entries.addAfter(Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_HERRINGBONE, ModBlocks.ACACIA_MOSAIC);
            entries.addAfter(Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_HERRINGBONE, ModBlocks.DARK_OAK_MOSAIC);
            entries.addAfter(Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_HERRINGBONE, ModBlocks.MANGROVE_MOSAIC);
            entries.addAfter(Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_HERRINGBONE, ModBlocks.CHERRY_MOSAIC);
            entries.addAfter(Blocks.PALE_OAK_PLANKS, ModBlocks.PALE_OAK_HERRINGBONE, ModBlocks.PALE_OAK_MOSAIC);
            entries.addAfter(Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_HERRINGBONE);
            entries.addAfter(Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_HERRINGBONE, ModBlocks.CRIMSON_MOSAIC);
            entries.addAfter(Blocks.WARPED_PLANKS, ModBlocks.WARPED_HERRINGBONE, ModBlocks.WARPED_MOSAIC);
            entries.addAfter(ModBlocks.ASPEN_PLANKS, ModBlocks.ASPEN_HERRINGBONE, ModBlocks.ASPEN_MOSAIC);
            entries.addAfter(Blocks.OAK_STAIRS, ModBlocks.OAK_MOSAIC_STAIRS);
            entries.addAfter(Blocks.OAK_SLAB, ModBlocks.OAK_MOSAIC_SLAB);
            entries.addAfter(Blocks.SPRUCE_STAIRS, ModBlocks.SPRUCE_MOSAIC_STAIRS);
            entries.addAfter(Blocks.SPRUCE_SLAB, ModBlocks.SPRUCE_MOSAIC_SLAB);
            entries.addAfter(Blocks.BIRCH_STAIRS, ModBlocks.BIRCH_MOSAIC_STAIRS);
            entries.addAfter(Blocks.BIRCH_SLAB, ModBlocks.BIRCH_MOSAIC_SLAB);
            entries.addAfter(Blocks.JUNGLE_STAIRS, ModBlocks.JUNGLE_MOSAIC_STAIRS);
            entries.addAfter(Blocks.JUNGLE_SLAB, ModBlocks.JUNGLE_MOSAIC_SLAB);
            entries.addAfter(Blocks.ACACIA_STAIRS, ModBlocks.ACACIA_MOSAIC_STAIRS);
            entries.addAfter(Blocks.ACACIA_SLAB, ModBlocks.ACACIA_MOSAIC_SLAB);
            entries.addAfter(Blocks.DARK_OAK_STAIRS, ModBlocks.DARK_OAK_MOSAIC_STAIRS);
            entries.addAfter(Blocks.DARK_OAK_SLAB, ModBlocks.DARK_OAK_MOSAIC_SLAB);
            entries.addAfter(Blocks.MANGROVE_STAIRS, ModBlocks.MANGROVE_MOSAIC_STAIRS);
            entries.addAfter(Blocks.MANGROVE_SLAB, ModBlocks.MANGROVE_MOSAIC_SLAB);
            entries.addAfter(Blocks.CHERRY_STAIRS, ModBlocks.CHERRY_MOSAIC_STAIRS);
            entries.addAfter(Blocks.CHERRY_SLAB, ModBlocks.CHERRY_MOSAIC_SLAB);
            entries.addAfter(Blocks.PALE_OAK_STAIRS, ModBlocks.PALE_OAK_MOSAIC_STAIRS);
            entries.addAfter(Blocks.PALE_OAK_SLAB, ModBlocks.PALE_OAK_MOSAIC_SLAB);
            entries.addAfter(Blocks.CRIMSON_STAIRS, ModBlocks.CRIMSON_MOSAIC_STAIRS);
            entries.addAfter(Blocks.CRIMSON_SLAB, ModBlocks.CRIMSON_MOSAIC_SLAB);
            entries.addAfter(Blocks.WARPED_STAIRS, ModBlocks.WARPED_MOSAIC_STAIRS);
            entries.addAfter(Blocks.WARPED_SLAB, ModBlocks.WARPED_MOSAIC_SLAB);
            entries.addAfter(ModBlocks.ASPEN_STAIRS, ModBlocks.ASPEN_MOSAIC_STAIRS);
            entries.addAfter(ModBlocks.ASPEN_SLAB, ModBlocks.ASPEN_MOSAIC_SLAB);
            entries.addAfter(Blocks.POLISHED_GRANITE_SLAB, ModBlocks.POLISHED_GRANITE_WALL);
            entries.addAfter(ModBlocks.POLISHED_GRANITE_WALL, ModBlocks.POLISHED_GRANITE_BRICKS);
            entries.addAfter(ModBlocks.POLISHED_GRANITE_BRICKS, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);
            entries.addAfter(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, ModBlocks.POLISHED_GRANITE_BRICK_SLAB);
            entries.addAfter(ModBlocks.POLISHED_GRANITE_BRICK_SLAB, ModBlocks.POLISHED_GRANITE_BRICK_WALL);
            entries.addAfter(Blocks.POLISHED_DIORITE_SLAB, ModBlocks.POLISHED_DIORITE_WALL);
            entries.addAfter(ModBlocks.POLISHED_DIORITE_WALL, ModBlocks.POLISHED_DIORITE_BRICKS);
            entries.addAfter(ModBlocks.POLISHED_DIORITE_BRICKS, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
            entries.addAfter(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, ModBlocks.POLISHED_DIORITE_BRICK_SLAB);
            entries.addAfter(ModBlocks.POLISHED_DIORITE_BRICK_SLAB, ModBlocks.POLISHED_DIORITE_BRICK_WALL);
            entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB, ModBlocks.POLISHED_ANDESITE_WALL);
            entries.addAfter(ModBlocks.POLISHED_ANDESITE_WALL, ModBlocks.POLISHED_ANDESITE_BRICKS);
            entries.addAfter(ModBlocks.POLISHED_ANDESITE_BRICKS, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
            entries.addAfter(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
            entries.addAfter(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, ModBlocks.POLISHED_ANDESITE_BRICK_WALL);
            entries.addAfter(Blocks.CHISELED_TUFF_BRICKS, Blocks.CALCITE);
            entries.addAfter(Blocks.CALCITE, ModBlocks.CALCITE_STAIRS);
            entries.addAfter(ModBlocks.CALCITE_STAIRS, ModBlocks.CALCITE_SLAB);
            entries.addAfter(ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_WALL);
            entries.addAfter(ModBlocks.CALCITE_WALL, ModBlocks.CALCITE_BRICKS);
            entries.addAfter(ModBlocks.CALCITE_BRICKS, ModBlocks.CALCITE_BRICK_STAIRS);
            entries.addAfter(ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICK_SLAB);
            entries.addAfter(ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICK_WALL);
            entries.addAfter(ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CHISELED_CALCITE_BRICKS);
            entries.addAfter(ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_TILES);
            entries.addAfter(ModBlocks.CALCITE_TILES, ModBlocks.CALCITE_TILE_STAIRS);
            entries.addAfter(ModBlocks.CALCITE_TILE_STAIRS, ModBlocks.CALCITE_TILE_SLAB);
            entries.addAfter(ModBlocks.CALCITE_TILE_SLAB, ModBlocks.CALCITE_TILE_WALL);
            entries.addAfter(Blocks.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_STAIRS);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_STAIRS, ModBlocks.SMOOTH_BASALT_SLAB);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_SLAB, ModBlocks.SMOOTH_BASALT_WALL);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_WALL, ModBlocks.SMOOTH_BASALT_BRICKS);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_BRICKS, ModBlocks.SMOOTH_BASALT_BRICK_STAIRS);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, ModBlocks.SMOOTH_BASALT_BRICK_SLAB);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_BRICK_SLAB, ModBlocks.SMOOTH_BASALT_BRICK_WALL);
            entries.addAfter(Blocks.BRICK_WALL, ModBlocks.WHITE_BRICKS, WHITE_BRICK_STAIRS, WHITE_BRICK_SLAB, WHITE_BRICK_WALL);
            entries.addAfter(ModBlocks.WHITE_BRICK_WALL, ModBlocks.LIGHT_GRAY_BRICKS, LIGHT_GRAY_BRICK_STAIRS, LIGHT_GRAY_BRICK_SLAB, LIGHT_GRAY_BRICK_WALL);
            entries.addAfter(ModBlocks.LIGHT_GRAY_BRICK_WALL, ModBlocks.GRAY_BRICKS, GRAY_BRICK_STAIRS, GRAY_BRICK_SLAB, GRAY_BRICK_WALL);
            entries.addAfter(ModBlocks.GRAY_BRICK_WALL, ModBlocks.BLACK_BRICKS, BLACK_BRICK_STAIRS, BLACK_BRICK_SLAB, BLACK_BRICK_WALL);
            entries.addAfter(ModBlocks.BLACK_BRICK_WALL, ModBlocks.BROWN_BRICKS, BROWN_BRICK_STAIRS, BROWN_BRICK_SLAB, BROWN_BRICK_WALL);
            entries.addAfter(ModBlocks.BROWN_BRICK_WALL, ModBlocks.RED_BRICKS, RED_BRICK_STAIRS, RED_BRICK_SLAB, RED_BRICK_WALL);
            entries.addAfter(ModBlocks.RED_BRICK_WALL, ModBlocks.ORANGE_BRICKS, ORANGE_BRICK_STAIRS, ORANGE_BRICK_SLAB, ORANGE_BRICK_WALL);
            entries.addAfter(ModBlocks.ORANGE_BRICK_WALL, ModBlocks.YELLOW_BRICKS, YELLOW_BRICK_STAIRS, YELLOW_BRICK_SLAB, YELLOW_BRICK_WALL);
            entries.addAfter(ModBlocks.YELLOW_BRICK_WALL, ModBlocks.LIME_BRICKS, LIME_BRICK_STAIRS, LIME_BRICK_SLAB, LIME_BRICK_WALL);
            entries.addAfter(ModBlocks.LIME_BRICK_WALL, ModBlocks.GREEN_BRICKS, GREEN_BRICK_STAIRS, GREEN_BRICK_SLAB, GREEN_BRICK_WALL);
            entries.addAfter(ModBlocks.GREEN_BRICK_WALL, ModBlocks.CYAN_BRICKS, CYAN_BRICK_STAIRS, CYAN_BRICK_SLAB, CYAN_BRICK_WALL);
            entries.addAfter(ModBlocks.CYAN_BRICK_WALL, ModBlocks.LIGHT_BLUE_BRICKS, LIGHT_BLUE_BRICK_STAIRS, LIGHT_BLUE_BRICK_SLAB, LIGHT_BLUE_BRICK_WALL);
            entries.addAfter(ModBlocks.LIGHT_BLUE_BRICK_WALL, ModBlocks.BLUE_BRICKS, BLUE_BRICK_STAIRS, BLUE_BRICK_SLAB, BLUE_BRICK_WALL);
            entries.addAfter(ModBlocks.BLUE_BRICK_WALL, ModBlocks.PURPLE_BRICKS, PURPLE_BRICK_STAIRS, PURPLE_BRICK_SLAB, PURPLE_BRICK_WALL);
            entries.addAfter(ModBlocks.PURPLE_BRICK_WALL, ModBlocks.MAGENTA_BRICKS, MAGENTA_BRICK_STAIRS, MAGENTA_BRICK_SLAB, MAGENTA_BRICK_WALL);
            entries.addAfter(ModBlocks.MAGENTA_BRICK_WALL, ModBlocks.PINK_BRICKS, PINK_BRICK_STAIRS, PINK_BRICK_SLAB, PINK_BRICK_WALL);
            entries.addAfter(Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS);
            entries.addAfter(ModBlocks.AMETHYST_STAIRS, ModBlocks.AMETHYST_SLAB);
            entries.addAfter(ModBlocks.AMETHYST_SLAB, ModBlocks.AMETHYST_WALL);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {

            entries.addAfter(Blocks.PINK_GLAZED_TERRACOTTA, Blocks.BRICKS, Blocks.BRICK_STAIRS, Blocks.BRICK_SLAB, Blocks.BRICK_WALL);
            entries.addAfter(Blocks.BRICK_WALL, ModBlocks.WHITE_BRICKS, WHITE_BRICK_STAIRS, WHITE_BRICK_SLAB, WHITE_BRICK_WALL);
            entries.addAfter(ModBlocks.WHITE_BRICK_WALL, ModBlocks.LIGHT_GRAY_BRICKS, LIGHT_GRAY_BRICK_STAIRS, LIGHT_GRAY_BRICK_SLAB, LIGHT_GRAY_BRICK_WALL);
            entries.addAfter(ModBlocks.LIGHT_GRAY_BRICK_WALL, ModBlocks.GRAY_BRICKS, GRAY_BRICK_STAIRS, GRAY_BRICK_SLAB, GRAY_BRICK_WALL);
            entries.addAfter(ModBlocks.GRAY_BRICK_WALL, ModBlocks.BLACK_BRICKS, BLACK_BRICK_STAIRS, BLACK_BRICK_SLAB, BLACK_BRICK_WALL);
            entries.addAfter(ModBlocks.BLACK_BRICK_WALL, ModBlocks.BROWN_BRICKS, BROWN_BRICK_STAIRS, BROWN_BRICK_SLAB, BROWN_BRICK_WALL);
            entries.addAfter(ModBlocks.BROWN_BRICK_WALL, ModBlocks.RED_BRICKS, RED_BRICK_STAIRS, RED_BRICK_SLAB, RED_BRICK_WALL);
            entries.addAfter(ModBlocks.RED_BRICK_WALL, ModBlocks.ORANGE_BRICKS, ORANGE_BRICK_STAIRS, ORANGE_BRICK_SLAB, ORANGE_BRICK_WALL);
            entries.addAfter(ModBlocks.ORANGE_BRICK_WALL, ModBlocks.YELLOW_BRICKS, YELLOW_BRICK_STAIRS, YELLOW_BRICK_SLAB, YELLOW_BRICK_WALL);
            entries.addAfter(ModBlocks.YELLOW_BRICK_WALL, ModBlocks.LIME_BRICKS, LIME_BRICK_STAIRS, LIME_BRICK_SLAB, LIME_BRICK_WALL);
            entries.addAfter(ModBlocks.LIME_BRICK_WALL, ModBlocks.GREEN_BRICKS, GREEN_BRICK_STAIRS, GREEN_BRICK_SLAB, GREEN_BRICK_WALL);
            entries.addAfter(ModBlocks.GREEN_BRICK_WALL, ModBlocks.CYAN_BRICKS, CYAN_BRICK_STAIRS, CYAN_BRICK_SLAB, CYAN_BRICK_WALL);
            entries.addAfter(ModBlocks.CYAN_BRICK_WALL, ModBlocks.LIGHT_BLUE_BRICKS, LIGHT_BLUE_BRICK_STAIRS, LIGHT_BLUE_BRICK_SLAB, LIGHT_BLUE_BRICK_WALL);
            entries.addAfter(ModBlocks.LIGHT_BLUE_BRICK_WALL, ModBlocks.BLUE_BRICKS, BLUE_BRICK_STAIRS, BLUE_BRICK_SLAB, BLUE_BRICK_WALL);
            entries.addAfter(ModBlocks.BLUE_BRICK_WALL, ModBlocks.PURPLE_BRICKS, PURPLE_BRICK_STAIRS, PURPLE_BRICK_SLAB, PURPLE_BRICK_WALL);
            entries.addAfter(ModBlocks.PURPLE_BRICK_WALL, ModBlocks.MAGENTA_BRICKS, MAGENTA_BRICK_STAIRS, MAGENTA_BRICK_SLAB, MAGENTA_BRICK_WALL);
            entries.addAfter(ModBlocks.MAGENTA_BRICK_WALL, ModBlocks.PINK_BRICKS, PINK_BRICK_STAIRS, PINK_BRICK_SLAB, PINK_BRICK_WALL);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {

            entries.addAfter(Blocks.PALE_HANGING_MOSS, ModBlocks.OAK_LEAF_PILE, SPRUCE_LEAF_PILE, BIRCH_LEAF_PILE,
                    ASPEN_LEAF_PILE, JUNGLE_LEAF_PILE, ACACIA_LEAF_PILE, DARK_OAK_LEAF_PILE, MANGROVE_LEAF_PILE);
            entries.addAfter(ModBlocks.MANGROVE_LEAF_PILE, ModBlocks.CHERRY_LEAF_PILE, WHITE_CHERRY_LEAF_PILE);
            entries.addAfter(ModBlocks.WHITE_CHERRY_LEAF_PILE, ModBlocks.PALE_OAK_LEAF_PILE);
            entries.addAfter(ModBlocks.PALE_OAK_LEAF_PILE, ModBlocks.AZALEA_LEAF_PILE, FLOWERING_AZALEA_LEAF_PILE);
            entries.addAfter(Blocks.BIRCH_LOG, ModBlocks.ASPEN_LOG);
            entries.addAfter(Blocks.BIRCH_LEAVES, ModBlocks.ASPEN_LEAVES);
            entries.addAfter(Blocks.CHERRY_LEAVES, ModBlocks.WHITE_CHERRY_LEAVES);
            entries.addAfter(Blocks.BIRCH_SAPLING, ModBlocks.ASPEN_SAPLING);
            entries.addAfter(Blocks.CHERRY_SAPLING, ModBlocks.WHITE_CHERRY_SAPLING);
            entries.addAfter(Blocks.CORNFLOWER, ModBlocks.MARIGOLD);
            entries.addAfter(Blocks.LILY_OF_THE_VALLEY, ModBlocks.MAUVE_HEATHER, ModBlocks.VIOLET_HEATHER, ModBlocks.WHITE_HEATHER);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {

            entries.addAfter(Blocks.BIRCH_SHELF, ModBlocks.ASPEN_SHELF);
            entries.add(ModBlocks.CALLIE_PLUSHIE);
            entries.addAfter(ModBlocks.CALLIE_PLUSHIE, ModBlocks.CYNTHIA_PLUSHIE);
            entries.addAfter(Blocks.COPPER_LANTERNS.waxedOxidized(), ModBlocks.REDSTONE_LANTERN);

        });

    }
}
