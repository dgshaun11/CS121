package weekFour;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalScore=0;
        System.out.println("How many students are there?");
        int studentCount = sc.nextInt();
        System.out.println("How many test scores per student?");
        int testCount = sc.nextInt();
        for (int i =0; i<studentCount;i++){
            totalScore = 0;
            System.out.println("Student number "+(i+1));
            System.out.println("--------------");
            for (int j =0; j<testCount; j++) {
                System.out.println("Enter score " + (j + 1) + ": ");
                int score = sc.nextInt();
                totalScore += score;
            }
            int avgScore = totalScore / testCount;
            System.out.println("The average for student " + (i + 1) + " is " + avgScore);
            }
            }
        }
