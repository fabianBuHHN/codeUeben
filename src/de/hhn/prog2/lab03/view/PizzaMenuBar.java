package de.hhn.prog2.lab03.view;

import javax.swing.*;


public class PizzaMenuBar extends JMenuBar {

    private JMenu menu;
    private JMenuBar menubar;
    private JMenuItem quit;

    public PizzaMenuBar() {
    }

    public JMenuBar getJMenu(){
        // create a menubar
        menubar = new JMenuBar();

        // create a menu
        menu = new JMenu("Datei");

        menubar.add(menu);

        // create menuitems
        quit = new JMenuItem("Schließen");


        // add menu items to menu
        menu.add(quit);

        // add menu to menu bar
        menubar.add(menu);

        return menubar;
    }
}