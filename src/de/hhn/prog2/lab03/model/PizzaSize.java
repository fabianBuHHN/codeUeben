package de.hhn.prog2.lab03.model;

public enum PizzaSize {

    SMALL (500), MEDIUM (600), LARGE (800), EXTRA_LARGE (1100);


    private final int priceSize;

    PizzaSize(int priceSize) {
        this.priceSize = priceSize;
    }

    public int getPriceSize() {
        return priceSize;
    }
}
