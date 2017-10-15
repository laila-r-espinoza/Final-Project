
package finalproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class SelectFighter {
    
    
    /**
     * makes you and the princess of your choice fight
     * @param hero
     * @param Enemy 
     */
    public static void FightSelect(myCharacter hero, Princess Enemy) throws Exception {
        JOptionPane.showMessageDialog(null, "Once Upon a Time in a Galaxy far far away "
                + "an Evil Queen poisned all the Disney princesses.");
        JOptionPane.showMessageDialog(null, "The poison made all the Princesses go mad. "
                + "They have already started to tear apart the land.");
        JOptionPane.showMessageDialog(null, "It is now your duty as Princess of the Galaxy to defeat ALL of them!");
        String asdf = JOptionPane.showInputDialog(null, "Are you ready to DEFEAT THE DISNEY PRINCESSES?!?!");
        if(asdf.contains("Y"))
        {
        boolean fight = true;
        while (fight) {
            DisplayStats(hero);
            DisplayStats(Enemy);
            String ans = JOptionPane.showInputDialog("Do you want to fight "+ Enemy+" or Run").toUpperCase();

            if (ans.contains("R")) {
                Main.Menu();
//                
            }
            if (fight) {
                Enemy.Fight(Enemy);
            }
            if (hero.getHP() <= 0) {
                JOptionPane.showMessageDialog(null, Enemy+" has defeated you.");
            }

            if (Enemy.getHP() <= 0) {
                JOptionPane.showMessageDialog(null, "You have defeated "+Enemy);
                fight = false;
            }
            
        }
    }
        if(asdf.contains("N")){
            Main.Menu();
        }
    }
    /**
     * displays characters stats
     * @param toDisplay 
     */
     public static void DisplayStats(Princess toDisplay) {
        String Stats = "";
        Stats += "Name: " + toDisplay.getName() + "\n";
        Stats += "Hair: " + toDisplay.getHair() + "\n";
        Stats += "Power: " + toDisplay.getPower() + "\n";
        Stats += "Prince: " + toDisplay.getPrince() + "\n";
        Stats += "Hitpoints: " + toDisplay.getHP() + "\n";
        Stats += "Attack: " + toDisplay.getAT() + "\n";
        Stats += "Defense: " + toDisplay.getDE() + "\n";
        JOptionPane.showMessageDialog(null, Stats);
    }
}
