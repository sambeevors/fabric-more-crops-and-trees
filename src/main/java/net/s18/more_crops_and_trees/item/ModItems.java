package net.s18.more_crops_and_trees.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.s18.more_crops_and_trees.MoreCropsAndTrees;

public class ModItems {
    public static final Item PEACH = registerItem("peach",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(0.3f)
                    .build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreCropsAndTrees.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreCropsAndTrees.LOGGER.info("Registering mod items for " + MoreCropsAndTrees.MOD_ID + "...");
    }
}
