import java.util.*;
public class Computer 
{
    public ArrayList<Card>cHand = new ArrayList <Card>();
    public ArrayList<Card>cCard= new ArrayList <Card>();
    
    
    public Computer(Deck d)
    {
        d.fill(cHand, 5);
        d.fill(cCard, 15);
    }

    public Card play(Card T1,Card T2){
        for(int x=0;x<5;x++){
            if(cHand.get(x).rank()+1==T1.rank() ||cHand.get(x).rank()-1==T1.rank() )
                return cHand.remove(x);
            if(cHand.get(x).rank()+1==T2.rank() ||cHand.get(x).rank()-1==T2.rank() )
                return  cHand.remove(x);
            }
        return null;
        }
    }
