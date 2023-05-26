import javax.swing.*;

public class ButtonListener{

   public static JButton generate = new JButton();


   // Random password generator
   public static void generatePassword(){
       System.out.println("Generating...");

       StringBuilder password = new StringBuilder();
       String abc = "abcdefghijklmnopqrstuvwxyz";
       String numbers = "0123456789";
       for (int i = 0; i < 9; i++) {
           // 1 for number, 2 for letter
           int choose = (int)(1 + Math.random() * 2);
           if(choose == 1){
                int randomN = (int)(Math.random() * 9);
                password.append(numbers.charAt(randomN));
           }else {
               int randomC = (int) (Math.random() * 25);
               password.append(abc.charAt(randomC));
           }
       }
       System.out.println(password);
       AddComps.password.setText(password.toString());
       AddComps.password.setVerticalAlignment(JLabel.CENTER);
       AddComps.password.setHorizontalAlignment(JLabel.LEFT);
       AddComps.password.setBounds(200, 85, 200, 30);
   }

}
