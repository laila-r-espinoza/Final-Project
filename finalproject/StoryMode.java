package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.jfugue.player.Player;

public class StoryMode {

    static ArrayList<Princess> pri;
    static ArrayList<myCharacter> st;
    static myCharacter princess;
    public static Player player = new Player();

    /**
     * tells you how to play
     */
    public static void HowToPlay() {
        JOptionPane.showMessageDialog(null, "HOW TO PLAY");
        JOptionPane.showMessageDialog(null, "Type in the key words in lowercase\n "
                + "to make move when given the option.\n "
                + "Press ok to move onto the next\n "
                + "step or scene.\n");
    }

    /**
     * Intro to the story
     *
     * @param pr
     * @param as
     */
    public static void intro(ArrayList<Princess> pr, myCharacter as) throws Exception {
        pri = pr;
        princess = as;

        JOptionPane.showInputDialog(null, "Once Upon a Time in a Galaxy far far away \n "
                + "an Evil Queen poisned all the Disney princesses.");
        JOptionPane.showMessageDialog(null, "The poison made all the Princesses go mad.\n "
                + "They have already started to tear apart the world of NeverLand.");
        JOptionPane.showMessageDialog(null, "It is now your duty as Princess of the Galaxy to defeat ALL of them!");
        String ans = JOptionPane.showInputDialog(null, "Are you ready to DEFEAT THE DISNEY PRINCESSES?!?!\n", "yes or no");
        if (ans.contains("yes")) {
            String a = JOptionPane.showInputDialog(null, "You have been equipped with a ray gun.\n "
                    + "Do you want to proceed to leave the starship?", "yes or no");
            if (a.contains("yes")) {
                JOptionPane.showMessageDialog(null, "Leaving the starship.");
                fight1();
            }
            if (a.contains("no")) {
                NO();
            }
        }
        if (ans.contains("no")) {
            NO();
        }
    }

    /**
     * return player to main menu
     */
    public static void NO() throws Exception {
        JOptionPane.showMessageDialog(null, "Going back to Main Menu.");
        Main.Menu();
    }

    /**
     * first fight
     */
    public static void fight1() throws Exception {
        Princess b = StoryFight.getRandomCharacter(pri);
        JOptionPane.showMessageDialog(null, "You have come up to your First princess " + b + ".");
        StoryFight.Fight1(princess, b);
    }

    /**
     * if you pass fight 1`you go to part 1
     */
    public static void part1() throws Exception {
        String run = JOptionPane.showInputDialog(null, "You have defeated your first "
                + "princess.\n Do you want to go through the woods to get to the "
                + "Evil Queen's Castle\n or run to the mountains to see if there are any Princesses there?", "woods or mountains");
        if (run.contains("woods")) {
            String stand = JOptionPane.showInputDialog(null, "You are running through the woods and"
                    + " hear a sound.\n Do you keep running or stand still?", "run or stand");
            if (stand.contains("run")) {
                String attack = JOptionPane.showInputDialog(null, "You hear someone running after you.\n "
                        + "Do you turn around and "
                        + "attack\n or keep running till you can't run any more?", "attack or run");
                if (attack.contains("attack")) {
                    fight2();
                }
                if (attack.contains("run")) {
                    JOptionPane.showMessageDialog(null, "A princess catches up to you and attacks you till you die.");
                    NO();
                }
            }
            if (stand.contains("stand")) {
                String ata = JOptionPane.showInputDialog(null, "You hear movement behind a tree.\n "
                        + "Suddenly a princess comes out.\n "
                        + "Do you attack or scream?", "attack or scream");
                if (ata.contains("attack")) {
                    fight2();
                }
                if (ata.contains("scream")) {
                    JOptionPane.showMessageDialog(null, "The princess attacks you and you die.");
                    NO();
                }
            }
        }
        if (run.contains("mountains")) {
            JOptionPane.showMessageDialog(null, "You fell into a well and drowned.");
            NO();
        }
    }

    /**
     * second fight
     */
    public static void fight2() throws Exception {
        Princess b = StoryFight.getRandomCharacter(pri);
        JOptionPane.showMessageDialog(null, "You have come up to your Second princess " + b + ".");
        StoryFight.Fight2(princess, b);
    }

