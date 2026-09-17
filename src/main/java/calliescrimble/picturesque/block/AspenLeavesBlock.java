package calliescrimble.picturesque.block;

import net.minecraft.block.TintedParticleLeavesBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.particle.TintedParticleEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class AspenLeavesBlock extends TintedParticleLeavesBlock {
    public AspenLeavesBlock(float leafParticleChance, Settings settings) {
        super(leafParticleChance, settings);
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        TintedParticleEffect tintedParticleEffect = TintedParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0xFFD561);
        ParticleUtil.spawnParticle(world, pos, random, tintedParticleEffect);
    }
}