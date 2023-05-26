import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class AddComps {

    public static JLabel password = new JLabel();
    public static void addComponents(JFrame frame){

        // Title
        JLabel title = new JLabel("Password Validator & Generator");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setFont(new Font("", Font.BOLD, 20));
        title.setBounds(0, 0, 500, 30);
        frame.add(title);

        // Generate password
        // Generate password label
        JLabel label1 = new JLabel("Generate a new password: ");
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.LEFT);
        label1.setBounds(0, 50, 500, 30);
        frame.add(label1);

        // Generate button
        JButton button1 = ButtonListener.generate;

        button1.setText("Generate Password");
        button1.setVerticalAlignment(JLabel.CENTER);
        button1.setHorizontalAlignment(JLabel.LEFT);
        button1.setBounds(0, 85, 150, 30);
        frame.add(button1);
        button1.addActionListener(e -> ButtonListener.generatePassword());

        // New password label
        password.setVerticalAlignment(JLabel.CENTER);
        password.setHorizontalAlignment(JLabel.LEFT);
        password.setBounds(200, 85, 200, 30);
        frame.add(password);
    }
}
