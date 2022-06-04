package de.hhn.prog2.lab09.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigPanel extends JPanel {

    private Locale defaultLocal, local;
    private Locale localDE = Locale.forLanguageTag("de_DE");
    private Locale localEN = Locale.forLanguageTag("en_EN");
    private String country, language;
    private ResourceBundle labels;

    private FlowLayout fLayout;
    private GridLayout gridLayout;
    private final String[] langs = {"de_DE", "en_EN"};
    private JComboBox<String> comboBox;
    private JPanel gridPanel, topPanel;

    public ConfigPanel() {
        initAll();
    }

    private void initAll() {
        initLayoutManager();
        initResBundle();
        createGLayoutStart();
        createFLayout();
        comboboxFunction();
    }

    private void initResBundle() {
        defaultLocal = Locale.getDefault();
        language = defaultLocal.getLanguage();
        country = defaultLocal.getCountry();
        local = new Locale(language, country);
        labels = ResourceBundle.getBundle("locale", local);
    }

    private void initLayoutManager() {
        fLayout = new FlowLayout();
        topPanel = new JPanel(fLayout);

        comboBox = new JComboBox<>(langs);

        gridLayout = new GridLayout(4, 2, 50, 10);
        gridPanel = new JPanel(gridLayout);
        gridLayout.preferredLayoutSize(gridPanel);

        this.setLayout(new BorderLayout());
        this.add(gridPanel, BorderLayout.PAGE_END);
        this.add(topPanel, BorderLayout.LINE_START);
    }

    private void createGLayoutStart() {
        JLabel nameText = new JLabel(labels.getString("name"));
        JLabel prenameText = new JLabel(labels.getString("prename"));
        JLabel birthdateText = new JLabel(labels.getString("birthdate"));
        JButton loadButton = new JButton(labels.getString("load"));

        JButton saveButton = new JButton(labels.getString("save"));
        JTextField lastname = new JTextField(1);
        JTextField prename = new JTextField(1);
        JTextField birthDate = new JTextField(1);

        gridPanel.add(nameText);
        gridPanel.add(lastname);
        gridPanel.add(prenameText);
        gridPanel.add(prename);
        gridPanel.add(birthdateText);
        gridPanel.add(birthDate);
        gridPanel.add(loadButton);
        gridPanel.add(saveButton);
    }

    private void createFLayout() {
        topPanel.add(comboBox);
    }

    private void comboboxFunction() {
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedItem().equals("de_DE")) {
                    labels = ResourceBundle.getBundle("locale", localDE);
                    System.out.println("Deutsch");
                } else {
                    labels = ResourceBundle.getBundle("locale", localEN);
                    System.out.println("Englisch");
                }
            }
        });
    }
}
