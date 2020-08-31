package com.laikacode.patterns.creation.factory.abs.animal;

import com.laikacode.patterns.creation.factory.abs.AbstractFactory;

import java.util.HashMap;

public final class AnimalFactory implements AbstractFactory<Animal, AnimalEnum> {

    private final  HashMap<AnimalEnum, Animal> animalHashMap;
    private static AnimalFactory               instance;

    private AnimalFactory(){
        this.animalHashMap = new HashMap<>() {{
            put(AnimalEnum.DOG, new Dog());
            put(AnimalEnum.DUCK, new Duck());
        }};
    }

    public static void createInstance(){
        if (instance == null){
            instance = new AnimalFactory();
        }
    }

    @Override
    public Animal create(AnimalEnum type) {

        if (type == null) throw new NullPointerException();

        if (this.animalHashMap.containsKey(type)){
            return this.animalHashMap.get(type);
        }

        return null;
    }
}
