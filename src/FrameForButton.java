import javax.swing.*;
import java.awt.*;

public class FrameForButton extends JFrame {

    private JButton button;
    private JLabel label;

    FrameForButton() {
        ImageIcon icon = new ImageIcon("sample.png");
        ImageIcon icon2 = new ImageIcon("logo.jpeg");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(350, 250, 300, 300);
        label.setVisible(false);

        button = new JButton();
        button.setText("I'm a button");
        button.setIcon(icon);
        button.setFocusable(false);
        button.addActionListener( e -> System.out.println("poo"));
        button.setBounds(100, 100, 250, 220);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 15));
        button.setIconTextGap(15);
        button.setForeground(Color.blue);
        button.setOpaque(true);
        button.setBackground(Color.yellow);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(e-> {
//            System.out.println("poo");
//            button.setEnabled(false);
            label.setVisible(true);
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 600);
        this.add(button);
        this.add(label);
        this.setVisible(true);
    }
}
