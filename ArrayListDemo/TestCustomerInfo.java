package ArrayListDemo;

import java.util.Scanner;

public class TestCustomerInfo extends SystemManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For courses (course name, gpa, score, letter grade) or 'q to quit'.");
        String input = sc.nextLine();
        while(!input.equals("q")){
            array1.add(input);
            System.out.println("Enter another element or 'q' to quit.");
            input = sc.nextLine();
        }
        display(array1);
    }
}
