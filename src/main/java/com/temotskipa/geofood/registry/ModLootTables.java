package com.temotskipa.geofood.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTables {
    private static final Identifier OAK_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/oak_leaves");
    private static final Identifier STONE_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/stone");
    private static final Identifier GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/grass");
    private static final Identifier TALL_GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/tall_grass");
    private static final Identifier DARK_OAK_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/dark_oak_leaves");

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (OAK_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.GRAPE))
                        .with(ItemEntry.builder(ModItems.TKEMALI))
                        .with(ItemEntry.builder(ModItems.RED_TKEMALI))
                        .with(ItemEntry.builder(ModItems.WALNUT))
                        .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1f), false)
                                .build())
                        .withCondition(RandomChanceLootCondition.builder(0.07f)
                                .build());
                supplier.withPool(poolBuilder.build());
            }
        }));
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (STONE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.SALT))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 3f))
                                .build())
                        .withCondition(RandomChanceLootCondition.builder(0.2f)
                                .build());
                supplier.withPool(poolBuilder.build());
            }
        }));
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.GARLIC))
                        .with(ItemEntry.builder(ModItems.ONION))
                        .with(ItemEntry.builder(ModItems.PARSLEY))
                        .with(ItemEntry.builder(ModItems.RED_PEPPER))
                        .with(ItemEntry.builder(ModItems.SCALLION))
                        .with(ItemEntry.builder(ModItems.SPINACH))
                        .with(ItemEntry.builder(ModItems.BEANS))
                        .with(ItemEntry.builder(ModItems.CILANTRO))
                        .with(ItemEntry.builder(ModItems.CORN))
                        .with(ItemEntry.builder(ModItems.MARIGOLD))
                        .with(ItemEntry.builder(ModItems.TARRAGON))
                        .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1f), false)
                                .build())
                        .withCondition(RandomChanceLootCondition.builder(0.08f).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (TALL_GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.GARLIC))
                        .with(ItemEntry.builder(ModItems.ONION))
                        .with(ItemEntry.builder(ModItems.PARSLEY))
                        .with(ItemEntry.builder(ModItems.RED_PEPPER))
                        .with(ItemEntry.builder(ModItems.SCALLION))
                        .with(ItemEntry.builder(ModItems.SPINACH))
                        .with(ItemEntry.builder(ModItems.BEANS))
                        .with(ItemEntry.builder(ModItems.CILANTRO))
                        .with(ItemEntry.builder(ModItems.CORN))
                        .with(ItemEntry.builder(ModItems.MARIGOLD))
                        .with(ItemEntry.builder(ModItems.TARRAGON))
                        .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1f), false)
                                .build())
                        .withCondition(RandomChanceLootCondition.builder(0.08f)
                                .build());
                supplier.withPool(poolBuilder.build());
            }
        }));
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (DARK_OAK_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.GRAPE))
                        .with(ItemEntry.builder(ModItems.TKEMALI))
                        .with(ItemEntry.builder(ModItems.RED_TKEMALI))
                        .with(ItemEntry.builder(ModItems.WALNUT))
                        .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1f), false)
                                .build())
                        .withCondition(RandomChanceLootCondition.builder(0.07f)
                                .build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}