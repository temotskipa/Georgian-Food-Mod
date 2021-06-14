package com.temotskipa.geofood.registry;

import com.temotskipa.geofood.GeoFood;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item KHINKALI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(7)
                    .saturationModifier(7.3f)
                    .meat()
                    .build()));
    public static final Item IMERULI_KHACHAPURI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(5)
                    .saturationModifier(8f)
                    .build()));
    public static final Item LOBIANI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(5)
                    .saturationModifier(8.1f)
                    .build()));
    public static final MushroomStewItem WALNUT_BEANS = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(10.2f)
                    .build()));
    public static final Item ADJARULI_KHACHAPURI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .rarity(Rarity.UNCOMMON)
            .food(new FoodComponent.Builder()
                    .hunger(10)
                    .saturationModifier(15.6f)
                    .build()));
    public static final Item SUPER_ADJARULI_KHACHAPURI = new SuperAdjaruliKhachapuriItem((new Item.Settings()
            .group(ItemGroup.FOOD)
            .rarity(Rarity.EPIC)
            .food(new FoodComponent.Builder()
                    .hunger(10)
                    .saturationModifier(20f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 60, 4), 1f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 120, 3), 1f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 300), 1f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 300, 1), 1f)
                    .alwaysEdible()
                    .build())));
    public static final Item SULGUNI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(1.1f)
                    .build()));
    public static final Item BEANS = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1.6f)
                    .build()));
    public static final MushroomStewItem COOKED_BEANS_IN_A_BOWL = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(5)
                    .saturationModifier(6.3f)
                    .build()));
    public static final MushroomStewItem RAW_BEANS_IN_A_BOWL = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1.6f)
                    .build()));
    public static final Item WALNUT = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(1.9f)
                    .build()));
    public static final Item GOZINAKI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(5.7f)
                    .build()));
    public static final Item KVARABIA = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(8.9f)
                    .build()));
    public static final MushroomStewItem SOUR_CREAM = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(1.2f)
                    .build()));
    public static final Item ACHMA = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(8)
                    .saturationModifier(10.9f)
                    .build()));
    public static final Item ATSKHAMGALI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(6.2f)
                    .build()));
    public static final Item IMERULI_CHEESE = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(1.1f)
                    .build()));
    public static final Item ONION = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20*15), 0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*5), 0.3f)
                    .build()));
    public static final Item CILANTRO = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.7f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 0.07f)
                    .build()));
    public static final Item CORIANDER = new Item(new Item.Settings()
            .group(GeoFood.SPICES));
    public static final BlockItem SALT_BLOCK = new BlockItem(ModBlocks.SALT_BLOCK, new Item.Settings()
            .group(ItemGroup.BUILDING_BLOCKS));
    public static final Item SALT = new Item(new Item.Settings()
            .group(GeoFood.SPICES));
    public static final BlockItem WALNUT_BLOCK = new BlockItem(ModBlocks.WALNUT_BLOCK, new Item.Settings()
            .group(ItemGroup.BUILDING_BLOCKS));
    public static final Item FENUGREEK = new Item(new Item.Settings()
            .group(GeoFood.SPICES));
    public static final Item RED_PEPPER = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.8f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20*50), 0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*15, 1), 0.3f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*55, 1), 0.9f)
                    .build()));
    public static final Item GARLIC = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.8f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20*50), 0.44f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*30), 0.13f)
                    .build()));
    public static final Item MARIGOLD = new Item(new Item.Settings()
            .group(GeoFood.SPICES));
    public static final Item PARSLEY = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.7f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 0.08f)
                    .build()));
    public static final Item SPINACH = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.8f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 0.09f)
                    .build()));
    public static final Item GRAPE = new Item(new Item.Settings()
            .group(GeoFood.FRUITS)
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(2.9f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1,1), 0.67f)
                    .build()));
    public static final Item RED_TKEMALI = new Item(new Item.Settings()
            .group(GeoFood.FRUITS)
            .food(new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1.9f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 0.4f)
                    .build()));
    public static final Item TKEMALI = new Item(new Item.Settings()
            .group(GeoFood.FRUITS)
            .food(new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1.9f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 0.4f)
                    .build()));
    public static final Item SCALLION = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.8f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 0.15f)
                    .build()));
    public static final GrapeJuiceItem GRAPE_JUICE = new GrapeJuiceItem(new Item.Settings()
            .group(GeoFood.DRINKS).food(new FoodComponent.Builder()
                    .hunger(0)
                    .saturationModifier(0.07f)
                    .alwaysEdible()
                    .build()));
    public static final Item BUTTER = new Item(new Item.Settings()
            .group(ItemGroup.FOOD));
    public static final MushroomStewItem MATSONI = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(1.2f)
                    .build()));
    public static final Item CORN = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(2)
                    .saturationModifier(1.4f)
                    .build()));
    public static final Item CORN_FLOUR = new Item(new Item.Settings()
            .group(ItemGroup.MATERIALS));
    public static final Item CHURCHKHELA = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .rarity(Rarity.RARE)
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(4.5f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*30, 1), 1f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*30), 1f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*60), 1f)
                    .build()));
    public static final MushroomStewItem CHICKEN_IN_BAZHE = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(9)
                    .saturationModifier(4.4f)
                    .build()));
    public static final Item MCHADI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(4.3f)
                    .build()));
    public static final Item SPINACH_MKHALI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(4.9f)
                    .build()));
    public static final Item BEETROOT_MKHALI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(5f)
                    .build()));
    public static final GrapeJuiceItem TKEMALI_SAUCE = new GrapeJuiceItem(new Item.Settings()
            .group(GeoFood.SAUCES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(1f)
                    .build()));
    public static final MushroomStewItem TATARA = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(3.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*30), 0.87f)
                    .build()));
    public static final Item TARRAGON = new Item(new Item.Settings()
            .group(GeoFood.VEGETABLES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.6f)
                    .build()));
    public static final Item TKLAPI = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(4.98f)
                    .build()));
    public static final MushroomStewItem CHAKAPULI = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(8)
                    .saturationModifier(6.92f)
                    .build()));
    public static final GrapeJuiceItem RED_TKEMALI_SAUCE = new GrapeJuiceItem(new Item.Settings()
            .group(GeoFood.SAUCES)
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .saturationModifier(0.1f)
                    .build()));
    public static final MushroomStewItem BEETROOT_IN_TKEMALI = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(6)
                    .saturationModifier(4.26f)
                    .build()));
    public static final MushroomStewItem SHKMERULI = new MushroomStewItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(7)
                    .saturationModifier(8.35f)
                    .build()));
    public static final BlockItem TKEMALI_BLOCK = new BlockItem(ModBlocks.TKEMALI_BLOCK, new Item.Settings()
            .group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem RED_TKEMALI_BLOCK = new BlockItem(ModBlocks.RED_TKEMALI_BLOCK, new Item.Settings()
            .group(ItemGroup.BUILDING_BLOCKS));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "khinkali"), KHINKALI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "lobiani"), LOBIANI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "walnut_beans"), WALNUT_BEANS);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "adjaruli_khachapuri"), ADJARULI_KHACHAPURI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "super_adjaruli_khachapuri"), SUPER_ADJARULI_KHACHAPURI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "sulguni"), SULGUNI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "beans"), BEANS);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "walnut"), WALNUT);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "cooked_beans_in_a_bowl"), COOKED_BEANS_IN_A_BOWL);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "raw_beans_in_a_bowl"), RAW_BEANS_IN_A_BOWL);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "gozinaki"), GOZINAKI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "kvarabia"), KVARABIA);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "imeruli_khachapuri"), IMERULI_KHACHAPURI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "sour_cream"), SOUR_CREAM);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "achma"), ACHMA);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "atskhamgali"), ATSKHAMGALI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "imeruli_cheese"), IMERULI_CHEESE);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "onion"), ONION);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "cilantro"), CILANTRO);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "coriander"), CORIANDER);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "salt_block"), SALT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "walnut_block"), WALNUT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "fenugreek"), FENUGREEK);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "red_pepper"), RED_PEPPER);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "garlic"), GARLIC);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "marigold"), MARIGOLD);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "parsley"), PARSLEY);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "grape"), GRAPE);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "red_tkemali"), RED_TKEMALI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "tkemali"), TKEMALI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "spinach"), SPINACH);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "scallion"), SCALLION);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "grape_juice"), GRAPE_JUICE);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "butter"), BUTTER);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "matsoni"), MATSONI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "corn"), CORN);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "corn_flour"), CORN_FLOUR);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "churchkhela"), CHURCHKHELA);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "chicken_in_bazhe"), CHICKEN_IN_BAZHE);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "mchadi"), MCHADI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "spinach_mkhali"), SPINACH_MKHALI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "beetroot_mkhali"), BEETROOT_MKHALI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "tatara"), TATARA);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "tarragon"), TARRAGON);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "tklapi"), TKLAPI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "chakapuli"), CHAKAPULI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "red_tkemali_sauce"), RED_TKEMALI_SAUCE);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "beetroot_in_tkemali"), BEETROOT_IN_TKEMALI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "shkmeruli"), SHKMERULI);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "tkemali_sauce"), TKEMALI_SAUCE);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "tkemali_block"), TKEMALI_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(GeoFood.MOD_ID, "red_tkemali_block"), RED_TKEMALI_BLOCK);
    }
}