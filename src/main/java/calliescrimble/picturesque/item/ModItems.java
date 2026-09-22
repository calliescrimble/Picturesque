package calliescrimble.picturesque.item;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import java.util.function.Function;

public class ModItems {

    public static final Item ASPEN_BOAT = registerItem("aspen_boat", settings -> new BoatItem(ModEntityTypes.ASPEN_BOAT, settings
            .stacksTo(1)));
    public static final Item ASPEN_CHEST_BOAT = registerItem("aspen_chest_boat", settings -> new BoatItem(ModEntityTypes.ASPEN_CHEST_BOAT, settings
            .stacksTo(1)));
    public static final Item ASPEN_SIGN = registerItem("aspen_sign", settings -> new SignItem(ModBlocks.ASPEN_SIGN, ModBlocks.ASPEN_WALL_SIGN, settings
            .useBlockDescriptionPrefix().stacksTo(16)));
    public static final Item ASPEN_HANGING_SIGN = registerItem("aspen_hanging_sign", settings -> new HangingSignItem(ModBlocks.ASPEN_HANGING_SIGN, ModBlocks.ASPEN_WALL_HANGING_SIGN, settings
            .useBlockDescriptionPrefix().stacksTo(16)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Picturesque.MOD_ID, name)))));
    }
    public static void initialize() {

        //

    }
}