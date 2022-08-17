import javax.swing.*;

public class OptionPanes {
    public static void main(String[] args) {
//         JOptionPane = pop up a standard dialog box that prompts users for a value
//                       or informs them of something.
//
//        JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Here is more useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Really?", "Title", JOptionPane.QUESTION_MESSAGE);
//        while (true)
//            JOptionPane.showMessageDialog(null, "You're computer has a virus", "Virus", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Call Technical Support NOW OR ELSE YOU WILL LOSE YOUR COMPUTER", "Title", JOptionPane.ERROR_MESSAGE);
//
////        int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
////        String name = JOptionPane.showInputDialog("What is your name?");
//
//        String message = "";
//        if (answer == 0) {
//            message = ", you are coding!";
//        } else if (answer == 1) {
//            message = ", you must code!";
//        } else {
//            message = ", you didn't answer my question!";
//        }
//        JOptionPane.showMessageDialog(null, name + "\n" + message, "User", JOptionPane.INFORMATION_MESSAGE);

        String[] responses = {"No, you're awesome!", "Thank you!", "Blush*"};
        ImageIcon icon = new ImageIcon("like.png");
        JOptionPane.showOptionDialog(
                null,
                "You are awesome",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0
        );
    }
}