    /**
     * if you pass fight 2 you go to part 2, 3, or 4 depending on your path
     */
    public static void part234() throws Exception {
        String run = JOptionPane.showInputDialog(null, "You have defeated your Second Princess.\n "
                + "Do you want to keep running to the Evil Queen's Castle\n or run to go get a better weapon?", "run or change");
        if (run.contains("run")) {
            String de = JOptionPane.showInputDialog(null, "You finally arrive to the Evil Queen's Castle.\n "
                    + "Her servant tells you she has killed herself\n "
                    + "in an attempt to not have to face her murderous princesses.\n "
                    + "Do you continue to search her castle or leave?", "search or leave");

            //part 2
            //goes to fight 3
            if (de.contains("search")) {
                JOptionPane.showMessageDialog(null, "You walk into the Evil Queen's Bedroom.");
                String as = JOptionPane.showInputDialog(null, "A princess comes out from her closest.\n Do you attack or hide?", "attack or hide");
                if (as.contains("attack")) {
                    fight3();
                }
                if (as.contains("hide")) {
                    JOptionPane.showMessageDialog(null, "The princess found you and killed you.");
                    NO();
                }
            }

            //part 3
            //goes to fight 4
            if (de.contains("leave")) {
                JOptionPane.showMessageDialog(null, "You leave the Castle and run through a path nearby.\n You come across a weaping lonely girl.");
                String s = JOptionPane.showInputDialog(null, "Do you go up to her or keep running?", "go or run");
                if (s.contains("g")) {
                    JOptionPane.showMessageDialog(null, "It is a Princess her potion has worn off and\n she asks if you can help her go back to her castle.");
                    String asde = JOptionPane.showInputDialog(null, "Do you help her or just run off?", "help or run");
                    if (asde.contains("help")) {
                        JOptionPane.showMessageDialog(null, "Y'all start to walk through the path\n when a gust of wind pushes y'all down.");
                        JOptionPane.showMessageDialog(null, "A princess comes out and threatens to attack.");
                        String attt = JOptionPane.showInputDialog(null, "Do you attack or run?", "attack or run");
                        if (attt.contains("attack")) {
                            fight4();
                        }
                        if (attt.contains("run")) {
                            JOptionPane.showMessageDialog(null, "You run to a nearby bush and drag the princess along with you.\n You hide untill the evil princess goes away. \n You start to walk again when the evil princess comes back this time you have to fight or die.");
                            String die = JOptionPane.showInputDialog(null, "Do you fight or die?", "fight or die");
                            if (die.contains("fight")) {
                                fight4();
                            }
                            if (die.contains("die")) {
                                JOptionPane.showMessageDialog(null, "You have chosen to die.\n The galaxy falls in ruins and every planet is destroyed.");
                                NO();
                            }
                        }
                    }
                    if (asde.contains("run")) {
                        JOptionPane.showMessageDialog(null, "Her potion wasn't really worn off\n she just tricked you and killed you.");
                        NO();
                    }
                }
                if (s.contains("run")) {
                    JOptionPane.showMessageDialog(null, "She runs after you and kills you");
                    NO();
                }
            }
        }
        //part 4
        //goes to fight 5
        if (run.contains("change")) {
            changeweap(st);
            String w = JOptionPane.showInputDialog(null, "Your gun has been changed.\n "
                    + "Do you run back through a desert to reach a hard to see\n "
                    + "castle or run to the forest?", "castle or forest");
            if (w.contains("castle")) {
                JOptionPane.showMessageDialog(null, "You run through the desert for an hour\n "
                        + "and finally come up to a castle.\n"
                        + "You walk inside and see a woman.\n "
                        + "It's a princess!");
                String q = JOptionPane.showInputDialog(null, "Do you ATTACK or RUN?!", "attack or run");
                if (q.contains("attack")) {
                    fight5();
                }
                if (q.contains("run")) {
                    JOptionPane.showMessageDialog(null, "She chases you and kills you.");
                    NO();
                }

                if (w.contains("forest")) {
                    JOptionPane.showMessageDialog(null, "You run through the forest and come across another princess.");
                    String o = JOptionPane.showInputDialog(null, "Do you ATTACK or RUN?!", "attack or run");
                    if (o.contains("attack")) {
                        fight5();
                    }
                    if (o.contains("run")) {
                        JOptionPane.showMessageDialog(null, "You run away trying to avoid the princess.\n"
                                + "As you run another princess comes up to you\n "
                                + "and you try to fight back but she has the uper hand and you die.");
                        NO();
                    }
                }


            }

        }
    }

