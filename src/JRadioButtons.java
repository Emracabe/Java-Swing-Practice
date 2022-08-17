import javax.swing.*;
import java.awt.*;

public class JRadioButtons {
    public static void main(String[] args) {

//        JRadioButton = One or more buttons in a grouping in which only 1 may be selected per group

        // Creating the icons for every radiobutton
        ImageIcon pizzaIcon = new ImageIcon("pizza.png");
        ImageIcon hamburgerIcon = new ImageIcon("hamburger.png");
        ImageIcon hotdogIcon = new ImageIcon("hotdog.png");

        // Creating the buttons
        JRadioButton pizzaButton = new JRadioButton("pizza");
        JRadioButton hamburgerButton = new JRadioButton("hamburger");
        JRadioButton hotdogButton = new JRadioButton("hot");

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        pizzaButton.addActionListener(e -> {
            System.out.println("You ordered pizza!");
        });

        hamburgerButton.addActionListener(e -> {
            System.out.println("You ordered hamburger!");
        });

        hotdogButton.addActionListener(e -> {
            System.out.println("You order hotdog!");
        });

        JFrame frame = new JFrame("JRadioButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // ButtonGroup allows the radio buttons to be selected only one at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotdogButton);

        frame.add(pizzaButton);
        frame.add(hamburgerButton);
        frame.add(hotdogButton);

        frame.pack();
        frame.setVisible(true);
    }
}
