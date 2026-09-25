package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModEntityTypes;
import calliescrimble.picturesque.item.ModItems;
import calliescrimble.picturesque.item.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalEntityTypeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockItemTags;
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

            tag(BlockTags.WOODEN_FENCES)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_FENCE));

            tag(BlockTags.FENCE_GATES)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_FENCE_GATE));

            tag(BlockTags.WALLS)
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_WALL))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_TILE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.AMETHYST_WALL))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.GRAY_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.BLACK_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.BROWN_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.RED_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.ORANGE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.YELLOW_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.LIME_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.GREEN_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.CYAN_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.BLUE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.PURPLE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.MAGENTA_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.PINK_BRICK_WALL));

            tag(BlockTags.LOGS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LOG))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_WOOD))
                    .add(ModBlocks.getRK(ModBlocks.STRIPPED_ASPEN_LOG))
                    .add(ModBlocks.getRK(ModBlocks.STRIPPED_ASPEN_WOOD));

            tag(BlockTags.PLANKS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_PLANKS));

            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LOG))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_WOOD))
                    .add(ModBlocks.getRK(ModBlocks.STRIPPED_ASPEN_LOG))
                    .add(ModBlocks.getRK(ModBlocks.STRIPPED_ASPEN_WOOD))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_PLANKS))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_FENCE))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_FENCE_GATE))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_DOOR))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_TRAPDOOR))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_PRESSURE_PLATE))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_BUTTON))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SHELF))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SIGN))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_WALL_SIGN))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_HANGING_SIGN))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_WALL_HANGING_SIGN))
                    .add(ModBlocks.getRK(ModBlocks.OAK_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.BAMBOO_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_HERRINGBONE))
                    .add(ModBlocks.getRK(ModBlocks.OAK_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_MOSAIC))
                    .add(ModBlocks.getRK(ModBlocks.OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_MOSAIC_STAIRS));

            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_WALL))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_TILES))
                    .add(ModBlocks.getRK(ModBlocks.CHISELED_CALCITE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_TILE_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_TILE_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_TILE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.AMETHYST_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.AMETHYST_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.AMETHYST_WALL))
                    .add(ModBlocks.getRK(ModBlocks.REDSTONE_LANTERN))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.GRAY_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.GRAY_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.GRAY_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.GRAY_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.BLACK_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.BLACK_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BLACK_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BLACK_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.BROWN_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.BROWN_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BROWN_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BROWN_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.RED_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.RED_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.RED_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.RED_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.ORANGE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.ORANGE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ORANGE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ORANGE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.YELLOW_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.YELLOW_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.YELLOW_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.YELLOW_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.LIME_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.LIME_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.LIME_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.LIME_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.GREEN_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.GREEN_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.GREEN_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.GREEN_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.CYAN_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.CYAN_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CYAN_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CYAN_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.BLUE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.BLUE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BLUE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BLUE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.PURPLE_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.PURPLE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.PURPLE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.PURPLE_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.MAGENTA_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.MAGENTA_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.MAGENTA_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.MAGENTA_BRICK_WALL))
                    .add(ModBlocks.getRK(ModBlocks.PINK_BRICKS))
                    .add(ModBlocks.getRK(ModBlocks.PINK_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.PINK_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.PINK_BRICK_WALL));

            tag(BlockTags.MINEABLE_WITH_HOE)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LEAVES))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_LEAVES))
                    .add(ModBlocks.getRK(ModBlocks.OAK_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.AZALEA_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.FLOWERING_AZALEA_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_LEAF_PILE));

            tag(BlockTags.SWORD_EFFICIENT)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LEAVES))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_LEAVES))
                    .add(ModBlocks.getRK(ModBlocks.OAK_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.AZALEA_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.FLOWERING_AZALEA_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_LEAF_PILE))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_LEAF_PILE));

            tag(BlockTags.LEAVES)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LEAVES))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_LEAVES));

            tag(BlockTags.BEE_ATTRACTIVE)
                    .add(ModBlocks.getRK(ModBlocks.MARIGOLD))
                    .add(ModBlocks.getRK(ModBlocks.VIOLET_HEATHER))
                    .add(ModBlocks.getRK(ModBlocks.MAUVE_HEATHER))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_HEATHER))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_LEAVES));

            tag(BlockTags.SLABS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_TILE_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.AMETHYST_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.GRAY_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BLACK_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BROWN_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.RED_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ORANGE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.YELLOW_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.LIME_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.GREEN_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CYAN_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BLUE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.PURPLE_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.MAGENTA_BRICK_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.PINK_BRICK_SLAB));

            tag(BlockTags.WOODEN_SLABS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_MOSAIC_SLAB))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_MOSAIC_SLAB));

            tag(BlockTags.STAIRS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CALCITE_TILE_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.AMETHYST_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.GRAY_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BLACK_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BROWN_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.RED_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ORANGE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.YELLOW_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.LIME_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.GREEN_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CYAN_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BLUE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.PURPLE_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.MAGENTA_BRICK_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.PINK_BRICK_STAIRS));

            tag(BlockTags.WOODEN_STAIRS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.SPRUCE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.BIRCH_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.JUNGLE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ACACIA_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.DARK_OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.MANGROVE_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CHERRY_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.PALE_OAK_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.CRIMSON_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.WARPED_MOSAIC_STAIRS))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_MOSAIC_STAIRS));

            tag(BlockTags.WOODEN_DOORS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_DOOR));

            tag(BlockTags.WOODEN_TRAPDOORS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_TRAPDOOR));

            tag(BlockTags.WOODEN_PRESSURE_PLATES)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_PRESSURE_PLATE));

            tag(BlockTags.WOODEN_BUTTONS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_BUTTON));

            tag(BlockTags.COMPLETES_FIND_TREE_TUTORIAL)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_LOG))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_WOOD))
                    .add(ModBlocks.getRK(ModBlocks.STRIPPED_ASPEN_LOG))
                    .add(ModBlocks.getRK(ModBlocks.STRIPPED_ASPEN_WOOD));

            tag(BlockItemTags.SAPLINGS.block())
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SAPLING))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_SAPLING));

            tag(BlockTags.FLOWERS)
                    .add(ModBlocks.getRK(ModBlocks.MARIGOLD))
                    .add(ModBlocks.getRK(ModBlocks.VIOLET_HEATHER))
                    .add(ModBlocks.getRK(ModBlocks.MAUVE_HEATHER))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_HEATHER));

            tag(BlockTags.SMALL_FLOWERS)
                    .add(ModBlocks.getRK(ModBlocks.MARIGOLD))
                    .add(ModBlocks.getRK(ModBlocks.VIOLET_HEATHER))
                    .add(ModBlocks.getRK(ModBlocks.MAUVE_HEATHER))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_HEATHER));

            tag(BlockTags.FLOWER_POTS)
                    .add(ModBlocks.getRK(ModBlocks.MARIGOLD_POT))
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SAPLING_POT))
                    .add(ModBlocks.getRK(ModBlocks.WHITE_CHERRY_SAPLING_POT));

            tag(BlockTags.WOODEN_SHELVES)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SHELF));

            tag(BlockTags.STANDING_SIGNS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_SIGN));

            tag(BlockTags.WALL_SIGNS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_WALL_SIGN));

            tag(BlockTags.CEILING_HANGING_SIGNS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_HANGING_SIGN));

            tag(BlockTags.WALL_HANGING_SIGNS)
                    .add(ModBlocks.getRK(ModBlocks.ASPEN_WALL_HANGING_SIGN));

            tag(BlockTags.LANTERNS)
                    .add(ModBlocks.getRK(ModBlocks.REDSTONE_LANTERN));
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

            tag(ItemTags.LOGS_THAT_BURN)
                    .add(ModItems.getRK(ModBlocks.ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_WOOD.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_WOOD.asItem()));

            tag(ItemTags.PLANKS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_PLANKS.asItem()));

            tag(ItemTags.LOGS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_WOOD.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_WOOD.asItem()));

            tag(ModTags.Items.ASPEN_LOGS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_WOOD.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_WOOD.asItem()));

            tag(ItemTags.WOODEN_SLABS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.OAK_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.SPRUCE_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.BIRCH_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.JUNGLE_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.ACACIA_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.DARK_OAK_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.MANGROVE_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHERRY_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.PALE_OAK_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.CRIMSON_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.WARPED_MOSAIC_SLAB.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_MOSAIC_SLAB.asItem()));

            tag(ItemTags.WOODEN_STAIRS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.OAK_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.SPRUCE_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.BIRCH_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.JUNGLE_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.ACACIA_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.DARK_OAK_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.MANGROVE_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHERRY_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.PALE_OAK_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CRIMSON_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.WARPED_MOSAIC_STAIRS.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_MOSAIC_STAIRS.asItem()));

            tag(ItemTags.WOODEN_DOORS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_DOOR.asItem()));

            tag(ItemTags.WOODEN_TRAPDOORS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_TRAPDOOR.asItem()));

            tag(ItemTags.WOODEN_PRESSURE_PLATES)
                    .add(ModItems.getRK(ModBlocks.ASPEN_PRESSURE_PLATE.asItem()));

            tag(ItemTags.WOODEN_BUTTONS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_BUTTON.asItem()));

            tag(ItemTags.SAPLINGS)
                    .add(ModItems.getRK(ModBlocks.ASPEN_SAPLING.asItem()))
                    .add(ModItems.getRK(ModBlocks.WHITE_CHERRY_SAPLING.asItem()));

            tag(ItemTags.BEE_FOOD)
                    .add(ModItems.getRK(ModBlocks.MARIGOLD.asItem()))
                    .add(ModItems.getRK(ModBlocks.VIOLET_HEATHER.asItem()))
                    .add(ModItems.getRK(ModBlocks.MAUVE_HEATHER.asItem()))
                    .add(ModItems.getRK(ModBlocks.WHITE_HEATHER.asItem()))
                    .add(ModItems.getRK(ModBlocks.WHITE_CHERRY_LEAVES.asItem()));

            tag(ItemTags.BOATS)
                    .add(ModItems.getRK(ModItems.ASPEN_BOAT));

            tag(ItemTags.CHEST_BOATS)
                    .add(ModItems.getRK(ModItems.ASPEN_CHEST_BOAT));

            tag(ItemTags.SIGNS)
                    .add(ModItems.getRK(ModItems.ASPEN_SIGN));

            tag(ItemTags.HANGING_SIGNS)
                    .add(ModItems.getRK(ModItems.ASPEN_HANGING_SIGN));

            tag(ItemTags.SULFUR_CUBE_SWALLOWABLE)
                    .add(ModItems.getRK(ModBlocks.ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_WOOD.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_WOOD.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_PLANKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.OAK_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.SPRUCE_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.BIRCH_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.JUNGLE_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.ACACIA_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.DARK_OAK_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.MANGROVE_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHERRY_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.PALE_OAK_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.BAMBOO_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.CRIMSON_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.WARPED_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.OAK_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.SPRUCE_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.BIRCH_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.JUNGLE_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.ACACIA_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.DARK_OAK_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.MANGROVE_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHERRY_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.PALE_OAK_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.CRIMSON_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.WARPED_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.CALCITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHISELED_CALCITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CALCITE_TILES.asItem()))
                    .add(ModItems.getRK(ModBlocks.SMOOTH_BASALT_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.POLISHED_GRANITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.POLISHED_DIORITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.POLISHED_ANDESITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.WHITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.LIGHT_GRAY_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.GRAY_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.BLACK_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.BROWN_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.RED_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.ORANGE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.YELLOW_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.LIME_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.GREEN_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CYAN_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.LIGHT_BLUE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.BLUE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.PURPLE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.MAGENTA_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.PINK_BRICKS.asItem()));

            tag(ItemTags.SULFUR_CUBE_ARCHETYPE_BOUNCY)
                    .add(ModItems.getRK(ModBlocks.ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_WOOD.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_LOG.asItem()))
                    .add(ModItems.getRK(ModBlocks.STRIPPED_ASPEN_WOOD.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_PLANKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.OAK_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.SPRUCE_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.BIRCH_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.JUNGLE_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.ACACIA_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.DARK_OAK_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.MANGROVE_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHERRY_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.PALE_OAK_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.BAMBOO_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.CRIMSON_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.WARPED_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_HERRINGBONE.asItem()))
                    .add(ModItems.getRK(ModBlocks.OAK_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.SPRUCE_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.BIRCH_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.JUNGLE_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.ACACIA_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.DARK_OAK_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.MANGROVE_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHERRY_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.PALE_OAK_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.CRIMSON_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.WARPED_MOSAIC.asItem()))
                    .add(ModItems.getRK(ModBlocks.ASPEN_MOSAIC.asItem()));

            tag(ItemTags.SULFUR_CUBE_ARCHETYPE_SLOW_BOUNCY)
                    .add(ModItems.getRK(ModBlocks.CALCITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CHISELED_CALCITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CALCITE_TILES.asItem()))
                    .add(ModItems.getRK(ModBlocks.SMOOTH_BASALT_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.POLISHED_GRANITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.POLISHED_DIORITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.POLISHED_ANDESITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.WHITE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.LIGHT_GRAY_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.GRAY_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.BLACK_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.BROWN_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.RED_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.ORANGE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.YELLOW_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.LIME_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.GREEN_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.CYAN_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.LIGHT_BLUE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.BLUE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.PURPLE_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.MAGENTA_BRICKS.asItem()))
                    .add(ModItems.getRK(ModBlocks.PINK_BRICKS.asItem()));
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

            tag(EntityTypeTags.BOAT)
                    .add(ModEntityTypes.getRK(ModEntityTypes.ASPEN_BOAT));

            tag(ConventionalEntityTypeTags.BOATS)
                    .add(ModEntityTypes.getRK(ModEntityTypes.ASPEN_CHEST_BOAT));
        }
    }
}