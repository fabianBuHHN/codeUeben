package de.hhn.prog2.lab03.controller;

import de.hhn.prog2.lab03.io.DataStorage;
import de.hhn.prog2.lab03.model.Order;
import de.hhn.prog2.lab03.model.Pizza;
import de.hhn.prog2.lab03.model.PizzaSize;
import de.hhn.prog2.lab03.model.PizzaTopping;
import de.hhn.prog2.lab03.view.PizzaConfigPanel;
import de.hhn.prog2.lab03.view.PizzaFrame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Order order = new Order();
        PizzaFrame frame = new PizzaFrame(pizza, order);
        PizzaConfigPanel configPanel = frame.getPizzaConfigPanel();

        new Controller(configPanel, pizza, frame);
        frame.setSize(800, 600);
    }

    private PizzaConfigPanel pizzaConfigPanel;
    private Pizza pizza;
    private DataStorage data;
    private JFrame frame;

    public Controller(PizzaConfigPanel configPanel, Pizza pizza, JFrame frame) {
        data = new DataStorage();
        this.pizzaConfigPanel = configPanel;
        this.pizza = pizza;
        this.frame = frame;

        initFinishButton();
        initQuitButton();
        initSaveMenu();
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
            pizzaConfigPanel.getOrder().addPizza(pizza);
            data.writeOrderCSV(pizzaConfigPanel.getOrder());
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
     * Gathers toppings selection and size selection to return both back to Pizza class
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

    private void initSaveMenu(){
    }
}
