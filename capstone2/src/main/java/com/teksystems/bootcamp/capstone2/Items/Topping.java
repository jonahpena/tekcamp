package com.teksystems.bootcamp.capstone2.Items;

public enum Topping {
    FURIKAKE("Furikake", .20),
    MASAGO("Masago", .20),
    GINGER("Ginger", .20),
    WASABI("Wasabi", .20);

    private double cost;
    private String name;

    private Topping(String name, double cost) {
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
