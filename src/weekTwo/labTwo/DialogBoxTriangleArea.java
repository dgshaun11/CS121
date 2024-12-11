package weekTwo.labTwo;
import javax.swing.JOptionPane;

public class DialogBoxTriangleArea
{
    public static void main(String[] args)
    {
        double base;
        double height;
        double area;

        base = Double.parseDouble(JOptionPane.showInputDialog("What is your base?"));
        height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));

        area = (base*height)/2;

        String message = String.format("Your area is %2f", area);
        JOptionPane.showMessageDialog(null, message);



    }
}
