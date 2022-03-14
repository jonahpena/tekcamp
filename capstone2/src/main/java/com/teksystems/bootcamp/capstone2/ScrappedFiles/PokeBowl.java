//package com.teksystems.bootcamp.capstone2.Items;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class PokeBowl {
//
//    private final String name = "Poke Bowl";
//    private final double basePrice = 12.99;
//    private final int maxFreeToppings = 5;
//    private final List<Topping> currentToppings = new ArrayList<>();
//
//    public PokeBowl() {
//        addTopping(Topping.FURIKAKE);
//        addTopping(Topping.GINGER);
//        addTopping(Topping.WASABI);
//        addTopping(Topping.MASAGO);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        double startingPrice = basePrice;
//        if (currentToppings.size() > maxFreeToppings) {
//            Collections.sort(currentToppings);
//            for(int i = maxFreeToppings; i < currentToppings.size(); i++) {
//                startingPrice += currentToppings.get(i).getCost();
//            }
//        }
//        return startingPrice;
//    }
//
//    public List<Topping> getCurrentToppings() {
//        return currentToppings;
//    }
//
//    public void addTopping(Topping topping) {
//        currentToppings.add(topping);
//    }
//
//}
//

//attribute abram / robin