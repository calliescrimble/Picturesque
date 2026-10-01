package calliescrimble.picturesque.world.tree;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.world.ModFeatures;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class ModSaplingGenerators {

    public static final TreeGrower ASPEN = new TreeGrower(
            Picturesque.MOD_ID + ":aspen",
            WeightedList.of(ModFeatures.ASPEN_KEY),
            WeightedList.of(),
            WeightedList.of(),
            ModFeatures.ASPEN_KEY);

    public static final TreeGrower WHITE_CHERRY = new TreeGrower(
            Picturesque.MOD_ID + ":white_cherry",
            WeightedList.of(ModFeatures.WHITE_CHERRY_KEY),
            WeightedList.of(),
            WeightedList.of(),
            ModFeatures.WHITE_CHERRY_KEY);
}