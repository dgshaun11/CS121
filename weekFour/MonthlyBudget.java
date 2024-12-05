package weekFour;
import java.util.Scanner;
public class MonthlyBudget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount budgeted for a month:");
        double budget = sc.nextDouble();

        sc.nextLine();

        double expenseSum = 0;
        String input="";

        do {
            System.out.println("Enter an expense amount or 'q' to quit");
            input = sc.nextLine();

            if(!input.equalsIgnoreCase("q")) {
                try {
                    double expense = Double.parseDouble(input);
                    expenseSum += expense;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid");
                }
            }

        } while (!input.equalsIgnoreCase("q"));
        System.out.println("Budget: "+budget+" Expenses: "+ " Over budget by $" );
        }

    }

