package calliescrimble.picturesque.world;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.block.ModBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.OffsetPlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ASPEN_PLACED_KEY = registerKey("aspen_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CHERRY_PLACED_KEY = registerKey("white_cherry_placed");
    public static final ResourceKey<PlacedFeature> MARIGOLD_PLACED_KEY = registerKey("marigold_placed");
    public static final ResourceKey<PlacedFeature> MAUVE_HEATHER_PLACED_KEY = registerKey("mauve_heather_placed");
    public static final ResourceKey<PlacedFeature> VIOLET_HEATHER_PLACED_KEY = registerKey("violet_heather_placed");
    public static final ResourceKey<PlacedFeature> WHITE_HEATHER_PLACED_KEY = registerKey("white_heather_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {

        HolderGetter<Feature> features =
                context.lookup(Registries.FEATURE);


        PlacementUtils.register(
                context,
                ASPEN_PLACED_KEY,
                features.getOrThrow(ModFeatures.ASPEN_KEY),
                VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(2, 0.1F, 2),
                        ModBlocks.ASPEN_SAPLING
                )
        );


        PlacementUtils.register(
                context,
                WHITE_CHERRY_PLACED_KEY,
                features.getOrThrow(ModFeatures.WHITE_CHERRY_KEY),
                VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(4, 0.1F, 2),
                        ModBlocks.WHITE_CHERRY_SAPLING
                )
        );


        PlacementUtils.register(
                context,
                MARIGOLD_PLACED_KEY,
                features.getOrThrow(ModFeatures.MARIGOLD_KEY),
                RarityFilter.onAverageOnceEvery(8),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome(),
                CountPlacement.of(64),
                OffsetPlacement.ofTriangle(8, 4),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.ONLY_IN_AIR_PREDICATE
                )
        );


        PlacementUtils.register(
                context,
                MAUVE_HEATHER_PLACED_KEY,
                features.getOrThrow(ModFeatures.MAUVE_HEATHER_KEY),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome(),
                CountPlacement.of(64),
                OffsetPlacement.ofTriangle(8, 4),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.ONLY_IN_AIR_PREDICATE
                )
        );


        PlacementUtils.register(
                context,
                VIOLET_HEATHER_PLACED_KEY,
                features.getOrThrow(ModFeatures.VIOLET_HEATHER_KEY),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome(),
                CountPlacement.of(64),
                OffsetPlacement.ofTriangle(8, 4),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.ONLY_IN_AIR_PREDICATE
                )
        );


        PlacementUtils.register(
                context,
                WHITE_HEATHER_PLACED_KEY,
                features.getOrThrow(ModFeatures.WHITE_HEATHER_KEY),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome(),
                CountPlacement.of(64),
                OffsetPlacement.ofTriangle(8, 4),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.ONLY_IN_AIR_PREDICATE
                )
        );
    }


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(
                Registries.PLACED_FEATURE,
                Identifier.fromNamespaceAndPath(
                        Picturesque.MOD_ID,
                        name
                )
        );
    }
}