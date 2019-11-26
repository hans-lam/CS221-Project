package ui;

import model.dice.DiceRoller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JFrame frame = new JFrame("Main Menu");
    private JPanel label = new JPanel();
    private Container box = new Container();
    private Font font = new Font("serif", Font.BOLD, 40);

    private Main() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,600);
        frame.setBackground(Color.CYAN);

        labels();
        layoutWorker();
    }

    private void labels() {
        JLabel mainMenu = new JLabel("Main Menu: ");
        mainMenu.setFont(font);
        label.add(mainMenu);
    }

    private void layoutWorker() {
        frame.getContentPane().add(BorderLayout.PAGE_START, label);
        frame.getContentPane().add(BorderLayout.CENTER, box);
        addComponentsToPane(box);
        frame.setVisible(true);
    }

    private void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        addDiceButton(pane);
        addClassesButton(pane);
        addWebsiteButton(pane);
        addHashMapButton(pane);
        addRacesButton(pane);
    }

    private void addDiceButton(Container container) {
        JButton diceRoller = new JButton("Dice Roller");
        diceRoller.setBackground(Color.red);
        diceRoller.setPreferredSize(new Dimension(300,100));
        diceRoller.setFont(font);
        diceRoller.addActionListener(this);
        diceRoller.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(diceRoller);
    }

    private void addClassesButton(Container container) {
        JButton classes = new JButton("Classes");
        classes.setBackground(Color.CYAN);
        classes.setPreferredSize(new Dimension(300, 100));
        classes.setFont(font);
        classes.addActionListener(this);
        classes.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(classes);
    }

    private void addWebsiteButton(Container container) {
        JButton website = new JButton("Website");
        website.setBackground(Color.GREEN);
        website.setPreferredSize(new Dimension(300, 100));
        website.setFont(font);
        website.addActionListener(this);
        website.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(website);
    }

    private void addHashMapButton(Container container) {
        JButton spells = new JButton("Spells?");
        spells.setBackground(Color.yellow);
        spells.setPreferredSize(new Dimension(300, 100));
        spells.setFont(font);
        spells.addActionListener(this);
        spells.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(spells);
    }

    private void addRacesButton(Container container) {
        JButton races = new JButton("Races");
        races.setBackground(Color.pink);
        races.setPreferredSize(new Dimension(300, 100));
        races.setFont(font);
        races.addActionListener(this);
        races.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(races);
    }

    // EFFECTS: calls a certain method based on an action event
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        buttonPressStrings(command);
        buttonPressWebsite(command);
    }

    private void buttonPressStrings(String command) {
        if (command.equals("Dice Roller")) {
            diceRoll();
        }
        if (command.equals("Classes")) {
            classesPrinter();
        }
        if (command.equals("Spells?")) {
            notYetImplemented();
        }
        if (command.equals("Races")) {
            races();
        }
    }

    private void buttonPressWebsite(String command) {
        if (command.equals("Website")) {
            printWebsite();
        }
    }

    private void races() {
        new RacesInitializer();
    }

    private void diceRoll() {
        DiceRoller d20 = new DiceRoller(6, 8);
        JOptionPane.showMessageDialog(this, d20.diceRoll());
    }

    private void classesPrinter() {
        new PrintClassInfo();
    }

    private void printWebsite() {
        new WebsitePrinter();
    }

    private void notYetImplemented() {
        JOptionPane.showMessageDialog(this, "Under Development");
        new HashMap();
    }

    public static void main(String[] args) {
        new Main();
    }
}
