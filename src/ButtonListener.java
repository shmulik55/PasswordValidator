import javax.swing.*;

public class ButtonListener{

   public static JButton generate = new JButton();
   public static String finalPassword;


   // Random password generator
   public static void generatePassword(){
       System.out.println("Generating...");

       String password = "";
       String abc = "abcdefghijklmnopqrstuvwxyz";
       String numbers = "0123456789";
       for (int i = 0; i < 9; i++) {
           // 1 for number, 2 for letter
           int choose = (int)(1 + Math.random() * 2);
           if(choose == 1){
                int randomN = (int)(Math.random() * 9);
                password += numbers.charAt(randomN);
           }else {
               int randomC = (int) (Math.random() * 25);
               password += abc.charAt(randomC);
           }
       }
       finalPassword = password;
       System.out.println(finalPassword);
   }

}
