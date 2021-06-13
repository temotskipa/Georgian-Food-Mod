package com.temotskipa.geofood;

import com.temotskipa.geofood.registry.ModBlocks;
import com.temotskipa.geofood.registry.ModItems;
import com.temotskipa.geofood.registry.ModLootTables;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeoFood implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "geofood";
    public static final String MOD_NAME = "Georgian Food Mod";
    
    public static final ItemGroup VEGETABLES = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "vegetables"),
            () -> new ItemStack(ModItems.CILANTRO)
    );
    public static final ItemGroup SPICES = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "spices"),
            () -> new ItemStack(ModItems.MARIGOLD)
    );
    public static final ItemGroup FRUITS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "fruits"),
            () -> new ItemStack(ModItems.GRAPE)
    );
    public static final ItemGroup DRINKS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "drinks"),
            () -> new ItemStack(ModItems.GRAPE_JUICE)
    );
    public static final ItemGroup SAUCES = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "sauces"),
            () -> new ItemStack(ModItems.TKEMALI_SAUCE)
    );
    
    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModLootTables.modifyLootTables();
    }
    
    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}