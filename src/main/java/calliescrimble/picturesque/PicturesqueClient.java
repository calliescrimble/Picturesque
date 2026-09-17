package calliescrimble.picturesque;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModEntityTypes;
import calliescrimble.picturesque.particle.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.particle.LeavesParticle;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactories;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class PicturesqueClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ParticleFactoryRegistry.getInstance().register(
                ModParticles.WHITE_CHERRY_PETAL,
                LeavesParticle.CherryLeavesFactory::new);

        EntityModelLayer normal = new EntityModelLayer(Picturesque.id("boat/aspen"), "main");
        EntityModelLayerRegistry.registerModelLayer(normal, BoatEntityModel::getTexturedModelData);
        EntityRendererFactories.register(ModEntityTypes.ASPEN_BOAT, context -> new BoatEntityRenderer(context, normal));

        EntityModelLayer chest = new EntityModelLayer(Picturesque.id("chest_boat/aspen"), "main");
        EntityModelLayerRegistry.registerModelLayer(chest, BoatEntityModel::getChestTexturedModelData);
        EntityRendererFactories.register(ModEntityTypes.ASPEN_CHEST_BOAT, context -> new BoatEntityRenderer(context, chest));

        BlockRenderLayerMap.putBlock(ModBlocks.ASPEN_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ASPEN_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ASPEN_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ASPEN_SAPLING_POT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WHITE_CHERRY_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WHITE_CHERRY_SAPLING_POT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.OAK_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SPRUCE_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BIRCH_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ASPEN_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.JUNGLE_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ACACIA_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.DARK_OAK_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MANGROVE_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CHERRY_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WHITE_CHERRY_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PALE_OAK_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.AZALEA_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FLOWERING_AZALEA_LEAF_PILE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MARIGOLD, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MARIGOLD_POT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.VIOLET_HEATHER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAUVE_HEATHER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WHITE_HEATHER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.REDSTONE_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CALLIE_PLUSHIE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CYNTHIA_PLUSHIE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BURNING_PLUSHIE, BlockRenderLayer.CUTOUT);

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    if (world == null || pos == null) {return 0x48B518;}
                    return BiomeColors.getFoliageColor(world, pos);},
                ModBlocks.OAK_LEAF_PILE,
                ModBlocks.JUNGLE_LEAF_PILE,
                ModBlocks.ACACIA_LEAF_PILE,
                ModBlocks.DARK_OAK_LEAF_PILE);

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    if (world == null || pos == null) {return 0x92C648;}
                    return BiomeColors.getFoliageColor(world, pos);},
                ModBlocks.MANGROVE_LEAF_PILE);

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> 0x619961,
                ModBlocks.SPRUCE_LEAF_PILE);

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> 0x80A755,
                ModBlocks.BIRCH_LEAF_PILE);

    }
}