package finalproject;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AddMethod {

    /**
     * creates a new character
     * @param pri 
     */
    public static void createNew(ArrayList<Princess> pri) {
        Princess newChar = new Princess();

        String Name = JOptionPane.showInputDialog(null, "Enter new Princess Name");
        newChar.changeName(Name);

        String Hair = JOptionPane.showInputDialog(null, "Enter new Princess Hair");
        newChar.changeHair(Hair);

        String Power = JOptionPane.showInputDialog(null, "Enter new Princess Power");
        newChar.changePower(Power);

        String Prince = JOptionPane.showInputDialog(null, "Enter new Princess Prince");
        newChar.changePrince(Prince);

        int HP = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new Princess HitPoints"));
        newChar.changeHP(HP);

        int AT = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new Princess Attack"));
        newChar.changeAT(AT);

        int DE = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new Princess Defense"));
        newChar.changeDE(DE);

        pri.add(newChar);
    }
}
