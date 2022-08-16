import javax.swing.*;
import java.awt.*;

public class OpenNewWindow {
    public static void main(String[] args) {
        openMainWindow();
    }

    private static void openMainWindow() {
        JButton button = new JButton("New Window");
        button.setFocusable(false);
        button.setBounds(110, 200, 250, 50);

        JFrame mainWindow = new JFrame("Main Window");
        mainWindow.add(button);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(500, 500);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);

        button.addActionListener(e -> {
            mainWindow.dispose();
            openNewWindow();
        });
    }

    private static void openNewWindow() {
        JLabel label = new JLabel("This is the New Window");
        JFrame newWindow = new JFrame("New Window");

        label.setFont(new Font("Arial", Font.BOLD, 25));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.blue);
        label.setBackground(Color.yellow);
        label.setOpaque(true);

        newWindow.add(label);
        newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newWindow.setSize(500, 500);
        newWindow.setVisible(true);
    }
}
