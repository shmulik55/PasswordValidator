import javax.swing.*;
import java.awt.*;

public class CreateGUI extends JFrame{
   CreateGUI() {

       //Size
       this.setSize(500, 500);
       this.setResizable(false);

       // Functionality
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Title
       ImageIcon icon = new ImageIcon("Lock.jpg");
       this.setIconImage(icon.getImage());
       this.setTitle("Password Validator");

       // Visibility
       this.setBackground(Color.lightGray);
       this.setVisible(true);

       AddComps.addComponents(this); // Use the add components class to add components to the frame
   }
}
