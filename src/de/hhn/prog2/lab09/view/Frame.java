package de.hhn.prog2.lab09.view;

import javax.swing.*;

public class Frame extends JFrame {

    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setSize(400,300);
        frame.setVisible(true);
    }

    private ConfigPanel panel;
    private MenuBar menuBar;

    public Frame(){
        super("lab09");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel = new ConfigPanel();

        menuBar = new MenuBar();
        this.setJMenuBar(menuBar);

        this.add(panel);
    }

    public ConfigPanel getPanel() {
        return panel;
    }
}
