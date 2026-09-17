package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModItems;
import calliescrimble.picturesque.item.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ASPEN_LOG.asItem())
                .add(ModBlocks.ASPEN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.asItem())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(ModBlocks.ASPEN_PLANKS.asItem());

        valueLookupBuilder(ItemTags.LOGS)
                .add(ModBlocks.ASPEN_LOG.asItem())
                .add(ModBlocks.ASPEN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.asItem())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.asItem());

        valueLookupBuilder(ModTags.Items.ASPEN_LOGS)
                .add(ModBlocks.ASPEN_LOG.asItem())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.asItem())
                .add(ModBlocks.ASPEN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.asItem());

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.ASPEN_SLAB.asItem())
                .add(ModBlocks.OAK_MOSAIC_SLAB.asItem())
                .add(ModBlocks.SPRUCE_MOSAIC_SLAB.asItem())
                .add(ModBlocks.BIRCH_MOSAIC_SLAB.asItem())
                .add(ModBlocks.JUNGLE_MOSAIC_SLAB.asItem())
                .add(ModBlocks.ACACIA_MOSAIC_SLAB.asItem())
                .add(ModBlocks.DARK_OAK_MOSAIC_SLAB.asItem())
                .add(ModBlocks.MANGROVE_MOSAIC_SLAB.asItem())
                .add(ModBlocks.CHERRY_MOSAIC_SLAB.asItem())
                .add(ModBlocks.PALE_OAK_MOSAIC_SLAB.asItem())
                .add(ModBlocks.CRIMSON_MOSAIC_SLAB.asItem())
                .add(ModBlocks.WARPED_MOSAIC_SLAB.asItem())
                .add(ModBlocks.ASPEN_MOSAIC_SLAB.asItem());

        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.ASPEN_STAIRS.asItem())
                .add(ModBlocks.OAK_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.SPRUCE_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.BIRCH_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.JUNGLE_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.ACACIA_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.DARK_OAK_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.MANGROVE_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.CHERRY_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.PALE_OAK_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.CRIMSON_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.WARPED_MOSAIC_STAIRS.asItem())
                .add(ModBlocks.ASPEN_MOSAIC_STAIRS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.ASPEN_DOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.ASPEN_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.ASPEN_PRESSURE_PLATE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.ASPEN_BUTTON.asItem());

        valueLookupBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.ASPEN_SAPLING.asItem())
                .add(ModBlocks.WHITE_CHERRY_SAPLING.asItem());

        valueLookupBuilder(ItemTags.FLOWERS)
                .add(ModBlocks.MARIGOLD.asItem())
                .add(ModBlocks.VIOLET_HEATHER.asItem())
                .add(ModBlocks.MAUVE_HEATHER.asItem())
                .add(ModBlocks.WHITE_HEATHER.asItem());

        valueLookupBuilder(ItemTags.SMALL_FLOWERS)
                .add(ModBlocks.MARIGOLD.asItem())
                .add(ModBlocks.VIOLET_HEATHER.asItem())
                .add(ModBlocks.MAUVE_HEATHER.asItem())
                .add(ModBlocks.WHITE_HEATHER.asItem());

        valueLookupBuilder(ItemTags.BEE_FOOD)
                .add(ModBlocks.MARIGOLD.asItem())
                .add(ModBlocks.VIOLET_HEATHER.asItem())
                .add(ModBlocks.MAUVE_HEATHER.asItem())
                .add(ModBlocks.WHITE_HEATHER.asItem())
                .add(ModBlocks.WHITE_CHERRY_LEAVES.asItem());

        valueLookupBuilder(ItemTags.BOATS)
                .add(ModItems.ASPEN_BOAT);

        valueLookupBuilder(ItemTags.CHEST_BOATS)
                .add(ModItems.ASPEN_CHEST_BOAT);

        valueLookupBuilder(ItemTags.SIGNS)
                .add(ModItems.ASPEN_SIGN);

        valueLookupBuilder(ItemTags.HANGING_SIGNS)
                .add(ModItems.ASPEN_HANGING_SIGN);
    }
}