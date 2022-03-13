package com.teksystems.bootcamp.capstone2.Items;

public enum Drinks {
    SPRITE("Sprite", 1.99),
    COKE("Coke", 1.99),
    ROOTBEER("Root-Beer", 1.99),
    FANTA("Fanta", 1.99);

    private double cost;
    private String name;

    private Drinks(String name, double cost) {
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
}
