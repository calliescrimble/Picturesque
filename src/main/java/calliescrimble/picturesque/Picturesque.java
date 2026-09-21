package calliescrimble.picturesque;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModEntityTypes;
import calliescrimble.picturesque.item.ModItems;
import calliescrimble.picturesque.item.ModLootTableModifiers;
import calliescrimble.picturesque.particle.ModParticles;
import calliescrimble.picturesque.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Picturesque implements ModInitializer {
	public static final String MOD_ID = "picturesque";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String string) {
		return Identifier.of(MOD_ID, string);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("This scene is very Picturesque!! [Title Card]");

		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {

			if (itemStack.isOf(ModBlocks.CALLIE_PLUSHIE.asItem())){
				list.add(Text.translatable("tooltip.picturesque.callie_plushie"));
				return;}

			if (itemStack.isOf(ModBlocks.CYNTHIA_PLUSHIE.asItem())){
				list.add(Text.translatable("tooltip.picturesque.cynthia_plushie"));
				return;}

		});

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntityTypes.registerEntityTypes();
		ModParticles.registerParticles();
		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();

		StrippableBlockRegistry.register(ModBlocks.ASPEN_LOG, ModBlocks.STRIPPED_ASPEN_LOG);
		StrippableBlockRegistry.register(ModBlocks.ASPEN_WOOD, ModBlocks.STRIPPED_ASPEN_WOOD);

		BlockEntityType.SHELF.addSupportedBlock(ModBlocks.ASPEN_SHELF);
		BlockEntityType.SIGN.addSupportedBlock(ModBlocks.ASPEN_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(ModBlocks.ASPEN_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(ModBlocks.ASPEN_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(ModBlocks.ASPEN_WALL_HANGING_SIGN);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ASPEN_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ASPEN_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_CHERRY_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_CHERRY_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FLOWERING_AZALEA_LEAF_PILE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_HERRINGBONE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_MOSAIC, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_MOSAIC_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALE_OAK_MOSAIC_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASPEN_MOSAIC_SLAB, 5, 20);
	}
}