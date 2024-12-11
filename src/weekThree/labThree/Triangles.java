package weekThree.labThree;

import javax.swing.*;
public class Triangles {
    public static void main(String[] args) {
        int userSide1 = Integer.parseInt(JOptionPane.showInputDialog("What is the first side length."));
        int userSide2 = Integer.parseInt(JOptionPane.showInputDialog("What is the second side length."));
        int userSide3 = Integer.parseInt(JOptionPane.showInputDialog("What is the third side length."));
        if (userSide1 == userSide2 && userSide1 == userSide3 && userSide2 == userSide3) {
            JOptionPane.showMessageDialog(null, "Your triangle is an equilateral triangle.");
        }
        else if (userSide1 == userSide2 || userSide2 == userSide3 || userSide1 == userSide3)
        {
            JOptionPane.showMessageDialog(null, "Your triangle is isosceles.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your triangle is a scalene.");
        }
    }

}
