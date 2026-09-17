package calliescrimble.picturesque.item;

import calliescrimble.picturesque.Picturesque;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import java.util.function.Supplier;

public interface ModEntityTypes {
    EntityType<BoatEntity> ASPEN_BOAT = registerEntityType("aspen_boat",
            EntityType.Builder.create(getBoatFactory(() -> ModItems.ASPEN_BOAT), SpawnGroup.MISC)
                    .dropsNothing()
                    .dimensions(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .maxTrackingRange(10));
    EntityType<ChestBoatEntity> ASPEN_CHEST_BOAT = registerEntityType("aspen_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> ModItems.ASPEN_CHEST_BOAT), SpawnGroup.MISC)
                    .dropsNothing()
                    .dimensions(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .maxTrackingRange(10));

    static <T extends Entity> EntityType<T> registerEntityType(String name, EntityType.Builder<T> builder) {
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Picturesque.id(name));
        return Registry.register(Registries.ENTITY_TYPE, key.getValue(), builder.build(key));
    }

    static void registerEntityTypes() {
    }

    private static EntityType.EntityFactory<BoatEntity> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new BoatEntity(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<ChestBoatEntity> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestBoatEntity(type, world, itemSupplier);
    }
}