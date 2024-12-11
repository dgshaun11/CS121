package weekTwo.labTwo;
import java.util.Scanner;
public class ScannerRectanglePerimeter
{
    public static void main(String[] args)
    {
        int length;
        int width;
        int perimeter;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your length?");
        length = Integer.parseInt(sc.nextLine());
        System.out.println("What is your width?");
        width = Integer.parseInt(sc.nextLine());

        perimeter = (2*length)+(2*width);

        System.out.println("Your perimeter is " + perimeter);
    }
}
