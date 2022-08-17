import javax.swing.*;
import java.awt.*;

public class ComboBoxes {
    public static void main(String[] args) {
        // JComboBox = a component that combines a button or editable field and a drop-down list

        String[] animals = {"dog", "cat", "bird"};

        Integer[] numbers = {1, 2, 3}; // USE WRAPPER CLASSES for options

        JComboBox comboBox = new JComboBox(animals); // Constructor params: Array of WRAPPER CLASSES for Options

        comboBox.addActionListener(e -> {
            System.out.println(comboBox.getSelectedItem());
        });
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        JFrame frame = new JFrame("JComboBox");
        frame.setLayout(new FlowLayout());
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }
}
