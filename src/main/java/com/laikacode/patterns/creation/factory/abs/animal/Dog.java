package com.laikacode.patterns.creation.factory.abs.animal;

public final class Dog implements Animal{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Guau!";
    }
}
