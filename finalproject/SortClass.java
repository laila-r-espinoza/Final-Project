
package finalproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class SortClass {
    /**
     * sorts alll the pricesses by Attack
     * */
    
    public static void SortAttack(ArrayList<Princess> pri)
    {
        String tdis = "Name \t Hair \t Power \t Prince \t HitPoints \t Attack \t Defense\n";
        for (int i = 0; i < pri.size(); i++) {
            for (int j = 0; j < pri.size()-1; j++) {
                if(pri.get(j).getAT()>pri.get(j+1).getAT()){
                    Princess asdf = pri.get(j);
                    pri.set(j, pri.get(j+1));
                    pri.set(j+1,asdf);
                }
                
            }
            
        }
        for (int i = 0; i < pri.size(); i++) {{
            tdis += pri.get(i).getName() + "\t   "
                    + pri.get(i).getHair()+ "\t   " 
                    +pri.get(i).getPower()+ "\t   " 
                    + pri.get(i).getPrince() + "\t   "
                    +pri.get(i).getHP()+"\t   "
                    +pri.get(i).getAT()+"\t   "
                    +pri.get(i).getDE()+"\n   ";
            
        }
        JOptionPane.showMessageDialog(null, tdis);
        
    }
    }
    /**
     * sorts display menu by hitpoints
     * */
    public static void SortHP(ArrayList<Princess> pri)
    {
        String tdis = "Name \t Hair \t Power \t Prince \t HitPoints \t Attack \t Defense\n";
        for (int i = 0; i < pri.size(); i++) {
            for (int j = 0; j < pri.size()-1; j++) {
                if(pri.get(j).getHP()>pri.get(j+1).getHP()){
                    Princess asdf = pri.get(j);
                    pri.set(j, pri.get(j+1));
                    pri.set(j+1,asdf);
                }
                
            }
            
        }
         for (int i = 0; i < pri.size(); i++) {{
            tdis += pri.get(i).getName() + "\t   "
                    + pri.get(i).getHair()+ "\t   " 
                    +pri.get(i).getPower()+ "\t   " 
                    + pri.get(i).getPrince() + "\t   "
                    +pri.get(i).getHP()+"\t   "
                    +pri.get(i).getAT()+"\t   "
                    +pri.get(i).getDE()+"\n   ";
            
        }
        JOptionPane.showMessageDialog(null, tdis);
    }}
    /**
     * sorts display menu by defense
     * */
    public static void SortDE(ArrayList<Princess> pri)
    {
        String tdis = "Name \t Hair \t Power \t Prince \t HitPoints \t Attack \t Defense\n";
        for (int i = 0; i < pri.size(); i++) {
            for (int j = 0; j < pri.size()-1; j++) {
                if(pri.get(j).getDE()>pri.get(j+1).getDE()){
                    Princess asdf = pri.get(j);
                    pri.set(j, pri.get(j+1));
                    pri.set(j+1,asdf);
                }
                
            }
            
        }
        for (int i = 0; i < pri.size(); i++) {{
            tdis += pri.get(i).getName() + "\t   "
                    + pri.get(i).getHair()+ "\t   " 
                    +pri.get(i).getPower()+ "\t   " 
                    + pri.get(i).getPrince() + "\t   "
                    +pri.get(i).getHP()+"\t   "
                    +pri.get(i).getAT()+"\t   "
                    +pri.get(i).getDE()+"\n   ";
            
        }
        JOptionPane.showMessageDialog(null, tdis);
    }
}}
