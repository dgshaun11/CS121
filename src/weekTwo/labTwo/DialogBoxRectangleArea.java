package weekTwo.labTwo;

import javax.swing.JOptionPane;
public class DialogBoxRectangleArea
{
    public static void main(String[] args)
    {
        int length;
        int width;
        int area;

        length = Integer.parseInt(JOptionPane.showInputDialog("What is your length?"));
        width = Integer.parseInt(JOptionPane.showInputDialog("What is your width?"));

        area = length * width;

        String message = String.format("Your area is %d",area);

        JOptionPane.showMessageDialog(null, message);
    }
}
