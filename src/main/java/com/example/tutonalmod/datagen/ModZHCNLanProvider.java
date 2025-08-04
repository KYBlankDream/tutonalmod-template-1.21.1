package com.example.tutonalmod.datagen;

import com.example.tutonalmod.block.ModBlocks;
import com.example.tutonalmod.item.ModItemGroups;
import com.example.tutonalmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {

    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ICE_ETHER,"冰箱");

        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"冰箱方块");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE, "冰箱矿石");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK,"冰箱体");

        translationBuilder.add(ModItemGroups.TUTONAL_GROUP,"新建物品栏");
    }
}
