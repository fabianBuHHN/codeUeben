package de.hhn.prog2.lab03.view;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class PizzaConfigPanel extends JPanel {


    public PizzaConfigPanel() {

        //set checkboxes for toppings
        JCheckBox tomato = new JCheckBox("Tomaten");
        tomato.setMnemonic(KeyEvent.VK_C);
        this.add(tomato);

        JCheckBox cheese = new JCheckBox("Käse");
        cheese.setMnemonic(KeyEvent.VK_C);
        this.add(cheese);

        JCheckBox salami = new JCheckBox("Salami");
        salami.setMnemonic(KeyEvent.VK_C);
        this.add(salami);

        JCheckBox ham = new JCheckBox("Schinken");
        ham.setMnemonic(KeyEvent.VK_C);
        this.add(ham);

        JCheckBox ananas = new JCheckBox("Ananas");
        ananas.setMnemonic(KeyEvent.VK_C);
        this.add(ananas);

        JCheckBox vegetable = new JCheckBox("Gemüse");
        vegetable.setMnemonic(KeyEvent.VK_C);
        this.add(vegetable);

        JCheckBox seafood = new JCheckBox("Meeresfrüchte");
        seafood.setMnemonic(KeyEvent.VK_C);
        this.add(seafood);

        JCheckBox nutella = new JCheckBox("Nutella");
        nutella.setMnemonic(KeyEvent.VK_C);
        this.add(nutella);

        JCheckBox sourCream = new JCheckBox("Sauerrahm");
        sourCream.setMnemonic(KeyEvent.VK_C);
        this.add(sourCream);

        //set buttons
        JButton cancelButton = new JButton("Kauf abbrechen");
        this.add(cancelButton);

        JButton finishButton = new JButton("Kauf bestätigen");
        this.add(finishButton);
    }
}
