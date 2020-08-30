package com.laikacode.patterns.creation.factory.method;

public final class IntermediatePlan implements Plan {
    private final double PRICE    = 1.25;
    private final double DISCOUNT = this.PRICE * 0.30;
    private final double ROYALTY  = this.PRICE * 0.40;

    @Override
    public double getPricePerMonth() {
        return this.PRICE * 30 - this.DISCOUNT - this.ROYALTY;
    }

    @Override
    public double getPricePerAge() {
        return this.PRICE * 365 - this.DISCOUNT - this.ROYALTY;
    }
}
