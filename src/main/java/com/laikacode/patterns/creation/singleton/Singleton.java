package com.laikacode.patterns.creation.singleton;

public final class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public Singleton createInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
