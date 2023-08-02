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
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEACH_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PEACH_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}