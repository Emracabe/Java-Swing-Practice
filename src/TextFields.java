import javax.swing.*;
import java.awt.*;

public class TextFields {
    public static void main(String[] args) {
        // JTextField = a GUI textbox component that can be used to add, set, or get text

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 25));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username");
//        textField.setEditable(false);

        JButton button = new JButton("Submit");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(button);
        frame.pack();
        button.addActionListener(e -> {
            frame.dispose();
            openNewWindow(textField.getText());
        });
        frame.setVisible(true);
    }

    private static void openNewWindow(String newText) {
        JLabel label = new JLabel(newText);
        label.setFont(new Font("Consolas", Font.BOLD, 35));
        label.setForeground(Color.red);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
