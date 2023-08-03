package net.s18.more_crops_and_trees.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.s18.more_crops_and_trees.MoreCropsAndTrees;
import net.s18.more_crops_and_trees.world.tree.PeachSaplingGenerator;

public class ModBlocks {
    public static final Block PEACH_LOG = registerBlock("peach_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PEACH_WOOD = registerBlock("peach_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PEACH_LOG = registerBlock("stripped_peach_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PEACH_WOOD = registerBlock("stripped_peach_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PEACH_PLANKS = registerBlock("peach_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PEACH_BUTTON = registerBlock("peach_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), new BlockSetType("oak"), 15,
                    true));
    public static final Block PEACH_DOOR = registerBlock("peach_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), new BlockSetType("oak")));
    public static final Block PEACH_FENCE_GATE = registerBlock("peach_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block PEACH_FENCE = registerBlock("peach_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PEACH_HANGING_SIGN = registerBlock("peach_hanging_sign",
            new HangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), WoodType.OAK));
    public static final Block PEACH_WALL_HANGING_SIGN = registerBlock("peach_wall_hanging_sign",
            new WallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN),
                    WoodType.OAK));
    public static final Block PEACH_PRESSURE_PLATE = registerBlock("peach_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE),
                    new BlockSetType("oak")));
    public static final Block PEACH_SIGN = registerBlock("peach_sign",
            new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), WoodType.OAK));
    public static final Block PEACH_WALL_SIGN = registerBlock("peach_wall_sign",
            new WallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), WoodType.OAK));
    public static final Block PEACH_SLAB = registerBlock("peach_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PEACH_STAIRS = registerBlock("peach_stairs",
            new StairsBlock(PEACH_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));

    public static final Block PEACH_TRAPDOOR = registerBlock("peach_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), new BlockSetType("oak")));

    public static final Block PEACH_LEAVES = registerBlock("peach_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block PEACH_SAPLING = registerBlock("peach_sapling",
            new SaplingBlock(new PeachSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MoreCropsAndTrees.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(MoreCropsAndTrees.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MoreCropsAndTrees.LOGGER.info("Registering mod blocks for " + MoreCropsAndTrees.MOD_ID + "...");
    }
}
