package de.hhn.prog2.lab03.view;

import javax.swing.*;


public class PizzaMenuBar extends JMenuBar {

    private JMenu dataMenu;
    private JMenuItem quitMenu, orderMenu, saveMenu, readMenu;

    public PizzaMenuBar() {
        initMenubar();
    }

    public JMenuItem getSaveMenu() {
        return saveMenu;
    }

    public JMenuItem getQuitMenu() {
        return quitMenu;
    }

    /**
     * Creates a menu bar with an item to close the program
     */
    private void initMenubar() {

        dataMenu = new JMenu("Datei");
        orderMenu = new JMenu("Bestellung");
        saveMenu = new JMenuItem("Bestellung speichern");
        readMenu = new JMenuItem("Bestellung aufrufen");
        quitMenu = new JMenuItem("Schließen");


        this.add(dataMenu);
        dataMenu.add(orderMenu);
        dataMenu.add(quitMenu);
        orderMenu.add(saveMenu);
        orderMenu.add(readMenu);
        this.add(dataMenu);

    }

    /**
     * Sets an ActionListener to add a quit functionality.
     */
    private void quitFunction() {
        quitMenu.addActionListener(e -> System.exit(0));
    }

    /**
     * Saves order in CSV file.
     */
    private void saveMenuSelected() {
    }
    /**
     * Reads an order from CSV file.
     */
    private void readFunction() {
    }
}