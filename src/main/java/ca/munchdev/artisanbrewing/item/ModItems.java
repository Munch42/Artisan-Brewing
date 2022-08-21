package ca.munchdev.artisanbrewing.item;

import ca.munchdev.artisanbrewing.ArtisanBrewing;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtisanBrewing.MOD_ID);

    public static final RegistryObject<Item> RED_GRAPE = ITEMS.register("red_grape", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARTISAN_BREWING_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
