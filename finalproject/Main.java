package finalproject;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import org.jfugue.Player;

public class Main {

    public static ArrayList<Princess> pri = new ArrayList<Princess>();
    public static myCharacter hero;
   // public static Player player = new Player();
    public static ArrayList<myCharacter> st = new ArrayList<myCharacter>();

    /**
     * reads in the princess text file
     *
     * @throws Exception
     */
    public static void readData() throws Exception {
        pri = new ArrayList<Princess>();
        Scanner file = new Scanner(new File("Princess.txt"));
        while (file.hasNextLine()) {
            String name = file.nextLine();
            String hair = file.nextLine();
            String power = file.nextLine();
            String prince = file.nextLine();
            int hitpoints = file.nextInt();
            int attack = file.nextInt();
            file.nextLine();
            int defense = Integer.parseInt(file.nextLine());


            pri.add(new Princess(name, hair, power, prince, hitpoints, attack, defense));
            System.out.println(pri.get(pri.size() - 1));

        }
    }

    /**
     * reads in the main character
     *
     * @throws Exception
     */
    public static void readInMC() throws Exception {

        Scanner file = new Scanner(new File("myCharacter.txt"));

        String name = file.nextLine();
        String hair = file.nextLine();
        String power = file.nextLine();
        String prince = file.nextLine();
        int hitpoints = file.nextInt();
        int attack = file.nextInt();
        int defense = file.nextInt();
        file.nextLine();
        String weapon = file.nextLine();
        String shield = file.nextLine();
        int AttackWeapon = file.nextInt();
        int DefenseShield = file.nextInt();
        hero = new myCharacter(name, hair, power, prince, hitpoints, attack, defense, AttackWeapon,
                DefenseShield, weapon, shield);

        System.out.println(hero);


    }

    /**
     * main menu list all sub menu's and other things in game
     *
     */
    public static void Menu() throws Exception {


        String options = "Main Menu \n"
                + "A: Fight random Princess \n"
                + "B: Fight selected Princess \n"
                + "C: Display Menu \n"
                + "D: Search Menu \n"
                + "E: Sort Menu \n"
                + "F: Character Stats \n"
                + "G: PASSWORD \n"
                + "S: Story Mode \n"
                + "Q: Quit";

        String ans = JOptionPane.showInputDialog(null, options).toUpperCase();

        if (ans.contains("A")) {
            test();
        }
        if (ans.contains("B")) {
            test2();
        }
        if (ans.contains("C")) {
            PrintMenu();
        }
        if (ans.contains("D")) {
            PrintSearch();
        }
        if (ans.contains("E")) {
            PrintSort();
        }
        if (ans.contains("F")) {
            StatsClass.Stats(pri);
        }
        if (ans.contains("G")) {
            password();
        }
        if (ans.contains("Q")) {
            System.exit(0);
        }
        if (ans.contains("S")) {
            storymode();
        }
        Menu();

    }

    /**
     * goes to story mode
     *
     * @throws Exception
     */
    public static void storymode() throws Exception {
        String story = JOptionPane.showInputDialog(null, "STORYMODE:\n"
                + "A: How to Play\n"
                + "B: Start");
        if (story.contains("A")) {
            StoryMode.HowToPlay();
        }
        if (story.contains("B")) {
            StoryMode.intro(pri, hero);
        }
    }

    /**
     * secret code that allows you to add a character, delete a character, and
     * change a character
     *
     */
    public static void password() throws Exception {

        String pass = JOptionPane.showInputDialog("TYPE IN PASSWORD");
        String code = "StarWars";


        if (pass.equalsIgnoreCase(code)) {

            String options = "Choose an Item \n"
                    + "A: Add New Character \n"
                    + "B: Change Character \n"
                    + "C: Delete a Princess \n";

            String ans = JOptionPane.showInputDialog(null, options).toUpperCase();
            if (ans.contains("A")) {
                AddMethod.createNew(pri);

            }

            if (ans.contains("B")) {
                String bopt = "Choose an Item \n"
                        + "A: Change Hair \n"
                        + "B: Change Power \n"
                        + "C: Change Prince \n"
                        + "D: Change HitPoints \n"
                        + "E: Change Attack \n"
                        + "F: Change Defense \n";
                String re = JOptionPane.showInputDialog(null, bopt).toUpperCase();
                if (re.contains("A")) {
                    Change.ChangeHair(pri);
                }
                if (re.contains("B")) {
                    Change.ChangePower(pri);
                }
                if (re.contains("C")) {
                    Change.ChangePrince(pri);
                }
                if (re.contains("D")) {
                    Change.ChangeHP(pri);
                }
                if (re.contains("E")) {
                    Change.ChangeAT(pri);
                }
                if (re.contains("F")) {
                    Change.ChangeDE(pri);
                }

            }
            if (ans.contains("C")) {
                DeletePrincess.delete(pri);
            }

        }
        Menu();

    }

