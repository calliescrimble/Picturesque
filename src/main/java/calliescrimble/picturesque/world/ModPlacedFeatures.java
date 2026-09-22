package calliescrimble.picturesque.world;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ASPEN_PLACED_KEY = registerKey("aspen_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CHERRY_PLACED_KEY = registerKey("white_cherry_placed");
    public static final ResourceKey<PlacedFeature> MARIGOLD_PLACED_KEY = registerKey("marigold_placed");
    public static final ResourceKey<PlacedFeature> MAUVE_HEATHER_PLACED_KEY = registerKey("mauve_heather_placed");
    public static final ResourceKey<PlacedFeature> VIOLET_HEATHER_PLACED_KEY = registerKey("violet_heather_placed");
    public static final ResourceKey<PlacedFeature> WHITE_HEATHER_PLACED_KEY = registerKey("white_heather_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ASPEN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ASPEN_KEY),
                VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(2, 0.1f, 2), ModBlocks.ASPEN_SAPLING));

        register(context, WHITE_CHERRY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CHERRY_KEY),
                VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(4, 0.1f, 2), ModBlocks.WHITE_CHERRY_SAPLING));

        register(context, MARIGOLD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MARIGOLD_KEY),
                List.of(RarityFilter.onAverageOnceEvery(8),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome(),
                        CountPlacement.of(64),
                        RandomOffsetPlacement.ofTriangle(8, 4),
                        BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)));

        register(context, MAUVE_HEATHER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAUVE_HEATHER_KEY),
                List.of(InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome(),
                        CountPlacement.of(64),
                        RandomOffsetPlacement.ofTriangle(8, 4),
                        BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)));

        register(context, VIOLET_HEATHER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VIOLET_HEATHER_KEY),
                List.of(InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome(),
                        CountPlacement.of(64),
                        RandomOffsetPlacement.ofTriangle(8, 4),
                        BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)));

        register(context, WHITE_HEATHER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_HEATHER_KEY),
                List.of(InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome(),
                        CountPlacement.of(64),
                        RandomOffsetPlacement.ofTriangle(8, 4),
                        BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)));

    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                   Holder<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}