package de.hhn.prog2.lab03.controller;

import de.hhn.prog2.lab03.model.Order;
import de.hhn.prog2.lab03.model.Pizza;
import de.hhn.prog2.lab03.view.PizzaConfigPanel;
import de.hhn.prog2.lab03.view.PizzaFrame;

public class Controller {

    private PizzaConfigPanel pizzaConfigPanel;
    private Pizza pizza;

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Order order = new Order();
        PizzaFrame frame = new PizzaFrame(pizza, order);
        frame.setSize(800, 600);

        PizzaConfigPanel configPanel = frame.getPizzaConfigPanel();
        Controller controller = new Controller(configPanel, pizza);
        controller.initFinishButton();
    }

    public Controller(PizzaConfigPanel configPanel, Pizza pizza) {
        this.pizzaConfigPanel = configPanel;
        this.pizza = pizza;
    }

    /**
     * Adds Action Listener to FinishButton, so that a pizza, with at least size selected, can be added to the order.
     * Also prints pizza attributes on the console.
     */
    public void initFinishButton() {
        pizzaConfigPanel.getFinishButton().addActionListener(e -> {
            pizza.setSize(pizzaConfigPanel.getPizzaSize());
            pizza.setPizzaToppings(pizzaConfigPanel.getPizzaToppings());
            System.out.println(pizza.toString());
        });
    }
}
