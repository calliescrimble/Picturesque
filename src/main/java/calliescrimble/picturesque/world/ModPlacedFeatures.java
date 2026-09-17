package calliescrimble.picturesque.world;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> ASPEN_PLACED_KEY = registerKey("aspen_placed");
    public static final RegistryKey<PlacedFeature> WHITE_CHERRY_PLACED_KEY = registerKey("white_cherry_placed");
    public static final RegistryKey<PlacedFeature> MARIGOLD_PLACED_KEY = registerKey("marigold_placed");
    public static final RegistryKey<PlacedFeature> MARIGOLD_PATCH_PLACED_KEY = registerKey("marigold_patch_placed");
    public static final RegistryKey<PlacedFeature> MAUVE_HEATHER_PLACED_KEY = registerKey("mauve_heather_placed");
    public static final RegistryKey<PlacedFeature> MAUVE_HEATHER_PATCH_PLACED_KEY = registerKey("mauve_heather_patch_placed");
    public static final RegistryKey<PlacedFeature> VIOLET_HEATHER_PLACED_KEY = registerKey("violet_heather_placed");
    public static final RegistryKey<PlacedFeature> VIOLET_HEATHER_PATCH_PLACED_KEY = registerKey("violet_heather_patch_placed");
    public static final RegistryKey<PlacedFeature> WHITE_HEATHER_PLACED_KEY = registerKey("white_heather_placed");
    public static final RegistryKey<PlacedFeature> WHITE_HEATHER_PATCH_PLACED_KEY = registerKey("white_heather_patch_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, ASPEN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ASPEN_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.ASPEN_SAPLING));

        register(context, WHITE_CHERRY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CHERRY_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(4, 0.1f, 2), ModBlocks.WHITE_CHERRY_SAPLING));

        register(context, MARIGOLD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MARIGOLD_KEY),
                List.of(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR)));
        register(context, MARIGOLD_PATCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MARIGOLD_PATCH_KEY),
                List.of(RarityFilterPlacementModifier.of(8),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()));

        register(context, MAUVE_HEATHER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAUVE_HEATHER_KEY),
                List.of(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR)));
        register(context, MAUVE_HEATHER_PATCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAUVE_HEATHER_PATCH_KEY),
                List.of(SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()));

        register(context, VIOLET_HEATHER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VIOLET_HEATHER_KEY),
                List.of(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR)));
        register(context, VIOLET_HEATHER_PATCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VIOLET_HEATHER_PATCH_KEY),
                List.of(SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()));

        register(context, WHITE_HEATHER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_HEATHER_KEY),
                List.of(BlockFilterPlacementModifier.of(BlockPredicate.IS_AIR)));
        register(context, WHITE_HEATHER_PATCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_HEATHER_PATCH_KEY),
                List.of(SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Picturesque.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}