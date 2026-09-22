package calliescrimble.picturesque.particle;

import calliescrimble.picturesque.Picturesque;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModParticles {

public static final SimpleParticleType WHITE_CHERRY_PETAL =
            Registry.register(
                    BuiltInRegistries.PARTICLE_TYPE,
                    Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, "white_cherry_petal"),
                    FabricParticleTypes.simple());

    public static void initialize() {

    }
}