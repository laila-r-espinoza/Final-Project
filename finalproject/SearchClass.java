package finalproject;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class SearchClass {

    /**
     * searches by attack
     * @param pri 
     */
    public static void SearchAttack(ArrayList<Princess> pri)
    {
        int attack = Integer.parseInt(JOptionPane.showInputDialog("Enter attack to find, "
                + "I will display all larger attacks."));
        for (int i = 0; i < pri.size(); i++) {
            if(pri.get(i).getAT()>attack)
            {
                FighterClass.DisplayStats(pri.get(i));
            }
            
        }
        JOptionPane.showMessageDialog(null, "Finished Attack Search Class");
    }
    
    /**
     * searches by defense
     * @param pri 
     */
    public static void SearchDE(ArrayList<Princess> pri)
    {
        int de = Integer.parseInt(JOptionPane.showInputDialog("Enter defense to find, "
                + "I will display all larger defenses."));
        for (int i = 0; i < pri.size(); i++) {
            if(pri.get(i).getDE()>de)
            {
                FighterClass.DisplayStats(pri.get(i));
            }
            
        }
        JOptionPane.showMessageDialog(null, "Finished Defense Search Class");
    }
    
    /**
     * searches by HP
     * @param pri 
     */
    public static void SearchHP(ArrayList<Princess> pri)
    {
        int hp = Integer.parseInt(JOptionPane.showInputDialog("Enter hitpoints to find, "
                + "I will display all larger hitpoints."));
        for (int i = 0; i < pri.size(); i++) {
            if(pri.get(i).getHP()>hp)
            {
                FighterClass.DisplayStats(pri.get(i));
            }
            
        }
        JOptionPane.showMessageDialog(null, "Finished HitPoints Search Class");
    }
    /**
     * searches by name
     * @param pri
     * @param name
     * @return 
     */
    public static Princess SearchName(ArrayList<Princess> pri ,String name)
    {
       
        for (int i = 0; i < pri.size(); i++) {
            if(pri.get(i).getName().equalsIgnoreCase(name))
            {
                return (pri.get(i));
            }
            
        }
        return pri.get(0);
    }
}
