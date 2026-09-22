package calliescrimble.picturesque;

import calliescrimble.picturesque.datagen.*;
import calliescrimble.picturesque.world.ModConfiguredFeatures;
import calliescrimble.picturesque.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class PicturesqueDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
		ModTagProviders.ModBlockTags blockTagsProvider = pack.addProvider(ModTagProviders.ModBlockTags::new);
		pack.addProvider((output, registriesFuture) -> new ModTagProviders.ModItemTags(output, registriesFuture, blockTagsProvider));
		pack.addProvider(ModTagProviders.ModEntityTypeTags::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
