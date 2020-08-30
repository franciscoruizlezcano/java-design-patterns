package com.laikacode.patterns.creation.builder;

import java.util.Date;

public class Product {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFirstAdmission() {
        return firstAdmission;
    }

    public void setFirstAdmission(Date firstAdmission) {
        this.firstAdmission = firstAdmission;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getWarrantyDays() {
        return warrantyDays;
    }

    public void setWarrantyDays(int warrantyDays) {
        this.warrantyDays = warrantyDays;
    }
}
