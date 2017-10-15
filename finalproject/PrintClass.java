
package finalproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PrintClass {
    //3 different prints
    //display the name field and special move of all princesses
/**
 * prints out just Name
 
 */
    public static void Normal(ArrayList<Princess> pri) {
        String tdis = "Name \n";

        for (int i = 0; i < pri.size(); i++) {
            {
                tdis += pri.get(i).getName() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, tdis);
    }
/**
 * prints out name and hair
 */
    public static void hair(ArrayList<Princess> pri) {
        String tdis = "Name \t Hair \n";

        for (int i = 0; i < pri.size(); i++) {
            {
                tdis += pri.get(i).getName() + "\t   " + pri.get(i).getHair() + "\n   ";
            }
        }
        JOptionPane.showMessageDialog(null, tdis);
    }
/**
 * prints out name and power
 */
    public static void power(ArrayList<Princess> pri) {
        String tdis = "Name \t Power \n";

        for (int i = 0; i < pri.size(); i++) {
            {
                tdis += pri.get(i).getName() + "\t   " + pri.get(i).getPower() + "\n   ";

            }

        }
        JOptionPane.showMessageDialog(null, tdis);
    }
/**
 * prints out name and prince
 */
    public static void Prince(ArrayList<Princess> pri) {
        String tdis = "Name \t Prince \n";

        for (int i = 0; i < pri.size(); i++) {
            {
                tdis += pri.get(i).getName() + pri.get(i).getPrince() + "\n   ";

            }

        }
        JOptionPane.showMessageDialog(null, tdis);
    }
}
