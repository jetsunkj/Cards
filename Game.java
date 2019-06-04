import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java. awt. Graphics;
import javax. swing. JFrame;
import javax. swing. JPanel;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;
public class Game extends JPanel{

    private int myWindowWidth = 700;
    private int myWindowHeight = 700;
    ImageIcon icon;
  
    JPanel playerCard = new JPanel();
    JPanel computerCard = new JPanel();
    JPanel playerHand = new JPanel();
    JPanel playerHand1 = new JPanel();
    JPanel playerHand2 = new JPanel();
    JPanel playerHand3 = new JPanel();
    JPanel playerHand4 = new JPanel();
    JPanel computerHand = new JPanel();
    JPanel computerHand1 = new JPanel();
    JPanel computerHand2 = new JPanel();
    JPanel computerHand3 = new JPanel();
    JPanel computerHand4 = new JPanel();
    JPanel tableHand1 = new JPanel();
    JPanel tableHand2 = new JPanel();
    JPanel tableCard1 = new JPanel();
    JPanel tableCard2 = new JPanel();
    Card back= new Card(-1,-1);
    Card back2= new Card(-1,-2);
    GridLayout L = new GridLayout(5,5);
    
    Deck d= new Deck();
    Player p= new Player();
    Table t= new Table();
    Computer k = new Computer(d);
    
    
    private int width;
    private int height;
    private int x = 0;
    private int y = 0;
    public Game()
    {
        this.setLayout(L);
        
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(computerCard);
        this.add(new JPanel());
        this.add(new JPanel());

        this.add(computerHand);
        this.add(computerHand1);
        this.add(computerHand2);
        this.add(computerHand3);
        this.add(computerHand4);
        
        this.add(new JPanel());
        this.add(tableHand1);
        this.add(tableCard1);
        this.add(tableCard2);
        this.add(tableHand2);
        
        this.add(playerHand);
        this.add(playerHand1);
        this.add(playerHand2);
        this.add(playerHand3);
        this.add(playerHand4);
        
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(playerCard);
        this.add(new JPanel());
        this.add(new JPanel());
        
        playerCard.add(back.getImage());
        
        computerCard.add(back2.getImage());
        
        playerHand.add(p.playerCard.get(0).getImage());
        playerHand1.add(p.playerCard.get(1).getImage());
        playerHand2.add(p.playerCard.get(2).getImage());
        playerHand3.add(p.playerCard.get(3).getImage());
        playerHand4.add(p.playerCard.get(4).getImage());
        computerHand.add(k.cCard.get(0).getImage());
        computerHand1.add(k.cCard.get(1).getImage());
        computerHand2.add(k.cCard.get(2).getImage());
        computerHand3.add(k.cCard.get(3).getImage());
        computerHand4.add(k.cCard.get(4).getImage());
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
    public void PlayGame(){
        
    
    
    
    }
    public void paintComponent(Graphics g){
        p.hand.get(0).getImage().setIcon(p.hand.get(1).getImage().getIcon());
        
        
    }
    
    
    public boolean IsConsecutive(){
        return true;
    }
    
}
