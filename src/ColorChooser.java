import javax.swing.*;
import java.awt.*;

public class ColorChooser {
    public static void main(String[] args) {
        // JColorChooser = a GUI mechanism that let's a user choose a color

        JLabel label = new JLabel("This is some text");

        label.setFont(new Font("Cooper Black", Font.PLAIN, 100));
        label.setBackground(Color.white);
        label.setOpaque(true);

        JButton button = new JButton("Pick a Color");
        button.addActionListener(l -> {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
            // label.setBackground(color);
            label.setForeground(color);
        });

        JFrame frame = new JFrame("JColorChooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
