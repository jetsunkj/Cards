import java.util.*;
public class Player extends Deck
{
    public ArrayList<Card>hand = new ArrayList <Card>();
    public ArrayList<Card>playerCard= new ArrayList <Card>();
    public Player()
    {
        fill(hand, 5);
        fill(playerCard, 15);
    }

    public void fillHand(){
        for( int x = 1; hand.size() < 5; x++){
            hand.add(myCards.get(x));
            myCards.remove(x);
        }
    }

    public void fillPlayerCard(){
        for( int x = 1; playerCard.size() < 15; x++){
            playerCard.add(myCards.get(x));
            myCards.remove(x);
        }
    }

    public void refill(){
        //after clicking
        if(hand.size()<5){
            int cardNeeded=5-hand.size();
            for(int x=0; x<cardNeeded;x++){
                hand.add(playerCard.get(x));
                playerCard.remove(x);
            }
        }
    }
}
