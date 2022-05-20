package de.hhn.prog2.lab03.view;

import de.hhn.prog2.lab03.model.Order;
import de.hhn.prog2.lab03.model.Pizza;
import de.hhn.prog2.lab03.model.PizzaSize;
import de.hhn.prog2.lab03.model.PizzaTopping;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class PizzaConfigPanel extends JPanel {

    private JButton testButton = new JButton("Test");

    private Pizza pizza;
    // Set Buttons
    private JButton quitButton = new JButton("Beenden");
    private JButton finishButton = new JButton("Fertig");
    // Set labeling radiobuttons
    private JLabel sizeLabel = new JLabel("Größe: ");
    private JLabel toppingLabel = new JLabel("Belag: ");
    private JPanel sizePanel, buttonPanel;
    private BorderLayout borderLayout;

    private ButtonGroup buttonGroup;
    private JPanel checkBoxPanel;
    private List<JCheckBox> checkBoxes;

    public List<JCheckBox> getCheckBoxes() {
        return checkBoxes;
    }

    public ButtonGroup getButtonGroup() {
        return buttonGroup;
    }

    public JButton getFinishButton() {
        return finishButton;
    }

    public JButton getQuitButton() {
        return quitButton;
    }

    public JButton getTestButton(){
        return testButton;
    }

    public PizzaConfigPanel(Pizza pizza, Order order) {

        checkBoxes = new ArrayList<>();
        buttonPanel = new JPanel(new FlowLayout());
        checkBoxPanel = new JPanel();
        buttonGroup = new ButtonGroup();
        sizePanel = new JPanel();
        borderLayout = new BorderLayout();

        // Set layout manager for PizzaConfigPanel
        this.setLayout(borderLayout);

        // add button group to button panel
        buttonPanel.add(finishButton);
        buttonPanel.add(quitButton);
        buttonPanel.add(testButton);

        // Add button panel to JPanel
        this.add(buttonPanel, BorderLayout.PAGE_END);

        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));

        checkBoxPanel.add(toppingLabel);

        // Add checkbox panel to Borderlayout Manager
        this.add(checkBoxPanel, BorderLayout.LINE_START);

        sizePanel.setLayout(new BoxLayout(sizePanel, BoxLayout.Y_AXIS));

        //add label to size selection
        sizePanel.add(sizeLabel);

        //adds checkboxes of toppings to layout
        for (PizzaTopping pt : PizzaTopping.values()) {
            JCheckBox toppingCheckBox = new JCheckBox(pt.getToppings());
            toppingCheckBox.setActionCommand(pt.getToppings());
            checkBoxPanel.add(toppingCheckBox);
            checkBoxes.add(toppingCheckBox);
        }

        //adds size selection button to layout
        for (PizzaSize p : PizzaSize.values()) {
            JRadioButton sizeRadioButton = new JRadioButton(p.getPizzaSizeString());
            sizeRadioButton.setActionCommand(p.getPizzaSizeString());
            sizePanel.add(sizeRadioButton);
            buttonGroup.add(sizeRadioButton);
        }

        // Add Button Panel to Borderlayout manager
        this.add(sizePanel, BorderLayout.LINE_END);
    }
}
