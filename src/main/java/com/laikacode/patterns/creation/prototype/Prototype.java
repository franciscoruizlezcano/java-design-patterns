package com.laikacode.patterns.creation.prototype;

public interface Prototype<T extends Object> {
    T clone();
}
