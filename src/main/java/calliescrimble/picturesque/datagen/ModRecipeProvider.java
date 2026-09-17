package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModItems;
import calliescrimble.picturesque.item.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALLIE_PLUSHIE, Blocks.GRAY_WOOL);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYNTHIA_PLUSHIE, Blocks.YELLOW_WOOL);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BURNING_PLUSHIE, Blocks.RED_WOOL);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILES, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_STAIRS, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_STAIRS, ModBlocks.CALCITE_TILES);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_SLAB, ModBlocks.CALCITE_TILES, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_WALL, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_WALL, ModBlocks.CALCITE_TILES);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, Blocks.CALCITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICKS, Blocks.SMOOTH_BASALT);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, Blocks.SMOOTH_BASALT);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, ModBlocks.SMOOTH_BASALT_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_SLAB, Blocks.SMOOTH_BASALT, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_SLAB, ModBlocks.SMOOTH_BASALT_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_WALL, Blocks.SMOOTH_BASALT);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_WALL, ModBlocks.SMOOTH_BASALT_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, ModBlocks.POLISHED_GRANITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, ModBlocks.POLISHED_GRANITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, ModBlocks.POLISHED_GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, ModBlocks.POLISHED_DIORITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, ModBlocks.POLISHED_DIORITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, ModBlocks.POLISHED_DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, ModBlocks.POLISHED_ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, ModBlocks.POLISHED_ANDESITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, ModBlocks.POLISHED_ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_STAIRS, ModBlocks.WHITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_SLAB, ModBlocks.WHITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_WALL, ModBlocks.WHITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_STAIRS, ModBlocks.LIGHT_GRAY_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_SLAB, ModBlocks.LIGHT_GRAY_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_WALL, ModBlocks.LIGHT_GRAY_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_STAIRS, ModBlocks.GRAY_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_SLAB, ModBlocks.GRAY_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_WALL, ModBlocks.GRAY_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_STAIRS, ModBlocks.BLACK_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_SLAB, ModBlocks.BLACK_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_WALL, ModBlocks.BLACK_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_STAIRS, ModBlocks.BROWN_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_SLAB, ModBlocks.BROWN_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_WALL, ModBlocks.BROWN_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_BRICK_STAIRS, ModBlocks.RED_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_BRICK_SLAB, ModBlocks.RED_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.RED_BRICK_WALL, ModBlocks.RED_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_STAIRS, ModBlocks.ORANGE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_SLAB, ModBlocks.ORANGE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_WALL, ModBlocks.ORANGE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_STAIRS, ModBlocks.YELLOW_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_SLAB, ModBlocks.YELLOW_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_WALL, ModBlocks.YELLOW_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_BRICK_STAIRS, ModBlocks.LIME_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_BRICK_SLAB, ModBlocks.LIME_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIME_BRICK_WALL, ModBlocks.LIME_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_STAIRS, ModBlocks.GREEN_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_SLAB, ModBlocks.GREEN_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_WALL, ModBlocks.GREEN_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_STAIRS, ModBlocks.CYAN_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_SLAB, ModBlocks.CYAN_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_WALL, ModBlocks.CYAN_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_STAIRS, ModBlocks.LIGHT_BLUE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_SLAB, ModBlocks.LIGHT_BLUE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_WALL, ModBlocks.LIGHT_BLUE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_STAIRS, ModBlocks.BLUE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_SLAB, ModBlocks.BLUE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_WALL, ModBlocks.BLUE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_STAIRS, ModBlocks.PURPLE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_SLAB, ModBlocks.PURPLE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_WALL, ModBlocks.PURPLE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_STAIRS, ModBlocks.MAGENTA_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_SLAB, ModBlocks.MAGENTA_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_WALL, ModBlocks.MAGENTA_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_BRICK_STAIRS, ModBlocks.PINK_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_BRICK_SLAB, ModBlocks.PINK_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.PINK_BRICK_WALL, ModBlocks.PINK_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, ModBlocks.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);

                createShapeless(RecipeCategory.MISC, ModBlocks.ASPEN_PLANKS, 4)
                        .input(ModTags.Items.ASPEN_LOGS)
                        .criterion(hasItem(ModBlocks.ASPEN_LOG), conditionsFromItem(ModBlocks.ASPEN_LOG))
                        .criterion(hasItem(ModBlocks.ASPEN_WOOD), conditionsFromItem(ModBlocks.ASPEN_WOOD))
                        .criterion(hasItem(ModBlocks.STRIPPED_ASPEN_LOG), conditionsFromItem(ModBlocks.STRIPPED_ASPEN_LOG))
                        .criterion(hasItem(ModBlocks.STRIPPED_ASPEN_WOOD), conditionsFromItem(ModBlocks.STRIPPED_ASPEN_WOOD))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.ASPEN_STAIRS, Ingredient.ofItems(ModBlocks.ASPEN_PLANKS))
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.ASPEN_SLAB, Ingredient.ofItems(ModBlocks.ASPEN_PLANKS))
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createFenceRecipe(ModBlocks.ASPEN_FENCE, Ingredient.ofItems(ModBlocks.ASPEN_PLANKS))
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createFenceGateRecipe(ModBlocks.ASPEN_FENCE_GATE, Ingredient.ofItems(ModBlocks.ASPEN_PLANKS))
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createDoorRecipe(ModBlocks.ASPEN_DOOR, Ingredient.ofItems(ModBlocks.ASPEN_PLANKS))
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createTrapdoorRecipe(ModBlocks.ASPEN_TRAPDOOR, Ingredient.ofItems(ModBlocks.ASPEN_PLANKS))
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createPressurePlateRecipe(RecipeCategory.MISC, ModBlocks.ASPEN_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.ASPEN_PLANKS))
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModBlocks.ASPEN_BUTTON)
                        .input(ModBlocks.ASPEN_PLANKS)
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ASPEN_WOOD, 3)
                        .pattern("WW")
                        .pattern("WW")
                        .input('W', ModBlocks.ASPEN_LOG)
                        .criterion(hasItem(ModBlocks.ASPEN_LOG), conditionsFromItem(ModBlocks.ASPEN_LOG))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.STRIPPED_ASPEN_WOOD, 3)
                        .pattern("WW")
                        .pattern("WW")
                        .input('W', ModBlocks.STRIPPED_ASPEN_LOG)
                        .criterion(hasItem(ModBlocks.STRIPPED_ASPEN_LOG), conditionsFromItem(ModBlocks.STRIPPED_ASPEN_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.OAK_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.OAK_PLANKS)
                        .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SPRUCE_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.SPRUCE_PLANKS)
                        .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BIRCH_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.BIRCH_PLANKS)
                        .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.JUNGLE_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.JUNGLE_PLANKS)
                        .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ACACIA_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.ACACIA_PLANKS)
                        .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.DARK_OAK_PLANKS)
                        .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MANGROVE_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.MANGROVE_PLANKS)
                        .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CHERRY_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.CHERRY_PLANKS)
                        .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PALE_OAK_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.PALE_OAK_PLANKS)
                        .criterion(hasItem(Blocks.PALE_OAK_PLANKS), conditionsFromItem(Blocks.PALE_OAK_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BAMBOO_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.BAMBOO_PLANKS)
                        .criterion(hasItem(Blocks.BAMBOO_PLANKS), conditionsFromItem(Blocks.BAMBOO_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CRIMSON_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.CRIMSON_PLANKS)
                        .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WARPED_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', Blocks.WARPED_PLANKS)
                        .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ASPEN_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .input('P', ModBlocks.ASPEN_PLANKS)
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .input('C', Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_TILES, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .input('C', ModBlocks.CALCITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CALCITE_STAIRS, Ingredient.ofItems(Blocks.CALCITE))
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_SLAB, Ingredient.ofItems(Blocks.CALCITE))
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .input('C', Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CALCITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.CALCITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .input('C', ModBlocks.CALCITE_BRICKS)
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CALCITE_TILE_STAIRS, Ingredient.ofItems(ModBlocks.CALCITE_TILES))
                        .criterion(hasItem(ModBlocks.CALCITE_TILES), conditionsFromItem(ModBlocks.CALCITE_TILES))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_SLAB, Ingredient.ofItems(ModBlocks.CALCITE_TILES))
                        .criterion(hasItem(ModBlocks.CALCITE_TILES), conditionsFromItem(ModBlocks.CALCITE_TILES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .input('C', ModBlocks.CALCITE_TILES)
                        .criterion(hasItem(ModBlocks.CALCITE_TILES), conditionsFromItem(ModBlocks.CALCITE_TILES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS)
                        .pattern("S")
                        .pattern("S")
                        .input('S', ModBlocks.CALCITE_BRICK_SLAB)
                        .criterion(hasItem(ModBlocks.CALCITE_BRICK_SLAB), conditionsFromItem(ModBlocks.CALCITE_BRICK_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICKS, 4)
                        .pattern("SS")
                        .pattern("SS")
                        .input('S', Blocks.SMOOTH_BASALT)
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_BASALT))
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_SLAB, Ingredient.ofItems(Blocks.SMOOTH_BASALT))
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .input('S', Blocks.SMOOTH_BASALT)
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .criterion(hasItem(ModBlocks.SMOOTH_BASALT_BRICKS), conditionsFromItem(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_SLAB, Ingredient.ofItems(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .criterion(hasItem(ModBlocks.SMOOTH_BASALT_BRICKS), conditionsFromItem(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .input('C', ModBlocks.SMOOTH_BASALT_BRICKS)
                        .criterion(hasItem(ModBlocks.SMOOTH_BASALT_BRICKS), conditionsFromItem(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', Blocks.POLISHED_GRANITE)
                        .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICKS, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .input('P', Blocks.POLISHED_GRANITE)
                        .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.POLISHED_GRANITE_BRICKS)
                        .criterion(hasItem(ModBlocks.POLISHED_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', Blocks.POLISHED_DIORITE)
                        .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICKS, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .input('P', Blocks.POLISHED_DIORITE)
                        .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_DIORITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_DIORITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.POLISHED_DIORITE_BRICKS)
                        .criterion(hasItem(ModBlocks.POLISHED_DIORITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', Blocks.POLISHED_ANDESITE)
                        .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICKS, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .input('P', Blocks.POLISHED_ANDESITE)
                        .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.POLISHED_ANDESITE_BRICKS)
                        .criterion(hasItem(ModBlocks.POLISHED_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .offerTo(exporter);

                createStairsRecipe(ModBlocks.AMETHYST_STAIRS, Ingredient.ofItems(Blocks.AMETHYST_BLOCK))
                        .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.AMETHYST_SLAB, Ingredient.ofItems(Blocks.AMETHYST_BLOCK))
                        .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.AMETHYST_WALL, 6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .input('A', Blocks.AMETHYST_BLOCK)
                        .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.WHITE_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.WHITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_BRICKS))
                        .criterion(hasItem(ModBlocks.WHITE_BRICKS), conditionsFromItem(ModBlocks.WHITE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.WHITE_BRICKS))
                        .criterion(hasItem(ModBlocks.WHITE_BRICKS), conditionsFromItem(ModBlocks.WHITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.WHITE_BRICKS)
                        .criterion(hasItem(ModBlocks.WHITE_BRICKS), conditionsFromItem(ModBlocks.WHITE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.LIGHT_GRAY_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_GRAY_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BRICKS))
                        .criterion(hasItem(ModBlocks.LIGHT_GRAY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_SLAB, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BRICKS))
                        .criterion(hasItem(ModBlocks.LIGHT_GRAY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.LIGHT_GRAY_BRICKS)
                        .criterion(hasItem(ModBlocks.LIGHT_GRAY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.GRAY_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GRAY_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.GRAY_BRICKS))
                        .criterion(hasItem(ModBlocks.GRAY_BRICKS), conditionsFromItem(ModBlocks.GRAY_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_SLAB, Ingredient.ofItems(ModBlocks.GRAY_BRICKS))
                        .criterion(hasItem(ModBlocks.GRAY_BRICKS), conditionsFromItem(ModBlocks.GRAY_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.GRAY_BRICKS)
                        .criterion(hasItem(ModBlocks.GRAY_BRICKS), conditionsFromItem(ModBlocks.GRAY_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.BLACK_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLACK_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.BLACK_BRICKS))
                        .criterion(hasItem(ModBlocks.BLACK_BRICKS), conditionsFromItem(ModBlocks.BLACK_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_SLAB, Ingredient.ofItems(ModBlocks.BLACK_BRICKS))
                        .criterion(hasItem(ModBlocks.BLACK_BRICKS), conditionsFromItem(ModBlocks.BLACK_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.BLACK_BRICKS)
                        .criterion(hasItem(ModBlocks.BLACK_BRICKS), conditionsFromItem(ModBlocks.BLACK_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.BROWN_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BROWN_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.BROWN_BRICKS))
                        .criterion(hasItem(ModBlocks.BROWN_BRICKS), conditionsFromItem(ModBlocks.BROWN_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_SLAB, Ingredient.ofItems(ModBlocks.BROWN_BRICKS))
                        .criterion(hasItem(ModBlocks.BROWN_BRICKS), conditionsFromItem(ModBlocks.BROWN_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.BROWN_BRICKS)
                        .criterion(hasItem(ModBlocks.BROWN_BRICKS), conditionsFromItem(ModBlocks.BROWN_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.RED_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.RED_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.RED_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.RED_BRICKS))
                        .criterion(hasItem(ModBlocks.RED_BRICKS), conditionsFromItem(ModBlocks.RED_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.RED_BRICK_SLAB, Ingredient.ofItems(ModBlocks.RED_BRICKS))
                        .criterion(hasItem(ModBlocks.RED_BRICKS), conditionsFromItem(ModBlocks.RED_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.RED_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.RED_BRICKS)
                        .criterion(hasItem(ModBlocks.RED_BRICKS), conditionsFromItem(ModBlocks.RED_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.ORANGE_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.ORANGE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_BRICKS))
                        .criterion(hasItem(ModBlocks.ORANGE_BRICKS), conditionsFromItem(ModBlocks.ORANGE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.ORANGE_BRICKS))
                        .criterion(hasItem(ModBlocks.ORANGE_BRICKS), conditionsFromItem(ModBlocks.ORANGE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.ORANGE_BRICKS)
                        .criterion(hasItem(ModBlocks.ORANGE_BRICKS), conditionsFromItem(ModBlocks.ORANGE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.YELLOW_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.YELLOW_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_BRICKS))
                        .criterion(hasItem(ModBlocks.YELLOW_BRICKS), conditionsFromItem(ModBlocks.YELLOW_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_SLAB, Ingredient.ofItems(ModBlocks.YELLOW_BRICKS))
                        .criterion(hasItem(ModBlocks.YELLOW_BRICKS), conditionsFromItem(ModBlocks.YELLOW_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.YELLOW_BRICKS)
                        .criterion(hasItem(ModBlocks.YELLOW_BRICKS), conditionsFromItem(ModBlocks.YELLOW_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIME_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.LIME_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIME_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LIME_BRICKS))
                        .criterion(hasItem(ModBlocks.LIME_BRICKS), conditionsFromItem(ModBlocks.LIME_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.LIME_BRICK_SLAB, Ingredient.ofItems(ModBlocks.LIME_BRICKS))
                        .criterion(hasItem(ModBlocks.LIME_BRICKS), conditionsFromItem(ModBlocks.LIME_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIME_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.LIME_BRICKS)
                        .criterion(hasItem(ModBlocks.LIME_BRICKS), conditionsFromItem(ModBlocks.LIME_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.GREEN_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GREEN_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_BRICKS))
                        .criterion(hasItem(ModBlocks.GREEN_BRICKS), conditionsFromItem(ModBlocks.GREEN_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_SLAB, Ingredient.ofItems(ModBlocks.GREEN_BRICKS))
                        .criterion(hasItem(ModBlocks.GREEN_BRICKS), conditionsFromItem(ModBlocks.GREEN_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.GREEN_BRICKS)
                        .criterion(hasItem(ModBlocks.GREEN_BRICKS), conditionsFromItem(ModBlocks.GREEN_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.CYAN_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CYAN_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_BRICKS))
                        .criterion(hasItem(ModBlocks.CYAN_BRICKS), conditionsFromItem(ModBlocks.CYAN_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_SLAB, Ingredient.ofItems(ModBlocks.CYAN_BRICKS))
                        .criterion(hasItem(ModBlocks.CYAN_BRICKS), conditionsFromItem(ModBlocks.CYAN_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.CYAN_BRICKS)
                        .criterion(hasItem(ModBlocks.CYAN_BRICKS), conditionsFromItem(ModBlocks.CYAN_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.LIGHT_BLUE_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_BLUE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_BLUE_BRICKS))
                        .criterion(hasItem(ModBlocks.LIGHT_BLUE_BRICKS), conditionsFromItem(ModBlocks.LIGHT_BLUE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.LIGHT_BLUE_BRICKS))
                        .criterion(hasItem(ModBlocks.LIGHT_BLUE_BRICKS), conditionsFromItem(ModBlocks.LIGHT_BLUE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.LIGHT_BLUE_BRICKS)
                        .criterion(hasItem(ModBlocks.LIGHT_BLUE_BRICKS), conditionsFromItem(ModBlocks.LIGHT_BLUE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.BLUE_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLUE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.BLUE_BRICKS))
                        .criterion(hasItem(ModBlocks.BLUE_BRICKS), conditionsFromItem(ModBlocks.BLUE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.BLUE_BRICKS))
                        .criterion(hasItem(ModBlocks.BLUE_BRICKS), conditionsFromItem(ModBlocks.BLUE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.BLUE_BRICKS)
                        .criterion(hasItem(ModBlocks.BLUE_BRICKS), conditionsFromItem(ModBlocks.BLUE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.PURPLE_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PURPLE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.PURPLE_BRICKS))
                        .criterion(hasItem(ModBlocks.PURPLE_BRICKS), conditionsFromItem(ModBlocks.PURPLE_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.PURPLE_BRICKS))
                        .criterion(hasItem(ModBlocks.PURPLE_BRICKS), conditionsFromItem(ModBlocks.PURPLE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.PURPLE_BRICKS)
                        .criterion(hasItem(ModBlocks.PURPLE_BRICKS), conditionsFromItem(ModBlocks.PURPLE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.MAGENTA_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.MAGENTA_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_BRICKS))
                        .criterion(hasItem(ModBlocks.MAGENTA_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_SLAB, Ingredient.ofItems(ModBlocks.MAGENTA_BRICKS))
                        .criterion(hasItem(ModBlocks.MAGENTA_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.MAGENTA_BRICKS)
                        .criterion(hasItem(ModBlocks.MAGENTA_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PINK_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .input('B', Blocks.BRICKS)
                        .input('D', Items.PINK_DYE)
                        .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PINK_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BRICKS))
                        .criterion(hasItem(ModBlocks.PINK_BRICKS), conditionsFromItem(ModBlocks.PINK_BRICKS))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.PINK_BRICK_SLAB, Ingredient.ofItems(ModBlocks.PINK_BRICKS))
                        .criterion(hasItem(ModBlocks.PINK_BRICKS), conditionsFromItem(ModBlocks.PINK_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PINK_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .input('P', ModBlocks.PINK_BRICKS)
                        .criterion(hasItem(ModBlocks.PINK_BRICKS), conditionsFromItem(ModBlocks.PINK_BRICKS))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                        .input(ModBlocks.MARIGOLD)
                        .criterion(hasItem(ModBlocks.MARIGOLD), conditionsFromItem(ModBlocks.MARIGOLD))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                        .input(ModBlocks.MAUVE_HEATHER)
                        .criterion(hasItem(ModBlocks.MAUVE_HEATHER), conditionsFromItem(ModBlocks.MAUVE_HEATHER))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, Items.MAGENTA_DYE)
                        .input(ModBlocks.VIOLET_HEATHER)
                        .criterion(hasItem(ModBlocks.VIOLET_HEATHER), conditionsFromItem(ModBlocks.VIOLET_HEATHER))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, Items.WHITE_DYE)
                        .input(ModBlocks.WHITE_HEATHER)
                        .criterion(hasItem(ModBlocks.WHITE_HEATHER), conditionsFromItem(ModBlocks.WHITE_HEATHER))
                        .offerTo(exporter);

                offerShelfRecipe(ModBlocks.ASPEN_SHELF, ModBlocks.STRIPPED_ASPEN_LOG);
                createShaped(RecipeCategory.MISC, ModBlocks.ASPEN_SIGN, 3)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern(" S ")
                        .input('A', ModBlocks.ASPEN_PLANKS)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.ASPEN_PLANKS), conditionsFromItem(ModBlocks.ASPEN_PLANKS))
                        .offerTo(exporter);
                offerHangingSignRecipe(ModItems.ASPEN_HANGING_SIGN, ModBlocks.STRIPPED_ASPEN_LOG);
                offerBoatRecipe(ModItems.ASPEN_BOAT, ModBlocks.ASPEN_PLANKS);
                offerChestBoatRecipe(ModItems.ASPEN_CHEST_BOAT, ModItems.ASPEN_BOAT);

                createShaped(RecipeCategory.MISC, ModBlocks.REDSTONE_LANTERN)
                        .pattern("NNN")
                        .pattern("NRN")
                        .pattern("NNN")
                        .input('N', Items.IRON_NUGGET)
                        .input('R', Items.REDSTONE_TORCH)
                        .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                        .criterion(hasItem(Items.REDSTONE_TORCH), conditionsFromItem(Items.REDSTONE_TORCH))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.STICK, 16)
                        .pattern("L")
                        .pattern("L")
                        .input('L', ItemTags.LOGS)
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Blocks.CALCITE, 2)
                        .pattern("DQ")
                        .pattern("QD")
                        .input('D', Blocks.DIORITE)
                        .input('Q', Items.QUARTZ)
                        .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                        .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.OAK_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.OAK_LEAVES)
                        .criterion(hasItem(Blocks.OAK_LEAVES), conditionsFromItem(Blocks.OAK_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SPRUCE_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.SPRUCE_LEAVES)
                        .criterion(hasItem(Blocks.SPRUCE_LEAVES), conditionsFromItem(Blocks.SPRUCE_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BIRCH_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.BIRCH_LEAVES)
                        .criterion(hasItem(Blocks.BIRCH_LEAVES), conditionsFromItem(Blocks.BIRCH_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ASPEN_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', ModBlocks.ASPEN_LEAVES)
                        .criterion(hasItem(ModBlocks.ASPEN_LEAVES), conditionsFromItem(ModBlocks.ASPEN_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.JUNGLE_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.JUNGLE_LEAVES)
                        .criterion(hasItem(Blocks.JUNGLE_LEAVES), conditionsFromItem(Blocks.JUNGLE_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ACACIA_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.ACACIA_LEAVES)
                        .criterion(hasItem(Blocks.ACACIA_LEAVES), conditionsFromItem(Blocks.ACACIA_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.DARK_OAK_LEAVES)
                        .criterion(hasItem(Blocks.DARK_OAK_LEAVES), conditionsFromItem(Blocks.DARK_OAK_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MANGROVE_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.MANGROVE_LEAVES)
                        .criterion(hasItem(Blocks.MANGROVE_LEAVES), conditionsFromItem(Blocks.MANGROVE_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.AZALEA_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.AZALEA_LEAVES)
                        .criterion(hasItem(Blocks.AZALEA_LEAVES), conditionsFromItem(Blocks.AZALEA_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.FLOWERING_AZALEA_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.FLOWERING_AZALEA_LEAVES)
                        .criterion(hasItem(Blocks.FLOWERING_AZALEA_LEAVES), conditionsFromItem(Blocks.FLOWERING_AZALEA_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CHERRY_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.CHERRY_LEAVES)
                        .criterion(hasItem(Blocks.CHERRY_LEAVES), conditionsFromItem(Blocks.CHERRY_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WHITE_CHERRY_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', ModBlocks.WHITE_CHERRY_LEAVES)
                        .criterion(hasItem(ModBlocks.WHITE_CHERRY_LEAVES), conditionsFromItem(ModBlocks.WHITE_CHERRY_LEAVES))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PALE_OAK_LEAF_PILE, 3)
                        .pattern("LL")
                        .input('L', Blocks.PALE_OAK_LEAVES)
                        .criterion(hasItem(Blocks.PALE_OAK_LEAVES), conditionsFromItem(Blocks.PALE_OAK_LEAVES))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.OAK_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.OAK_SLAB)
                        .criterion(hasItem(Blocks.OAK_SLAB), conditionsFromItem(Blocks.OAK_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.SPRUCE_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.SPRUCE_SLAB)
                        .criterion(hasItem(Blocks.SPRUCE_SLAB), conditionsFromItem(Blocks.SPRUCE_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BIRCH_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.BIRCH_SLAB)
                        .criterion(hasItem(Blocks.BIRCH_SLAB), conditionsFromItem(Blocks.BIRCH_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.JUNGLE_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.JUNGLE_SLAB)
                        .criterion(hasItem(Blocks.JUNGLE_SLAB), conditionsFromItem(Blocks.JUNGLE_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ACACIA_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.ACACIA_SLAB)
                        .criterion(hasItem(Blocks.ACACIA_SLAB), conditionsFromItem(Blocks.ACACIA_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.DARK_OAK_SLAB)
                        .criterion(hasItem(Blocks.DARK_OAK_SLAB), conditionsFromItem(Blocks.DARK_OAK_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.MANGROVE_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.MANGROVE_SLAB)
                        .criterion(hasItem(Blocks.MANGROVE_SLAB), conditionsFromItem(Blocks.MANGROVE_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CHERRY_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.CHERRY_SLAB)
                        .criterion(hasItem(Blocks.CHERRY_SLAB), conditionsFromItem(Blocks.CHERRY_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PALE_OAK_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.PALE_OAK_SLAB)
                        .criterion(hasItem(Blocks.PALE_OAK_SLAB), conditionsFromItem(Blocks.PALE_OAK_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.CRIMSON_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.CRIMSON_SLAB)
                        .criterion(hasItem(Blocks.CRIMSON_SLAB), conditionsFromItem(Blocks.CRIMSON_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.WARPED_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', Blocks.WARPED_SLAB)
                        .criterion(hasItem(Blocks.WARPED_SLAB), conditionsFromItem(Blocks.WARPED_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ASPEN_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .input('S', ModBlocks.ASPEN_SLAB)
                        .criterion(hasItem(ModBlocks.ASPEN_SLAB), conditionsFromItem(ModBlocks.ASPEN_SLAB))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.OAK_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.OAK_MOSAIC))
                        .criterion(hasItem(ModBlocks.OAK_MOSAIC), conditionsFromItem(ModBlocks.OAK_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.OAK_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.OAK_MOSAIC))
                        .criterion(hasItem(ModBlocks.OAK_MOSAIC), conditionsFromItem(ModBlocks.OAK_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.SPRUCE_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.SPRUCE_MOSAIC))
                        .criterion(hasItem(ModBlocks.SPRUCE_MOSAIC), conditionsFromItem(ModBlocks.SPRUCE_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.SPRUCE_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.SPRUCE_MOSAIC))
                        .criterion(hasItem(ModBlocks.SPRUCE_MOSAIC), conditionsFromItem(ModBlocks.SPRUCE_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BIRCH_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.BIRCH_MOSAIC))
                        .criterion(hasItem(ModBlocks.BIRCH_MOSAIC), conditionsFromItem(ModBlocks.BIRCH_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.BIRCH_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.BIRCH_MOSAIC))
                        .criterion(hasItem(ModBlocks.BIRCH_MOSAIC), conditionsFromItem(ModBlocks.BIRCH_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.JUNGLE_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.JUNGLE_MOSAIC))
                        .criterion(hasItem(ModBlocks.JUNGLE_MOSAIC), conditionsFromItem(ModBlocks.JUNGLE_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.JUNGLE_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.JUNGLE_MOSAIC))
                        .criterion(hasItem(ModBlocks.JUNGLE_MOSAIC), conditionsFromItem(ModBlocks.JUNGLE_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.ACACIA_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.ACACIA_MOSAIC))
                        .criterion(hasItem(ModBlocks.ACACIA_MOSAIC), conditionsFromItem(ModBlocks.ACACIA_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.ACACIA_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.ACACIA_MOSAIC))
                        .criterion(hasItem(ModBlocks.ACACIA_MOSAIC), conditionsFromItem(ModBlocks.ACACIA_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.DARK_OAK_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.DARK_OAK_MOSAIC))
                        .criterion(hasItem(ModBlocks.DARK_OAK_MOSAIC), conditionsFromItem(ModBlocks.DARK_OAK_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.DARK_OAK_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.DARK_OAK_MOSAIC))
                        .criterion(hasItem(ModBlocks.DARK_OAK_MOSAIC), conditionsFromItem(ModBlocks.DARK_OAK_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.MANGROVE_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.MANGROVE_MOSAIC))
                        .criterion(hasItem(ModBlocks.MANGROVE_MOSAIC), conditionsFromItem(ModBlocks.MANGROVE_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.MANGROVE_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.MANGROVE_MOSAIC))
                        .criterion(hasItem(ModBlocks.MANGROVE_MOSAIC), conditionsFromItem(ModBlocks.MANGROVE_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CHERRY_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.CHERRY_MOSAIC))
                        .criterion(hasItem(ModBlocks.CHERRY_MOSAIC), conditionsFromItem(ModBlocks.CHERRY_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.CHERRY_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.CHERRY_MOSAIC))
                        .criterion(hasItem(ModBlocks.CHERRY_MOSAIC), conditionsFromItem(ModBlocks.CHERRY_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PALE_OAK_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.PALE_OAK_MOSAIC))
                        .criterion(hasItem(ModBlocks.PALE_OAK_MOSAIC), conditionsFromItem(ModBlocks.PALE_OAK_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.PALE_OAK_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.PALE_OAK_MOSAIC))
                        .criterion(hasItem(ModBlocks.PALE_OAK_MOSAIC), conditionsFromItem(ModBlocks.PALE_OAK_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CRIMSON_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.CRIMSON_MOSAIC))
                        .criterion(hasItem(ModBlocks.CRIMSON_MOSAIC), conditionsFromItem(ModBlocks.CRIMSON_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.CRIMSON_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.CRIMSON_MOSAIC))
                        .criterion(hasItem(ModBlocks.CRIMSON_MOSAIC), conditionsFromItem(ModBlocks.CRIMSON_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.WARPED_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.WARPED_MOSAIC))
                        .criterion(hasItem(ModBlocks.WARPED_MOSAIC), conditionsFromItem(ModBlocks.WARPED_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.WARPED_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.WARPED_MOSAIC))
                        .criterion(hasItem(ModBlocks.WARPED_MOSAIC), conditionsFromItem(ModBlocks.WARPED_MOSAIC))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.ASPEN_MOSAIC_STAIRS, Ingredient.ofItems(ModBlocks.ASPEN_MOSAIC))
                        .criterion(hasItem(ModBlocks.ASPEN_MOSAIC), conditionsFromItem(ModBlocks.ASPEN_MOSAIC))
                        .offerTo(exporter);
                createSlabRecipe(RecipeCategory.MISC, ModBlocks.ASPEN_MOSAIC_SLAB, Ingredient.ofItems(ModBlocks.ASPEN_MOSAIC))
                        .criterion(hasItem(ModBlocks.ASPEN_MOSAIC), conditionsFromItem(ModBlocks.ASPEN_MOSAIC))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Picturesque Recipes";
    }
}