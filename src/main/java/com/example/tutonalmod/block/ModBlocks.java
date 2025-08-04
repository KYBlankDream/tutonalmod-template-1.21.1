package com.example.tutonalmod.block;

import com.example.tutonalmod.TutonalMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ICE_ETHER_BLOCK = register("ice_ether_block",new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(3F, 3F)));
    public static final Block ICE_ETHER_ORE = register("ice_ether_ore",new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4.5F, 6F)));
    public static final Block RAW_ICE_ETHER_BLOCK = register("raw_ice_ether_block",new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(3F, 3F)));

    //注册任务栏中的方块道具
    public static void registerBlockItems(String id,Block block){
        Registry.register(Registries.ITEM,Identifier.of(TutonalMod.MOD_ID,id),new BlockItem(block,new Item.Settings()));
    }

    //注册方块
    public static Block register(String id, Block block) {
        registerBlockItems(id,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutonalMod.MOD_ID,id), block);
    }

    public static void registerModBlocks(){

    }
}
