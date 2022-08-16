import javax.swing.*;
import java.awt.*;

public class FlowLayouts {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container

        // FlowLayout = places components in a row, sized at their preferred size/
        //              If the horizontal space in the container is too small,
        //              the FlowLayout class uses the next available row

        // To remember:
        //              Always add layout manager on Panels since they extend Frame


        // Frame
        JFrame frame = new JFrame();
        frame.setTitle("FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setSize(new Dimension(100, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        // Adding the components
        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
