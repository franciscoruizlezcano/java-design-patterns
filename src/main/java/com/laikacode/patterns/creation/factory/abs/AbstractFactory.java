package com.laikacode.patterns.creation.factory.abs;

public interface AbstractFactory<T extends Object, S extends Enum> {
    T create(S type);
}
