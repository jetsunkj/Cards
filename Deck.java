import java.util.*;
public class Deck
{

    public ArrayList<Card>myCards;
    public Deck()
    {
        myCards= new ArrayList<Card>();
        fillDeck(52);
    }
    
    public ArrayList getCards(){
        return myCards;
    }
    
    private void fillDeck(int num){
        
        for(int numCard=0; numCard<num;numCard++){
            for(int rank=1; rank<14; rank++){
                for(int suit=0; suit<4;suit++){
                    myCards.add(new Card(rank,suit));
                }
            }

        }
        shuffle();

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
        for( int x = 0; List.size() < num;){
            List.add(myCards.get(x));
            myCards.remove(x);
        }
    }
    
    public void shuffle(){
        Random r = new Random();
        int count = 0;
        while(count<100){
            int rand = r.nextInt(52);
            myCards.add((myCards.remove(rand)));
            count++;
        }
        
    }
}

