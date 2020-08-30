package com.laikacode.patterns.creation.prototype;

public final class Employee extends Person{
    private Employee boss;

    public Employee() {
    }

    public Employee(
            int      id,
            String   name,
            String   lastname,
            Employee boss
    ) {
        super(
                id,
                name,
                lastname
        );

        this.boss = boss;
    }

    public Employee getBoss() {
        return boss;
    }
}
