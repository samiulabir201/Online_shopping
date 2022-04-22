package com.example.ecommerce180041221.model;

public class Cart {

    private int quantity;
    private int id;

    public int getId(){return id;}
    public void setId(){this.id = id; }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
