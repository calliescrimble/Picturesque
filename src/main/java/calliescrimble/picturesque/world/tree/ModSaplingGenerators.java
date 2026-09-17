package calliescrimble.picturesque.world.tree;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator ASPEN = new SaplingGenerator(Picturesque.MOD_ID + ":aspen",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ASPEN_KEY), Optional.empty());

    public static final SaplingGenerator WHITE_CHERRY = new SaplingGenerator(Picturesque.MOD_ID + ":white_cherry",
            Optional.empty(), Optional.of(ModConfiguredFeatures.WHITE_CHERRY_KEY), Optional.empty());
}