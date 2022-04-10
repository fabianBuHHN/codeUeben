package de.hhn.prog2.lab03.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private double price;
    private PizzaSize size;
    private List<PizzaTopping> pizzaToppings;

    public void setPizzaToppings(List<PizzaTopping> pizzaToppings) {
        this.pizzaToppings = pizzaToppings;
    }

    public double getPrice() {
        return price;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public List<PizzaTopping> getPizzaToppings() {
        return pizzaToppings;
    }



    public Pizza() {
        pizzaToppings = new ArrayList<>();
    }

    /**
     * Calculates the price of one pizza based on size and toppings.
     * Uses methods size.getPriceSize() and calcPriceToppings().
     *
     * @return Pizza price
     */
    public double calcPrice() {

        return  size.getPriceSize() + calcPriceToppings();
    }


    /**
     * Calculates the price of the pizza toppings.
     *
     * @return Toppings price
     */
    private double calcPriceToppings() {
        return pizzaToppings.size() * 0.5;
    }

    /**
     * Adds a topping to List pizzaToppings.
     *
     * @param topping Pizzatopping from ENUM PizzaTopping.
     */
    public void addPizzaToppings(PizzaTopping topping) {
        try {
            pizzaToppings.add(topping);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println("Topping not found");
        }
    }
}
