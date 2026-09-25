package calliescrimble.picturesque.item;

import calliescrimble.picturesque.Picturesque;
import java.util.function.Supplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;

public interface ModEntityTypes {
    EntityType<Boat> ASPEN_BOAT = registerEntityType("aspen_boat",
            EntityType.Builder.of(getBoatFactory(() -> ModItems.ASPEN_BOAT), MobCategory.MISC)
                    .noLootTable()
                    .sized(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .clientTrackingRange(10));
    EntityType<ChestBoat> ASPEN_CHEST_BOAT = registerEntityType("aspen_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> ModItems.ASPEN_CHEST_BOAT), MobCategory.MISC)
                    .noLootTable()
                    .sized(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .clientTrackingRange(10));

    public static ResourceKey<EntityType<?>> getRK(EntityType entityType) {
        return BuiltInRegistries.ENTITY_TYPE.getResourceKey(entityType).get();
    }

    static <T extends Entity> EntityType<T> registerEntityType(String name, EntityType.Builder<T> builder) {
        ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, Picturesque.id(name));
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, key.identifier(), builder.build(key));
    }

    static void initialize() {
    }

    private static EntityType.EntityFactory<Boat> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new Boat(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<ChestBoat> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestBoat(type, world, itemSupplier);
    }
}