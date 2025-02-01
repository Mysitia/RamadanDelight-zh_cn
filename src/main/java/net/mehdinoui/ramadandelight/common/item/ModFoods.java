package net.mehdinoui.ramadandelight.common.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class ModFoods {

    //Soups
    public static final FoodProperties CHORBA = new FoodProperties.Builder().
            nutrition(8).saturationMod(0.5F)
            .effect(()-> new MobEffectInstance(ModEffects.COMFORT.get(),BRIEF_DURATION,0),1.0f)
            .build();
    public static final FoodProperties HALEEM = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.6F)
            .effect(()-> new MobEffectInstance(ModEffects.COMFORT.get(),BRIEF_DURATION,0),1.0f)
            .build();
    public static final FoodProperties HARIRA = new FoodProperties.Builder().
            nutrition(8).saturationMod(0.5F)
            .effect(()-> new MobEffectInstance(ModEffects.COMFORT.get(),BRIEF_DURATION,0),1.0f)
            .build();


    //Bourek
    public static final FoodProperties BOUREK_SHEET = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.1F).fast().build();
    public static final FoodProperties RAW_BOUREK= new FoodProperties.Builder().
            nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties BOUREK = new FoodProperties.Builder().
            nutrition(6).saturationMod(0.4F).build();

    //Samosa
    public static final FoodProperties RAW_SAMOSA = new FoodProperties.Builder().
            nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties SAMOSA = new FoodProperties.Builder().
            nutrition(5).saturationMod(0.3F).fast().build();

    //Kebab
    public static final FoodProperties RAW_KEBAB = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties KEBAB = new FoodProperties.Builder().
            nutrition(5).saturationMod(0.3F).fast().build();

    //Free Palestine
    public static final FoodProperties MANAKISH = new FoodProperties.Builder().
            nutrition(6).saturationMod(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, BRIEF_DURATION, 0), 1.0F)
            .build();

    //Dishes
    public static final FoodProperties MAKLOBA = new FoodProperties.Builder().
            nutrition(12).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F)
            .build();
    public static final FoodProperties SAYADIEH = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F)
            .build();

    //Salades
    public static final FoodProperties TABBOULEH = new FoodProperties.Builder().
            nutrition(6).saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 0), 1.0F)
            .build();

}
