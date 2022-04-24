package de.hhn.prog2.lab03.view;

import javax.swing.*;


public class PizzaFrame extends JFrame {

    public PizzaFrame() {
        super("Papala Pub - Pizza Lieferservice");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PizzaConfigPanel pizzaConfigPanel = new PizzaConfigPanel();

        PizzaMenuBar menuBar = new PizzaMenuBar();
        this.setJMenuBar(menuBar.getJMenu());

        this.add(pizzaConfigPanel);
        pack();
    }
}
