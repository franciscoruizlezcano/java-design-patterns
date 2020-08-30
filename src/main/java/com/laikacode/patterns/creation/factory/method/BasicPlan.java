package com.laikacode.patterns.creation.factory.method;

public final class BasicPlan implements Plan {

    private final double PRICE = 1.50;

    @Override
    public double getPricePerMonth() {
        return this.PRICE * 30;
    }

    @Override
    public double getPricePerAge() {
        return this.PRICE * 365;
    }

}
