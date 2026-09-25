package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends FabricModelProvider {

    public static final BlockFamily ASPEN_BLOCK_FAMILY = BlockFamilies.familyBuilder(ModBlocks.ASPEN_PLANKS)
            .log(ModBlocks.ASPEN_LOG)
            .strippedLog(ModBlocks.STRIPPED_ASPEN_LOG)
            .button(ModBlocks.ASPEN_BUTTON)
            .fence(ModBlocks.ASPEN_FENCE)
            .fenceGate(ModBlocks.ASPEN_FENCE_GATE)
            .hangingSign(ModBlocks.ASPEN_HANGING_SIGN, ModBlocks.ASPEN_WALL_HANGING_SIGN)
            .pressurePlate(ModBlocks.ASPEN_PRESSURE_PLATE)
            .sign(ModBlocks.ASPEN_SIGN, ModBlocks.ASPEN_WALL_SIGN)
            .slab(ModBlocks.ASPEN_SLAB)
            .stairs(ModBlocks.ASPEN_STAIRS)
            .door(ModBlocks.ASPEN_DOOR)
            .trapdoor(ModBlocks.ASPEN_TRAPDOOR)
            .recipeGroupPrefix("wooden")
            .recipeUnlockedBy("has_planks")
            .getFamily();

    public ModModelProvider(FabricPackOutput output) {super(output);}


    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider calcitePool = blockStateModelGenerator.family(Blocks.CALCITE);
        BlockModelGenerators.BlockFamilyProvider basaltPool = blockStateModelGenerator.family(Blocks.SMOOTH_BASALT);
        BlockModelGenerators.BlockFamilyProvider calciteBrickPool = blockStateModelGenerator.family(ModBlocks.CALCITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider calciteTilePool = blockStateModelGenerator.family(ModBlocks.CALCITE_TILES);
        BlockModelGenerators.BlockFamilyProvider basaltBrickPool = blockStateModelGenerator.family(ModBlocks.SMOOTH_BASALT_BRICKS);
        BlockModelGenerators.BlockFamilyProvider granitePool = blockStateModelGenerator.family(Blocks.POLISHED_GRANITE);
        BlockModelGenerators.BlockFamilyProvider dioritePool = blockStateModelGenerator.family(Blocks.POLISHED_DIORITE);
        BlockModelGenerators.BlockFamilyProvider andesitePool = blockStateModelGenerator.family(Blocks.POLISHED_ANDESITE);
        BlockModelGenerators.BlockFamilyProvider graniteBrickPool = blockStateModelGenerator.family(ModBlocks.POLISHED_GRANITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider dioriteBrickPool = blockStateModelGenerator.family(ModBlocks.POLISHED_DIORITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider andesiteBrickPool = blockStateModelGenerator.family(ModBlocks.POLISHED_ANDESITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider amethystPool = blockStateModelGenerator.family(Blocks.AMETHYST_BLOCK);

        BlockModelGenerators.BlockFamilyProvider oakMosaicPool = blockStateModelGenerator.family(ModBlocks.OAK_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider spruceMosaicPool = blockStateModelGenerator.family(ModBlocks.SPRUCE_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider birchMosaicPool = blockStateModelGenerator.family(ModBlocks.BIRCH_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider jungleMosaicPool = blockStateModelGenerator.family(ModBlocks.JUNGLE_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider acaciaMosaicPool = blockStateModelGenerator.family(ModBlocks.ACACIA_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider darkOakMosaicPool = blockStateModelGenerator.family(ModBlocks.DARK_OAK_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider mangroveMosaicPool = blockStateModelGenerator.family(ModBlocks.MANGROVE_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider cherryMosaicPool = blockStateModelGenerator.family(ModBlocks.CHERRY_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider paleOakMosaicPool = blockStateModelGenerator.family(ModBlocks.PALE_OAK_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider crimsonMosaicPool = blockStateModelGenerator.family(ModBlocks.CRIMSON_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider warpedMosaicPool = blockStateModelGenerator.family(ModBlocks.WARPED_MOSAIC);
        BlockModelGenerators.BlockFamilyProvider aspenMosaicPool = blockStateModelGenerator.family(ModBlocks.ASPEN_MOSAIC);

        blockStateModelGenerator.family(ASPEN_BLOCK_FAMILY.getBaseBlock()).generateFor(ASPEN_BLOCK_FAMILY);
        blockStateModelGenerator.woodProvider(ModBlocks.ASPEN_LOG).logWithHorizontal(ModBlocks.ASPEN_LOG).wood(ModBlocks.ASPEN_WOOD);
        blockStateModelGenerator.woodProvider(ModBlocks.STRIPPED_ASPEN_LOG).logWithHorizontal(ModBlocks.STRIPPED_ASPEN_LOG).wood(ModBlocks.STRIPPED_ASPEN_WOOD);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.ASPEN_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.WHITE_CHERRY_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createShelf(ModBlocks.ASPEN_SHELF, ModBlocks.STRIPPED_ASPEN_LOG);

        blockStateModelGenerator.createTrivialCube(ModBlocks.OAK_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.SPRUCE_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BIRCH_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.JUNGLE_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.ACACIA_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.DARK_OAK_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.MANGROVE_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.CHERRY_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PALE_OAK_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.BAMBOO_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.CRIMSON_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.WARPED_HERRINGBONE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.ASPEN_HERRINGBONE);

        oakMosaicPool.stairs(ModBlocks.OAK_MOSAIC_STAIRS);
        oakMosaicPool.slab(ModBlocks.OAK_MOSAIC_SLAB);
        spruceMosaicPool.stairs(ModBlocks.SPRUCE_MOSAIC_STAIRS);
        spruceMosaicPool.slab(ModBlocks.SPRUCE_MOSAIC_SLAB);
        birchMosaicPool.stairs(ModBlocks.BIRCH_MOSAIC_STAIRS);
        birchMosaicPool.slab(ModBlocks.BIRCH_MOSAIC_SLAB);
        jungleMosaicPool.stairs(ModBlocks.JUNGLE_MOSAIC_STAIRS);
        jungleMosaicPool.slab(ModBlocks.JUNGLE_MOSAIC_SLAB);
        acaciaMosaicPool.stairs(ModBlocks.ACACIA_MOSAIC_STAIRS);
        acaciaMosaicPool.slab(ModBlocks.ACACIA_MOSAIC_SLAB);
        darkOakMosaicPool.stairs(ModBlocks.DARK_OAK_MOSAIC_STAIRS);
        darkOakMosaicPool.slab(ModBlocks.DARK_OAK_MOSAIC_SLAB);
        mangroveMosaicPool.stairs(ModBlocks.MANGROVE_MOSAIC_STAIRS);
        mangroveMosaicPool.slab(ModBlocks.MANGROVE_MOSAIC_SLAB);
        cherryMosaicPool.stairs(ModBlocks.CHERRY_MOSAIC_STAIRS);
        cherryMosaicPool.slab(ModBlocks.CHERRY_MOSAIC_SLAB);
        paleOakMosaicPool.stairs(ModBlocks.PALE_OAK_MOSAIC_STAIRS);
        paleOakMosaicPool.slab(ModBlocks.PALE_OAK_MOSAIC_SLAB);
        crimsonMosaicPool.stairs(ModBlocks.CRIMSON_MOSAIC_STAIRS);
        crimsonMosaicPool.slab(ModBlocks.CRIMSON_MOSAIC_SLAB);
        warpedMosaicPool.stairs(ModBlocks.WARPED_MOSAIC_STAIRS);
        warpedMosaicPool.slab(ModBlocks.WARPED_MOSAIC_SLAB);
        aspenMosaicPool.stairs(ModBlocks.ASPEN_MOSAIC_STAIRS);
        aspenMosaicPool.slab(ModBlocks.ASPEN_MOSAIC_SLAB);
        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        calcitePool.wall(ModBlocks.CALCITE_WALL);
        basaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        basaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        basaltPool.wall(ModBlocks.SMOOTH_BASALT_WALL);
        calciteBrickPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.wall(ModBlocks.CALCITE_BRICK_WALL);
        calciteTilePool.stairs(ModBlocks.CALCITE_TILE_STAIRS);
        calciteTilePool.slab(ModBlocks.CALCITE_TILE_SLAB);
        calciteTilePool.wall(ModBlocks.CALCITE_TILE_WALL);
        basaltBrickPool.stairs(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS);
        basaltBrickPool.slab(ModBlocks.SMOOTH_BASALT_BRICK_SLAB);
        basaltBrickPool.wall(ModBlocks.SMOOTH_BASALT_BRICK_WALL);
        granitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        dioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        andesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);
        graniteBrickPool.stairs(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        graniteBrickPool.slab(ModBlocks.POLISHED_GRANITE_BRICK_SLAB);
        graniteBrickPool.wall(ModBlocks.POLISHED_GRANITE_BRICK_WALL);
        dioriteBrickPool.stairs(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        dioriteBrickPool.slab(ModBlocks.POLISHED_DIORITE_BRICK_SLAB);
        dioriteBrickPool.wall(ModBlocks.POLISHED_DIORITE_BRICK_WALL);
        andesiteBrickPool.stairs(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        andesiteBrickPool.slab(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
        andesiteBrickPool.wall(ModBlocks.POLISHED_ANDESITE_BRICK_WALL);
        amethystPool.stairs(ModBlocks.AMETHYST_STAIRS);
        amethystPool.slab(ModBlocks.AMETHYST_SLAB);
        amethystPool.wall(ModBlocks.AMETHYST_WALL);

        BlockModelGenerators.BlockFamilyProvider whiteBrickPool =
                blockStateModelGenerator.family(ModBlocks.WHITE_BRICKS);
        whiteBrickPool.stairs(ModBlocks.WHITE_BRICK_STAIRS);
        whiteBrickPool.slab(ModBlocks.WHITE_BRICK_SLAB);
        whiteBrickPool.wall(ModBlocks.WHITE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider lightGrayBrickPool =
                blockStateModelGenerator.family(ModBlocks.LIGHT_GRAY_BRICKS);
        lightGrayBrickPool.stairs(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
        lightGrayBrickPool.slab(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
        lightGrayBrickPool.wall(ModBlocks.LIGHT_GRAY_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider grayBrickPool =
                blockStateModelGenerator.family(ModBlocks.GRAY_BRICKS);
        grayBrickPool.stairs(ModBlocks.GRAY_BRICK_STAIRS);
        grayBrickPool.slab(ModBlocks.GRAY_BRICK_SLAB);
        grayBrickPool.wall(ModBlocks.GRAY_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider blackBrickPool =
                blockStateModelGenerator.family(ModBlocks.BLACK_BRICKS);
        blackBrickPool.stairs(ModBlocks.BLACK_BRICK_STAIRS);
        blackBrickPool.slab(ModBlocks.BLACK_BRICK_SLAB);
        blackBrickPool.wall(ModBlocks.BLACK_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider brownBrickPool =
                blockStateModelGenerator.family(ModBlocks.BROWN_BRICKS);
        brownBrickPool.stairs(ModBlocks.BROWN_BRICK_STAIRS);
        brownBrickPool.slab(ModBlocks.BROWN_BRICK_SLAB);
        brownBrickPool.wall(ModBlocks.BROWN_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider redBrickPool =
                blockStateModelGenerator.family(ModBlocks.RED_BRICKS);
        redBrickPool.stairs(ModBlocks.RED_BRICK_STAIRS);
        redBrickPool.slab(ModBlocks.RED_BRICK_SLAB);
        redBrickPool.wall(ModBlocks.RED_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider orangeBrickPool =
                blockStateModelGenerator.family(ModBlocks.ORANGE_BRICKS);
        orangeBrickPool.stairs(ModBlocks.ORANGE_BRICK_STAIRS);
        orangeBrickPool.slab(ModBlocks.ORANGE_BRICK_SLAB);
        orangeBrickPool.wall(ModBlocks.ORANGE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider yellowBrickPool =
                blockStateModelGenerator.family(ModBlocks.YELLOW_BRICKS);
        yellowBrickPool.stairs(ModBlocks.YELLOW_BRICK_STAIRS);
        yellowBrickPool.slab(ModBlocks.YELLOW_BRICK_SLAB);
        yellowBrickPool.wall(ModBlocks.YELLOW_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider limeBrickPool =
                blockStateModelGenerator.family(ModBlocks.LIME_BRICKS);
        limeBrickPool.stairs(ModBlocks.LIME_BRICK_STAIRS);
        limeBrickPool.slab(ModBlocks.LIME_BRICK_SLAB);
        limeBrickPool.wall(ModBlocks.LIME_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider greenBrickPool =
                blockStateModelGenerator.family(ModBlocks.GREEN_BRICKS);
        greenBrickPool.stairs(ModBlocks.GREEN_BRICK_STAIRS);
        greenBrickPool.slab(ModBlocks.GREEN_BRICK_SLAB);
        greenBrickPool.wall(ModBlocks.GREEN_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider cyanBrickPool =
                blockStateModelGenerator.family(ModBlocks.CYAN_BRICKS);
        cyanBrickPool.stairs(ModBlocks.CYAN_BRICK_STAIRS);
        cyanBrickPool.slab(ModBlocks.CYAN_BRICK_SLAB);
        cyanBrickPool.wall(ModBlocks.CYAN_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider lightBlueBrickPool =
                blockStateModelGenerator.family(ModBlocks.LIGHT_BLUE_BRICKS);
        lightBlueBrickPool.stairs(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
        lightBlueBrickPool.slab(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
        lightBlueBrickPool.wall(ModBlocks.LIGHT_BLUE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider blueBrickPool =
                blockStateModelGenerator.family(ModBlocks.BLUE_BRICKS);
        blueBrickPool.stairs(ModBlocks.BLUE_BRICK_STAIRS);
        blueBrickPool.slab(ModBlocks.BLUE_BRICK_SLAB);
        blueBrickPool.wall(ModBlocks.BLUE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider purpleBrickPool =
                blockStateModelGenerator.family(ModBlocks.PURPLE_BRICKS);
        purpleBrickPool.stairs(ModBlocks.PURPLE_BRICK_STAIRS);
        purpleBrickPool.slab(ModBlocks.PURPLE_BRICK_SLAB);
        purpleBrickPool.wall(ModBlocks.PURPLE_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider magentaBrickPool =
                blockStateModelGenerator.family(ModBlocks.MAGENTA_BRICKS);
        magentaBrickPool.stairs(ModBlocks.MAGENTA_BRICK_STAIRS);
        magentaBrickPool.slab(ModBlocks.MAGENTA_BRICK_SLAB);
        magentaBrickPool.wall(ModBlocks.MAGENTA_BRICK_WALL);
        BlockModelGenerators.BlockFamilyProvider pinkBrickPool =
                blockStateModelGenerator.family(ModBlocks.PINK_BRICKS);
        pinkBrickPool.stairs(ModBlocks.PINK_BRICK_STAIRS);
        pinkBrickPool.slab(ModBlocks.PINK_BRICK_SLAB);
        pinkBrickPool.wall(ModBlocks.PINK_BRICK_WALL);

        blockStateModelGenerator.createPlant(ModBlocks.ASPEN_SAPLING, ModBlocks.ASPEN_SAPLING_POT, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlant(ModBlocks.WHITE_CHERRY_SAPLING, ModBlocks.WHITE_CHERRY_SAPLING_POT, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlant(ModBlocks.MARIGOLD, ModBlocks.MARIGOLD_POT, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlock(ModBlocks.VIOLET_HEATHER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlock(ModBlocks.MAUVE_HEATHER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlock(ModBlocks.WHITE_HEATHER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createLantern(ModBlocks.REDSTONE_LANTERN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(ModBlocks.CALLIE_PLUSHIE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(ModBlocks.CYNTHIA_PLUSHIE);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.CHISELED_CALCITE_BRICKS, TexturedModel.COLUMN_ALT);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.ASPEN_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.AZALEA_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.FLOWERING_AZALEA_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.CHERRY_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.WHITE_CHERRY_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.PALE_OAK_LEAF_PILE, TexturedModel.CARPET);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        itemModelGenerator.generateFlatItem(ModBlocks.ASPEN_SAPLING.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModBlocks.WHITE_CHERRY_SAPLING.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModBlocks.MARIGOLD.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModBlocks.VIOLET_HEATHER.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModBlocks.MAUVE_HEATHER.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModBlocks.WHITE_HEATHER.asItem(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ASPEN_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ASPEN_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

    }
}