package de.hhn.prog2.lab03.view;

import javax.swing.*;
import java.awt.*;


public class PizzaFrame extends JFrame {

    public PizzaFrame() {
        super("Papala Pub - Pizza Lieferservice");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PizzaConfigPanel pizzaConfigPanel = new PizzaConfigPanel();
        this.add(pizzaConfigPanel);
        PizzaMenuBar menuBar = new PizzaMenuBar();
        setJMenuBar(menuBar);
        pack();
    }
}
