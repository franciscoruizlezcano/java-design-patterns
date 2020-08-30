package com.laikacode.patterns.creation.factory.abs.color;

import com.laikacode.patterns.creation.factory.abs.AbstractFactory;

import java.util.HashMap;

public final class ColorFactory implements AbstractFactory<Color, ColorEnum> {

    private static ColorFactory instance;
    private final HashMap<ColorEnum, Color> colorHashMap;

    private ColorFactory() throws InstantiationException {
        if (instance == null) throw new InstantiationException();

        this.colorHashMap = new HashMap<>();

        this.colorHashMap.put(ColorEnum.BLUE, new Blue());
        this.colorHashMap.put(ColorEnum.RED, new Red());

    }

    @Override
    public Color create(ColorEnum type) {
        if (type == null) throw new NullPointerException();

        if (this.colorHashMap.containsKey(type)){
            return this.colorHashMap.get(type);
        }

        return null;
    }
}
