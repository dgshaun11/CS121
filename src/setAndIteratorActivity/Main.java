package setAndIteratorActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        RealEstateSet set = new RealEstateSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Real Estate Property Management System");
        while (counter!=1){
            System.out.println("(1) Add a property ID");
            System.out.println("(2) View all property IDs");
            System.out.println("(3) Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    set.addProperties();
                    break;
                case 2:
                    set.displayProperties();
                    break;
                case 3:
                    counter++;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
