package de.hhn.prog2.lab03.view;

import javax.swing.*;


public class PizzaMenuBar extends JMenuBar {

    private JMenu menu;
    private JMenuItem quit;

    public PizzaMenuBar() {
        initMenubar();
    }

    /**
     * Creates a menu bar
     */
    private void initMenubar(){

        menu = new JMenu("Datei");
        quit = new JMenuItem("Schließen");
        this.add(menu);
        menu.add(quit);
        this.add(menu);
    }
}