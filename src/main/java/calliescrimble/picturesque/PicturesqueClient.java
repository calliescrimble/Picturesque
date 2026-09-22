package calliescrimble.picturesque;

import calliescrimble.picturesque.block.ModBlocks;
import calliescrimble.picturesque.item.ModEntityTypes;
import calliescrimble.picturesque.particle.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.particle.FallingLeavesParticle;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.BlockPos;
import net.minecraft.util.ARGB;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class PicturesqueClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ParticleProviderRegistry.getInstance().register(
                ModParticles.WHITE_CHERRY_PETAL,
                FallingLeavesParticle.CherryProvider::new);

        ModelLayerLocation normal = new ModelLayerLocation(Picturesque.id("boat/aspen"), "main");
        ModelLayerRegistry.registerModelLayer(normal, BoatModel::createBoatModel);
        EntityRenderers.register(ModEntityTypes.ASPEN_BOAT, context -> new BoatRenderer(context, normal));

        ModelLayerLocation chest = new ModelLayerLocation(Picturesque.id("chest_boat/aspen"), "main");
        ModelLayerRegistry.registerModelLayer(chest, BoatModel::createChestBoatModel);
        EntityRenderers.register(ModEntityTypes.ASPEN_CHEST_BOAT, context -> new BoatRenderer(context, chest));

        BlockColorRegistry.register(
                List.of(new BlockTintSource() {
                    @Override
                    public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                        return BiomeColors.getAverageFoliageColor(level, pos);}
                    @Override
                    public int color(BlockState state) {
                        return 0x48B518;}}),
                ModBlocks.OAK_LEAF_PILE,
                ModBlocks.JUNGLE_LEAF_PILE,
                ModBlocks.ACACIA_LEAF_PILE,
                ModBlocks.DARK_OAK_LEAF_PILE);

        BlockColorRegistry.register(
                List.of(new BlockTintSource() {
                    @Override
                    public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                        return BiomeColors.getAverageFoliageColor(level, pos);}
                    @Override
                    public int color(BlockState state) {
                        return 0x92C648;}}),
                ModBlocks.MANGROVE_LEAF_PILE);

        BlockColorRegistry.register(
                List.of(BlockTintSources.constant(ARGB.opaque(0x619961))),
                ModBlocks.SPRUCE_LEAF_PILE);

        BlockColorRegistry.register(
                List.of(BlockTintSources.constant(ARGB.opaque(0x80A755))),
                ModBlocks.BIRCH_LEAF_PILE);
    }
}