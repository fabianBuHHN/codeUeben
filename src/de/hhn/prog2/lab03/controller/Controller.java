package de.hhn.prog2.lab03.controller;

import de.hhn.prog2.lab03.io.DataStorage;
import de.hhn.prog2.lab03.model.Order;
import de.hhn.prog2.lab03.model.Pizza;
import de.hhn.prog2.lab03.model.PizzaSize;
import de.hhn.prog2.lab03.model.PizzaTopping;
import de.hhn.prog2.lab03.view.PizzaConfigPanel;
import de.hhn.prog2.lab03.view.PizzaFrame;
import de.hhn.prog2.lab03.view.PizzaMenuBar;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Order order = new Order();
        PizzaFrame pizzaFrame = new PizzaFrame(pizza, order);

        pizzaFrame.setSize(800, 600);

        new Controller(pizza, pizzaFrame);
    }


    private PizzaConfigPanel pizzaConfigPanel;
    private Pizza pizza;
    private DataStorage data;
    private PizzaFrame frame;
    private Order order;
    private PizzaMenuBar menuBar;


    public Controller(Pizza pizza, PizzaFrame frame) {
        order = new Order();
        data = new DataStorage();

        this.pizzaConfigPanel = frame.getPizzaConfigPanel();
        this.pizza = pizza;
        this.frame = frame;

        menuBar = (PizzaMenuBar) frame.getJMenuBar();

        initFinishButton();
        initQuitButton();
        initQuitMenu();
        initSaveMenu();
        initReadMenu();
    }


    /**
     * Adds Action Listener to FinishButton, so that a pizza, with at least size selected, can be added to the order.
     * Also prints pizza attributes on the console.
     */
    public void initFinishButton() {
        pizzaConfigPanel.getFinishButton().addActionListener(e -> {
            finishButtonSelected();
            System.out.println(pizza.toString());
        });
    }

    /**
     * Configures dialog for finish button
     */
    private void finishButtonSelected() {
        addToOrder();
        int n = JOptionPane.showConfirmDialog(
                pizzaConfigPanel,
                "Die Pizza für den Preis von " + pizza.calcPrice() + " hinzufügen?",
                "Pizza zur Bestellung hinzufügen?",
                JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.YES_OPTION) {
            order.addPizza(pizza);
            data.writeOrderCSV(order.getOrder());
        }
    }

    public void initQuitButton() {
        pizzaConfigPanel.getQuitButton().addActionListener(e -> quitButtonSelected());
    }

    /**
     * Configs dialog for quit button
     */
    private void quitButtonSelected() {
        Object[] options = {"Ja!",
                "Nein!"};
        int n = JOptionPane.showOptionDialog(
                pizzaConfigPanel,
                "Wirklich Beenden?",
                "Beenden",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        System.out.println("Selected option:" + n);

        if (n == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    /**
     * Gathers toppings selection and size selection to return both back to Pizza class.
     * <p>
     * Iterates over with for-each loop over all checkboxes. Saves the selection in
     * newly initialized ArrayList "result".
     */
    private void addToOrder() {
        //init ArrayList to save selected toppings
        List<PizzaTopping> result = new ArrayList<>();


        try {
            if (pizzaConfigPanel.getButtonGroup().getSelection() != null)
                pizza.setSize(PizzaSize.fromString(pizzaConfigPanel.getButtonGroup().getSelection().getActionCommand()));
            else {
                JOptionPane noSizePane = new JOptionPane("Wähle eine Pizzagröße", JOptionPane.WARNING_MESSAGE, JOptionPane.DEFAULT_OPTION);
                noSizePane.createDialog(null, "Fehler").setVisible(true);
            }

        } catch (IllegalArgumentException noSize) {
            System.err.println("No Size selection made");
        }

        boolean toppingChossen = false;

        //get topping selection
        for (JCheckBox pt : pizzaConfigPanel.getCheckBoxes()) {
            if (pt.isSelected()) {
                if (!pt.isSelected()) {
                    JOptionPane noToppingPane = new JOptionPane("Wähle Toppings", JOptionPane.WARNING_MESSAGE, JOptionPane.DEFAULT_OPTION);
                    noToppingPane.createDialog(null, "Fehler").setVisible(true);
                } else result.add(PizzaTopping.fromString(pt.getActionCommand()));
            }
        }
        pizza.setPizzaToppings(result);
    }

    private void initSaveMenu() {
        try {
            menuBar.getSaveMenu().addActionListener(e -> {
                        addToOrder();
                        order.addPizza(pizza);
                        data.writeOrderCSV(order.getOrder());
                    }
            );
        } catch (NullPointerException npex) {
            JOptionPane saveMenuPane = new JOptionPane("Fehler beim speichern", JOptionPane.WARNING_MESSAGE, JOptionPane.DEFAULT_OPTION);
            saveMenuPane.createDialog(null, "Fehler").setVisible(true);
        }
    }

    /**
     * Displays all orders in a dialog.
     */
    private void initReadMenu() {
        menuBar.getReadMenu().addActionListener(e -> {
            try {
                data.readOrderCSV();
            } catch (IOException ex) {
                ex.printStackTrace();
                System.err.println("problem reading file");
            }
        });
    }

    private void initQuitMenu() {
        menuBar.getQuitMenu().addActionListener(e -> System.exit(0));
    }
}
