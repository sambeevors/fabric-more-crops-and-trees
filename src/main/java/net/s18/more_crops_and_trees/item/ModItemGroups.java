package net.s18.more_crops_and_trees.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.s18.more_crops_and_trees.MoreCropsAndTrees;
import net.s18.more_crops_and_trees.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CROPS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreCropsAndTrees.MOD_ID, "crops"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crops"))
                    .icon(() -> new ItemStack(ModItems.PEACH)).entries((displayConext, entries) -> {
                        entries.add(ModItems.PEACH);
                    }).build());

    public static final ItemGroup BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreCropsAndTrees.MOD_ID, "blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks"))
                    .icon(() -> new ItemStack(ModBlocks.PEACH_LOG)).entries((displayConext, entries) -> {
                        entries.add(ModBlocks.PEACH_LOG);
                        entries.add(ModBlocks.PEACH_WOOD);
                        entries.add(ModBlocks.STRIPPED_PEACH_LOG);
                        entries.add(ModBlocks.STRIPPED_PEACH_WOOD);
                        entries.add(ModBlocks.PEACH_PLANKS);
                        entries.add(ModBlocks.PEACH_LEAVES);
                        entries.add(ModBlocks.PEACH_SAPLING);
                    }).build());

    public static void registerItemGroups() {
        MoreCropsAndTrees.LOGGER.info("Registering mod item groups for " + MoreCropsAndTrees.MOD_ID + "...");
    }
}
