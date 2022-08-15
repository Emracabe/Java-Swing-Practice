import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("sample.png");
        Border border = BorderFactory.createLineBorder(Color.blue, 2);

        JLabel label = new JLabel(); // create a label
        label.setText("Kazan Neft"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x0000FF)); // set font color of text
        label.setFont(new Font("Arial", Font.PLAIN, 50)); // set font of text
        label.setIconTextGap(10); // set gap of text to image
        label.setBackground(Color.yellow); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border of label (not image + text)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        //label.setBounds(200, 100, 400, 300); // set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setTitle("JLabel Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(800, 600);
        //frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);

        // You must call this after you add all the labels
        // Since if you don't, your frame will not display any component
        frame.pack();
    }
}
