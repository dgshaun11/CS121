package weekFour;
import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args){
        int distance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed in mph: ");
        int speed = sc.nextInt();
        System.out.println("Enter the number of hours spent traveling");
        int hours = sc.nextInt();
        for (int i = 1; i<=hours; i++){
            distance = speed*i;
            System.out.println(i + " " + distance);
        }


    }
}
