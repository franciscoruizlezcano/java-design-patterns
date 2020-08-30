package com.laikacode.patterns.creation.builder;

import java.util.Date;

public final class ProductBuilder implements Builder<Product>{
    private int id;
    private String description;
    private Date firstAdmission;
    private String serialNumber;
    private double price;
    private String imageUrl;
    private int warrantyDays;

    public ProductBuilder withId(int id){
        this.id = id;
        return this;
    }

    public ProductBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public ProductBuilder withFirstAdmission(Date firstAdmission){
        this.firstAdmission = firstAdmission;
        return this;
    }

    public ProductBuilder withSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
        return this;
    }

    public ProductBuilder withPrice(double price){
        this.price = price;
        return this;
    }

    public ProductBuilder withImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        return this;
    }

    public ProductBuilder withWarrantyDays(int warrantyDays){
        this.warrantyDays = warrantyDays;
        return this;
    }

    @Override
    public Product build() {
        return new Product(
                this.id,
                this.description,
                this.firstAdmission,
                this.serialNumber,
                this.price,
                this.imageUrl,
                this.warrantyDays
        );
    }
}
