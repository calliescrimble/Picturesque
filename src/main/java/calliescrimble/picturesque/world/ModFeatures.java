package calliescrimble.picturesque.world;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.CherryTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModFeatures {

    public static final ResourceKey<Feature> ASPEN_KEY = registerKey("aspen");
    public static final ResourceKey<Feature> WHITE_CHERRY_KEY = registerKey("white_cherry");
    public static final ResourceKey<Feature> MARIGOLD_KEY = registerKey("marigold");
    public static final ResourceKey<Feature> MAUVE_HEATHER_KEY = registerKey("mauve_heather");
    public static final ResourceKey<Feature> VIOLET_HEATHER_KEY = registerKey("violet_heather");
    public static final ResourceKey<Feature> WHITE_HEATHER_KEY = registerKey("white_heather");


    public static void bootstrap(BootstrapContext<Feature> context) {

        context.register(
                ASPEN_KEY,
                new TreeFeature.Builder(
                        BlockStateProvider.of(ModBlocks.ASPEN_LOG),
                        new StraightTrunkPlacer(10, 2, 0),
                        BlockStateProvider.of(ModBlocks.ASPEN_LEAVES),
                        new BlobFoliagePlacer(
                                ConstantInt.of(2),
                                ConstantInt.of(0),
                                3
                        ),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.DIRT))
                        .ignoreVines()
                        .build()
        );

        context.register(
                WHITE_CHERRY_KEY,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.CHERRY_LOG),
                        new CherryTrunkPlacer(
                                7,
                                1,
                                0,
                                new WeightedListInt(
                                        WeightedList.<IntProvider>builder()
                                                .add(ConstantInt.of(1), 1)
                                                .add(ConstantInt.of(2), 1)
                                                .add(ConstantInt.of(3), 1)
                                                .build()
                                ),
                                UniformInt.of(2, 4),
                                UniformInt.of(-4, -3),
                                UniformInt.of(-1, 0)
                        ),
                        BlockStateProvider.of(ModBlocks.WHITE_CHERRY_LEAVES),
                        new CherryFoliagePlacer(
                                ConstantInt.of(4),
                                ConstantInt.of(0),
                                ConstantInt.of(5),
                                0.25F,
                                0.5F,
                                0.16666667F,
                                0.33333334F
                        ),
                        new TwoLayersFeatureSize(1, 0, 2),
                        BlockStateProvider.holderOf(Blocks.DIRT)
                )
                        .ignoreVines()
                        .build()
        );

        context.register(
                MARIGOLD_KEY,
                new SimpleBlockFeature(
                        BlockStateProvider.of(ModBlocks.MARIGOLD)
                )
        );

        context.register(
                MAUVE_HEATHER_KEY,
                new SimpleBlockFeature(
                        BlockStateProvider.of(ModBlocks.MAUVE_HEATHER)
                )
        );

        context.register(
                VIOLET_HEATHER_KEY,
                new SimpleBlockFeature(
                        BlockStateProvider.of(ModBlocks.VIOLET_HEATHER)
                )
        );

        context.register(
                WHITE_HEATHER_KEY,
                new SimpleBlockFeature(
                        BlockStateProvider.of(ModBlocks.WHITE_HEATHER)
                )
        );
    }


    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(
                Registries.FEATURE,
                Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name)
        );
    }
}