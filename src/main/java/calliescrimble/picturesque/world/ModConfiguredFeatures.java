package calliescrimble.picturesque.world;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> ASPEN_KEY = registerKey("aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_CHERRY_KEY = registerKey("white_cherry");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARIGOLD_KEY = registerKey("marigold");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARIGOLD_PATCH_KEY = registerKey("marigold_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAUVE_HEATHER_KEY = registerKey("mauve_heather");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAUVE_HEATHER_PATCH_KEY = registerKey("mauve_heather_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_HEATHER_KEY = registerKey("violet_heather");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_HEATHER_PATCH_KEY = registerKey("violet_heather_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_HEATHER_KEY = registerKey("white_heather");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_HEATHER_PATCH_KEY = registerKey("white_heather_patch");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, ASPEN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ASPEN_LOG),
                new StraightTrunkPlacer(10, 2, 0),
                BlockStateProvider.of(ModBlocks.ASPEN_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .ignoreVines()
                .build());

        register(context, WHITE_CHERRY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.CHERRY_LOG),
                new CherryTrunkPlacer(
                        7,
                        1,
                        0,
                        new WeightedListIntProvider(
                                Pool.<IntProvider>builder().add(ConstantIntProvider.create(1), 1)
                                        .add(ConstantIntProvider.create(2), 1)
                                        .add(ConstantIntProvider.create(3), 1)
                                        .build()
                        ),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)
                ),
                BlockStateProvider.of(ModBlocks.WHITE_CHERRY_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines()
                .build());

        RegistryEntryLookup<PlacedFeature> registryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        register(context, MARIGOLD_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                BlockStateProvider.of(ModBlocks.MARIGOLD)));

        register(context, MARIGOLD_PATCH_KEY, Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64,
                        8,
                        4,
                        registryLookup.getOrThrow(ModPlacedFeatures.MARIGOLD_PLACED_KEY)));

        register(context, MAUVE_HEATHER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                BlockStateProvider.of(ModBlocks.MAUVE_HEATHER)));

        register(context, MAUVE_HEATHER_PATCH_KEY, Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64,
                        8,
                        4,
                        registryLookup.getOrThrow(ModPlacedFeatures.MAUVE_HEATHER_PLACED_KEY)));

        register(context, VIOLET_HEATHER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                BlockStateProvider.of(ModBlocks.VIOLET_HEATHER)));

        register(context, VIOLET_HEATHER_PATCH_KEY, Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64,
                        8,
                        4,
                        registryLookup.getOrThrow(ModPlacedFeatures.VIOLET_HEATHER_PLACED_KEY)));

        register(context, WHITE_HEATHER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                BlockStateProvider.of(ModBlocks.WHITE_HEATHER)));

        register(context, WHITE_HEATHER_PATCH_KEY, Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64,
                        8,
                        4,
                        registryLookup.getOrThrow(ModPlacedFeatures.WHITE_HEATHER_PLACED_KEY)));

    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Picturesque.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}