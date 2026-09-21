package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

public class ModModelProvider extends FabricModelProvider {

    public static final BlockFamily ASPEN_BLOCK_FAMILY = BlockFamilies.register(ModBlocks.ASPEN_PLANKS)
            .button(ModBlocks.ASPEN_BUTTON)
            .fence(ModBlocks.ASPEN_FENCE)
            .fenceGate(ModBlocks.ASPEN_FENCE_GATE)
            .pressurePlate(ModBlocks.ASPEN_PRESSURE_PLATE)
            .sign(ModBlocks.ASPEN_SIGN, ModBlocks.ASPEN_WALL_SIGN)
            .slab(ModBlocks.ASPEN_SLAB)
            .stairs(ModBlocks.ASPEN_STAIRS)
            .door(ModBlocks.ASPEN_DOOR)
            .trapdoor(ModBlocks.ASPEN_TRAPDOOR)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool basaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        BlockStateModelGenerator.BlockTexturePool calciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool calciteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_TILES);
        BlockStateModelGenerator.BlockTexturePool basaltBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_BASALT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool dioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool andesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool graniteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool dioriteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool andesiteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool amethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);

        BlockStateModelGenerator.BlockTexturePool oakMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool spruceMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRUCE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool birchMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIRCH_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool jungleMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JUNGLE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool acaciaMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACACIA_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool darkOakMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool mangroveMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGROVE_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool cherryMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool paleOakMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALE_OAK_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool crimsonMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRIMSON_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool warpedMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WARPED_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool aspenMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ASPEN_MOSAIC);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ASPEN_BLOCK_FAMILY.getBaseBlock()).family(ASPEN_BLOCK_FAMILY);
        blockStateModelGenerator.createLogTexturePool(ModBlocks.ASPEN_LOG).log(ModBlocks.ASPEN_LOG).wood(ModBlocks.ASPEN_WOOD);
        blockStateModelGenerator.createLogTexturePool(ModBlocks.STRIPPED_ASPEN_LOG).log(ModBlocks.STRIPPED_ASPEN_LOG).wood(ModBlocks.STRIPPED_ASPEN_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.ASPEN_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.WHITE_CHERRY_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerShelf(ModBlocks.ASPEN_SHELF, ModBlocks.STRIPPED_ASPEN_LOG);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_ASPEN_LOG, ModBlocks.ASPEN_HANGING_SIGN, ModBlocks.ASPEN_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRCH_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNGLE_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGROVE_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHERRY_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_OAK_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAMBOO_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_HERRINGBONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASPEN_HERRINGBONE);

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

        BlockStateModelGenerator.BlockTexturePool whiteBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_BRICKS);
        whiteBrickPool.stairs(ModBlocks.WHITE_BRICK_STAIRS);
        whiteBrickPool.slab(ModBlocks.WHITE_BRICK_SLAB);
        whiteBrickPool.wall(ModBlocks.WHITE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool lightGrayBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_BRICKS);
        lightGrayBrickPool.stairs(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
        lightGrayBrickPool.slab(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
        lightGrayBrickPool.wall(ModBlocks.LIGHT_GRAY_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool grayBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_BRICKS);
        grayBrickPool.stairs(ModBlocks.GRAY_BRICK_STAIRS);
        grayBrickPool.slab(ModBlocks.GRAY_BRICK_SLAB);
        grayBrickPool.wall(ModBlocks.GRAY_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool blackBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_BRICKS);
        blackBrickPool.stairs(ModBlocks.BLACK_BRICK_STAIRS);
        blackBrickPool.slab(ModBlocks.BLACK_BRICK_SLAB);
        blackBrickPool.wall(ModBlocks.BLACK_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool brownBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_BRICKS);
        brownBrickPool.stairs(ModBlocks.BROWN_BRICK_STAIRS);
        brownBrickPool.slab(ModBlocks.BROWN_BRICK_SLAB);
        brownBrickPool.wall(ModBlocks.BROWN_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool redBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_BRICKS);
        redBrickPool.stairs(ModBlocks.RED_BRICK_STAIRS);
        redBrickPool.slab(ModBlocks.RED_BRICK_SLAB);
        redBrickPool.wall(ModBlocks.RED_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool orangeBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_BRICKS);
        orangeBrickPool.stairs(ModBlocks.ORANGE_BRICK_STAIRS);
        orangeBrickPool.slab(ModBlocks.ORANGE_BRICK_SLAB);
        orangeBrickPool.wall(ModBlocks.ORANGE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool yellowBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_BRICKS);
        yellowBrickPool.stairs(ModBlocks.YELLOW_BRICK_STAIRS);
        yellowBrickPool.slab(ModBlocks.YELLOW_BRICK_SLAB);
        yellowBrickPool.wall(ModBlocks.YELLOW_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool limeBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_BRICKS);
        limeBrickPool.stairs(ModBlocks.LIME_BRICK_STAIRS);
        limeBrickPool.slab(ModBlocks.LIME_BRICK_SLAB);
        limeBrickPool.wall(ModBlocks.LIME_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool greenBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_BRICKS);
        greenBrickPool.stairs(ModBlocks.GREEN_BRICK_STAIRS);
        greenBrickPool.slab(ModBlocks.GREEN_BRICK_SLAB);
        greenBrickPool.wall(ModBlocks.GREEN_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool cyanBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_BRICKS);
        cyanBrickPool.stairs(ModBlocks.CYAN_BRICK_STAIRS);
        cyanBrickPool.slab(ModBlocks.CYAN_BRICK_SLAB);
        cyanBrickPool.wall(ModBlocks.CYAN_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool lightBlueBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_BRICKS);
        lightBlueBrickPool.stairs(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
        lightBlueBrickPool.slab(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
        lightBlueBrickPool.wall(ModBlocks.LIGHT_BLUE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool blueBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_BRICKS);
        blueBrickPool.stairs(ModBlocks.BLUE_BRICK_STAIRS);
        blueBrickPool.slab(ModBlocks.BLUE_BRICK_SLAB);
        blueBrickPool.wall(ModBlocks.BLUE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool purpleBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_BRICKS);
        purpleBrickPool.stairs(ModBlocks.PURPLE_BRICK_STAIRS);
        purpleBrickPool.slab(ModBlocks.PURPLE_BRICK_SLAB);
        purpleBrickPool.wall(ModBlocks.PURPLE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool magentaBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_BRICKS);
        magentaBrickPool.stairs(ModBlocks.MAGENTA_BRICK_STAIRS);
        magentaBrickPool.slab(ModBlocks.MAGENTA_BRICK_SLAB);
        magentaBrickPool.wall(ModBlocks.MAGENTA_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool pinkBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_BRICKS);
        pinkBrickPool.stairs(ModBlocks.PINK_BRICK_STAIRS);
        pinkBrickPool.slab(ModBlocks.PINK_BRICK_SLAB);
        pinkBrickPool.wall(ModBlocks.PINK_BRICK_WALL);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ASPEN_SAPLING, ModBlocks.ASPEN_SAPLING_POT, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_CHERRY_SAPLING, ModBlocks.WHITE_CHERRY_SAPLING_POT, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MARIGOLD, ModBlocks.MARIGOLD_POT, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.VIOLET_HEATHER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.MAUVE_HEATHER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.WHITE_HEATHER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerLantern(ModBlocks.REDSTONE_LANTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.CALLIE_PLUSHIE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.CYNTHIA_PLUSHIE);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_CALCITE_BRICKS, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.ASPEN_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.registerSingleton(ModBlocks.AZALEA_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.registerSingleton(ModBlocks.FLOWERING_AZALEA_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHERRY_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.registerSingleton(ModBlocks.WHITE_CHERRY_LEAF_PILE, TexturedModel.CARPET);
        blockStateModelGenerator.registerSingleton(ModBlocks.PALE_OAK_LEAF_PILE, TexturedModel.CARPET);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModBlocks.ASPEN_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.WHITE_CHERRY_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MARIGOLD.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.VIOLET_HEATHER.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MAUVE_HEATHER.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.WHITE_HEATHER.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModItems.ASPEN_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASPEN_CHEST_BOAT, Models.GENERATED);

    }
}