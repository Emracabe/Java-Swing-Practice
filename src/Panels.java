import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("./assets/public/like.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 150, 150);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0, 250, 500, 250);
        yellowPanel.setLayout(null);
        yellowPanel.add(label); // Yellow panel adds a label component

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);

        // Adding the panels
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(yellowPanel);

        frame.setVisible(true);
    }
}
