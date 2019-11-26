package ui;

import model.race.Goblin;
import model.race.Goliath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RacesInitializer extends JFrame implements ActionListener {
    private JFrame frame = new JFrame("Races");
    private JPanel label = new JPanel();
    private Container box = new Container();
    private Font font = new Font("serif", Font.BOLD, 40);

    RacesInitializer() {
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
        addGoblinButton(box);
        addGoliathButton(box);
        addHumanButton(box);
    }

    private void addGoblinButton(Container box) {
        JButton goblin = new JButton("Goblin");
        goblin.setBackground(Color.red);
        goblin.setPreferredSize(new Dimension(300,100));
        goblin.setFont(font);
        goblin.addActionListener(this);
        goblin.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(goblin);
    }

    private void addGoliathButton(Container box) {
        JButton goliath = new JButton("Goliath");
        goliath.setBackground(Color.CYAN);
        goliath.setPreferredSize(new Dimension(300,100));
        goliath.setFont(font);
        goliath.addActionListener(this);
        goliath.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(goliath);
    }

    private void addHumanButton(Container box) {
        JButton human = new JButton("Human");
        human.setBackground(Color.PINK);
        human.setPreferredSize(new Dimension(300,100));
        human.setFont(font);
        human.addActionListener(this);
        human.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(human);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Goblin")) {
            goblinTraits();
        }
        if (command.equals("Goliath")) {
            goliathTraits();
        }
        if (command.equals("Human")) {
            humanTraits();
        }
    }

    private void humanTraits() {
        JOptionPane.showMessageDialog(this, "Under Development");
    }

    private void goliathTraits() {
        Goliath myGoliath = new Goliath("", "","", "", "", "","");
        JOptionPane.showMessageDialog(this, myGoliath.getRacialTraits());
    }

    private void goblinTraits() {
        Goblin myGoblin = new Goblin("","","","","","","");
        JOptionPane.showMessageDialog(this, myGoblin.getRacialTraits());
    }

    public static void main(String[] args) {
        new RacesInitializer();
    }
}
