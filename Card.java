import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Card  {
    int myRank;
    int mySuit;
    ImageIcon icon;
    
    public Card(int myRank, int mySuit){
        this.myRank = myRank;
        this.mySuit = mySuit;
        icon= new ImageIcon("Cards/"+getSuitToWord(mySuit)+" "+myRank+".png"); 
        
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("icon");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible (true);
    }

    public int rank() {
        return myRank;
    }
    
    public String getSuitToWord(int num){
        if(num==0){
            return "diamonds";        
        }else if(num==1){
            return "clubs";        
        }else if(num==2){
            return "hearts";        
        }else{
            return "spades";
        }
        
    }
    
   
 
    public int suit() {
        return mySuit;
    }
    

}
