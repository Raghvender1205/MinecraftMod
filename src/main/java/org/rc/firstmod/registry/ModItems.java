package org.rc.firstmod.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.rc.firstmod.Firstmod;

public class ModItems {
    public static final Item RUBY = register("ruby");

    private static Item register(String name) {
        Identifier id = Identifier.of(Firstmod.MOD_ID, name);

        return Registry.register(
                Registries.ITEM,
                id,
                new Item(
                        new Item.Settings()
                                .registryKey(RegistryKey.of(RegistryKeys.ITEM, id))
                )
        );
    }

    public static void registerItems() {
        Firstmod.LOGGER.info("Registering items");
    }
}
