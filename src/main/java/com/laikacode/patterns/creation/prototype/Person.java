package com.laikacode.patterns.creation.prototype;

public abstract class Person implements Prototype<Person>{
    private int    id;
    private String name;
    private String lastname;

    public Person() {
    }

    public Person(
            int    id,
            String name,
            String lastname
    ) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public Person clone() {
        return this;
    }
}
