package weekThree.labThree;


import javax.swing.*;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number:");

        int userNumber = sc.nextInt();
        if (userNumber%2==1) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("Your number is even");
        }
    }

}
