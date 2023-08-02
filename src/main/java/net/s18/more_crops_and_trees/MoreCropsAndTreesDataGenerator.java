package net.s18.more_crops_and_trees;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryBuilder.BootstrapFunction;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.s18.more_crops_and_trees.data.ModLootTableGenerator;
import net.s18.more_crops_and_trees.data.ModModelProvider;
import net.s18.more_crops_and_trees.data.ModRecipeGenerator;
import net.s18.more_crops_and_trees.data.ModWorldGenerator;
import net.s18.more_crops_and_trees.world.ModConfiguredFeatures;
import net.s18.more_crops_and_trees.world.ModPlacedFeatures;

public class MoreCropsAndTreesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		// TODO: Figure out why this doesn't work
		// registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE,
		// ModConfiguredFeatures::bootstrap);
		// registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE,
		// ModPlacedFeatures::bootstrap);
	}
}