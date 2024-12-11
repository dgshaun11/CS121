package weekThree;

import java.util.ArrayList;
import java.util.Random;

public class blackJackGameMethods {
    int chips;
    ArrayList<Integer> playerCards;
    ArrayList<Integer> dealerCards;
    Random random;

    public blackJackGameMethods(){
        this.chips = 100;
        this.random = new Random();
        this.playerCards = new ArrayList<>();
        this.dealerCards = new ArrayList<>();
    }
    public int getChips(){
        return chips;
    }
    public void setChips(int chips){
        this.chips = chips;
    }
    public ArrayList<Integer> getPlayerCards(){
        return playerCards;
    }
    public ArrayList<Integer> getDealerCards(){
        return dealerCards;
    }
    public int dealCard(){
        return random.nextInt(9) +2;
    }
    public int sumCards(ArrayList<Integer> cards){
        return cards.stream().mapToInt(Integer::intValue).sum(); //adds up all the weekThree.cards
    }
    public void resetHands(){
        playerCards.clear();
        dealerCards.clear();
    }
    public boolean isPlayerBust(){
        return sumCards(playerCards) > 21;
    }
    public boolean isDealerBust(){
        return sumCards(dealerCards) > 21;
    }
}
