package org.rc.firstmod.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.rc.firstmod.Firstmod;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block");

    private static Block registerBlock(String name) {
        Identifier id = Identifier.of(Firstmod.MOD_ID, name);

        // Create block with register key
        Block block = new Block(
                AbstractBlock.Settings
                        .copy(Blocks.NETHERITE_BLOCK)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, id))
        );

        // Register block
        Registry.register(Registries.BLOCK, id, block);

        // Register block item (so it shows in inventory)
        Registry.register(
                Registries.ITEM,
                id,
                new BlockItem(
                        block,
                        new Item.Settings()
                                .registryKey(RegistryKey.of(RegistryKeys.ITEM, id))
                )
        );

        return block;
    }

    public static void registerBlocks() {
        Firstmod.LOGGER.info("Registering blocks...");
    }
}
