import java.util.*;
public class Deck
{
    
    public ArrayList<Card>myCards;
    public Deck( )
    {
        myCards= new ArrayList<Card>();
        fillDeck(52);
    }
    
    private void fillDeck(int num){
        Random r = new Random();
        while(myCards.size() < num){
            
            int suit = r.nextInt(4) + 1;
            int rank = r.nextInt(12) + 2; 

            if(!cardExists(suit,rank)){
                Card c = new Card(rank,suit);
                myCards.add(c);
            }
        }

    }
    
    private boolean cardExists(int suit, int rank)
    {
       
        boolean cExists= false;
        for(int y = 0; y < myCards.size();y++)
        {
            int s = myCards.get(y).suit();
            int r = myCards.get(y).rank();
            if(s == suit && r == rank)
            {
                cExists = true;
                break;
            }
        }
        return cExists;
    }
    
    public void fill(ArrayList<Card> List, int num){
        for( int x = 1; List.size() < num; x++){
            List.add(myCards.get(x));
            myCards.remove(x);
        }
    }
    
    
}
