package weekFour;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int random = rand.nextInt(1, 100);
        int guessSum = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Guess a number between 1 and 100 or enter 'q' to quit:");
            String guessUser = sc.nextLine();
            int guessUser1 = Integer.parseInt(guessUser);
            if (guessUser.equals("q")) {
                keepGoing = false;
            }
                if (guessUser1 > random) {
                    System.out.println("Your guess is too high");
                    guessSum++;
                } else if (guessUser1 < random) {
                    System.out.println("Your guess is too low");
                    guessSum++;
                } else if (guessUser1 == random) {
                    System.out.printf("You guessed correctly! It only took you %d times", guessSum);
                    keepGoing = false;
                } else {
                    System.out.println("Invalid.");
                }
            }
        }
    }

