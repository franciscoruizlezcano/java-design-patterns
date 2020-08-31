package com.laikacode.patterns.creation.factory.abs;

public interface AbstractFactory<T, S> {
    T create(S type);
}
