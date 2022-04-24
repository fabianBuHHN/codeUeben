package de.hhn.prog2.lab03.model;

public enum PizzaSize {

    SMALL("Klein", 500), MEDIUM("Mittel", 600), LARGE("Groß", 800), EXTRA_LARGE("Extra Groß", 1100);


    private final String pizzaSizeString;
    private int priceSize;

    PizzaSize(String pizzaSizeString, int priceSize) {
        this.pizzaSizeString = pizzaSizeString;
        this.priceSize = priceSize;
    }

    public static PizzaSize fromString(String text) {
        for (PizzaSize p : PizzaSize.values()) {
            if (p.pizzaSizeString.equalsIgnoreCase(text)) {
                return p;
            }
        }
        return null;
    }

    public int getPriceSize() {
        return priceSize;
    }

    public String getPizzaSizeString() {
        return pizzaSizeString;
    }
}
