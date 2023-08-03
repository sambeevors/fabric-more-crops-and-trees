package net.s18.more_crops_and_trees.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.s18.more_crops_and_trees.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.PEACH_LOG).log(ModBlocks.PEACH_LOG).wood(ModBlocks.PEACH_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PEACH_LOG).log(ModBlocks.STRIPPED_PEACH_LOG)
                .wood(ModBlocks.STRIPPED_PEACH_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_PLANKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_BUTTON); // No registerButton ?
        blockStateModelGenerator.registerDoor(ModBlocks.PEACH_DOOR);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_FENCE_GATE); // No registerFence ?
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_FENCE); // No registerFence ?
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_PEACH_LOG, ModBlocks.PEACH_HANGING_SIGN, ModBlocks.PEACH_WALL_HANGING_SIGN);
//        blockStateModelGenerator.registerWeightedPressurePlate(ModBlocks.PEACH_PRESSURE_PLATE, ModBlocks.PEACH_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_SIGN); // No registerSign?
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_SLAB); // No registerSlab?
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_STAIRS); // No registerSign?
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PEACH_TRAPDOOR); // No registerSign?

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PEACH_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}