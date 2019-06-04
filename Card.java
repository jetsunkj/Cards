import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Card  {
    int myRank;
    int mySuit;
    ImageIcon icon;
    JLabel label; 
    public Card(int myRank, int mySuit){
        this.myRank = myRank;
        this.mySuit = mySuit;
        icon = new ImageIcon(this.getIcon());
        label =  new JLabel();
        label.setIcon(icon);
    }

    public String getIcon(){
        System.out.println("Cards/"+getSuitToWord(mySuit)+" "+myRank+".png");
        String icon= "Cards/"+getSuitToWord(mySuit)+" "+myRank+".png";
        return icon;
    }

    public JLabel getImage(){
        return label;
    }

    public int rank() {
        return myRank;
    }

    
    public String getSuitToWord(int num){
        if(num==0){
            return "dimonds";        
        }else if(num==1){
            return "clubs";        
        }else if(num==2){
            return "hearts";        
        }else if(num==3)
            return "spades";
        else
            return "back";
    }


    public int suit() {
        return mySuit;
    }

}
