package weekSix.labSix;
import java.util.Scanner;

public class Rectangle {
    static Scanner sc = new Scanner(System.in);

    public static double getLength(){
        System.out.println("Enter the length of the rectangle.");
        double length = Double.parseDouble(sc.nextLine());
        return length;

    }
    public static double getWidth(){
        System.out.println("Enter the length of the rectangle.");
        double width = Double.parseDouble(sc.nextLine());
        return width;
    }
    public static double getArea(double length, double width){
        return length * width;
    }
    public static void displayData(double length, double width, double area){
        System.out.println("rectangle length:" + length);
        System.out.println("rectangle width:" + width);
        System.out.println("rectangle area:" + area);
    }

    public static void main(String[] args){
        double length;
        double width;
        double area;

        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);

        sc.close();
    }
}
