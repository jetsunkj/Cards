import java.util.*;
public class Table 
{
    public ArrayList<Card>tableCard= new ArrayList<Card>();
    public ArrayList<Card> tableCard2= new ArrayList<Card>();
    public ArrayList<Card> stack= new ArrayList<Card>();
    public ArrayList<Card> stack2= new ArrayList<Card>();
    public Player p= new Player();
    Deck d = new Deck();
    
    public Table()
    {
        d.fill(tableCard, 1);
        d.fill(tableCard2, 1);
        d.fill(stack, 5);
        d.fill(stack2, 5);
        p.fillHand(d);
        
    }

   
}
