
package finalproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StatsClass {
    /**
     * prints out the stats of the princesses
     */
    public static void Stats(ArrayList<Princess> pri)
    {
        String tdis = "Name \t Attack \t Defense \t HitPoints \n";
        
        for (int i = 0; i < pri.size(); i++) {{
            tdis += pri.get(i).getName() + "\t   "+ pri.get(i).getAT()+ "\t   " + pri.get(i).getDE() + "\t   "+ pri.get(i).getHP()+"\n   ";
            
        }
        JOptionPane.showMessageDialog(null, tdis);
    }
}
}
