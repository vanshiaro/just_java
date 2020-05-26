package com.example.justjava;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Beverage implements Serializable {
    public static  final Map<String,String> beverageType= new HashMap<String,String>(){{
        put("orderEsCoffee", "ESPRESSO");
        put("orderLaCoffee", "LATTE");
        put("orderCaCoffee", "CAPPUCCINO");
        put("orderMoCoffee", "MOCHA");
        put("orderLbCoffee", "LONG BLACK");
        put("orderGT", "GREEN TEA");
        put("orderBT", "BLACK TEA");
        put("orderHT", "HERBAL TEA");
        put("orderCT", "CHAMOMILE TEA");
        put("orderTT", "TANDOORI TEA");
    }};
    private String id ="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "";
    public Beverage(String id, int price) {
        this.id = id;
        this.price = price;
        this.name = beverageType.get(id);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}