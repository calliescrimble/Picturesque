package calliescrimble.picturesque;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModCreativeTabOutput;
import calliescrimble.picturesque.item.ModEntityTypes;
import calliescrimble.picturesque.item.ModItems;
import calliescrimble.picturesque.item.ModLootTableModifiers;
import calliescrimble.picturesque.particle.ModParticles;
import calliescrimble.picturesque.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Picturesque implements ModInitializer {
	public static final String MOD_ID = "picturesque";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String string) {
		return Identifier.fromNamespaceAndPath(MOD_ID, string);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("This scene is very Picturesque!! [Title Card]");

		ModItems.initialize();
		ModBlocks.initialize();
		ModEntityTypes.initialize();
		ModParticles.initialize();
		ModWorldGeneration.initialize();
		ModLootTableModifiers.initialize();
		ModCreativeTabOutput.initialize();

	}
}