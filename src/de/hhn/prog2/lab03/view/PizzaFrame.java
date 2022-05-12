package de.hhn.prog2.lab03.view;

import de.hhn.prog2.lab03.model.Order;
import de.hhn.prog2.lab03.model.Pizza;

import javax.swing.*;


public class PizzaFrame extends JFrame {

    private PizzaConfigPanel pizzaConfigPanel;
    private PizzaMenuBar menuBar;


    public PizzaFrame(Pizza pizza, Order order) {
        super("Papala Pub - Pizza Lieferservice");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pizzaConfigPanel = new PizzaConfigPanel(pizza, order);

        menuBar = new PizzaMenuBar();
        this.setJMenuBar(menuBar);

        this.add(pizzaConfigPanel);
        this.setVisible(true);
        pack();
    }

    public PizzaConfigPanel getPizzaConfigPanel() {
        return pizzaConfigPanel;
    }
}
