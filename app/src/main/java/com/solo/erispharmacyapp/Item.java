package com.solo.erispharmacyapp;

public class Item {
    private String name;
    private String description;
    private String price;
    private String quantity;
    public int image;

    public Item(String name, String description, String price, int image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /*
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

     */
}
