package weekTwo;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Gambling {
    public static void main(String[] args) {
        Random randGen = new Random();
        new Scanner(System.in);
        int dealer3;
        int rp = 0;
        int chips = 100;
        boolean playAgain = true;


        //split, double, add face weekThree.cards// make a way to get more chips after zero
        String intro = ("WELCOME!!!! From rags to riches, experience a better life after all-inning your life savings! This is Shaun's Plaza");
        JOptionPane.showMessageDialog(null, intro);
        // hit does not work when looping?
        while (playAgain) {
            ArrayList<Integer> playerCards = new ArrayList<>();
            ArrayList<Integer> dealerCards = new ArrayList<>();
            int playerHand1 = 0;
            int playerHand2 = 0;
            int dealerHand1 = 0;
            int dealerHand2 = 0;
            int playerCardsSum = 0;
            int dealerCardsSum = 0;
            playerHand1 = randGen.nextInt(9) + 2;
            playerHand2 = randGen.nextInt(9) + 2;
            dealerHand1 = randGen.nextInt(9) + 2;
            dealerHand2 = randGen.nextInt(9) + 2;
            playerCards.add(playerHand1);
            playerCards.add(playerHand2);
            dealerCards.add(dealerHand1);

            //make the bet
            int bet = Integer.parseInt(JOptionPane.showInputDialog("You have " + chips + " chips. How much would you like to bet?"));
            while (bet > chips) {
                String response = "are you stupid.";
                JOptionPane.showMessageDialog(null, response);
                bet = Integer.parseInt(JOptionPane.showInputDialog("You have " + chips + " chips. How much would you like to bet?"));
            }

            playerCardsSum = playerCards.stream().mapToInt(Integer::intValue).sum();

            // make code that determines king queen jack ace through randomizing 11-14 to be k,q,c,a

            String message = String.format("Dealer's first card shows " + dealerHand1 + " (Keep in mind the dealer has two weekThree.cards).");
            JOptionPane.showMessageDialog(null, message);
            String message1 = String.format("Your hand is shows %s Sum = %d.",playerCards, playerCardsSum);
            JOptionPane.showMessageDialog(null, message1);

            //prompts the user to hit or stand and creates a loop until they wish to stop
            boolean correctResponse = false;
            while (!correctResponse) {
                String choice = JOptionPane.showInputDialog("Do you wish to hit or stand? Please enter 'hit' or 'stand'.");
                if (choice.equals("hit")) {
                    int playerNewCard = randGen.nextInt(9) + 2;
                    playerCards.add(playerNewCard);
                    playerCardsSum = playerCards.stream().mapToInt(Integer::intValue).sum();
                    String displayHands = String.format("Your hand is %s Sum = %d. Dealer's hand is %s.", playerCards, playerCardsSum, dealerCards);
                    JOptionPane.showMessageDialog(null, displayHands);
                    if (playerCardsSum > 21) {
                        JOptionPane.showMessageDialog(null, "You suck ass. Dealer wins.");
                        chips -= bet;
                        correctResponse = true;
                    }
                } else if (choice.equalsIgnoreCase("stand")) {
                    correctResponse = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Not a choice bruh.");
                }
            }
            if (playerCardsSum <= 21) {
                //dealers turn
                while (dealerCardsSum <= 16) {
                    int cardDealerPulled = randGen.nextInt(9) + 2;
                    dealerCards.add(cardDealerPulled);
                    dealerCardsSum = dealerCards.stream().mapToInt(Integer::intValue).sum();
                    String dealerHandReveal = "Dealer's draws. Shows [" + cardDealerPulled + "].";
                }
                //display final hand
                String displayHands = String.format("Your hand is %s Sum = %d. Dealer's hand is %s Sum = %d.", playerCards, playerCardsSum, dealerCards, dealerCardsSum);
                JOptionPane.showMessageDialog(null, displayHands);

                //determine winner
                if (dealerCardsSum > 21) {
                    JOptionPane.showMessageDialog(null, "Dealer's hand is " + dealerCardsSum + ". House busted You beat the house! + ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠖⠚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠒⠢⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠞⠁⢀⣠⣴⣶⣶⣶⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣴⣶⣶⣶⣤⣀⡀⠉⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀⠘⠉⠁⠀⠀⠉⠛⢾⣍⡛⢷⠀⠀⠀⠀⠀⠀⠀⢰⡾⢋⣵⠾⠋⠉⠀⠀⠈⠙⠂⠀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⠾⡇⠀⠀⠀⠀⠀⠀⡿⠾⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⣄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⠀⠀⠀⢀⡤⠖⠉⠁⠀⠀⠀⠉⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠁⠀⠀⠀⠈⠙⠢⣄⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⢠⠋⠀⠀⠀⠀⠀⠀⣠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⡜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⡎⠀⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⠀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡄⠀⠀⠀⠀⠀⠈⡆⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⢰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⡀⠀⠀⠀⠀⠀⠸⡀⠀⠀⠀\n" +
                            "⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⡇⠀⠀⣀⠤⠔⢒⣂⣀⣀⣒⠲⢤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⢒⣊⣀⣀⣒⠒⠤⢄⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀\n" +
                            "⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠸⢀⢔⣨⣴⣿⣿⣿⣿⣿⣿⣿⣿⣷⣝⡄⠀⠀⠀⠀⠀⠀⠀⠀⣔⣵⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣐⢄⡸⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀\n" +
                            "⠀⠀⡔⠁⠀⠀⠀⠀⠀⠀⠀⣵⡿⠛⢹⣿⣿⣿⣿⣿⣿⣿⠉⣻⠻⡏⠀⠀⠀⠀⠀⠀⠀⠈⣸⠋⢸⣿⣿⣿⣿⣿⣿⣿⠉⣻⠿⣷⣅⠀⠀⠀⠀⠀⠀⠀⠑⣄⠀\n" +
                            "⠀⡞⠀⠀⠀⠀⠀⠀⠀⠠⡾⡏⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⡟⠃⠀⣧⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠈⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠈⣽⡆⠀⠀⠀⠀⠀⠀⠀⠘⡄\n" +
                            "⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⡀⠀⠀⠘⠐⠿⠿⠿⠟⠋⠀⣀⣴⠇⠀⠀⠀⠀⠀⠀⠀⠘⢳⣄⡀⠙⠐⠿⠿⠿⠟⠋⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⢱\n" +
                            "⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⢶⣶⣲⣶⣒⣲⣶⠾⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⠶⣶⣖⣲⣒⣲⣶⡾⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸\n" +
                            "⠀⠀⠀⠀⠀⠰⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡄⠀⠀⠀⠀⢀\n" +
                            "⢰⠀⠀⠀⠀⠀⠈⢷⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠴⣾⡟⠀⠀⠀⠀⠀⢸\n" +
                            "⠸⡀⠀⠀⠀⠀⠀⠈⢿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠏⠀⠀⠀⠀⠀⠀⣸\n" +
                            "⠀⢣⠀⠀⠀⠀⠀⠀⠈⢻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⠋⠀⠀⠀⠀⠀⠀⢀⠇\n" +
                            "⠀⠈⢆⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣶⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣴⣾⣿⡿⠃⠀⠀⠀⠀⠀⠀⢀⡞⠀\n" +
                            "⠀⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠙⢿⣷⣍⣻⠛⠻⢷⣶⣖⣒⣤⣤⣤⣤⣤⣤⣴⣤⣤⣴⣶⣤⣤⣤⣤⣤⣒⣾⢷⠿⠛⠛⣏⠕⣿⠟⠀⠀⠀⠀⠀⠀⠀⢀⡜⠀⠀\n" +
                            "⠀⠀⠀⠈⢆⠀⠀⠀⠀⠀⠀⠀⠀⠻⡿⣿⣦⣀⠀⡇⠀⠀⠀⢸⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⢸⢀⣠⣾⣿⣶⡋⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀⠀⢹⠈⢻⣿⣿⣷⡤⢄⡀⢸⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⢸⡀⣀⡤⢴⣿⣿⣿⣿⠏⡏⡇⠀⠀⠀⠀⠀⠀⡴⠋⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠈⢦⡀⠀⠀⠀⠀⠀⣟⠀⠈⠙⣿⣿⠉⠀⠈⠉⠁⠐⠒⠒⠒⠚⠒⠒⠒⠒⡆⡞⠉⠀⠀⢸⣿⠿⢋⡼⠀⠙⠃⠀⠀⠀⠀⢠⠞⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⢸⠀⢀⡀⠈⠻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⡇⠀⠀⠀⡸⠃⢠⢻⠡⠀⠀⠀⠀⠀⣠⠔⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠲⣄⠀⠀⡇⢸⡏⠲⣄⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⢀⡇⣄⡾⣾⠇⠀⠀⢀⡠⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠢⡇⢸⡇⠀⢸⠈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⣸⠈⡼⡟⣀⠤⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢸⠑⠒⠼⢦⣸⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣡⠤⢳⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢱⠀⡇⠀⠀⠀⢸⢉⡳⡀⢀⣴⡄⠀⠀⠀⠀⣀⠀⠀⣠⡾⠁⠀⠀⠀⡏⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠮⠶⠃⠀⠀⠀⠸⢸⠘⢽⠢⣉⠀⠀⠀⢀⠞⢀⠙⣯⠜⠁⠀⠀⠀⠀⠷⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣶⠇⠀⠁⠒⠭⠄⢶⡿⠦⠴⠊⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⠄⠒⠒⠒⠒⠀⠀⠀⠀⠀⠁⠀⠤⠤⠤⠤⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⠒⠒⠀⠀⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠒⠲⢤⡄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠓⠒⠒⠦⠤⠶⠶⠶⠶⠶⣶⠒⠒⠒⠒⠒⠒⠂⠀⠤⠤⠖⠒⠚⠛⠛⠒⠒⠛⠛⠦⠤⠔⠒⠒⠒⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀" + bet + "chips.");
                    chips += bet;
                } else if ((playerCardsSum > dealerCardsSum)) {
                    JOptionPane.showMessageDialog(null, "Your hand shows " + playerCardsSum + " dealer's hand shows " + dealerCardsSum + ". You beat the house! +" + bet + "chips.");
                    chips += bet;
                } else if (playerCardsSum < dealerCardsSum) {
                    JOptionPane.showMessageDialog(null, "You lose. House wins, like always. -100000000 aura.");
                    chips -= bet;
                } else {
                    JOptionPane.showMessageDialog(null, "Your hand shows " + playerCardsSum + " dealer's hand shows " + dealerCardsSum + ". You tied the dealer. LMAOOOOOOO.");
                }
            }
                //playing Again
                String choice2 = JOptionPane.showInputDialog("Would you like to play again? Type 'yes' or 'no");
                playAgain = choice2.equalsIgnoreCase("yes");
                if (choice2.equalsIgnoreCase("no")) {
                    String choice3 = JOptionPane.showInputDialog("99% of gamblers quit before they hit big. Are you SURE. Type 'yes' or 'no'.");
                    if (choice3.equals("no")) {
                        playAgain = choice3.equalsIgnoreCase("no");
                    }
                }
                if (chips <= 0) {
                    JOptionPane.showMessageDialog(null, "You're broke bozo.");
                    playAgain = false;
                }

        }
    }
}
