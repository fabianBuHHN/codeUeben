package de.hhn.prog2.lab03.model;

public enum PizzaTopping {

    TOMATO("Tomaten"), CHEESE("Käse"), SALAMI("Salami"), HAM("Schinken"), ANANAS("Ananas"),
    VEGETABLES("Gemüse"), SEAFOOD("Meeresfrüchte"), NUTELLA("Nutella"), SOUR_CREAM("Sauerrahm");

    private final String topping;

    PizzaTopping(String toppingName){
        this.topping = toppingName;
    }

    public String getTopping() {
        return topping;
    }
}
