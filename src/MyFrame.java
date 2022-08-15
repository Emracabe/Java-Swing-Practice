import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Emmar's JFrame"); // sets title of Frames
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent Frames from being resized
        this.setSize(1000, 800); // sets the x-dimension and y-dimension of Frames
        this.setVisible(true); // make Frames visible

        ImageIcon image = new ImageIcon("logo.jpeg"); // create an ImageIcon
        this.setIconImage(image.getImage()); // change icon of Frames
        this.getContentPane().setBackground(new Color(0x502BB4)); // change background color of Frames
    }
}
