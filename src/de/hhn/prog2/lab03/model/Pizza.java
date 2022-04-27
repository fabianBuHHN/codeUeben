package de.hhn.prog2.lab03.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private PizzaSize size;
    private List<PizzaTopping> pizzaToppings;

    public void setPizzaToppings(List<PizzaTopping> pizzaToppings) {
        this.pizzaToppings = pizzaToppings;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public Pizza() {
        pizzaToppings = new ArrayList<>();
    }

    /**
     * Calculates the price of one pizza based on size and toppings.
     */
    public double calcPrice() {
        if(size != null) {
            return (size.getPriceSize() + calcPriceToppings()) / 100;
        } else throw new IllegalArgumentException("No size selected");
    }

    /**
     * Calculates the price of the pizza toppings.
     *
     * @return Toppings price
     */
    private double calcPriceToppings() {
        return pizzaToppings.size() * 50;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price= " + calcPrice() +
                "size=" + size +
                ", pizzaToppings=" + pizzaToppings +
                '}';
    }
}
