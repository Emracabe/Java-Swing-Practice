import javax.swing.*;
import java.awt.*;

public class ProgressBars {
    public static void main(String[] args) {
        // Progress Bar = visual aid to let the user know that an operation is processing

        JProgressBar bar = new JProgressBar();
        bar.setValue(0);
        bar.setBounds(0,0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Arial", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        JFrame frame = new JFrame("Progress Bar");
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill(bar);
    }

    private static void fill(JProgressBar bar) {
        for (int counter = 0; counter <= 100; counter+=1) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        bar.setString("Done :)");
        bar.setForeground(Color.green);
    }
}
