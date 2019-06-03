import java.util.*;
public class Player
{
    public ArrayList<Card>hand = new ArrayList <Card>();
    public ArrayList<Card>playerCard= new ArrayList <Card>();
    Deck d= new Deck();
    public Player()
    {
        d.fill(hand, 5);
        d.fill(playerCard, 15);
    }

    public void fillHand(Deck d){
        for( int x = 1; hand.size() < 5; x++){
            hand.add(d.myCards.get(x));
            d.myCards.remove(x);
        }
    }

    }

