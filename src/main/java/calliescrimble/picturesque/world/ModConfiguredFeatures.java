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
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.CherryTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ASPEN_KEY = registerKey("aspen");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHERRY_KEY = registerKey("white_cherry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARIGOLD_KEY = registerKey("marigold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAUVE_HEATHER_KEY = registerKey("mauve_heather");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VIOLET_HEATHER_KEY = registerKey("violet_heather");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_HEATHER_KEY = registerKey("white_heather");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        register(context, ASPEN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ASPEN_LOG),
                new StraightTrunkPlacer(10, 2, 0),
                BlockStateProvider.simple(ModBlocks.ASPEN_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines()
                .build());

        register(context, WHITE_CHERRY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.CHERRY_LOG),
                new CherryTrunkPlacer(
                        7,
                        1,
                        0,
                        new WeightedListInt(
                         WeightedList.<IntProvider>builder().add(ConstantInt.of(1), 1)
                         .add(ConstantInt.of(2), 1)
                         .add(ConstantInt.of(3), 1)
                         .build()),
                        UniformInt.of(2, 4),
                        UniformInt.of(-4, -3),
                        UniformInt.of(-1, 0)),
                BlockStateProvider.simple(ModBlocks.WHITE_CHERRY_LEAVES),
                new CherryFoliagePlacer(ConstantInt.of(4),
                        ConstantInt.of(0),
                        ConstantInt.of(5),
                        0.25F,
                        0.5F,
                        0.16666667F,
                        0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines()
                .build());

        register(context, MARIGOLD_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                BlockStateProvider.simple(ModBlocks.MARIGOLD)));

        register(context, MAUVE_HEATHER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                BlockStateProvider.simple(ModBlocks.MAUVE_HEATHER)));

        register(context, VIOLET_HEATHER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                BlockStateProvider.simple(ModBlocks.VIOLET_HEATHER)));

        register(context, WHITE_HEATHER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                BlockStateProvider.simple(ModBlocks.WHITE_HEATHER)));
    }



    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                   ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}