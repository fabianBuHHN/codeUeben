package de.hhn.prog2.lab03.model;

public enum PizzaSize {

    SMALL (5), MEDIUM (6), LARGE (8), EXTRA_LARGE (11);


    private final int priceSize;

    PizzaSize(int priceSize) {
        this.priceSize = priceSize;
    }

    public int getPriceSize() {
        return priceSize;
    }
}
