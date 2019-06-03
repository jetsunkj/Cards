import java.util.*;
import javax.swing.ImageIcon;
import java. awt. Graphics;
import javax. swing. JFrame;
import javax. swing. JPanel;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
public class Game extends JPanel
{
    private int myWindowWidth = 700;
    private int myWindowHeight = 700;
    ImageIcon icon;
    JPanel playerCard = new JPanel();
    JPanel computerCard = new JPanel();
    JPanel playerHand = new JPanel();
    JPanel computerHand = new JPanel();
    JPanel tableHand1 = new JPanel();
    JPanel tableHand2 = new JPanel();
    JPanel tableCard1 = new JPanel();
    JPanel tableCard2 = new JPanel();
    
    GridLayout L = new GridLayout(0,8);
    
    Deck d= new Deck();
    Player p= new Player();
    Table t= new Table();
    Computer k = new Computer();
    public Game()
    {
        this.setLayout(L);
        this.add(playerCard);
        this.add(computerCard);
        this.add(playerHand);
        this.add(computerHand);
        this.add(tableHand1);
        this.add(tableHand2);
        this.add(tableCard1);
        this.add(tableCard2);
       
        playerCard.add(p.hand.get(0).getImage());
        computerCard.add(k.cHand.get(0).getImage());
        playerHand.add(p.playerCard.get(0).getImage());
        computerHand.add(k.cCard.get(0).getImage());
        tableHand1.add(t.tableCard.get(0).getImage());
        tableHand2.add(t.tableCard2.get(0).getImage());
        tableCard1.add(t.stack.get(0).getImage());
        tableCard2.add(t.stack2.get(0).getImage());
        
        JFrame easel = new JFrame();    
        easel.setSize (myWindowWidth, myWindowHeight);
        easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        easel.add (this);
        easel.setVisible (true);
      
    }
    
    public void paintComponent(Graphics g){
        p.hand.get(0).getImage().setIcon(p.hand.get(1).getImage().getIcon());
        

    }
    
    
    public boolean IsConsecutive(){
        return true;
    }

}
