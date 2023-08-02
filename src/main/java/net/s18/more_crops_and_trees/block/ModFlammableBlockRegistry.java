package net.s18.more_crops_and_trees.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.PEACH_LOG, 5, 5);
        registry.add(ModBlocks.PEACH_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_PEACH_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_PEACH_WOOD, 5, 5);
        registry.add(ModBlocks.PEACH_PLANKS, 5, 20);
        registry.add(ModBlocks.PEACH_LEAVES, 30, 60);
    }
}
