package calliescrimble.picturesque.world.gen;

import calliescrimble.picturesque.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModBiomeModification {

    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BIRCH_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.ASPEN_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.CHERRY_GROVE),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_CHERRY_PLACED_KEY);

    }

    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.JUNGLE, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA, Biomes.SPARSE_JUNGLE),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.MARIGOLD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.TAIGA, Biomes.SNOWY_TAIGA, Biomes.WINDSWEPT_FOREST, Biomes.WINDSWEPT_HILLS, Biomes.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.MAUVE_HEATHER_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.TAIGA, Biomes.SNOWY_TAIGA, Biomes.WINDSWEPT_FOREST, Biomes.WINDSWEPT_HILLS, Biomes.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.VIOLET_HEATHER_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.TAIGA, Biomes.SNOWY_TAIGA, Biomes.WINDSWEPT_FOREST, Biomes.WINDSWEPT_HILLS, Biomes.WINDSWEPT_GRAVELLY_HILLS),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_HEATHER_PLACED_KEY);
    }
}