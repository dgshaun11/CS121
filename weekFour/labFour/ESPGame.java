package weekFour.labFour;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int correctGuesses = 0;
        String color="";
        for(int i = 0; i<10;i++) {
            System.out.println(i+1+". What color has the computer chosen?");
            String response = sc.nextLine();
            int randColor = rand.nextInt(5);
            if (randColor == 0) {
                color = "red";
            } else if (randColor == 1) {
                color = "green";
            } else if (randColor == 2) {
                color = "blue";
            } else if (randColor == 3) {
                color = "orange";
            } else if (randColor == 4) {
                color = "yellow";
            }
            if (response.equals(color)) {
                correctGuesses++;
            }
            System.out.println("> The computer chose "+color);
        }
        System.out.printf("You got %d out of 10 correct", correctGuesses);
    }
}
