import javax.swing.*;
import java.awt.*;

public class BorderLayouts {
    public static void main(String[] args) {

        // Layout Manager - Defines the natural layout for components within a container

        // BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
        //                All extra space is placed in the center area

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel yellowPanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel violetPanel = new JPanel();

        redPanel.setBackground(Color.red);
        bluePanel.setBackground(Color.blue);
        yellowPanel.setBackground(Color.yellow);
        greenPanel.setBackground(Color.green);
        violetPanel.setBackground(Color.magenta);

        redPanel.setPreferredSize(new Dimension(100, 100));
        bluePanel.setPreferredSize(new Dimension(100, 100));
        yellowPanel.setPreferredSize(new Dimension(100, 100));
        greenPanel.setPreferredSize(new Dimension(100, 100));
        violetPanel.setPreferredSize(new Dimension(100, 100));


        // ---------------------- Sub Panels ---------------------------- //

        JPanel blackPanel = new JPanel();
        JPanel darkGrayPanel = new JPanel();
        JPanel grayPanel = new JPanel();
        JPanel lightGrayPanel = new JPanel();
        JPanel whitePanel = new JPanel();

        blackPanel.setBackground(Color.black);
        darkGrayPanel.setBackground(Color.darkGray);
        grayPanel.setBackground(Color.gray);
        lightGrayPanel.setBackground(Color.lightGray);
        whitePanel.setBackground(Color.white);

        blackPanel.setPreferredSize(new Dimension(50, 50));
        darkGrayPanel.setPreferredSize(new Dimension(50, 50));
        grayPanel.setPreferredSize(new Dimension(50, 50));
        lightGrayPanel.setPreferredSize(new Dimension(50, 50));
        whitePanel.setPreferredSize(new Dimension(50, 50));

        // ---------------------- End of Sub Panels ---------------------------- //

        // Adding the subpanels to bluepanel (the center panel in the Frame)
        bluePanel.setLayout(new BorderLayout());
        bluePanel.add(blackPanel, BorderLayout.NORTH);
        bluePanel.add(darkGrayPanel, BorderLayout.WEST);
        bluePanel.add(grayPanel, BorderLayout.EAST);
        bluePanel.add(lightGrayPanel, BorderLayout.SOUTH);
        bluePanel.add(whitePanel, BorderLayout.CENTER);

        // The Main Window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BorderLayout");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(5, 5)); // Giving the JFrame a BorderLayout manager

        // Adding the panels
        frame.add(redPanel, BorderLayout.NORTH);
        frame.add(greenPanel, BorderLayout.EAST);
        frame.add(yellowPanel, BorderLayout.WEST);
        frame.add(violetPanel, BorderLayout.SOUTH);
        frame.add(bluePanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
