package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModItems;
import calliescrimble.picturesque.item.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALLIE_PLUSHIE, Blocks.GRAY_WOOL);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CYNTHIA_PLUSHIE, Blocks.YELLOW_WOOL);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_TILES, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_STAIRS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_STAIRS, ModBlocks.CALCITE_TILES);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_SLAB, ModBlocks.CALCITE_TILES, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_WALL, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_WALL, ModBlocks.CALCITE_TILES);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, Blocks.CALCITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICKS, Blocks.SMOOTH_BASALT);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, Blocks.SMOOTH_BASALT);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, ModBlocks.SMOOTH_BASALT_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_SLAB, Blocks.SMOOTH_BASALT, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_SLAB, ModBlocks.SMOOTH_BASALT_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_WALL, Blocks.SMOOTH_BASALT);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_WALL, ModBlocks.SMOOTH_BASALT_BRICKS);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, ModBlocks.POLISHED_GRANITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, ModBlocks.POLISHED_GRANITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, ModBlocks.POLISHED_GRANITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, ModBlocks.POLISHED_DIORITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, ModBlocks.POLISHED_DIORITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.DIORITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, ModBlocks.POLISHED_DIORITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, ModBlocks.POLISHED_ANDESITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, ModBlocks.POLISHED_ANDESITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.ANDESITE);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, ModBlocks.POLISHED_ANDESITE_BRICKS);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_STAIRS, ModBlocks.WHITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_SLAB, ModBlocks.WHITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_WALL, ModBlocks.WHITE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_STAIRS, ModBlocks.LIGHT_GRAY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_SLAB, ModBlocks.LIGHT_GRAY_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_WALL, ModBlocks.LIGHT_GRAY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_STAIRS, ModBlocks.GRAY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_SLAB, ModBlocks.GRAY_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_WALL, ModBlocks.GRAY_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_STAIRS, ModBlocks.BLACK_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_SLAB, ModBlocks.BLACK_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_WALL, ModBlocks.BLACK_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_STAIRS, ModBlocks.BROWN_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_SLAB, ModBlocks.BROWN_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_WALL, ModBlocks.BROWN_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.RED_BRICK_STAIRS, ModBlocks.RED_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.RED_BRICK_SLAB, ModBlocks.RED_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.RED_BRICK_WALL, ModBlocks.RED_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_STAIRS, ModBlocks.ORANGE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_SLAB, ModBlocks.ORANGE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_WALL, ModBlocks.ORANGE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_STAIRS, ModBlocks.YELLOW_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_SLAB, ModBlocks.YELLOW_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_WALL, ModBlocks.YELLOW_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIME_BRICK_STAIRS, ModBlocks.LIME_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIME_BRICK_SLAB, ModBlocks.LIME_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIME_BRICK_WALL, ModBlocks.LIME_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_STAIRS, ModBlocks.GREEN_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_SLAB, ModBlocks.GREEN_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_WALL, ModBlocks.GREEN_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_STAIRS, ModBlocks.CYAN_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_SLAB, ModBlocks.CYAN_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_WALL, ModBlocks.CYAN_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_STAIRS, ModBlocks.LIGHT_BLUE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_SLAB, ModBlocks.LIGHT_BLUE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_WALL, ModBlocks.LIGHT_BLUE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_STAIRS, ModBlocks.BLUE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_SLAB, ModBlocks.BLUE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_WALL, ModBlocks.BLUE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_STAIRS, ModBlocks.PURPLE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_SLAB, ModBlocks.PURPLE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_WALL, ModBlocks.PURPLE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_STAIRS, ModBlocks.MAGENTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_SLAB, ModBlocks.MAGENTA_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_WALL, ModBlocks.MAGENTA_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.PINK_BRICK_STAIRS, ModBlocks.PINK_BRICKS);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.PINK_BRICK_SLAB, ModBlocks.PINK_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.PINK_BRICK_WALL, ModBlocks.PINK_BRICKS);

                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, ModBlocks.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);

                shapeless(RecipeCategory.MISC, ModBlocks.ASPEN_PLANKS, 4)
                        .requires(ModTags.Items.ASPEN_LOGS)
                        .unlockedBy(getHasName(ModBlocks.ASPEN_LOG), has(ModBlocks.ASPEN_LOG))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_WOOD), has(ModBlocks.ASPEN_WOOD))
                        .unlockedBy(getHasName(ModBlocks.STRIPPED_ASPEN_LOG), has(ModBlocks.STRIPPED_ASPEN_LOG))
                        .unlockedBy(getHasName(ModBlocks.STRIPPED_ASPEN_WOOD), has(ModBlocks.STRIPPED_ASPEN_WOOD))
                        .save(output);
                stairBuilder(ModBlocks.ASPEN_STAIRS, Ingredient.of(ModBlocks.ASPEN_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.ASPEN_SLAB, Ingredient.of(ModBlocks.ASPEN_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                fenceBuilder(ModBlocks.ASPEN_FENCE, Ingredient.of(ModBlocks.ASPEN_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                fenceGateBuilder(ModBlocks.ASPEN_FENCE_GATE, Ingredient.of(ModBlocks.ASPEN_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                doorBuilder(ModBlocks.ASPEN_DOOR, Ingredient.of(ModBlocks.ASPEN_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                trapdoorBuilder(ModBlocks.ASPEN_TRAPDOOR, Ingredient.of(ModBlocks.ASPEN_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                pressurePlateBuilder(RecipeCategory.MISC, ModBlocks.ASPEN_PRESSURE_PLATE, Ingredient.of(ModBlocks.ASPEN_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                shapeless(RecipeCategory.MISC, ModBlocks.ASPEN_BUTTON)
                        .requires(ModBlocks.ASPEN_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ASPEN_WOOD, 3)
                        .pattern("WW")
                        .pattern("WW")
                        .define('W', ModBlocks.ASPEN_LOG)
                        .unlockedBy(getHasName(ModBlocks.ASPEN_LOG), has(ModBlocks.ASPEN_LOG))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_ASPEN_WOOD, 3)
                        .pattern("WW")
                        .pattern("WW")
                        .define('W', ModBlocks.STRIPPED_ASPEN_LOG)
                        .unlockedBy(getHasName(ModBlocks.STRIPPED_ASPEN_LOG), has(ModBlocks.STRIPPED_ASPEN_LOG))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.OAK_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.OAK_PLANKS)
                        .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.SPRUCE_PLANKS)
                        .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS), has(Blocks.SPRUCE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BIRCH_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.BIRCH_PLANKS)
                        .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.JUNGLE_PLANKS)
                        .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ACACIA_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.ACACIA_PLANKS)
                        .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.DARK_OAK_PLANKS)
                        .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.MANGROVE_PLANKS)
                        .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CHERRY_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.CHERRY_PLANKS)
                        .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.PALE_OAK_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.PALE_OAK_PLANKS)
                        .unlockedBy(getHasName(Blocks.PALE_OAK_PLANKS), has(Blocks.PALE_OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BAMBOO_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.BAMBOO_PLANKS)
                        .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.CRIMSON_PLANKS)
                        .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.WARPED_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', Blocks.WARPED_PLANKS)
                        .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ASPEN_HERRINGBONE, 3)
                        .pattern("P ")
                        .pattern("PP")
                        .define('P', ModBlocks.ASPEN_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.CALCITE)
                        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CALCITE_TILES, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModBlocks.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS), has(ModBlocks.CALCITE_BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.CALCITE_STAIRS, Ingredient.of(Blocks.CALCITE))
                        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.CALCITE_SLAB, Ingredient.of(Blocks.CALCITE))
                        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CALCITE_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .define('C', Blocks.CALCITE)
                        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                        .save(output);
                stairBuilder(ModBlocks.CALCITE_BRICK_STAIRS, Ingredient.of(ModBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS), has(ModBlocks.CALCITE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_SLAB, Ingredient.of(ModBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS), has(ModBlocks.CALCITE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICK_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .define('C', ModBlocks.CALCITE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS), has(ModBlocks.CALCITE_BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.CALCITE_TILE_STAIRS, Ingredient.of(ModBlocks.CALCITE_TILES))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_TILES), has(ModBlocks.CALCITE_TILES))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_SLAB, Ingredient.of(ModBlocks.CALCITE_TILES))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_TILES), has(ModBlocks.CALCITE_TILES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CALCITE_TILE_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .define('C', ModBlocks.CALCITE_TILES)
                        .unlockedBy(getHasName(ModBlocks.CALCITE_TILES), has(ModBlocks.CALCITE_TILES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CHISELED_CALCITE_BRICKS)
                        .pattern("S")
                        .pattern("S")
                        .define('S', ModBlocks.CALCITE_BRICK_SLAB)
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICK_SLAB), has(ModBlocks.CALCITE_BRICK_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICKS, 4)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S', Blocks.SMOOTH_BASALT)
                        .unlockedBy(getHasName(Blocks.SMOOTH_BASALT), has(Blocks.SMOOTH_BASALT))
                        .save(output);
                stairBuilder(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.of(Blocks.SMOOTH_BASALT))
                        .unlockedBy(getHasName(Blocks.SMOOTH_BASALT), has(Blocks.SMOOTH_BASALT))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_SLAB, Ingredient.of(Blocks.SMOOTH_BASALT))
                        .unlockedBy(getHasName(Blocks.SMOOTH_BASALT), has(Blocks.SMOOTH_BASALT))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_WALL, 6)
                        .pattern("SSS")
                        .pattern("SSS")
                        .define('S', Blocks.SMOOTH_BASALT)
                        .unlockedBy(getHasName(Blocks.SMOOTH_BASALT), has(Blocks.SMOOTH_BASALT))
                        .save(output);
                stairBuilder(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, Ingredient.of(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_BASALT_BRICKS), has(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_SLAB, Ingredient.of(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_BASALT_BRICKS), has(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICK_WALL, 6)
                        .pattern("CCC")
                        .pattern("CCC")
                        .define('C', ModBlocks.SMOOTH_BASALT_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_BASALT_BRICKS), has(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', Blocks.POLISHED_GRANITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_GRANITE), has(Blocks.POLISHED_GRANITE))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICKS, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .define('P', Blocks.POLISHED_GRANITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_GRANITE), has(Blocks.POLISHED_GRANITE))
                        .save(output);
                stairBuilder(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS, Ingredient.of(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_GRANITE_BRICKS), has(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_SLAB, Ingredient.of(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_GRANITE_BRICKS), has(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GRANITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.POLISHED_GRANITE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.POLISHED_GRANITE_BRICKS), has(ModBlocks.POLISHED_GRANITE_BRICKS))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', Blocks.POLISHED_DIORITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_DIORITE), has(Blocks.POLISHED_DIORITE))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICKS, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .define('P', Blocks.POLISHED_DIORITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_DIORITE), has(Blocks.POLISHED_DIORITE))
                        .save(output);
                stairBuilder(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS, Ingredient.of(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_DIORITE_BRICKS), has(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_SLAB, Ingredient.of(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_DIORITE_BRICKS), has(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DIORITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.POLISHED_DIORITE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.POLISHED_DIORITE_BRICKS), has(ModBlocks.POLISHED_DIORITE_BRICKS))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', Blocks.POLISHED_ANDESITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_ANDESITE), has(Blocks.POLISHED_ANDESITE))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICKS, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .define('P', Blocks.POLISHED_ANDESITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_ANDESITE), has(Blocks.POLISHED_ANDESITE))
                        .save(output);
                stairBuilder(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Ingredient.of(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_ANDESITE_BRICKS), has(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_SLAB, Ingredient.of(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.POLISHED_ANDESITE_BRICKS), has(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ANDESITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.POLISHED_ANDESITE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.POLISHED_ANDESITE_BRICKS), has(ModBlocks.POLISHED_ANDESITE_BRICKS))
                        .save(output);

                stairBuilder(ModBlocks.AMETHYST_STAIRS, Ingredient.of(Blocks.AMETHYST_BLOCK))
                        .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.AMETHYST_SLAB, Ingredient.of(Blocks.AMETHYST_BLOCK))
                        .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.AMETHYST_WALL, 6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Blocks.AMETHYST_BLOCK)
                        .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.WHITE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.WHITE_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.WHITE_BRICK_STAIRS, Ingredient.of(ModBlocks.WHITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.WHITE_BRICKS), has(ModBlocks.WHITE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_SLAB, Ingredient.of(ModBlocks.WHITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.WHITE_BRICKS), has(ModBlocks.WHITE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.WHITE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.WHITE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.WHITE_BRICKS), has(ModBlocks.WHITE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.LIGHT_GRAY_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.LIGHT_GRAY_BRICK_STAIRS, Ingredient.of(ModBlocks.LIGHT_GRAY_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.LIGHT_GRAY_BRICKS), has(ModBlocks.LIGHT_GRAY_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_SLAB, Ingredient.of(ModBlocks.LIGHT_GRAY_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.LIGHT_GRAY_BRICKS), has(ModBlocks.LIGHT_GRAY_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.LIGHT_GRAY_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.LIGHT_GRAY_BRICKS), has(ModBlocks.LIGHT_GRAY_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.GRAY_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.GRAY_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.GRAY_BRICK_STAIRS, Ingredient.of(ModBlocks.GRAY_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GRAY_BRICKS), has(ModBlocks.GRAY_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_SLAB, Ingredient.of(ModBlocks.GRAY_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GRAY_BRICKS), has(ModBlocks.GRAY_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.GRAY_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.GRAY_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.GRAY_BRICKS), has(ModBlocks.GRAY_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BLACK_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.BLACK_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.BLACK_BRICK_STAIRS, Ingredient.of(ModBlocks.BLACK_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BLACK_BRICKS), has(ModBlocks.BLACK_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_SLAB, Ingredient.of(ModBlocks.BLACK_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BLACK_BRICKS), has(ModBlocks.BLACK_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BLACK_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.BLACK_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.BLACK_BRICKS), has(ModBlocks.BLACK_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BROWN_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.BROWN_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.BROWN_BRICK_STAIRS, Ingredient.of(ModBlocks.BROWN_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BROWN_BRICKS), has(ModBlocks.BROWN_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_SLAB, Ingredient.of(ModBlocks.BROWN_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BROWN_BRICKS), has(ModBlocks.BROWN_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BROWN_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.BROWN_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.BROWN_BRICKS), has(ModBlocks.BROWN_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.RED_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.RED_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.RED_BRICK_STAIRS, Ingredient.of(ModBlocks.RED_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.RED_BRICKS), has(ModBlocks.RED_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.RED_BRICK_SLAB, Ingredient.of(ModBlocks.RED_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.RED_BRICKS), has(ModBlocks.RED_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.RED_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.RED_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.RED_BRICKS), has(ModBlocks.RED_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ORANGE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.ORANGE_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.ORANGE_BRICK_STAIRS, Ingredient.of(ModBlocks.ORANGE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.ORANGE_BRICKS), has(ModBlocks.ORANGE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_SLAB, Ingredient.of(ModBlocks.ORANGE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.ORANGE_BRICKS), has(ModBlocks.ORANGE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ORANGE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.ORANGE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.ORANGE_BRICKS), has(ModBlocks.ORANGE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.YELLOW_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.YELLOW_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.YELLOW_BRICK_STAIRS, Ingredient.of(ModBlocks.YELLOW_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.YELLOW_BRICKS), has(ModBlocks.YELLOW_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_SLAB, Ingredient.of(ModBlocks.YELLOW_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.YELLOW_BRICKS), has(ModBlocks.YELLOW_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.YELLOW_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.YELLOW_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.YELLOW_BRICKS), has(ModBlocks.YELLOW_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.LIME_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.LIME_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.LIME_BRICK_STAIRS, Ingredient.of(ModBlocks.LIME_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.LIME_BRICKS), has(ModBlocks.LIME_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.LIME_BRICK_SLAB, Ingredient.of(ModBlocks.LIME_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.LIME_BRICKS), has(ModBlocks.LIME_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.LIME_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.LIME_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.LIME_BRICKS), has(ModBlocks.LIME_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.GREEN_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.GREEN_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.GREEN_BRICK_STAIRS, Ingredient.of(ModBlocks.GREEN_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GREEN_BRICKS), has(ModBlocks.GREEN_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_SLAB, Ingredient.of(ModBlocks.GREEN_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GREEN_BRICKS), has(ModBlocks.GREEN_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.GREEN_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.GREEN_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.GREEN_BRICKS), has(ModBlocks.GREEN_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CYAN_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.CYAN_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.CYAN_BRICK_STAIRS, Ingredient.of(ModBlocks.CYAN_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CYAN_BRICKS), has(ModBlocks.CYAN_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_SLAB, Ingredient.of(ModBlocks.CYAN_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CYAN_BRICKS), has(ModBlocks.CYAN_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CYAN_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.CYAN_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.CYAN_BRICKS), has(ModBlocks.CYAN_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.LIGHT_BLUE_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.LIGHT_BLUE_BRICK_STAIRS, Ingredient.of(ModBlocks.LIGHT_BLUE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.LIGHT_BLUE_BRICKS), has(ModBlocks.LIGHT_BLUE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_SLAB, Ingredient.of(ModBlocks.LIGHT_BLUE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.LIGHT_BLUE_BRICKS), has(ModBlocks.LIGHT_BLUE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.LIGHT_BLUE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.LIGHT_BLUE_BRICKS), has(ModBlocks.LIGHT_BLUE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BLUE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.BLUE_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.BLUE_BRICK_STAIRS, Ingredient.of(ModBlocks.BLUE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BLUE_BRICKS), has(ModBlocks.BLUE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_SLAB, Ingredient.of(ModBlocks.BLUE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BLUE_BRICKS), has(ModBlocks.BLUE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BLUE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.BLUE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.BLUE_BRICKS), has(ModBlocks.BLUE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.PURPLE_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.PURPLE_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.PURPLE_BRICK_STAIRS, Ingredient.of(ModBlocks.PURPLE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.PURPLE_BRICKS), has(ModBlocks.PURPLE_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_SLAB, Ingredient.of(ModBlocks.PURPLE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.PURPLE_BRICKS), has(ModBlocks.PURPLE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.PURPLE_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.PURPLE_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.PURPLE_BRICKS), has(ModBlocks.PURPLE_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.MAGENTA_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.MAGENTA_BRICK_STAIRS, Ingredient.of(ModBlocks.MAGENTA_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.MAGENTA_BRICKS), has(ModBlocks.MAGENTA_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_SLAB, Ingredient.of(ModBlocks.MAGENTA_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.MAGENTA_BRICKS), has(ModBlocks.MAGENTA_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.MAGENTA_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.MAGENTA_BRICKS), has(ModBlocks.MAGENTA_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.PINK_BRICKS, 8)
                        .pattern("BBB")
                        .pattern("BDB")
                        .pattern("BBB")
                        .define('B', Blocks.BRICKS)
                        .define('D', Items.PINK_DYE)
                        .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                        .save(output);
                stairBuilder(ModBlocks.PINK_BRICK_STAIRS, Ingredient.of(ModBlocks.PINK_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.PINK_BRICKS), has(ModBlocks.PINK_BRICKS))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.PINK_BRICK_SLAB, Ingredient.of(ModBlocks.PINK_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.PINK_BRICKS), has(ModBlocks.PINK_BRICKS))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.PINK_BRICK_WALL, 6)
                        .pattern("PPP")
                        .pattern("PPP")
                        .define('P', ModBlocks.PINK_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.PINK_BRICKS), has(ModBlocks.PINK_BRICKS))
                        .save(output);

                shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                        .requires(ModBlocks.MARIGOLD)
                        .unlockedBy(getHasName(ModBlocks.MARIGOLD), has(ModBlocks.MARIGOLD))
                        .save(output);

                shapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                        .requires(ModBlocks.MAUVE_HEATHER)
                        .unlockedBy(getHasName(ModBlocks.MAUVE_HEATHER), has(ModBlocks.MAUVE_HEATHER))
                        .save(output);
                shapeless(RecipeCategory.MISC, Items.MAGENTA_DYE)
                        .requires(ModBlocks.VIOLET_HEATHER)
                        .unlockedBy(getHasName(ModBlocks.VIOLET_HEATHER), has(ModBlocks.VIOLET_HEATHER))
                        .save(output);
                shapeless(RecipeCategory.MISC, Items.WHITE_DYE)
                        .requires(ModBlocks.WHITE_HEATHER)
                        .unlockedBy(getHasName(ModBlocks.WHITE_HEATHER), has(ModBlocks.WHITE_HEATHER))
                        .save(output);

                shelf(ModBlocks.ASPEN_SHELF, ModBlocks.STRIPPED_ASPEN_LOG);
                shaped(RecipeCategory.MISC, ModBlocks.ASPEN_SIGN, 3)
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern(" S ")
                        .define('A', ModBlocks.ASPEN_PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModBlocks.ASPEN_PLANKS), has(ModBlocks.ASPEN_PLANKS))
                        .save(output);
                hangingSign(ModItems.ASPEN_HANGING_SIGN, ModBlocks.STRIPPED_ASPEN_LOG);
                woodenBoat(ModItems.ASPEN_BOAT, ModBlocks.ASPEN_PLANKS);
                chestBoat(ModItems.ASPEN_CHEST_BOAT, ModItems.ASPEN_BOAT);

                shaped(RecipeCategory.MISC, ModBlocks.REDSTONE_LANTERN)
                        .pattern("NNN")
                        .pattern("NRN")
                        .pattern("NNN")
                        .define('N', Items.IRON_NUGGET)
                        .define('R', Items.REDSTONE_TORCH)
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .unlockedBy(getHasName(Items.REDSTONE_TORCH), has(Items.REDSTONE_TORCH))
                        .save(output);

                shaped(RecipeCategory.MISC, Items.STICK, 16)
                        .pattern("L")
                        .pattern("L")
                        .define('L', ItemTags.LOGS)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.MISC, Blocks.CALCITE, 2)
                        .pattern("DQ")
                        .pattern("QD")
                        .define('D', Blocks.DIORITE)
                        .define('Q', Items.QUARTZ)
                        .unlockedBy(getHasName(Blocks.DIORITE), has(Blocks.DIORITE))
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.OAK_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.OAK_LEAVES)
                        .unlockedBy(getHasName(Blocks.OAK_LEAVES), has(Blocks.OAK_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.SPRUCE_LEAVES)
                        .unlockedBy(getHasName(Blocks.SPRUCE_LEAVES), has(Blocks.SPRUCE_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BIRCH_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.BIRCH_LEAVES)
                        .unlockedBy(getHasName(Blocks.BIRCH_LEAVES), has(Blocks.BIRCH_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ASPEN_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', ModBlocks.ASPEN_LEAVES)
                        .unlockedBy(getHasName(ModBlocks.ASPEN_LEAVES), has(ModBlocks.ASPEN_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.JUNGLE_LEAVES)
                        .unlockedBy(getHasName(Blocks.JUNGLE_LEAVES), has(Blocks.JUNGLE_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ACACIA_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.ACACIA_LEAVES)
                        .unlockedBy(getHasName(Blocks.ACACIA_LEAVES), has(Blocks.ACACIA_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.DARK_OAK_LEAVES)
                        .unlockedBy(getHasName(Blocks.DARK_OAK_LEAVES), has(Blocks.DARK_OAK_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.MANGROVE_LEAVES)
                        .unlockedBy(getHasName(Blocks.MANGROVE_LEAVES), has(Blocks.MANGROVE_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.AZALEA_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.AZALEA_LEAVES)
                        .unlockedBy(getHasName(Blocks.AZALEA_LEAVES), has(Blocks.AZALEA_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.FLOWERING_AZALEA_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.FLOWERING_AZALEA_LEAVES)
                        .unlockedBy(getHasName(Blocks.FLOWERING_AZALEA_LEAVES), has(Blocks.FLOWERING_AZALEA_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CHERRY_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.CHERRY_LEAVES)
                        .unlockedBy(getHasName(Blocks.CHERRY_LEAVES), has(Blocks.CHERRY_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.WHITE_CHERRY_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', ModBlocks.WHITE_CHERRY_LEAVES)
                        .unlockedBy(getHasName(ModBlocks.WHITE_CHERRY_LEAVES), has(ModBlocks.WHITE_CHERRY_LEAVES))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.PALE_OAK_LEAF_PILE, 3)
                        .pattern("LL")
                        .define('L', Blocks.PALE_OAK_LEAVES)
                        .unlockedBy(getHasName(Blocks.PALE_OAK_LEAVES), has(Blocks.PALE_OAK_LEAVES))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.OAK_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.OAK_SLAB)
                        .unlockedBy(getHasName(Blocks.OAK_SLAB), has(Blocks.OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.SPRUCE_SLAB)
                        .unlockedBy(getHasName(Blocks.SPRUCE_SLAB), has(Blocks.SPRUCE_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.BIRCH_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.BIRCH_SLAB)
                        .unlockedBy(getHasName(Blocks.BIRCH_SLAB), has(Blocks.BIRCH_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.JUNGLE_SLAB)
                        .unlockedBy(getHasName(Blocks.JUNGLE_SLAB), has(Blocks.JUNGLE_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ACACIA_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.ACACIA_SLAB)
                        .unlockedBy(getHasName(Blocks.ACACIA_SLAB), has(Blocks.ACACIA_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.DARK_OAK_SLAB)
                        .unlockedBy(getHasName(Blocks.DARK_OAK_SLAB), has(Blocks.DARK_OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.MANGROVE_SLAB)
                        .unlockedBy(getHasName(Blocks.MANGROVE_SLAB), has(Blocks.MANGROVE_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CHERRY_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.CHERRY_SLAB)
                        .unlockedBy(getHasName(Blocks.CHERRY_SLAB), has(Blocks.CHERRY_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.PALE_OAK_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.PALE_OAK_SLAB)
                        .unlockedBy(getHasName(Blocks.PALE_OAK_SLAB), has(Blocks.PALE_OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.CRIMSON_SLAB)
                        .unlockedBy(getHasName(Blocks.CRIMSON_SLAB), has(Blocks.CRIMSON_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.WARPED_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', Blocks.WARPED_SLAB)
                        .unlockedBy(getHasName(Blocks.WARPED_SLAB), has(Blocks.WARPED_SLAB))
                        .save(output);
                shaped(RecipeCategory.MISC, ModBlocks.ASPEN_MOSAIC)
                        .pattern("S")
                        .pattern("S")
                        .define('S', ModBlocks.ASPEN_SLAB)
                        .unlockedBy(getHasName(ModBlocks.ASPEN_SLAB), has(ModBlocks.ASPEN_SLAB))
                        .save(output);
                stairBuilder(ModBlocks.OAK_MOSAIC_STAIRS, Ingredient.of(ModBlocks.OAK_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.OAK_MOSAIC), has(ModBlocks.OAK_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.OAK_MOSAIC_SLAB, Ingredient.of(ModBlocks.OAK_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.OAK_MOSAIC), has(ModBlocks.OAK_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.SPRUCE_MOSAIC_STAIRS, Ingredient.of(ModBlocks.SPRUCE_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.SPRUCE_MOSAIC), has(ModBlocks.SPRUCE_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.SPRUCE_MOSAIC_SLAB, Ingredient.of(ModBlocks.SPRUCE_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.SPRUCE_MOSAIC), has(ModBlocks.SPRUCE_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.BIRCH_MOSAIC_STAIRS, Ingredient.of(ModBlocks.BIRCH_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.BIRCH_MOSAIC), has(ModBlocks.BIRCH_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.BIRCH_MOSAIC_SLAB, Ingredient.of(ModBlocks.BIRCH_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.BIRCH_MOSAIC), has(ModBlocks.BIRCH_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.JUNGLE_MOSAIC_STAIRS, Ingredient.of(ModBlocks.JUNGLE_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.JUNGLE_MOSAIC), has(ModBlocks.JUNGLE_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.JUNGLE_MOSAIC_SLAB, Ingredient.of(ModBlocks.JUNGLE_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.JUNGLE_MOSAIC), has(ModBlocks.JUNGLE_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.ACACIA_MOSAIC_STAIRS, Ingredient.of(ModBlocks.ACACIA_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.ACACIA_MOSAIC), has(ModBlocks.ACACIA_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.ACACIA_MOSAIC_SLAB, Ingredient.of(ModBlocks.ACACIA_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.ACACIA_MOSAIC), has(ModBlocks.ACACIA_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.DARK_OAK_MOSAIC_STAIRS, Ingredient.of(ModBlocks.DARK_OAK_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.DARK_OAK_MOSAIC), has(ModBlocks.DARK_OAK_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.DARK_OAK_MOSAIC_SLAB, Ingredient.of(ModBlocks.DARK_OAK_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.DARK_OAK_MOSAIC), has(ModBlocks.DARK_OAK_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.MANGROVE_MOSAIC_STAIRS, Ingredient.of(ModBlocks.MANGROVE_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.MANGROVE_MOSAIC), has(ModBlocks.MANGROVE_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.MANGROVE_MOSAIC_SLAB, Ingredient.of(ModBlocks.MANGROVE_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.MANGROVE_MOSAIC), has(ModBlocks.MANGROVE_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.CHERRY_MOSAIC_STAIRS, Ingredient.of(ModBlocks.CHERRY_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.CHERRY_MOSAIC), has(ModBlocks.CHERRY_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.CHERRY_MOSAIC_SLAB, Ingredient.of(ModBlocks.CHERRY_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.CHERRY_MOSAIC), has(ModBlocks.CHERRY_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.PALE_OAK_MOSAIC_STAIRS, Ingredient.of(ModBlocks.PALE_OAK_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.PALE_OAK_MOSAIC), has(ModBlocks.PALE_OAK_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.PALE_OAK_MOSAIC_SLAB, Ingredient.of(ModBlocks.PALE_OAK_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.PALE_OAK_MOSAIC), has(ModBlocks.PALE_OAK_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.CRIMSON_MOSAIC_STAIRS, Ingredient.of(ModBlocks.CRIMSON_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.CRIMSON_MOSAIC), has(ModBlocks.CRIMSON_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.CRIMSON_MOSAIC_SLAB, Ingredient.of(ModBlocks.CRIMSON_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.CRIMSON_MOSAIC), has(ModBlocks.CRIMSON_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.WARPED_MOSAIC_STAIRS, Ingredient.of(ModBlocks.WARPED_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.WARPED_MOSAIC), has(ModBlocks.WARPED_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.WARPED_MOSAIC_SLAB, Ingredient.of(ModBlocks.WARPED_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.WARPED_MOSAIC), has(ModBlocks.WARPED_MOSAIC))
                        .save(output);
                stairBuilder(ModBlocks.ASPEN_MOSAIC_STAIRS, Ingredient.of(ModBlocks.ASPEN_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_MOSAIC), has(ModBlocks.ASPEN_MOSAIC))
                        .save(output);
                slabBuilder(RecipeCategory.MISC, ModBlocks.ASPEN_MOSAIC_SLAB, Ingredient.of(ModBlocks.ASPEN_MOSAIC))
                        .unlockedBy(getHasName(ModBlocks.ASPEN_MOSAIC), has(ModBlocks.ASPEN_MOSAIC))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Picturesque Recipes";
    }
}