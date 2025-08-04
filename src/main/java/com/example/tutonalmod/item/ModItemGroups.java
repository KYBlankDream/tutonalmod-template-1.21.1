package com.example.tutonalmod.item;

import com.example.tutonalmod.TutonalMod;
import com.example.tutonalmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> TUTONAL_GROUP = register("tutonal_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TutonalMod.MOD_ID,id));
    }

    private static void registerModItemGroup(){
        Registry.register(
                Registries.ITEM_GROUP,
                TUTONAL_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.tutonal_group"))
                        .icon(()-> new ItemStack(ModItems.ICE_ETHER))
                        .entries((displayContext, entries) ->{
                                    entries.add(ModItems.ICE_ETHER);
                                    entries.add(Blocks.BLUE_BED);
                                    entries.add(Items.DIAMOND);

                                    entries.add(ModBlocks.ICE_ETHER_BLOCK);
                                    entries.add(ModBlocks.ICE_ETHER_ORE);
                                    entries.add(ModBlocks.RAW_ICE_ETHER_BLOCK);
                                })
                        .build()
        );
    }

    public static void registerModItemGroups(){
        TutonalMod.LOGGER.info("Register ItemGroup");
        registerModItemGroup(); // ✅ 关键！
    }
}
