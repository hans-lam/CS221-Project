package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

public class WebsitePrinter extends JFrame implements ActionListener {
    private JFrame frame = new JFrame("Website Printer");
    private JPanel label = new JPanel();
    private ImageIcon imageIcon;
    private JLabel picture = new JLabel();
    private JLabel instructions = new JLabel();
    private JTextField field;
    private JLabel browse = new JLabel();
    private Container box = new Container();
    private Container box2 = new Container();
    private Font font = new Font("serif", Font.BOLD, 40);
    private Font font2 = new Font("serif", Font.ITALIC, 15);

    WebsitePrinter() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,500);
        frame.setBackground(Color.CYAN);

        labels();
        layoutWorker();
    }

    private void setField(Container box) {
        field = new JTextField(69);
        box.add(field);
    }

    private void setImageIcon(Container box) {
        imageIcon = new ImageIcon(getClass().getResource("dnd_Icon.png"));
        Image image = imageIcon.getImage();
        Image transformedImage = image.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(transformedImage);

        picture = new JLabel(imageIcon);

        picture.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(picture);
    }

    private void setBrowseLabel(Container box) {
        browse = new JLabel("or you can just browse any website down here:");
        browse.setAlignmentX(Component.CENTER_ALIGNMENT);
        browse.setFont(font2);
        box.add(browse);
    }

    private void setLabel(Container box) {
        instructions = new JLabel("Enter URL here: ");
        box.add(instructions);
    }

    private void buttonWebsite(Container box) {
        JButton websiteViewer = new JButton("D&D Website");
        websiteViewer.setBackground(Color.GREEN);
        websiteViewer.setPreferredSize(new Dimension(300, 100));
        websiteViewer.setFont(font);
        websiteViewer.addActionListener(this);
        websiteViewer.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(websiteViewer);
    }

    private void buttonEnter(Container box) {
        JButton enter = new JButton("Enter");
        enter.setBackground(Color.pink);
        enter.addActionListener(this);
        enter.setAlignmentX(Component.CENTER_ALIGNMENT);
        box.add(enter);
    }

    private void labels() {
        JLabel websitePrinter = new JLabel("Website Printer: ");
        websitePrinter.setFont(font);
        label.add(websitePrinter);
    }

    private void layoutWorker() {
        frame.getContentPane().add(BorderLayout.PAGE_START, label);
        frame.getContentPane().add(BorderLayout.CENTER, box2);
        frame.getContentPane().add(BorderLayout.PAGE_END, box);
        addComponentsToPaneX(box);
        addComponentsToPaneY(box2);
        frame.setVisible(true);
    }

    private void addComponentsToPaneY(Container box2) {
        box2.setLayout(new BoxLayout(box2, BoxLayout.Y_AXIS));

        setImageIcon(box2);
        buttonWebsite(box2);
        setBrowseLabel(box2);
    }

    private void addComponentsToPaneX(Container box) {
        box.setLayout(new BoxLayout(box, BoxLayout.X_AXIS));

        setLabel(box);
        setField(box);
        buttonEnter(box);
    }

    // EFFECTS: calls a certain method based on an action event
    @Override
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand();

        if (command.equals("D&D Website")) {
            try {
                dndWebsite();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (command.equals("Enter")) {
            try {
                websitePrint();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void websitePrint() throws IOException {
        java.awt.Desktop.getDesktop().browse(URI.create(field.getText()));
    }

    private void dndWebsite() throws IOException {
        java.awt.Desktop.getDesktop().browse(URI.create("https://dnd.wizards.com/"));
    }

    public static void main(String[] args) {
        new WebsitePrinter();
    }
}
