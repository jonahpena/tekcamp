package com.teksystems.bootcamp.capstone2.Items;

public enum Entree {
    //Entree
    ALOHA("Aloha", 12.99),
    ONO("Ono", 12.99),
    OHANA("Ohana", 12.99),
    MAHALO("Mahalo", 12.99),

    //Toppings
    FURIKAKE("Furikake", .20),
    MASAGO("Masago", .20),
    GINGER("Ginger", .20),
    WASABI("Wasabi", .20),

    //Drinks
    SPRITE("Sprite", 1.99),
    COKE("Coke", 1.99),
    ROOTBEER("Root-Beer", 1.99),
    WATER("Water", 0.00),

    //Sides
    EDAMAME("Edamame", 4.99),
    CRABBALL("Crab Ball", 1.99),
    SPAMMUSUBI("Spam Musubi", 1.99),
    NORI("Nori", 0.99);

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
