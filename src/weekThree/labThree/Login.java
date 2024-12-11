package weekThree.labThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args){
String Username="Ryo";
String Password= "Angrybirds101?";
        String user = JOptionPane.showInputDialog("Enter your username: ");
        String pw = JOptionPane.showInputDialog("Enter your password: ");
        if(user.equals(Username)&& pw.equals(Password)){
            JOptionPane.showMessageDialog(null,"Welcome to CS121");
        }
        else if(user.equals(Username)){
            JOptionPane.showMessageDialog(null, "Your password is incorrect.");
        }
        else if(pw.equals(Password)){
            JOptionPane.showMessageDialog(null, "Your username is incorrect.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Both inputs are incorrect.");
        }


    }
}
