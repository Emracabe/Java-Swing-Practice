import javax.swing.*;
import java.awt.event.KeyEvent;

public class KeyListeners {
    public static void main(String[] args) {

        ImageIcon labelIcon = new ImageIcon("./assets/public/load.png");
        JLabel label = new JLabel();
        label.setIcon(labelIcon);
        label.setBounds(0, 0, 100, 100);
        label.setOpaque(true);

        JFrame frame = new JFrame("KeyListener");
        frame.add(label);

        frame.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //keyTyped = invoked when a key is typed. Uses KeyChar, char output
                switch (e.getKeyChar()) {
                    case 'a':
                        label.setLocation(label.getX() - 10, label.getY());
                        break;

                    case 'd':
                        label.setLocation(label.getX() + 10, label.getY());
                        break;

                    case 'w':
                        label.setLocation(label.getX(), label.getY() - 10);
                        break;

                    case 's':
                        label.setLocation(label.getX(), label.getY() + 10);
                        break;

                    default:
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //keyPressed = invoked when a physical key is pressed down. Uses KeyCode, int output
                switch (e.getKeyCode()) {
                    case 37:
                        label.setLocation(label.getX() - 10, label.getY());
                        break;

                    case 39:
                        label.setLocation(label.getX() + 10, label.getY());
                        break;

                    case 38:
                        label.setLocation(label.getX(), label.getY() - 10);
                        break;

                    case 40:
                        label.setLocation(label.getX(), label.getY() + 10);
                        break;

                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //keyReleased = called whenever a button is released
                //System.out.println("You released key char: " + e.getKeyChar());
                System.out.println("You released key code: " + e.getKeyCode());
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
