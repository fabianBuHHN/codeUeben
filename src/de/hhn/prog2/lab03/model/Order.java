package de.hhn.prog2.lab03.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private long orderId;
    private List<Pizza> pizzas;
    private double orderPrice;

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Order(){
        pizzas = new ArrayList<>();
    }

    /**
     * Adds a pizza object if there is one.
     *
     * @param pizza The Object which is to be added to the List<Pizza>
     */
    public void addPizza(Pizza pizza) {
        if (pizza != null) {
            pizzas.add(pizza);
        } else throw new IllegalArgumentException("No Pizza made yet");
    }

    /**
     * If there is a pizza list and @param pizza is found in this list, @param pizza will be removed from this list
     *
     * @param pizza The pizza object to be removed
     */
    public void removePizza(Pizza pizza) {
        if (pizzas != null && pizzas.contains(pizza)) {
            pizzas.remove(pizza);
        } else throw new IllegalArgumentException("No Pizza found");
    }

    /**
     * With a for-each loop is the price of the hole order calculated.
     *
     * @return Price of the hole order
     */
    public double getOrderPrice() {
        for (Pizza p : pizzas) {
            orderPrice += p.getPrice();
        }

        return orderPrice;
    }
}