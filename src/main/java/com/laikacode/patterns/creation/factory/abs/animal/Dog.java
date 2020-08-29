package com.laikacode.patterns.creation.factory.abs.animal;

public class Dog implements Animal{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Guau!";
    }
}
