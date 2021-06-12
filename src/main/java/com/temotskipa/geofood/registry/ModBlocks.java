package com.temotskipa.geofood.registry;

import com.temotskipa.geofood.GeoFood;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SALT_BLOCK = new Block(FabricBlockSettings
            .copy(Blocks.SAND));
    public static final Block WALNUT_BLOCK = new Block(FabricBlockSettings
            .copy(Blocks.PUMPKIN));
    public static final Block TKEMALI_BLOCK = new Block(FabricBlockSettings
            .of(Material.ORGANIC_PRODUCT)
            .sounds(BlockSoundGroup.GRASS)
            .strength(1.98f, 5.8f)
            .breakByHand(true)
            .breakByTool(FabricToolTags.AXES));
    public static final Block RED_TKEMALI_BLOCK = new Block(FabricBlockSettings.copy(TKEMALI_BLOCK));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(GeoFood.MOD_ID, "salt_block"), SALT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(GeoFood.MOD_ID, "walnut_block"), WALNUT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(GeoFood.MOD_ID, "tkemali_block"), TKEMALI_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(GeoFood.MOD_ID, "red_tkemali_block"), RED_TKEMALI_BLOCK);
    }
}
