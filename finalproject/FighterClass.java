package finalproject;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FighterClass {

    
    /**
     * chooses a random character
     * @param list
     * @return 
     */
    public static Princess getRandomCharacter(ArrayList<Princess> list) {
        int num = list.size();
        int randchar = (int) (num * Math.random());
        return list.get(randchar);
    }
    
    
    /**
     * used to fight between hero and enemy
     * @param hero
     * @param Enemy 
     */
    public static void FightScene(myCharacter hero, Princess Enemy) throws Exception {
        String asdf = JOptionPane.showInputDialog(null, "Are you ready to DEFEAT THE DISNEY PRINCESSES?!?!","Yes or No");
        if(asdf.contains("Y"))
        {
        boolean fight = true;
        while (fight) {
            DisplayStats(hero);
            DisplayStats(Enemy);
            String ans = JOptionPane.showInputDialog("Do you want to fight "+ Enemy+" or do you want to run away?").toUpperCase();

            if (ans.contains("R")) {
                int chance = (int) (Math.random() * 10);
                if (chance > 8) {
                    fight = false;
                }
            }
            if (fight) {
                Enemy.Fight(Enemy);
            }
            if (hero.getHP() <= 0) {
                JOptionPane.showMessageDialog(null, Enemy+" has defeated you.");
            }

            if (Enemy.getHP() <= 0) {
                JOptionPane.showMessageDialog(null, "You have defeated "+Enemy+".");
                fight = false;
            }
        }
    }
        if(asdf.contains("N")){
            Main.Menu();
        }
        Main.Menu();
    }
    
    
   /**
     * used to display stats for a character
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