    /**
     * changes the weapon
     */
    public static void changeweap(ArrayList<myCharacter> st) throws FileNotFoundException {
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

    /**
     * part 2 3rd fight
     *
     * @throws Exception
     */
    public static void fight3() throws Exception {
        Princess b = StoryFight.getRandomCharacter(pri);
        JOptionPane.showMessageDialog(null, "You have come up to your Third princess." + b + ".");
        StoryFight.Fight3(princess, b);
    }

    /**
     * part 3 3rd fight
     *
     * @throws Exception +
     */
    public static void fight4() throws Exception {
        Princess b = StoryFight.getRandomCharacter(pri);
        JOptionPane.showMessageDialog(null, "You have come up to your Third princess." + b + ".");
        StoryFight.Fight4(princess, b);
    }

    /**
     * part 4 3rd fight
     *
     * @throws Exception +
     */
    public static void fight5() throws Exception {
        Princess b = StoryFight.getRandomCharacter(pri);
        JOptionPane.showMessageDialog(null, "You have come up to your Third princess." + b + ".");
        StoryFight.Fight5(princess, b);
    }

    /**
     * Ends the story
     *
     * @throws Exception
     */
    public static void TheEnd() throws Exception {
        JOptionPane.showMessageDialog(null, "You are in a white room.");
        JOptionPane.showMessageDialog(null, "A lady stands in a corner weaping.");
        JOptionPane.showMessageDialog(null, "You walk up to her slowly and she starts to turn around.");
        String e = JOptionPane.showInputDialog(null, "She looks at you with watery eyes.\n "
                + "You notice she is the Evil Queen.\n "
                + "Do you try and RUN from fear or try and \n"
                + "SEE why she is crying and why she's still alive?");
        if (e.contains("run")) {
            JOptionPane.showMessageDialog(null, "She stares into your soul and turns you to ash.");
            NO();
        }
        if (e.contains("see")) {
            JOptionPane.showMessageDialog(null, "She tells you how she has made a big mistake\n"
                    + "and says how she only wanted to kill off\n "
                    + "the evil jedi who wanted to take over NeverLand.");
            JOptionPane.showMessageDialog(null, "You feel her sorrow and ask to help.\n "
                    + "She tells you to take the crystal from your safety lightsaber\n "
                    + "and stab her then to take it to the mystic well and drop it in.\n");
            String o = JOptionPane.showInputDialog(null, "Do you HELP her or LEAVE her?");
            if (o.contains("help")) {
                JOptionPane.showMessageDialog(null, "You take the crystal out of your lightsaber "
                        + "and stab her with it.\n "
                        + "You fall from no where and start to run you then see the mystic well and run faster.");
                JOptionPane.showMessageDialog(null, "A jedi stops you along the way and asks where you are going.");
                String p = JOptionPane.showInputDialog(null, "Which is the best excuse?\n"
                        + "A: I have to go see my sick mother.\n"
                        + "B: I am the princess of the galaxy and I demand you let me through!\n"
                        + "C: I am trying to help the Evil Queen with an arrand.\n"
                        + "D: I am just looking at the land.", "type in CAPITALIZED letter");
                if (p.contains("A")) {
                    JOptionPane.showMessageDialog(null, "You get to the well and drop the crystal in.\n"
                            + "It turns the water purple then it sparks and all war goes silent.");
                    JOptionPane.showMessageDialog(null, "You see Princesses running to you and the jedi as well.");
                    JOptionPane.showMessageDialog(null, "They shatter into ashes right before you.");
                    JOptionPane.showMessageDialog(null, "Only a few Jedi come up to you and hand you a paper.");
                    JOptionPane.showMessageDialog(null, "The paper reads:");
                    StoryGraphicsRunner asdf = new StoryGraphicsRunner();
                    player.play("V1  I48 D4i D4i D4i G4h D5h C5i B4i A4i G5h D5q C5i B4i A4i  G5h "
                            + "D5q C5i B4i C5i A4h D4q D4i G4h D5h C5i B4i A4i G5h D5q C5i B4i A4i "
                            + "G5h D5q C5i B4i C5i A4h");
                }
                if (p.contains("B")) {
                    JOptionPane.showMessageDialog(null, "They take you and kill you because they \n"
                            + "did not believe you and thought you were mad.");
                    NO();
                }
                if (p.contains("C")) {
                    JOptionPane.showMessageDialog(null, "They kill you due to your relation to the Evil Queen.");
                    NO();
                }
                if (p.contains("D")) {
                    JOptionPane.showMessageDialog(null, "You get to the well and drop the crystal in.\n"
                            + "It turns the water purple then it sparks and all war goes silent.");
                    JOptionPane.showMessageDialog(null, "You see Princesses running to you and jedis as well.");
                    JOptionPane.showMessageDialog(null, "They shatter into ashes right before you.");
                    JOptionPane.showMessageDialog(null, "Only a few Jedi come up to you and hand you a paper.");
                    JOptionPane.showMessageDialog(null, "The paper reads:");
                    StoryGraphicsRunner asdf = new StoryGraphicsRunner();
                    player.play("V1  I48 D4i D4i D4i G4h D5h C5i B4i A4i G5h D5q C5i B4i A4i  G5h "
                            + "D5q C5i B4i C5i A4h D4q D4i G4h D5h C5i B4i A4i G5h D5q C5i B4i A4i "
                            + "G5h D5q C5i B4i C5i A4h");
                }


            }
            if (o.contains("leave")) {
                JOptionPane.showMessageDialog(null, "She steals your lightsaber and kills you with it.");
                NO();
            }
        }

    }
}
