package com.laikacode.patterns.creation.factory.method;

public final class ExpertPlan implements Plan {

    private final double PRICE    = 1.50;
    private final double DISCOUNT = this.PRICE * 0.30;

    @Override
    public double getPricePerMonth() {
        return this.PRICE * 30 - this.DISCOUNT;
    }

    @Override
    public double getPricePerAge() {
        return this.PRICE * 365 - this.DISCOUNT;
    }
}
