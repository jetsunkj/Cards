import java.util.*;
import java. awt. Graphics;
import javax. swing. JFrame;
import javax. swing. JPanel;
import java.awt.Image;
import java.awt.event.MouseEvent;
public class Game extends JPanel
{
    private int myWindowWidth = 700;
    private int myWindowHeight = 700;
    public Game()
    {
        Deck d= new Deck();
        Player p= new Player();
        Table t= new Table();
        
        
        JFrame easel = new JFrame();	
        easel.setSize (myWindowWidth, myWindowHeight);
        easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        easel.add (this);
        easel.setVisible (true);
        

    }
    
    public void paintComponent(Graphics g){
         	
    }
    

    public boolean IsConsecutive(){
        return true;
    }

}
