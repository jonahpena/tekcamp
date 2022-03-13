package com.teksystems.bootcamp.capstone2.Items;

public enum Entree {
    ALOHA("Aloha", 12.99),
    ONO("Ono", 12.99),
    OHANA("Ohana", 12.99),
    MAHALO("Mahalo", 12.99);

    private double cost;
    private String name;

    private Entree(String name, double cost) {
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
