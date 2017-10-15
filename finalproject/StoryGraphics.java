package finalproject;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import javax.imageio.ImageIO;

class StoryGraphics extends java.applet.Applet {

    /**
     * sets background color
     */
    public StoryGraphics() {
        setSize(800, 800);
        setBackground(Color.GREEN);
        setVisible(true);
    }

    /**
     * puts image on background and puts a title on it and ending credits
     *
     * @param window
     */
    public void paint(Graphics window) {
        window.setColor(Color.CYAN);
        try {
            Image image = ImageIO.read(new File("scroll2.GIF"));

            window.drawImage(image, 100, 100, 550, 600, null);
        } catch (Exception e) {
        }

        window.setColor(Color.pink);
        window.setFont(new Font("TimesRoman", Font.BOLD, 60));
        window.drawString("Princess Battles", 145, 80);
        window.setColor(Color.white);
        window.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        window.drawString("     My dear Princess Leia, you have ", 185, 180);
        window.drawString("   accomplished so many things.", 185, 210);
        window.drawString("   Many being saving this world, ", 185, 240);
        window.drawString("   NeverLand, from complete destruction.", 185, 270);
        window.drawString("   I am very proud of you and ", 185, 300);
        window.drawString("   all you have done. The princesses and", 185, 330);
        window.drawString("   jedis that have been destroyed ", 185, 360);
        window.drawString("   were the evil ones, the ones that", 185, 390);
        window.drawString("   knew no better than to betray ", 185, 420);
        window.drawString("   their home lands and galaxies.", 185, 450);
        window.drawString("     You my dear, and a few others ", 185, 480);
        window.drawString("   are the heros and true beings.", 185, 510);
        window.drawString("   I wish you luck on your ", 185, 540);
        window.drawString("   future journeys and that you stay a", 185, 570);
        window.drawString("   true Princess.", 185, 600);
        window.drawString("Love Your Real Mother,", 185, 640);
        window.drawString("           Queen Grimhilde", 185, 660);
        window.drawString("           Code:StarWars", 185, 670);
        

    }
}

/**
 * GraphicsRunner Class
 *
 */
class StoryGraphicsRunner extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    /**
     * Used to setup canvas
     */
    public StoryGraphicsRunner() {
        super("Graphics");
        setSize(WIDTH, HEIGHT);
        getContentPane().add(new StoryGraphics());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
