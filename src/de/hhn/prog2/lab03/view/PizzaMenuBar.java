package de.hhn.prog2.lab03.view;

import javax.swing.*;


public class PizzaMenuBar extends JMenuBar {

    private JMenu dataMenu;
    private JMenuItem quitMenu;

    public PizzaMenuBar() {
        initMenubar();
        quitFunction();
    }

    /**
     * Creates a menu bar with an item to close the program
     */
    private void initMenubar() {

        dataMenu = new JMenu("Datei");
        quitMenu = new JMenuItem("Schließen");

        this.add(dataMenu);
        dataMenu.add(quitMenu);
        this.add(dataMenu);
    }

    /**
     * Sets an ActionListener to add an exit functionality
     */
    private void quitFunction() {
        quitMenu.addActionListener(e -> System.exit(0));
    }
}