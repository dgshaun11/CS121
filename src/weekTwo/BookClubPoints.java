package weekTwo;

import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args)
    {
        int points=0;
        int books = Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased?"));
        if (books == 0)
        {
            String message = "You have "+points+ " points.";
            JOptionPane.showMessageDialog(null, message);
        }
        else if (books == 1)
        {
            points+=5;
            String message1 = "You have "+points+" points.";
            JOptionPane.showMessageDialog(null, message1);
        }
        else if (books == 2)
        {
            points+=15;
            String message2 = "You have "+points+" points.";
            JOptionPane.showMessageDialog(null, message2);
        }
        else if (books ==3)
        {
            points+=30;
            String message3 = "You have "+points+" points.";
            JOptionPane.showMessageDialog(null,message3);
        }
        else if(books>=4)
        {
            points+=60;
            String message4 = "You have "+points+" points.";
            JOptionPane.showMessageDialog(null, message4);
        }

    }
}
