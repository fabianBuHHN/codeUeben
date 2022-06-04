package de.hhn.prog2.lab09.view;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    private JMenu dataMenu;
    private JMenuItem quitMenu;

    public JMenu getDataMenu() {
        return dataMenu;
    }

    public JMenuItem getQuitMenu() {
        return quitMenu;
    }

    public MenuBar(){
        initMenuBar();
    }

    /**
     * Creates a menuBar with one item to close the program.
     */
    private void initMenuBar() {
        dataMenu = new JMenu("Datei");
        quitMenu = new JMenuItem("Beenden");

        this.add(dataMenu);
        dataMenu.add(quitMenu);
    }

}
