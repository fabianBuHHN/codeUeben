package de.hhn.prog2.lab03.view;

import javax.swing.*;
import java.awt.*;


public class PizzaConfigPanel extends JPanel {

    // Set pizza toppings
    private JCheckBox tomato = new JCheckBox("Tomaten");
    private JCheckBox cheese = new JCheckBox("Käse");
    private JCheckBox salami = new JCheckBox("Salami");
    private JCheckBox ham = new JCheckBox("Schinken");
    private JCheckBox ananas = new JCheckBox("Ananas");
    private JCheckBox vegetable = new JCheckBox("Gemüse");
    private JCheckBox seafood = new JCheckBox("Meeresfrüchte");
    private JCheckBox nutella = new JCheckBox("Nutella");
    private JCheckBox sourCream = new JCheckBox("Sauerrahm");
    // Set Buttons
    private JButton addButton = new JButton("Zu Warenkorb hinzufügen");
    private JButton exitButton = new JButton("Kauf abbrechen");
    private JButton priceButton = new JButton("Preis der Bestellung");
    // Set Strings for size label
    private String smallString = "Klein";
    private String mediumString = "Mittel";
    private String largeString = "Groß";
    private String extra_largeString = "Extra Groß";
    // Set labeling
    private JLabel sizeLabel = new JLabel("Größe: ");
    private JLabel toppingLabel = new JLabel("Belag: ");
    //   private ImageIcon pizzaImage = new ImageIcon("C:\\Users\\fabi2\\Desktop\\prog2-aib-fabutter\\pizzaIcon.png");


    public PizzaConfigPanel() {
        // Set layout manager for PizzaConfigPanel
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
/*
        JLabel imageLabel = new JLabel(pizzaImage);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
        this.add(imageLabel);*/

        // set new Flow Layout Manager
        JPanel buttonPanel = new JPanel(new FlowLayout());
        // add Buttons in flow layout
        buttonPanel.add(exitButton);
        buttonPanel.add(addButton);
        buttonPanel.add(priceButton);
        // Add button panel to JPanel
        this.add(buttonPanel, BorderLayout.PAGE_END);

        // initialize new Panel for Checkboxes
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));

        // add checkboxes to Boxlayout
        checkBoxPanel.add(toppingLabel);
        checkBoxPanel.add(tomato);
        checkBoxPanel.add(cheese);
        checkBoxPanel.add(salami);
        checkBoxPanel.add(ham);
        checkBoxPanel.add(ananas);
        checkBoxPanel.add(vegetable);
        checkBoxPanel.add(seafood);
        checkBoxPanel.add(nutella);
        checkBoxPanel.add(sourCream);

        // Add checkbox panel to Borderlayout Manager
        this.add(checkBoxPanel, BorderLayout.LINE_START);

        //initialize new Panel for size selection
        JPanel sizePanel = new JPanel();
        sizePanel.setLayout(new BoxLayout(sizePanel, BoxLayout.Y_AXIS));
        //add label to size selection
        sizePanel.add(sizeLabel);

        // set radio button for size selection
        JRadioButton smallSizeRadioButton = new JRadioButton(smallString);
        JRadioButton mediumSizeRadioButton = new JRadioButton(mediumString);
        JRadioButton largeSizeRadioButton = new JRadioButton(largeString);
        JRadioButton extra_largeSizeRadioButton = new JRadioButton(extra_largeString);

        // add buttons to sizePanel and set label
        smallSizeRadioButton.setActionCommand(smallString);
        sizePanel.add(smallSizeRadioButton);

        mediumSizeRadioButton.setActionCommand(mediumString);
        sizePanel.add(mediumSizeRadioButton);

        largeSizeRadioButton.setActionCommand(largeString);
        sizePanel.add(largeSizeRadioButton);

        extra_largeSizeRadioButton.setActionCommand(extra_largeString);
        sizePanel.add(extra_largeSizeRadioButton);

        // Add Button Panel to Borderlayout manager
        this.add(sizePanel, BorderLayout.LINE_END);
    }
}