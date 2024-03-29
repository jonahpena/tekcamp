package com.teksystems.bootcamp.capstone2.Menu;

public enum MenuAddOns {
    //    //Entree
    ALOHA("Aloha ----------- $12.99   |", 12.99),
    ONO("Ono ------------- $12.99   |", 12.99),
    OHANA("Ohana  ---------- $12.99   |", 12.99),
    MAHALO("Mahalo  --------- $12.99   |", 12.99),

    //Toppings
    FURIKAKE("Furikake  ------- $0.20    |", .20),
    MASAGO("Masago  --------- $0.20    |", .20),
    GINGER("Ginger ---------- $0.20    |", .20),
    WASABI("Wasabi ---------- $0.20    |", .20),

    //Drinks
    SPRITE("Sprite ---------- $1.99    |", 1.99),
    COKE("Coke ------------ $1.99    |", 1.99),
    ROOTBEER("Root-Beer ------- $1.99    |", 1.99),
    WATER("Water ----------- $0.00    |", 0.00),

    //Sides
    EDAMAME("Edamame --------- $2.99    |", 2.99),
    CRABBALL("Crab Ball ------- $2.99    |", 2.99),
    SPAMMUSUBI("Spam Musubi ----- $2.99    |", 2.99),
    NORI("Nori ------------ $2.99    |", 2.99),

    //Combo Meal
    ALOHACOMBO("Aloha Combo", 9.99),
    ONOCOMBO("Ono Combo", 9.99),
    OHANACOMBO("Ohana Combo", 9.99),
    MAHALOCOMBO("Mahalo Combo", 9.99);

    private double cost;
    private String name;

    private MenuAddOns(String name, double cost) {
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
