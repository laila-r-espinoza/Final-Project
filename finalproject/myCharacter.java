package finalproject;

public class myCharacter extends Princess {

    public String weapon;
    private String shield;
    public int AttackWeapon;
    private int DefenseShield;

    
    public myCharacter() {
        super();
    }
/**
 * sets the variables
 * @param na
 * @param ha
 * @param po
 * @param pr
 * @param hi
 * @param at
 * @param de
 * @param weap
 * @param shei
 * @param theWeap
 * @param theShei 
 */
    public myCharacter(String na, String ha, String po,
            String pr, int hi, int at, int de,
            int weap, int shei, String theWeap, String theShei) {
        super(na, ha, po, pr, hi, at, de);
        weapon = theWeap;
        shield = theShei;
        AttackWeapon = weap;
        DefenseShield = de;

    }
/**
 * gets the weapon
 * @return 
 */
    public String getWeapon() {
        return weapon;
    }
    /**
     * changes the weapon
     * @param newWeapon 
     */

    public void changeWeapon(String newWeapon) {
        weapon = newWeapon;
    }
/**
 * gets the shield
 * @return 
 */
    public String getShield() {
        return shield;
    }
/**
 * changes the shield
 * @param newshield 
 */
    public void changeShield(String newshield) {
        this.shield = newshield;
    }
/**
 * get the attack weapon
 * @return 
 */
    public int getAttackWeapon() {
        return AttackWeapon;
    }
/**
 * changes the attack weapon
 * @param newAttackWeapon 
 */
    public void changeAttackWeapon(int newAttackWeapon) {
        AttackWeapon = newAttackWeapon;
    }
/**
 * gets defense shield
 * @return 
 */
    public int getDefenseShield() {
        return DefenseShield;
    }
/**
 * changes defense shield
 * @param newDefenseShield 
 */
    public void changeDefenseShield(int newDefenseShield) {
        this.DefenseShield = newDefenseShield;
    }
/**
 * gets the attack and changes
 * @return 
 */
    public int getAttack() {
        return super.getAT() + AttackWeapon;
    }

    /**
     * get the defense and changes
     * @return 
     */
    public int getDefense() {
        return super.getDE() + DefenseShield;
    }
}
