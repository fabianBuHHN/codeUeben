package de.hhn.prog2.lab03.view;

import javax.swing.*;


public class PizzaMenuBar extends JMenuBar {

    JMenuBar menuBar;
    JMenu data;

    public PizzaMenuBar() {

        menuBar = new JMenuBar();
        data = new JMenu("Datei");
        menuBar.add(data);
    }
}
