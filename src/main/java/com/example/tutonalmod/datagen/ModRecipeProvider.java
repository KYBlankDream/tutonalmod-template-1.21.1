package com.example.tutonalmod.datagen;

import com.example.tutonalmod.TutonalMod;
import com.example.tutonalmod.block.ModBlocks;
import com.example.tutonalmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC,ModItems.ICE_ETHER,RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.ICE_ETHER_ORE,1)
                .input(ModItems.ICE_ETHER)
                .input(Items.STONE)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.ICE_ETHER))
                .criterion("has_item",RecipeProvider.conditionsFromItem(Items.STONE))
                .offerTo(recipeExporter, Identifier.of(TutonalMod.MOD_ID,"ice_ether_ore"));
    }
}
