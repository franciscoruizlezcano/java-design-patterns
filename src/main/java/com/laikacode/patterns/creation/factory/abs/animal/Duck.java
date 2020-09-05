package com.laikacode.patterns.creation.factory.abs.animal;

public final class Duck implements Animal{
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Cuak!";
    }
}
