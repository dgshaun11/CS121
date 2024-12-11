package challengeQuestions;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerFeedbackManager {
    public static void main(String[] args){
        double Avg = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> custNames = new ArrayList<String>();
        ArrayList<String> itemName = new ArrayList<String>();
        ArrayList<Integer> rates = new ArrayList<Integer>();

        for (int i = 0; i <5; i++) {
            System.out.println("Enter the name of customer " + (i + 1) + ": ");
            custNames.add(sc.nextLine());
            System.out.println("Enter the name of item purchased by " + custNames.get(i) + ": ");
            itemName.add(sc.nextLine());
            System.out.println("Enter the rating for " + itemName.get(i) + " (1-5): ");
            rates.add(sc.nextInt());
            sc.nextLine();
        }
        System.out.println("Customer Feedback:");
        System.out.println("--------------------------------");
        System.out.println("Customer Name  | Item  | Rating");
        for (int i =0; i < custNames.size(); i++){
            System.out.println(custNames.get(i) + "  | " + itemName.get(i) + "  | " + rates.get(i));
        }
        for (int i = 0; i < rates.size(); i++){
            Avg += rates.get(i);
        }
        Avg /= rates.size();
        System.out.println("Average Rating for All Items: "+ Avg);
        }
    }
