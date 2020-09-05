package com.laikacode.patterns.creation.builder;

import java.util.Date;

public final class Product {
    private int    id;
    private String description;
    private Date   firstAdmission;
    private String serialNumber;
    private double price;
    private String imageUrl;
    private int    warrantyDays;

    public Product() {
    }

    public Product(
            int    id,
            String description,
            Date   firstAdmission,
            String serialNumber,
            double price,
            String imageUrl,
            int    warrantyDays
    ) {
        this.id = id;
        this.description = description;
        this.firstAdmission = firstAdmission;
        this.serialNumber = serialNumber;
        this.price = price;
        this.imageUrl = imageUrl;
        this.warrantyDays = warrantyDays;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getFirstAdmission() {
        return firstAdmission;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getWarrantyDays() {
        return warrantyDays;
    }
}
