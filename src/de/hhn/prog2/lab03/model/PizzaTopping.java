package de.hhn.prog2.lab03.model;

import java.util.ArrayList;

public enum PizzaTopping {

    TOMATO("Tomaten"), CHEESE("Käse"), SALAMI("Salami"), HAM("Schinken"), ANANAS("Ananas"),
    VEGETABLES("Gemüse"), SEAFOOD("Meeresfrüchte"), NUTELLA("Nutella"), SOUR_CREAM("Sauerrahm");

    private final String topping;
    private ArrayList<PizzaTopping> toppingArr;

    PizzaTopping(String toppingName) {
        toppingArr = new ArrayList<>();
        this.topping = toppingName;
    }

    public String getToppings() {
        return topping;
    }
}
