import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class MenuBars {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        ImageIcon loadIcon = new ImageIcon("./assets/public/load.png");
        ImageIcon saveIcon = new ImageIcon("./assets/public/save.png");
        ImageIcon exitIcon = new ImageIcon("./assets/public/exit.png");

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        loadItem.addActionListener(l -> {
            System.out.println("*beep *boop you loaded a file");
        });

        saveItem.addActionListener(l -> {
            System.out.println("*beep *boop you saved a file");
        });

        exitItem.addActionListener(l -> {
            System.exit(0);
        });

        // Setting keyboard shortcuts
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for help
        loadItem.setMnemonic(KeyEvent.VK_L); // L for load
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
