package com.example.justjava;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Order implements Serializable {
    String name;
    int quantity;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    int total;

    public Order(String name, int quantity, int price, int total) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }


}
