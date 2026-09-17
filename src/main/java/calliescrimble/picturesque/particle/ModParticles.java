package calliescrimble.picturesque.particle;

import calliescrimble.picturesque.Picturesque;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

public static final SimpleParticleType WHITE_CHERRY_PETAL =
            Registry.register(
                    Registries.PARTICLE_TYPE,
                    Identifier.of(Picturesque.MOD_ID, "white_cherry_petal"),
                    FabricParticleTypes.simple());

    public static void registerParticles() {

    }
}