    /**
     * Prints out certain items that you choose
     *
     */
    public static void PrintMenu() {
        String options = "Choose an Item \n"
                + "A: Name \n"
                + "B: Name Hair \n"
                + "C: Name Power \n"
                + "D: Name Prince \n";
        String ans = JOptionPane.showInputDialog(null, options).toUpperCase();
        if (ans.contains("A")) {
            PrintClass.Normal(pri);
        }
        if (ans.contains("B")) {
            PrintClass.hair(pri);
        }
        if (ans.contains("C")) {
            PrintClass.power(pri);
        }
        if (ans.contains("D")) {
            PrintClass.Prince(pri);
        }

    }

    /**
     * print menu list to choose a sort
     *
     */
    public static void PrintSort() {
        String options = "Choose a Sort \n"
                + "A: Attack \n"
                + "B: Defense \n"
                + "C: Hitpoints \n";
        String ans = JOptionPane.showInputDialog(null, options).toUpperCase();
        if (ans.contains("A")) {
            SortClass.SortAttack(pri);
        }
        if (ans.contains("B")) {
            SortClass.SortDE(pri);
        }
        if (ans.contains("C")) {
            SortClass.SortHP(pri);
        }

    }

    /**
     * print menu list to search for higher ranks
     *
     */
    public static void PrintSearch() {
        String options = "Choose something to search \n"
                + "A: Attack \n"
                + "B: Defense \n"
                + "C: Hitpoints \n";
        String ans = JOptionPane.showInputDialog(null, options).toUpperCase();
        if (ans.contains("A")) {
            SearchClass.SearchAttack(pri);
        }
        if (ans.contains("B")) {
            SearchClass.SearchDE(pri);
        }
        if (ans.contains("C")) {
            SearchClass.SearchHP(pri);
        }

    }

    /**
     * saves the princess monsters(the enemies)
     *
     */
    public static void SaveP() throws Exception {
        PrintWriter fout = new PrintWriter(new FileWriter("Princess.bac"));
        for (Princess name : pri) {
            fout.println(name.getName());
            fout.println(name.getHair());
            fout.println(name.getPower());
            fout.println(name.getPrince());
            fout.println(name.getHP());
            fout.println(name.getAT());
            fout.println(name.getDE());

            //System.out.println(pri.get(pri.size()-1));
        }
        JOptionPane.showMessageDialog(null, "Saved Finished");
        fout.close();
    }

    /**
     * reads the save method
     *
     */
    public static void Read() throws Exception {
        Scanner file = new Scanner(new File("Princess.bac"));

        while (file.hasNextLine()) {
            String name = file.nextLine();
            String hair = file.nextLine();
            String power = file.nextLine();
            String prince = file.nextLine();
            int hitpoints = file.nextInt();
            int attack = file.nextInt();
            file.nextLine();
            int defense = Integer.parseInt(file.nextLine());


            pri.add(new Princess(name, hair, power, prince, hitpoints, attack, defense));
            System.out.println(pri.get(pri.size() - 1));

        }
    }

    /**
     * makes the characters fight
     *
     */
    public static void test() throws Exception {
        Princess e = FighterClass.getRandomCharacter(pri);
        FighterClass.FightScene(hero, e);
    }

    /**
     * makes the character you select fight
     */
    public static void test2() throws Exception {
        String a = JOptionPane.showInputDialog(null, "Type in name");
        Princess e = SearchClass.SearchName(pri, a);
        SelectFighter.FightSelect(hero, e);
    }

    /**
     * plays music
     *
     * @throws Exception
     */
//    public static void MusicPlayer() throws Exception {
//        player.play("V1  I48 D4i D4i D4i G4h D5h C5i B4i A4i G5h D5q "
//                + "C5i B4i A4i  G5h D5q C5i B4i C5i A4h D4q D4i G4h D5h C5i"
//                + " B4i A4i G5h D5q C5i B4i A4i G5h D5q C5i B4i C5i A4h");
//
//    }

    /**
     * runs the program
     *
     */
    public static void main(String[] args) throws Exception {

        Read();
        readInMC();
        GraphicsRunner asdf = new GraphicsRunner();
        //MusicPlayer();
        Menu();


    }
}
