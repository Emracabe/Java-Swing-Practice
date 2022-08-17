import javax.swing.*;
import java.awt.*;
import java.io.File;

public class FileChooser {
    public static void main(String[] args) {
        //JFileChooser = a GUI mechanism that let's user choose a file (helpful for opening or saving files)

        JButton button = new JButton("Select File");
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:\\Users\\Anaclita\\Documents\\Emboy"));

            //int response = fileChooser.showOpenDialog(null); // select file to open
            int response = fileChooser.showSaveDialog(null); // select file to save

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        });

        JFrame frame = new JFrame("JFileChooser");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
