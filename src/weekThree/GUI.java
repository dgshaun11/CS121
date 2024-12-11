package weekThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class GUI {
    blackJackGameMethods game;
    JLabel statusLabel;
    JPanel controlPanel;
    JPanel cardPanel;
    ArrayList<JLabel> cardLabels;
    JTextArea gameLog = new JTextArea();

    public GUI() {
        game = new blackJackGameMethods();

        JFrame jframe = new JFrame("Blackjack");   //create JFrame object

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new BorderLayout());
        jframe.setSize(400, 400);            //set size of GUI screen

        //this will make a card panel for the weekThree.cards
        cardPanel = new JPanel(); //this is the entire center, from below 'Welcome to Blackjack' and above the hit or stand buttons
        cardPanel.setLayout(new FlowLayout());
        cardPanel.setPreferredSize(new Dimension(400, 200));
        cardLabels = new ArrayList<>();

        //displays at the top
        statusLabel = new JLabel("Welcome to Blackjack!", SwingConstants.CENTER);
        jframe.add(statusLabel, BorderLayout.NORTH);

        //this panel of the frame lets the player hit.
        controlPanel = new JPanel();
        JButton pressButton = new JButton("Hit");  //create JButton object
        JButton secondButton = new JButton("Stand");
        JButton betButton = new JButton("Bet");
        controlPanel.add(pressButton);
        controlPanel.add(secondButton);
        controlPanel.add(betButton);
        jframe.add(controlPanel, BorderLayout.SOUTH);

        //this adds the card graphic in the center
        jframe.add(cardPanel, BorderLayout.CENTER);

        //this give the hit button a function
        pressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawCard();
            }
        });
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (game.sumCards(game.getDealerCards()) <=16)
                {
                    drawCard();
                }
                statusLabel.setText("You stand.");
                pressButton.setEnabled(false); //disable hitting
            }
        });
        betButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                int bet = Integer.parseInt(JOptionPane.showInputDialog("Place your bet:"));
                if (bet > game.getChips()) {
                    gameLog.append("You don't have enough chips.");
                }
            }
        });
        jframe.setVisible(true);
    }
        //this makes the gui for the actual card
        private void drawCard() {
            String card = getRandomCard();
            JLabel cardLabel = new JLabel(card, SwingConstants.CENTER);
            cardLabel.setOpaque(true);
            cardLabel.setBackground(Color.WHITE);
            cardLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cardLabel.setPreferredSize(new Dimension(60, 100));

            cardLabels.add(cardLabel); //keep tracks of the weekThree.cards. CardLabels is an arraylist
            cardPanel.add(cardLabel); //cardLabel
            cardPanel.revalidate(); //refreshes the panel

            statusLabel.setText("You drew: " + card);
        }
        //this generates a random card
        String getRandomCard(){
            String[] suits = {"♠", "♥", "♦", "♣"}; //list of all possible suits
            String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; //list of all possible values of weekThree.cards
            Random random = new Random(); //creates random object
            String suit = suits[random.nextInt(suits.length)]; //generates a random suit within the suit list
            String value = values[random.nextInt(values.length)];
            return value + suit;
            }
        public static void main(String[] args){
            new GUI();
        }
        }

