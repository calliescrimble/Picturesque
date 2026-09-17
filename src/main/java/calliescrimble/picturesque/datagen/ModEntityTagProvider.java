package calliescrimble.picturesque.datagen;

import calliescrimble.picturesque.item.ModEntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalEntityTypeTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class ModEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ModEntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(EntityTypeTags.BOAT)
                .add(ModEntityTypes.ASPEN_BOAT);

        valueLookupBuilder(ConventionalEntityTypeTags.BOATS)
                .add(ModEntityTypes.ASPEN_CHEST_BOAT);

    }
}
