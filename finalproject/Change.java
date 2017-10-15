package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Change {

    /**
     * changes the hair of a character
     *
     * @param pri
     */
    public static void ChangeHair(ArrayList<Princess> pri) {
        String Name = JOptionPane.showInputDialog("Enter Name to Find: \n");
        for (int i = 0; i < pri.size(); i++) {
            if (pri.get(i).getName().contains(Name)) {
                String ans = JOptionPane.showInputDialog(null, pri.get(i).getName()
                        + " Found! \n"
                        + "Her hair is '" + pri.get(i).getHair() + "' \n"
                        + "Do you want to change her Hair? \n");
                if (ans.contains("Y")) {
                    String newhair = JOptionPane.showInputDialog("Enter New Hair: \n");
                    pri.get(i).changeHair(newhair);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Finished Changing Hair");
    }

    /**
     * changes the power of a character
     *
     */
    public static void ChangePower(ArrayList<Princess> pri) {
        String Name = JOptionPane.showInputDialog("Enter Name to Find: \n");
        for (int i = 0; i < pri.size(); i++) {
            if (pri.get(i).getName().contains(Name)) {
                String ans = JOptionPane.showInputDialog(null, pri.get(i).getName()
                        + "Found! \n"
                        + "Her power is '" + pri.get(i).getPower() + "' \n"
                        + "Do you want to change her Power? \n");
                if (ans.contains("Y")) {
                    String newp = JOptionPane.showInputDialog("Enter New Power: \n");
                    pri.get(i).changePower(newp);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Finished Changing Power");
    }

    /**
     * changes the prince of a character
     *
     * @param pri
     */
    public static void ChangePrince(ArrayList<Princess> pri) {
        String Name = JOptionPane.showInputDialog("Enter Name to Find: \n");
        for (int i = 0; i < pri.size(); i++) {
            if (pri.get(i).getName().contains(Name)) {
                String ans = JOptionPane.showInputDialog(null, pri.get(i).getName()
                        + "Found! \n"
                        + "Her Prince is '" + pri.get(i).getPrince() + "' \n"
                        + "Do you want to change her Prince? \n");
                if (ans.contains("Y")) {
                    String newp = JOptionPane.showInputDialog("Enter New Prince: \n");
                    pri.get(i).changePrince(newp);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Finished Changing Prince");
    }

    /**
     * changes the hp of a character
     *
     * @param pri
     */
    public static void ChangeHP(ArrayList<Princess> pri) {
        String Name = JOptionPane.showInputDialog("Enter Name to Find: \n");
        for (int i = 0; i < pri.size(); i++) {
            if (pri.get(i).getName().contains(Name)) {
                String ans = JOptionPane.showInputDialog(null, pri.get(i).getName()
                        + "Found! \n"
                        + "Her hitpoints is '" + pri.get(i).getHP() + "' \n"
                        + "Do you want to change her HitPoints? \n");
                if (ans.contains("Y")) {
                    int newhp = Integer.parseInt(JOptionPane.showInputDialog("Enter New HitPoints: \n"));
                    pri.get(i).changeHP(newhp);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Finished Changing HitPoints");
    }

    /**
     * changes the attack of a character
     *
     * @param pri
     */
    public static void ChangeAT(ArrayList<Princess> pri) {
        String Name = JOptionPane.showInputDialog("Enter Name to Find: \n");
        for (int i = 0; i < pri.size(); i++) {
            if (pri.get(i).getName().contains(Name)) {
                String ans = JOptionPane.showInputDialog(null, pri.get(i).getName()
                        + "Found! \n"
                        + "Her attack is '" + pri.get(i).getAT() + "' \n"
                        + "Do you want to change her Attack? \n");
                if (ans.contains("Y")) {
                    int newat = Integer.parseInt(JOptionPane.showInputDialog("Enter New Attack: \n"));
                    pri.get(i).changeAT(newat);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Finished Changing Attack");
    }

    /**
     * changes the defense of a character
     *
     * @param pri
     */
    public static void ChangeDE(ArrayList<Princess> pri) {
        String Name = JOptionPane.showInputDialog("Enter Name to Find: \n");
        for (int i = 0; i < pri.size(); i++) {
            if (pri.get(i).getName().contains(Name)) {
                String ans = JOptionPane.showInputDialog(null, pri.get(i).getName()
                        + "Found! \n"
                        + "Her defense is '" + pri.get(i).getDE() + "' \n"
                        + "Do you want to change her Defense? \n");
                if (ans.contains("Y")) {
                    int newde = Integer.parseInt(JOptionPane.showInputDialog("Enter New Defense: \n"));
                    pri.get(i).changeDE(newde);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Finished Changing Defense");
    }

    public Change(ArrayList<myCharacter> st) throws FileNotFoundException {
        Scanner file = new Scanner(new File("guns.txt"));
        String[] guns = new String[6];
        while (file.hasNextLine()) {
            guns[0] = file.nextLine();
            guns[1] = file.nextLine();
            guns[2] = file.nextLine();
            guns[3] = file.nextLine();
            guns[4] = file.nextLine();
            guns[5] = file.nextLine();
            file.nextLine();

            int num = guns.length;
            int randchar = (int) (num * Math.random());
            for (int i = 0; i < st.size(); i++) {
                if (st.get(i).getWeapon().equalsIgnoreCase(null)) {
                    st.get(i).changeWeapon(guns[randchar]);
                }
                if (st.get(i).getAttackWeapon() >= 0 || st.get(i).getAttackWeapon() <= 0) {
                    st.get(i).changeAttackWeapon(100);
                }

            }


        }
    }
}
