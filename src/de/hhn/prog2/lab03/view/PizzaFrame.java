package de.hhn.prog2.lab03.view;

import javax.swing.*;
import java.awt.*;


public class PizzaFrame extends JFrame {

    public PizzaFrame() {
        super("Papala Pub - Pizza Lieferservice");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(5,5);
        this.setLayout(grid);

        PizzaConfigPanel pizzaConfigPanel = new PizzaConfigPanel();
        PizzaMenuBar pizzaMenuBar = new PizzaMenuBar();
        this.add(pizzaConfigPanel);
    }
}
