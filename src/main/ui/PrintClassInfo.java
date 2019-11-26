package ui;

import model.classes.Barbarian;
import model.classes.Bard;
import model.classes.Cleric;
import model.classes.Monk;
import model.dice.DiceRoller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintClassInfo extends JFrame implements ActionListener {
    private JFrame frame = new JFrame("Classes");
    private Container box = new Container();
    private JPanel label = new JPanel();
    private Font font = new Font("serif", Font.BOLD, 40);

    PrintClassInfo() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        labels();
        layoutWorker();
    }

    private void labels() {
        JLabel mainMenu = new JLabel("Classes: ");
        mainMenu.setFont(font);
        label.add(mainMenu);
    }

    private void layoutWorker() {
        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, box);
        addComponentsToPane(box);
        frame.setVisible(true);
    }

    private void addComponentsToPane(Container box) {
        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
        addBardButton(box);
        addClericButton(box);
        addBarbarianButton(box);
        addMonkButton(box);
    }

    private void addBardButton(Container container) {
        JButton bard = new JButton("Bard");
        bard.setBackground(Color.red);
        bard.setPreferredSize(new Dimension(300,100));
        bard.setFont(font);
        bard.addActionListener(this);
        bard.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(bard);
    }

    private void addClericButton(Container container) {
        JButton cleric = new JButton("Cleric");
        cleric.setBackground(Color.CYAN);
        cleric.setPreferredSize(new Dimension(300, 100));
        cleric.setFont(font);
        cleric.addActionListener(this);
        cleric.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(cleric);
    }

    private void addBarbarianButton(Container c) {
        JButton barb = new JButton("Barbarian");
        barb.setBackground(Color.PINK);
        barb.setPreferredSize(new Dimension(300, 100));
        barb.setFont(font);
        barb.addActionListener(this);
        barb.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(barb);
    }

    private void addMonkButton(Container c) {
        JButton monk = new JButton("Monk");
        monk.setBackground(Color.GREEN);
        monk.setPreferredSize(new Dimension(300, 100));
        monk.setFont(font);
        monk.addActionListener(this);
        monk.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(monk);
    }

    // EFFECTS: calls a certain method based on an action event
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Bard")) {
            bardTraits();
        }
        if (command.equals("Cleric")) {
            clericTraits();
        }
        if (command.equals("Barbarian")) {
            barbarianTraits();
        }
        if (command.equals("Monk")) {
            monkTraits();
        }
    }

    private void monkTraits() {
        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        JOptionPane.showMessageDialog(this, myMonk.print());
    }

    private void barbarianTraits() {
        Barbarian myBarbarian = new Barbarian();
        myBarbarian.getClassInfo();
        JOptionPane.showMessageDialog(this, myBarbarian.print());
    }

    private void bardTraits() {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        JOptionPane.showMessageDialog(this, myBard.print());
    }

    private void clericTraits() {
        Cleric myCleric = new Cleric();
        myCleric.getClassInfo();
        JOptionPane.showMessageDialog(this, myCleric.print());
    }

    public static void main(String[] args) {
        new PrintClassInfo();
    }
}
