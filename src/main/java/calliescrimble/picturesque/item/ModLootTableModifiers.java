package calliescrimble.picturesque.item;

import calliescrimble.picturesque.block.ModBlocks;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            //

        });
    }
}