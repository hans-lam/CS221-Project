package ui;

import model.dice.DiceRoller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JFrame frame = new JFrame("Main Menu");
    private JPanel panel = new JPanel();
    private JPanel label = new JPanel();
    private Font font = new Font("serif", Font.BOLD, 40);

    public Main() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,800);
        frame.setBackground(Color.CYAN);

        buttons();
        labels();
        layoutWorker();
    }

    public void buttons() {
        JButton diceRoller = new JButton("Dice Roller");
        diceRoller.setBackground(Color.red);
        diceRoller.setPreferredSize(new Dimension(300,100));
        diceRoller.setFont(font);
        diceRoller.addActionListener(this);
        panel.add(diceRoller);
    }

    public void labels() {
        JLabel mainMenu = new JLabel("Main Menu: ");
        mainMenu.setFont(font);
        label.add(mainMenu);
    }

    public void layoutWorker() {
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Dice Roller")) {
            diceRoll();
        }
    }

    public void diceRoll() {
        DiceRoller d20 = new DiceRoller(6, 8);
        JOptionPane.showMessageDialog(this, d20.diceRoll());
    }
}
