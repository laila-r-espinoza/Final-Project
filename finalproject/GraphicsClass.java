package finalproject;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

class GraphicsClass extends java.applet.Applet {

    /**
     * sets background color
     */
    public GraphicsClass() {
        setSize(800, 800);
        setBackground(Color.CYAN);
        setVisible(true);
    }

    /**
     * puts image on background and puts a title on it
     *
     * @param window
     */
    public void paint(Graphics window) {
        window.setColor(Color.BLUE);
        try {
            Image image = ImageIO.read(new File("priBackGround.gif"));

            window.drawImage(image, 100, 100, 550, 500, null);
        } catch (Exception e) {
        }

        window.setColor(Color.magenta);
        window.setFont(new Font("TimesRoman", Font.BOLD, 75));
        window.drawString("Princess Battles", 80, 90);

    }
}

/**
 * GraphicsRunner Class
 *
 */
class GraphicsRunner extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    /**
     * Used to setup canvas
     */
    public GraphicsRunner() {
        super("Graphics Runner");
        setSize(WIDTH, HEIGHT);
        getContentPane().add(new GraphicsClass());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}