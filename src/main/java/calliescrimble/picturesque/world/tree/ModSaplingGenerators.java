package calliescrimble.picturesque.world.tree;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.world.ModConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class ModSaplingGenerators {
    public static final TreeGrower ASPEN = new TreeGrower(Picturesque.MOD_ID + ":aspen",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ASPEN_KEY), Optional.empty());

    public static final TreeGrower WHITE_CHERRY = new TreeGrower(Picturesque.MOD_ID + ":white_cherry",
            Optional.empty(), Optional.of(ModConfiguredFeatures.WHITE_CHERRY_KEY), Optional.empty());
}