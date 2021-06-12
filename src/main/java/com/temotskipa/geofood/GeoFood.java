package com.temotskipa.geofood;

import com.temotskipa.geofood.registry.ModBlocks;
import com.temotskipa.geofood.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
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
    
    public static final Identifier OAK_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/oak_leaves");
    public static final Identifier GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/grass");
    
    public void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.CILANTRO))
                        .with(ItemEntry.builder(ModItems.BEANS))
                        .with(ItemEntry.builder(ModItems.ONION))
                        .with(ItemEntry.builder(ModItems.FENUGREEK))
                        .with(ItemEntry.builder(ModItems.RED_PEPPER))
                        .with(ItemEntry.builder(ModItems.GARLIC))
                        .with(ItemEntry.builder(ModItems.PARSLEY))
                        .with(ItemEntry.builder(ModItems.MARIGOLD))
                        .with(ItemEntry.builder(ModItems.SCALLION))
                        .with(ItemEntry.builder(ModItems.CORN))
                        .with(ItemEntry.builder(ModItems.TARRAGON))
                        .withCondition(RandomChanceLootCondition.builder(0.09f)
                                .build())
                        .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1f))
                                .build());
                supplier.withPool(poolBuilder.build());
            }
            LootTableLoadingCallback.EVENT.register((resourceManager1, manager1, id1, supplier1, setter1) -> {
                if (OAK_LEAVES_LOOT_TABLE_ID.equals(id1)) {
                    FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .with(ItemEntry.builder(ModItems.WALNUT))
                            .with(ItemEntry.builder(ModItems.GRAPE))
                            .with(ItemEntry.builder(ModItems.TKEMALI))
                            .with(ItemEntry.builder(ModItems.RED_TKEMALI))
                            .withCondition(RandomChanceLootCondition.builder(0.05f)
                                    .build())
                            .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1f))
                                    .build());
                    supplier1.withPool(poolBuilder.build());
                }
            });
        });
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        modifyLootTables();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}