package calliescrimble.picturesque.world.gen;

import calliescrimble.picturesque.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModBiomeModification {

    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ASPEN_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_CHERRY_PLACED_KEY);

    }

    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MARIGOLD_PATCH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.SNOWY_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS, BiomeKeys.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAUVE_HEATHER_PATCH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.SNOWY_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS, BiomeKeys.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VIOLET_HEATHER_PATCH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.SNOWY_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS, BiomeKeys.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_HEATHER_PATCH_PLACED_KEY);
    }
}