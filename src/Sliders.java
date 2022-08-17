import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Sliders {
    public static void main(String[] args) {
        // JSlider =    GUI component that lets user enter a value
        //              by using an adjustable sliding knob on a track

        JSlider slider = new JSlider(0, 100, 50);

        JFrame frame = new JFrame("Slider Demo");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 22));

        // Setting the slider properties
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Arial", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);
        //slider.setOrientation(SwingConstants.HORIZONTAL);

        slider.setForeground(new Color(0x45A53A));
        label.setText("°C = " + slider.getValue());
        slider.addChangeListener(l -> {
            int sliderValue = slider.getValue();;

            if (sliderValue > 50) {
                slider.setForeground(Color.red);
            }
            else {
                slider.setForeground(Color.blue);
            }

            label.setText("°C = " + slider.getValue());
        });

//        if (sliderValue >= 20 && sliderValue <= 40) {
//            label.setForeground(Color.blue);
//        }

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }
}
