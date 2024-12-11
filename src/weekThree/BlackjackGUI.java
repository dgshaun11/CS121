package weekThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackjackGUI extends JFrame {
    private blackJackGameMethods game;
    private JLabel dealerLabel;
    private JLabel playerLabel;
    private JLabel chipsLabel;
    private JTextArea gameLog;
    private JButton hitButton;
    private JButton standButton;
    private JButton betButton;

    public BlackjackGUI() {
        game = new blackJackGameMethods();

        // Setting up the frame
        setTitle("Blackjack");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Dealer and player weekThree.cards area
        dealerLabel = new JLabel("Dealer: ");
        playerLabel = new JLabel("Player: ");
        chipsLabel = new JLabel("Chips: " + game.getChips());
        gameLog = new JTextArea();
        gameLog.setEditable(false);

        JPanel gamePanel = new JPanel(new GridLayout(3, 1));
        gamePanel.add(dealerLabel);
        gamePanel.add(playerLabel);
        gamePanel.add(chipsLabel);
        add(gamePanel, BorderLayout.CENTER);

        // Buttons for actions
        hitButton = new JButton("Hit");
        standButton = new JButton("Stand");
        betButton = new JButton("Bet");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(hitButton);
        buttonPanel.add(standButton);
        buttonPanel.add(betButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add ActionListeners for buttons
        hitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.getPlayerCards().add(game.dealCard());
                updateGameStatus();
                if (game.isPlayerBust()) {
                    gameLog.append("You busted!\n");
                    disableButtons();
                }
            }
        });

        standButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Dealer's turn logic
                while (game.sumCards(game.getDealerCards()) <= 16) {
                    game.getDealerCards().add(game.dealCard());
                }
                updateGameStatus();
                checkWinner();
                disableButtons();
            }
        });

        betButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int bet = Integer.parseInt(JOptionPane.showInputDialog("Place your bet: "));
                if (bet > game.getChips()) {
                    gameLog.append("You don't have enough chips!\n");
                } else {
                    game.setChips(game.getChips() - bet);
                    startNewGame();
                }
            }
        });
    }

    private void startNewGame() {
        game.resetHands();
        game.getPlayerCards().add(game.dealCard());
        game.getPlayerCards().add(game.dealCard());
        game.getDealerCards().add(game.dealCard());
        updateGameStatus();
        enableButtons();
    }

    private void updateGameStatus() {
        playerLabel.setText("Player: " + game.getPlayerCards() + " Sum: " + game.sumCards(game.getPlayerCards()));
        dealerLabel.setText("Dealer: " + game.getDealerCards() + " Sum: " + game.sumCards(game.getDealerCards()));
        chipsLabel.setText("Chips: " + game.getChips());
    }

    private void checkWinner() {
        int playerSum = game.sumCards(game.getPlayerCards());
        int dealerSum = game.sumCards(game.getDealerCards());
        if (dealerSum > 21) {
            gameLog.append("Dealer busts! You win!\n");
        } else if (playerSum > dealerSum) {
            gameLog.append("You win!\n");
        } else if (playerSum < dealerSum) {
            gameLog.append("Dealer wins!\n");
        } else {
            gameLog.append("It's a tie!\n");
        }
    }

    private void disableButtons() {
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
    }

    private void enableButtons() {
        hitButton.setEnabled(true);
        standButton.setEnabled(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackjackGUI().setVisible(true);
            }
        });
    }
}
