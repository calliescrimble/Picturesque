package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModEntityTypes;
import calliescrimble.picturesque.item.ModItems;
import calliescrimble.picturesque.item.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalEntityTypeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModTagProviders {

    public static class ModBlockTags extends FabricTagsProvider.BlockTagsProvider {
        public ModBlockTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider registries) {

            valueLookupBuilder(BlockTags.WOODEN_FENCES)
                    .add(ModBlocks.ASPEN_FENCE);

            valueLookupBuilder(BlockTags.FENCE_GATES)
                    .add(ModBlocks.ASPEN_FENCE_GATE);

            valueLookupBuilder(BlockTags.WALLS)
                    .add(ModBlocks.CALCITE_WALL)
                    .add(ModBlocks.SMOOTH_BASALT_WALL)
                    .add(ModBlocks.CALCITE_BRICK_WALL)
                    .add(ModBlocks.CALCITE_TILE_WALL)
                    .add(ModBlocks.SMOOTH_BASALT_BRICK_WALL)
                    .add(ModBlocks.POLISHED_GRANITE_WALL)
                    .add(ModBlocks.POLISHED_DIORITE_WALL)
                    .add(ModBlocks.POLISHED_ANDESITE_WALL)
                    .add(ModBlocks.POLISHED_GRANITE_BRICK_WALL)
                    .add(ModBlocks.POLISHED_DIORITE_BRICK_WALL)
                    .add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL)
                    .add(ModBlocks.AMETHYST_WALL)
                    .add(ModBlocks.WHITE_BRICK_WALL)
                    .add(ModBlocks.LIGHT_GRAY_BRICK_WALL)
                    .add(ModBlocks.GRAY_BRICK_WALL)
                    .add(ModBlocks.BLACK_BRICK_WALL)
                    .add(ModBlocks.BROWN_BRICK_WALL)
                    .add(ModBlocks.RED_BRICK_WALL)
                    .add(ModBlocks.ORANGE_BRICK_WALL)
                    .add(ModBlocks.YELLOW_BRICK_WALL)
                    .add(ModBlocks.LIME_BRICK_WALL)
                    .add(ModBlocks.GREEN_BRICK_WALL)
                    .add(ModBlocks.CYAN_BRICK_WALL)
                    .add(ModBlocks.LIGHT_BLUE_BRICK_WALL)
                    .add(ModBlocks.BLUE_BRICK_WALL)
                    .add(ModBlocks.PURPLE_BRICK_WALL)
                    .add(ModBlocks.MAGENTA_BRICK_WALL)
                    .add(ModBlocks.PINK_BRICK_WALL);

            valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                    .add(ModBlocks.ASPEN_LOG)
                    .add(ModBlocks.ASPEN_WOOD)
                    .add(ModBlocks.STRIPPED_ASPEN_LOG)
                    .add(ModBlocks.STRIPPED_ASPEN_WOOD);

            valueLookupBuilder(BlockTags.LOGS)
                    .add(ModBlocks.ASPEN_LOG)
                    .add(ModBlocks.ASPEN_WOOD)
                    .add(ModBlocks.STRIPPED_ASPEN_LOG)
                    .add(ModBlocks.STRIPPED_ASPEN_WOOD);

            valueLookupBuilder(BlockTags.PLANKS)
                    .add(ModBlocks.ASPEN_PLANKS);

            valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                    .add(ModBlocks.ASPEN_LOG)
                    .add(ModBlocks.ASPEN_WOOD)
                    .add(ModBlocks.STRIPPED_ASPEN_LOG)
                    .add(ModBlocks.STRIPPED_ASPEN_WOOD)
                    .add(ModBlocks.ASPEN_PLANKS)
                    .add(ModBlocks.ASPEN_STAIRS)
                    .add(ModBlocks.ASPEN_SLAB)
                    .add(ModBlocks.ASPEN_FENCE)
                    .add(ModBlocks.ASPEN_FENCE_GATE)
                    .add(ModBlocks.ASPEN_DOOR)
                    .add(ModBlocks.ASPEN_TRAPDOOR)
                    .add(ModBlocks.ASPEN_PRESSURE_PLATE)
                    .add(ModBlocks.ASPEN_BUTTON)
                    .add(ModBlocks.ASPEN_SHELF)
                    .add(ModBlocks.ASPEN_SIGN)
                    .add(ModBlocks.ASPEN_WALL_SIGN)
                    .add(ModBlocks.ASPEN_HANGING_SIGN)
                    .add(ModBlocks.ASPEN_WALL_HANGING_SIGN)
                    .add(ModBlocks.OAK_HERRINGBONE)
                    .add(ModBlocks.SPRUCE_HERRINGBONE)
                    .add(ModBlocks.BIRCH_HERRINGBONE)
                    .add(ModBlocks.JUNGLE_HERRINGBONE)
                    .add(ModBlocks.ACACIA_HERRINGBONE)
                    .add(ModBlocks.DARK_OAK_HERRINGBONE)
                    .add(ModBlocks.MANGROVE_HERRINGBONE)
                    .add(ModBlocks.CHERRY_HERRINGBONE)
                    .add(ModBlocks.PALE_OAK_HERRINGBONE)
                    .add(ModBlocks.BAMBOO_HERRINGBONE)
                    .add(ModBlocks.CRIMSON_HERRINGBONE)
                    .add(ModBlocks.WARPED_HERRINGBONE)
                    .add(ModBlocks.ASPEN_HERRINGBONE)
                    .add(ModBlocks.OAK_MOSAIC)
                    .add(ModBlocks.SPRUCE_MOSAIC)
                    .add(ModBlocks.BIRCH_MOSAIC)
                    .add(ModBlocks.JUNGLE_MOSAIC)
                    .add(ModBlocks.ACACIA_MOSAIC)
                    .add(ModBlocks.DARK_OAK_MOSAIC)
                    .add(ModBlocks.MANGROVE_MOSAIC)
                    .add(ModBlocks.CHERRY_MOSAIC)
                    .add(ModBlocks.PALE_OAK_MOSAIC)
                    .add(ModBlocks.CRIMSON_MOSAIC)
                    .add(ModBlocks.WARPED_MOSAIC)
                    .add(ModBlocks.ASPEN_MOSAIC)
                    .add(ModBlocks.OAK_MOSAIC_SLAB)
                    .add(ModBlocks.SPRUCE_MOSAIC_SLAB)
                    .add(ModBlocks.BIRCH_MOSAIC_SLAB)
                    .add(ModBlocks.JUNGLE_MOSAIC_SLAB)
                    .add(ModBlocks.ACACIA_MOSAIC_SLAB)
                    .add(ModBlocks.DARK_OAK_MOSAIC_SLAB)
                    .add(ModBlocks.MANGROVE_MOSAIC_SLAB)
                    .add(ModBlocks.CHERRY_MOSAIC_SLAB)
                    .add(ModBlocks.PALE_OAK_MOSAIC_SLAB)
                    .add(ModBlocks.CRIMSON_MOSAIC_SLAB)
                    .add(ModBlocks.WARPED_MOSAIC_SLAB)
                    .add(ModBlocks.ASPEN_MOSAIC_SLAB)
                    .add(ModBlocks.OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.SPRUCE_MOSAIC_STAIRS)
                    .add(ModBlocks.BIRCH_MOSAIC_STAIRS)
                    .add(ModBlocks.JUNGLE_MOSAIC_STAIRS)
                    .add(ModBlocks.ACACIA_MOSAIC_STAIRS)
                    .add(ModBlocks.DARK_OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.MANGROVE_MOSAIC_STAIRS)
                    .add(ModBlocks.CHERRY_MOSAIC_STAIRS)
                    .add(ModBlocks.PALE_OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.CRIMSON_MOSAIC_STAIRS)
                    .add(ModBlocks.WARPED_MOSAIC_STAIRS)
                    .add(ModBlocks.ASPEN_MOSAIC_STAIRS);

            valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(ModBlocks.CALCITE_STAIRS)
                    .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                    .add(ModBlocks.CALCITE_SLAB)
                    .add(ModBlocks.SMOOTH_BASALT_SLAB)
                    .add(ModBlocks.CALCITE_WALL)
                    .add(ModBlocks.SMOOTH_BASALT_WALL)
                    .add(ModBlocks.CALCITE_BRICKS)
                    .add(ModBlocks.CALCITE_TILES)
                    .add(ModBlocks.CHISELED_CALCITE_BRICKS)
                    .add(ModBlocks.SMOOTH_BASALT_BRICKS)
                    .add(ModBlocks.CALCITE_BRICK_STAIRS)
                    .add(ModBlocks.CALCITE_TILE_STAIRS)
                    .add(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS)
                    .add(ModBlocks.CALCITE_BRICK_SLAB)
                    .add(ModBlocks.CALCITE_TILE_SLAB)
                    .add(ModBlocks.SMOOTH_BASALT_BRICK_SLAB)
                    .add(ModBlocks.CALCITE_BRICK_WALL)
                    .add(ModBlocks.CALCITE_TILE_WALL)
                    .add(ModBlocks.SMOOTH_BASALT_BRICK_WALL)
                    .add(ModBlocks.POLISHED_GRANITE_WALL)
                    .add(ModBlocks.POLISHED_DIORITE_WALL)
                    .add(ModBlocks.POLISHED_ANDESITE_WALL)
                    .add(ModBlocks.POLISHED_GRANITE_BRICKS)
                    .add(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS)
                    .add(ModBlocks.POLISHED_GRANITE_BRICK_SLAB)
                    .add(ModBlocks.POLISHED_GRANITE_BRICK_WALL)
                    .add(ModBlocks.POLISHED_DIORITE_BRICKS)
                    .add(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS)
                    .add(ModBlocks.POLISHED_DIORITE_BRICK_SLAB)
                    .add(ModBlocks.POLISHED_DIORITE_BRICK_WALL)
                    .add(ModBlocks.POLISHED_ANDESITE_BRICKS)
                    .add(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS)
                    .add(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB)
                    .add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL)
                    .add(ModBlocks.AMETHYST_STAIRS)
                    .add(ModBlocks.AMETHYST_SLAB)
                    .add(ModBlocks.AMETHYST_WALL)
                    .add(ModBlocks.REDSTONE_LANTERN)
                    .add(ModBlocks.WHITE_BRICKS)
                    .add(ModBlocks.WHITE_BRICK_STAIRS)
                    .add(ModBlocks.WHITE_BRICK_SLAB)
                    .add(ModBlocks.WHITE_BRICK_WALL)
                    .add(ModBlocks.LIGHT_GRAY_BRICKS)
                    .add(ModBlocks.LIGHT_GRAY_BRICK_STAIRS)
                    .add(ModBlocks.LIGHT_GRAY_BRICK_SLAB)
                    .add(ModBlocks.LIGHT_GRAY_BRICK_WALL)
                    .add(ModBlocks.GRAY_BRICKS)
                    .add(ModBlocks.GRAY_BRICK_STAIRS)
                    .add(ModBlocks.GRAY_BRICK_SLAB)
                    .add(ModBlocks.GRAY_BRICK_WALL)
                    .add(ModBlocks.BLACK_BRICKS)
                    .add(ModBlocks.BLACK_BRICK_STAIRS)
                    .add(ModBlocks.BLACK_BRICK_SLAB)
                    .add(ModBlocks.BLACK_BRICK_WALL)
                    .add(ModBlocks.BROWN_BRICKS)
                    .add(ModBlocks.BROWN_BRICK_STAIRS)
                    .add(ModBlocks.BROWN_BRICK_SLAB)
                    .add(ModBlocks.BROWN_BRICK_WALL)
                    .add(ModBlocks.RED_BRICKS)
                    .add(ModBlocks.RED_BRICK_STAIRS)
                    .add(ModBlocks.RED_BRICK_SLAB)
                    .add(ModBlocks.RED_BRICK_WALL)
                    .add(ModBlocks.ORANGE_BRICKS)
                    .add(ModBlocks.ORANGE_BRICK_STAIRS)
                    .add(ModBlocks.ORANGE_BRICK_SLAB)
                    .add(ModBlocks.ORANGE_BRICK_WALL)
                    .add(ModBlocks.YELLOW_BRICKS)
                    .add(ModBlocks.YELLOW_BRICK_STAIRS)
                    .add(ModBlocks.YELLOW_BRICK_SLAB)
                    .add(ModBlocks.YELLOW_BRICK_WALL)
                    .add(ModBlocks.LIME_BRICKS)
                    .add(ModBlocks.LIME_BRICK_STAIRS)
                    .add(ModBlocks.LIME_BRICK_SLAB)
                    .add(ModBlocks.LIME_BRICK_WALL)
                    .add(ModBlocks.GREEN_BRICKS)
                    .add(ModBlocks.GREEN_BRICK_STAIRS)
                    .add(ModBlocks.GREEN_BRICK_SLAB)
                    .add(ModBlocks.GREEN_BRICK_WALL)
                    .add(ModBlocks.CYAN_BRICKS)
                    .add(ModBlocks.CYAN_BRICK_STAIRS)
                    .add(ModBlocks.CYAN_BRICK_SLAB)
                    .add(ModBlocks.CYAN_BRICK_WALL)
                    .add(ModBlocks.LIGHT_BLUE_BRICKS)
                    .add(ModBlocks.LIGHT_BLUE_BRICK_STAIRS)
                    .add(ModBlocks.LIGHT_BLUE_BRICK_SLAB)
                    .add(ModBlocks.LIGHT_BLUE_BRICK_WALL)
                    .add(ModBlocks.BLUE_BRICKS)
                    .add(ModBlocks.BLUE_BRICK_STAIRS)
                    .add(ModBlocks.BLUE_BRICK_SLAB)
                    .add(ModBlocks.BLUE_BRICK_WALL)
                    .add(ModBlocks.PURPLE_BRICKS)
                    .add(ModBlocks.PURPLE_BRICK_STAIRS)
                    .add(ModBlocks.PURPLE_BRICK_SLAB)
                    .add(ModBlocks.PURPLE_BRICK_WALL)
                    .add(ModBlocks.MAGENTA_BRICKS)
                    .add(ModBlocks.MAGENTA_BRICK_STAIRS)
                    .add(ModBlocks.MAGENTA_BRICK_SLAB)
                    .add(ModBlocks.MAGENTA_BRICK_WALL)
                    .add(ModBlocks.PINK_BRICKS)
                    .add(ModBlocks.PINK_BRICK_STAIRS)
                    .add(ModBlocks.PINK_BRICK_SLAB)
                    .add(ModBlocks.PINK_BRICK_WALL);

            valueLookupBuilder(BlockTags.MINEABLE_WITH_HOE)
                    .add(ModBlocks.ASPEN_LEAVES)
                    .add(ModBlocks.WHITE_CHERRY_LEAVES)
                    .add(ModBlocks.OAK_LEAF_PILE)
                    .add(ModBlocks.SPRUCE_LEAF_PILE)
                    .add(ModBlocks.BIRCH_LEAF_PILE)
                    .add(ModBlocks.ASPEN_LEAF_PILE)
                    .add(ModBlocks.JUNGLE_LEAF_PILE)
                    .add(ModBlocks.ACACIA_LEAF_PILE)
                    .add(ModBlocks.DARK_OAK_LEAF_PILE)
                    .add(ModBlocks.MANGROVE_LEAF_PILE)
                    .add(ModBlocks.AZALEA_LEAF_PILE)
                    .add(ModBlocks.FLOWERING_AZALEA_LEAF_PILE)
                    .add(ModBlocks.CHERRY_LEAF_PILE)
                    .add(ModBlocks.WHITE_CHERRY_LEAF_PILE)
                    .add(ModBlocks.PALE_OAK_LEAF_PILE);

            valueLookupBuilder(BlockTags.SWORD_EFFICIENT)
                    .add(ModBlocks.ASPEN_LEAVES)
                    .add(ModBlocks.WHITE_CHERRY_LEAVES)
                    .add(ModBlocks.OAK_LEAF_PILE)
                    .add(ModBlocks.SPRUCE_LEAF_PILE)
                    .add(ModBlocks.BIRCH_LEAF_PILE)
                    .add(ModBlocks.ASPEN_LEAF_PILE)
                    .add(ModBlocks.JUNGLE_LEAF_PILE)
                    .add(ModBlocks.ACACIA_LEAF_PILE)
                    .add(ModBlocks.DARK_OAK_LEAF_PILE)
                    .add(ModBlocks.MANGROVE_LEAF_PILE)
                    .add(ModBlocks.AZALEA_LEAF_PILE)
                    .add(ModBlocks.FLOWERING_AZALEA_LEAF_PILE)
                    .add(ModBlocks.CHERRY_LEAF_PILE)
                    .add(ModBlocks.WHITE_CHERRY_LEAF_PILE)
                    .add(ModBlocks.PALE_OAK_LEAF_PILE);

            valueLookupBuilder(BlockTags.LEAVES)
                    .add(ModBlocks.ASPEN_LEAVES)
                    .add(ModBlocks.WHITE_CHERRY_LEAVES);

            valueLookupBuilder(BlockTags.BEE_ATTRACTIVE)
                    .add(ModBlocks.MARIGOLD)
                    .add(ModBlocks.VIOLET_HEATHER)
                    .add(ModBlocks.MAUVE_HEATHER)
                    .add(ModBlocks.WHITE_HEATHER)
                    .add(ModBlocks.WHITE_CHERRY_LEAVES);

            valueLookupBuilder(BlockTags.SLABS)
                    .add(ModBlocks.ASPEN_SLAB)
                    .add(ModBlocks.CALCITE_SLAB)
                    .add(ModBlocks.CALCITE_BRICK_SLAB)
                    .add(ModBlocks.CALCITE_TILE_SLAB)
                    .add(ModBlocks.SMOOTH_BASALT_SLAB)
                    .add(ModBlocks.SMOOTH_BASALT_BRICK_SLAB)
                    .add(ModBlocks.POLISHED_GRANITE_BRICK_SLAB)
                    .add(ModBlocks.POLISHED_DIORITE_BRICK_SLAB)
                    .add(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB)
                    .add(ModBlocks.AMETHYST_SLAB)
                    .add(ModBlocks.OAK_MOSAIC_SLAB)
                    .add(ModBlocks.SPRUCE_MOSAIC_SLAB)
                    .add(ModBlocks.BIRCH_MOSAIC_SLAB)
                    .add(ModBlocks.JUNGLE_MOSAIC_SLAB)
                    .add(ModBlocks.ACACIA_MOSAIC_SLAB)
                    .add(ModBlocks.DARK_OAK_MOSAIC_SLAB)
                    .add(ModBlocks.MANGROVE_MOSAIC_SLAB)
                    .add(ModBlocks.CHERRY_MOSAIC_SLAB)
                    .add(ModBlocks.PALE_OAK_MOSAIC_SLAB)
                    .add(ModBlocks.CRIMSON_MOSAIC_SLAB)
                    .add(ModBlocks.WARPED_MOSAIC_SLAB)
                    .add(ModBlocks.ASPEN_MOSAIC_SLAB)
                    .add(ModBlocks.WHITE_BRICK_SLAB)
                    .add(ModBlocks.LIGHT_GRAY_BRICK_SLAB)
                    .add(ModBlocks.GRAY_BRICK_SLAB)
                    .add(ModBlocks.BLACK_BRICK_SLAB)
                    .add(ModBlocks.BROWN_BRICK_SLAB)
                    .add(ModBlocks.RED_BRICK_SLAB)
                    .add(ModBlocks.ORANGE_BRICK_SLAB)
                    .add(ModBlocks.YELLOW_BRICK_SLAB)
                    .add(ModBlocks.LIME_BRICK_SLAB)
                    .add(ModBlocks.GREEN_BRICK_SLAB)
                    .add(ModBlocks.CYAN_BRICK_SLAB)
                    .add(ModBlocks.LIGHT_BLUE_BRICK_SLAB)
                    .add(ModBlocks.BLUE_BRICK_SLAB)
                    .add(ModBlocks.PURPLE_BRICK_SLAB)
                    .add(ModBlocks.MAGENTA_BRICK_SLAB)
                    .add(ModBlocks.PINK_BRICK_SLAB);

            valueLookupBuilder(BlockTags.WOODEN_SLABS)
                    .add(ModBlocks.ASPEN_SLAB)
                    .add(ModBlocks.OAK_MOSAIC_SLAB)
                    .add(ModBlocks.SPRUCE_MOSAIC_SLAB)
                    .add(ModBlocks.BIRCH_MOSAIC_SLAB)
                    .add(ModBlocks.JUNGLE_MOSAIC_SLAB)
                    .add(ModBlocks.ACACIA_MOSAIC_SLAB)
                    .add(ModBlocks.DARK_OAK_MOSAIC_SLAB)
                    .add(ModBlocks.MANGROVE_MOSAIC_SLAB)
                    .add(ModBlocks.CHERRY_MOSAIC_SLAB)
                    .add(ModBlocks.PALE_OAK_MOSAIC_SLAB)
                    .add(ModBlocks.CRIMSON_MOSAIC_SLAB)
                    .add(ModBlocks.WARPED_MOSAIC_SLAB)
                    .add(ModBlocks.ASPEN_MOSAIC_SLAB);

            valueLookupBuilder(BlockTags.STAIRS)
                    .add(ModBlocks.ASPEN_STAIRS)
                    .add(ModBlocks.CALCITE_STAIRS)
                    .add(ModBlocks.CALCITE_BRICK_STAIRS)
                    .add(ModBlocks.CALCITE_TILE_STAIRS)
                    .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                    .add(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS)
                    .add(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS)
                    .add(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS)
                    .add(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS)
                    .add(ModBlocks.AMETHYST_STAIRS)
                    .add(ModBlocks.OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.SPRUCE_MOSAIC_STAIRS)
                    .add(ModBlocks.BIRCH_MOSAIC_STAIRS)
                    .add(ModBlocks.JUNGLE_MOSAIC_STAIRS)
                    .add(ModBlocks.ACACIA_MOSAIC_STAIRS)
                    .add(ModBlocks.DARK_OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.MANGROVE_MOSAIC_STAIRS)
                    .add(ModBlocks.CHERRY_MOSAIC_STAIRS)
                    .add(ModBlocks.PALE_OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.CRIMSON_MOSAIC_STAIRS)
                    .add(ModBlocks.WARPED_MOSAIC_STAIRS)
                    .add(ModBlocks.ASPEN_MOSAIC_STAIRS)
                    .add(ModBlocks.WHITE_BRICK_STAIRS)
                    .add(ModBlocks.LIGHT_GRAY_BRICK_STAIRS)
                    .add(ModBlocks.GRAY_BRICK_STAIRS)
                    .add(ModBlocks.BLACK_BRICK_STAIRS)
                    .add(ModBlocks.BROWN_BRICK_STAIRS)
                    .add(ModBlocks.RED_BRICK_STAIRS)
                    .add(ModBlocks.ORANGE_BRICK_STAIRS)
                    .add(ModBlocks.YELLOW_BRICK_STAIRS)
                    .add(ModBlocks.LIME_BRICK_STAIRS)
                    .add(ModBlocks.GREEN_BRICK_STAIRS)
                    .add(ModBlocks.CYAN_BRICK_STAIRS)
                    .add(ModBlocks.LIGHT_BLUE_BRICK_STAIRS)
                    .add(ModBlocks.BLUE_BRICK_STAIRS)
                    .add(ModBlocks.PURPLE_BRICK_STAIRS)
                    .add(ModBlocks.MAGENTA_BRICK_STAIRS)
                    .add(ModBlocks.PINK_BRICK_STAIRS);

            valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                    .add(ModBlocks.ASPEN_STAIRS)
                    .add(ModBlocks.OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.SPRUCE_MOSAIC_STAIRS)
                    .add(ModBlocks.BIRCH_MOSAIC_STAIRS)
                    .add(ModBlocks.JUNGLE_MOSAIC_STAIRS)
                    .add(ModBlocks.ACACIA_MOSAIC_STAIRS)
                    .add(ModBlocks.DARK_OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.MANGROVE_MOSAIC_STAIRS)
                    .add(ModBlocks.CHERRY_MOSAIC_STAIRS)
                    .add(ModBlocks.PALE_OAK_MOSAIC_STAIRS)
                    .add(ModBlocks.CRIMSON_MOSAIC_STAIRS)
                    .add(ModBlocks.WARPED_MOSAIC_STAIRS)
                    .add(ModBlocks.ASPEN_MOSAIC_STAIRS);

            valueLookupBuilder(BlockTags.WOODEN_DOORS)
                    .add(ModBlocks.ASPEN_DOOR);

            valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                    .add(ModBlocks.ASPEN_TRAPDOOR);

            valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                    .add(ModBlocks.ASPEN_PRESSURE_PLATE);

            valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                    .add(ModBlocks.ASPEN_BUTTON);

            valueLookupBuilder(BlockTags.COMPLETES_FIND_TREE_TUTORIAL)
                    .add(ModBlocks.ASPEN_LOG)
                    .add(ModBlocks.ASPEN_WOOD)
                    .add(ModBlocks.STRIPPED_ASPEN_LOG)
                    .add(ModBlocks.STRIPPED_ASPEN_WOOD);

            valueLookupBuilder(BlockTags.SAPLINGS)
                    .add(ModBlocks.ASPEN_SAPLING)
                    .add(ModBlocks.WHITE_CHERRY_SAPLING);

            valueLookupBuilder(BlockTags.FLOWERS)
                    .add(ModBlocks.MARIGOLD)
                    .add(ModBlocks.VIOLET_HEATHER)
                    .add(ModBlocks.MAUVE_HEATHER)
                    .add(ModBlocks.WHITE_HEATHER);

            valueLookupBuilder(BlockTags.SMALL_FLOWERS)
                    .add(ModBlocks.MARIGOLD)
                    .add(ModBlocks.VIOLET_HEATHER)
                    .add(ModBlocks.MAUVE_HEATHER)
                    .add(ModBlocks.WHITE_HEATHER);

            valueLookupBuilder(BlockTags.FLOWER_POTS)
                    .add(ModBlocks.MARIGOLD_POT)
                    .add(ModBlocks.ASPEN_SAPLING_POT)
                    .add(ModBlocks.WHITE_CHERRY_SAPLING_POT);

            valueLookupBuilder(BlockTags.WOODEN_SHELVES)
                    .add(ModBlocks.ASPEN_SHELF);

            valueLookupBuilder(BlockTags.STANDING_SIGNS)
                    .add(ModBlocks.ASPEN_SIGN);

            valueLookupBuilder(BlockTags.WALL_SIGNS)
                    .add(ModBlocks.ASPEN_WALL_SIGN);

            valueLookupBuilder(BlockTags.CEILING_HANGING_SIGNS)
                    .add(ModBlocks.ASPEN_HANGING_SIGN);

            valueLookupBuilder(BlockTags.WALL_HANGING_SIGNS)
                    .add(ModBlocks.ASPEN_WALL_HANGING_SIGN);

            valueLookupBuilder(BlockTags.LANTERNS)
                    .add(ModBlocks.REDSTONE_LANTERN);
        }
    }

    public static class ModItemTags extends FabricTagsProvider.ItemTagsProvider {
        public ModItemTags(
                FabricPackOutput output,
                CompletableFuture<HolderLookup.Provider> registriesFuture,
                BlockTagsProvider blockTagsProvider
        ) {
            super(output, registriesFuture, blockTagsProvider);
        }

        @Override
        protected void addTags(HolderLookup.Provider registries) {

            valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                    .add(ModBlocks.ASPEN_LOG.asItem())
                    .add(ModBlocks.ASPEN_WOOD.asItem())
                    .add(ModBlocks.STRIPPED_ASPEN_LOG.asItem())
                    .add(ModBlocks.STRIPPED_ASPEN_WOOD.asItem());

            valueLookupBuilder(ItemTags.PLANKS)
                    .add(ModBlocks.ASPEN_PLANKS.asItem());

            valueLookupBuilder(ItemTags.LOGS)
                    .add(ModBlocks.ASPEN_LOG.asItem())
                    .add(ModBlocks.ASPEN_WOOD.asItem())
                    .add(ModBlocks.STRIPPED_ASPEN_LOG.asItem())
                    .add(ModBlocks.STRIPPED_ASPEN_WOOD.asItem());

            valueLookupBuilder(ModTags.Items.ASPEN_LOGS)
                    .add(ModBlocks.ASPEN_LOG.asItem())
                    .add(ModBlocks.STRIPPED_ASPEN_LOG.asItem())
                    .add(ModBlocks.ASPEN_WOOD.asItem())
                    .add(ModBlocks.STRIPPED_ASPEN_WOOD.asItem());

            valueLookupBuilder(ItemTags.WOODEN_SLABS)
                    .add(ModBlocks.ASPEN_SLAB.asItem())
                    .add(ModBlocks.OAK_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.SPRUCE_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.BIRCH_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.JUNGLE_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.ACACIA_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.DARK_OAK_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.MANGROVE_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.CHERRY_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.PALE_OAK_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.CRIMSON_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.WARPED_MOSAIC_SLAB.asItem())
                    .add(ModBlocks.ASPEN_MOSAIC_SLAB.asItem());

            valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                    .add(ModBlocks.ASPEN_STAIRS.asItem())
                    .add(ModBlocks.OAK_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.SPRUCE_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.BIRCH_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.JUNGLE_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.ACACIA_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.DARK_OAK_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.MANGROVE_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.CHERRY_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.PALE_OAK_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.CRIMSON_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.WARPED_MOSAIC_STAIRS.asItem())
                    .add(ModBlocks.ASPEN_MOSAIC_STAIRS.asItem());

            valueLookupBuilder(ItemTags.WOODEN_DOORS)
                    .add(ModBlocks.ASPEN_DOOR.asItem());

            valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                    .add(ModBlocks.ASPEN_TRAPDOOR.asItem());

            valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                    .add(ModBlocks.ASPEN_PRESSURE_PLATE.asItem());

            valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                    .add(ModBlocks.ASPEN_BUTTON.asItem());

            valueLookupBuilder(ItemTags.SAPLINGS)
                    .add(ModBlocks.ASPEN_SAPLING.asItem())
                    .add(ModBlocks.WHITE_CHERRY_SAPLING.asItem());

            valueLookupBuilder(ItemTags.FLOWERS)
                    .add(ModBlocks.MARIGOLD.asItem())
                    .add(ModBlocks.VIOLET_HEATHER.asItem())
                    .add(ModBlocks.MAUVE_HEATHER.asItem())
                    .add(ModBlocks.WHITE_HEATHER.asItem());

            valueLookupBuilder(ItemTags.SMALL_FLOWERS)
                    .add(ModBlocks.MARIGOLD.asItem())
                    .add(ModBlocks.VIOLET_HEATHER.asItem())
                    .add(ModBlocks.MAUVE_HEATHER.asItem())
                    .add(ModBlocks.WHITE_HEATHER.asItem());

            valueLookupBuilder(ItemTags.BEE_FOOD)
                    .add(ModBlocks.MARIGOLD.asItem())
                    .add(ModBlocks.VIOLET_HEATHER.asItem())
                    .add(ModBlocks.MAUVE_HEATHER.asItem())
                    .add(ModBlocks.WHITE_HEATHER.asItem())
                    .add(ModBlocks.WHITE_CHERRY_LEAVES.asItem());

            valueLookupBuilder(ItemTags.BOATS)
                    .add(ModItems.ASPEN_BOAT);

            valueLookupBuilder(ItemTags.CHEST_BOATS)
                    .add(ModItems.ASPEN_CHEST_BOAT);

            valueLookupBuilder(ItemTags.SIGNS)
                    .add(ModItems.ASPEN_SIGN);

            valueLookupBuilder(ItemTags.HANGING_SIGNS)
                    .add(ModItems.ASPEN_HANGING_SIGN);
        }
    }

    public static class ModEntityTypeTags extends FabricTagsProvider.EntityTypeTagsProvider {
        public ModEntityTypeTags(
                FabricPackOutput output,
                CompletableFuture<HolderLookup.Provider> registriesFuture
        ) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider registries) {

            valueLookupBuilder(EntityTypeTags.BOAT)
                    .add(ModEntityTypes.ASPEN_BOAT);

            valueLookupBuilder(ConventionalEntityTypeTags.BOATS)
                    .add(ModEntityTypes.ASPEN_CHEST_BOAT);
        }
    }
}