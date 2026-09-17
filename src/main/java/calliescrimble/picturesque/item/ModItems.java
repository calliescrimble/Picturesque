package calliescrimble.picturesque.item;

import calliescrimble.picturesque.Picturesque;
import calliescrimble.picturesque.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class ModItems {

    public static final Item ASPEN_BOAT = registerItem("aspen_boat", settings -> new BoatItem(ModEntityTypes.ASPEN_BOAT, settings
            .maxCount(1)));
    public static final Item ASPEN_CHEST_BOAT = registerItem("aspen_chest_boat", settings -> new BoatItem(ModEntityTypes.ASPEN_CHEST_BOAT, settings
            .maxCount(1)));
    public static final Item ASPEN_SIGN = registerItem("aspen_sign", settings -> new SignItem(ModBlocks.ASPEN_SIGN, ModBlocks.ASPEN_WALL_SIGN, settings
            .useBlockPrefixedTranslationKey().maxCount(16)));
    public static final Item ASPEN_HANGING_SIGN = registerItem("aspen_hanging_sign", settings -> new HangingSignItem(ModBlocks.ASPEN_HANGING_SIGN, ModBlocks.ASPEN_WALL_HANGING_SIGN, settings
            .useBlockPrefixedTranslationKey().maxCount(16)));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Picturesque.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Picturesque.MOD_ID, name)))));
    }
    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {

            entries.addAfter(Blocks.BIRCH_HANGING_SIGN, ModItems.ASPEN_SIGN, ModItems.ASPEN_HANGING_SIGN);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {

            entries.addAfter(Items.BIRCH_CHEST_BOAT, ModItems.ASPEN_BOAT, ModItems.ASPEN_CHEST_BOAT);

        });
    }
}