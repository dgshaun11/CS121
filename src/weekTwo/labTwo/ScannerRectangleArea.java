package weekTwo.labTwo;

import java.util.Scanner;

public class ScannerRectangleArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int length;
        int width;
        int area;

        System.out.println("What is the width of your rectangle?");
        width = Integer.parseInt(sc.nextLine());
        System.out.println("What is the length of your rectangle?");
        length = Integer.parseInt(sc.nextLine());

        area = length * width;
        System.out.println("Your area is " + area);

    }
}
