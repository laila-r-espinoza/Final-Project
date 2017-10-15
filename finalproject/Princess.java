package finalproject;

import javax.swing.JOptionPane;

public class Princess {

    private String name;
    private String hair;
    private String power;
    private String prince;
    private int hitpoints;
    private int attack;
    private int defense;

    /**
     * set characteristics to nothing
     * */
    public Princess() {
        name = "";
        hair = "";
        power = "";
        prince = "";
        hitpoints = 0;
        attack = 0;
        defense = 0;

    }
    
    /**
     * name variables
     * */
    public Princess(String na, String ha, String po, String pr, int hi, int at, int de) {
        name = na;
        hair = ha;
        power = po;
        prince = pr;
        this.hitpoints = hi;
        attack = at;
        defense = de;
    }

    /**
     * gets name from above
     * */
    public String getName() {
        return name;
    }
    
    /**
     * changes it to name in txt
     * */
    public void changeName(String newName) {
        name = newName;
    }

    /**
     * gets Hair from above
     * */
    public String getHair() {
        return hair;
    }
    
    /**
     * changes it to hair in txt
     * */
    public void changeHair(String newHair) {
        hair = newHair;
    }

    /**
     * gets power from above
     * */
    public String getPower() {
        return power;
    }
    
    /**
     * changes it to power in txt
     * */
    public void changePower(String newPower) {
        power = newPower;
    }

    /**
     * gets prince from above
     * */
    public String getPrince() {
        return prince;
    }
    
    /**
     * changes it to prince in txt
     * */
    public void changePrince(String newPrince) {
        prince = newPrince;
    }

    /**
     * gets hitpoints from above
     * */
    public int getHP() {
        return hitpoints;
    }
    /**
     * changes it to hitpoints in txt
     * */

    public void changeHP(int newHP) {
        hitpoints = newHP;
    }

    /**
     * gets attack from above
     * */
    public int getAT() {
        return attack;
    }
    /**
     * changes it to attack in txt
     * */

    public void changeAT(int newAT) {
        attack = newAT;
    }

    /**
     * gets defense from above
     * */
    public int getDE() {
        return defense;
    }
    /**
     * changes it to defense in txt
     * */

    public void changeDE(int newDE) {
        defense = newDE;
    }

    /**
     * puts name: in front of the name field
     * */
    public String toString() {
        return "Name: " + this.name;
    }
/**
 * makes characters fight
 * @param other 
 */
    public void Fight(Princess other) {
        int chanThis = (int) (Math.random() * 10);
        int chanOther = (int) (Math.random() * 10);

        if (other.getDE() * chanOther < this.getAT() * chanThis) {
            JOptionPane.showMessageDialog(null, this.getName() + "Does damage");
            other.changeHP(other.getHP() - this.getAT());
        }
        if (this.getDE() * chanThis < other.getAT() * chanOther) {
            JOptionPane.showMessageDialog(null, other.getName() + "Does damage");
            this.changeHP(this.getHP() - other.getAT());
        }
    }
}
