package weekThree;

import java.util.ArrayList;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BlackJack {
    private class Card {
        String value;
        String type;

        Card(String value, String type) {
            this.value = value;
            this.type = type;
        }

        public String toString() {
            return value + "-" + type;
        }
        public int getValue(){
            if ("AJQK".contains(value)) { //A J Q K
                if (value == "A") {
                    return 11;
                }
                return 10;
            }
            return Integer.parseInt(value); //2-10
        }

        public boolean isAce() {
            return value == "A";
            }
        public String getImagePath(){
            return "./cards/" + toString() + ".png";
        }
    }


    ArrayList<Card> deck;
    Random random = new Random();
    int chips = 100;
    int playAgainCounter;

    //dealer section
    Card hiddenCard;
    ArrayList<Card> dealerHand;
    int dealerSum;
    int dealerAceCount;


    //player
    ArrayList<Card> playerHand;
    int playerSum;
    int playerAceCount;

    //window
    int boardWidth = 600;
    int boardHeight = boardWidth;

    int cardWidth = 110; //ratio should be 1/1.4 for card pictures
    int cardHeight = 154;

    JFrame frame = new JFrame("BlackJack");
    JPanel gamePanel = new JPanel() {
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            try {
                //draw hidden card
                Image hiddenCardImg = new ImageIcon(getClass().getResource("./cards/BACK.png")).getImage();
                if (!stayButton.isEnabled()) {
                    hiddenCardImg = new ImageIcon(getClass().getResource(hiddenCard.getImagePath())).getImage();
                }
                g.drawImage(hiddenCardImg, 20, 20, cardWidth, cardHeight, null);

                //draw dealers hand
                for (int i = 0; i < dealerHand.size(); i++){
                    Card card = dealerHand.get(i);
                    Image cardImg = new ImageIcon(getClass().getResource(card.getImagePath())).getImage();
                    g.drawImage(cardImg, cardWidth + 25 + (cardWidth + 5) * i, 20, cardWidth, cardHeight, null);
                }

                //draw player's hand
                for (int i = 0; i < playerHand.size(); i++){
                    Card card = playerHand.get(i);
                    Image cardImg = new ImageIcon(getClass().getResource(card.getImagePath())).getImage();
                    g.drawImage(cardImg, 20+ (cardWidth + 5)*i,320, cardWidth, cardHeight, null);

                }
                if (!stayButton.isEnabled()) {
                    dealerSum = reduceDealerAce();
                    playerSum = reducePlayerAce();
                    System.out.println("STAY: ");
                    System.out.println(dealerSum);
                    System.out.println(playerSum);

                    String message = "";
                    if (playerSum > 21) {
                        message = "You lose.";
                    }
                    else if (dealerSum > 21) {
                        message = "You win.";
                    }
                    else if (playerSum == dealerSum) {
                        message = "Tied.";
                    }
                    else if (playerSum > dealerSum) {
                        message = "You win.";
                    }
                    else if (playerSum < dealerSum) {
                        message = "You lose.";
                    }
                    g.setFont(new Font("Arial", Font.PLAIN, 30));
                    g.setColor(Color.white);
                    g.drawString(message, 220, 250);
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    };
    JPanel buttonPanel = new JPanel();
    JButton hitButton = new JButton("Hit");
    JButton stayButton = new JButton("Stand");
    JButton betButton = new JButton("Bet");
    JButton playAgain = new JButton("Play again");

    JTextArea chipAmount = new JTextArea("Chips: "+chips);


    BlackJack () {
        startGame();

        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel.setLayout(new BorderLayout());
        gamePanel.setBackground(new Color(53, 101, 77));
        frame.add(gamePanel);

        hitButton.setFocusable(false);
        buttonPanel.add(hitButton);
        stayButton.setFocusable(false);
        buttonPanel.add(stayButton);
        betButton.setFocusable(false);
        buttonPanel.add(betButton);
        buttonPanel.add(chipAmount);
        buttonPanel.add(playAgain);
        frame.add(buttonPanel, BorderLayout.SOUTH);


        hitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Card card = deck.remove(deck.size()-1);
                playerSum += card.getValue();
                playerAceCount += card.isAce() ? 1: 0;
                playerHand.add(card);

                if (reducePlayerAce() > 21) { //A + 2 + 3 == 3
                    hitButton.setEnabled(false);
                }
                gamePanel.repaint();
            }
        });

        stayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hitButton.setEnabled(false);
                stayButton.setEnabled(false);

                while (dealerSum < 17) {
                    Card card = deck.remove(deck.size()-1);
                    dealerSum += card.getValue();
                    dealerAceCount += card.isAce()? 1:0;
                    dealerHand.add(card);
                }
                gamePanel.repaint();
            }
        });
        betButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int betAmount = Integer.parseInt(JOptionPane.showInputDialog("How much would you like to bet?"));
                chips -= betAmount;
                chipAmount = new JTextArea("Chips: "+chips);
                gamePanel.repaint();
            }
        });
        playAgain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                playAgainCounter +=1;
                System.out.println(playAgainCounter);
                gamePanel.repaint();
            }
        });

        gamePanel.repaint();
    }
    public void startGame(){
        for (int i =0; i==playAgainCounter; i++) {
            //deck
            buildDeck();
            shuffleDeck();

            //dealer
            dealerHand = new ArrayList<Card>();
            dealerSum = 0;
            dealerAceCount = 0;

            hiddenCard = deck.remove(deck.size() - 1); //remove card at last index
            dealerSum += hiddenCard.getValue();
            dealerAceCount += hiddenCard.isAce() ? 1 : 0;


            Card card = deck.remove(deck.size() - 1);
            dealerSum += card.getValue();
            dealerAceCount += card.isAce() ? 1 : 0;
            dealerHand.add(card);

            System.out.println("DEALER");
            System.out.println(hiddenCard);
            System.out.println(dealerHand);
            System.out.println(dealerSum);
            System.out.println(dealerAceCount);

            //player
            playerHand = new ArrayList<Card>();
            playerSum = 0;
            playerAceCount = 0;

            for (int m = 0; i < 2; i++) {
                card = deck.remove(deck.size() - 1);
                playerSum += card.getValue();
                playerAceCount += card.isAce() ? 1 : 0;
                playerHand.add(card);
            }

            System.out.println("PLAYER: ");
            System.out.println(playerHand);
            System.out.println(playerSum);
            System.out.println(playerAceCount);
        }
    }
    public void buildDeck() {
        deck = new ArrayList<Card>();
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8","9","10","J","Q","K"};
        String[] types = {"C","D","H","S"};

        for (int i = 0; i < types.length; i++){
            for (int j = 0; j < values.length; j++){
                Card card = new Card(values[j], types[i]);
                deck.add(card);
            }
        }
        System.out.println("BUILD DECK:");
        System.out.println(deck);
    }
    public void shuffleDeck(){
        for (int i = 0; i<deck.size();i++) {
            int j = random.nextInt(deck.size());
            Card currCard = deck.get(i);
            Card randomCard = deck.get(j);
            deck.set(i, randomCard);
            deck.set(j, currCard);
        }
        System.out.println("AFTER SHUFFLE");
        System.out.println(deck);
    }
    public int reducePlayerAce() {
        while (playerSum > 21 && playerAceCount > 0){
            playerSum -=10;
            playerAceCount -=1;
        }
        return playerSum;
    }

    public int reduceDealerAce(){
        while (dealerSum > 21 && dealerAceCount > 0){
            dealerSum -=10;
            dealerAceCount -=1;
        }
        return dealerSum;
    }
}
