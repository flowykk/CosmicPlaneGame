import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    public static final int max_speed = 200;
    public static final int max_top = 0;
    public static final int max_bottom = 887;

    Image plane = new ImageIcon("cosmoplane.png").getImage();

    public Rectangle r() {
        return new Rectangle(x, y, 270, 134);
    }

    int speed = 0; //скорость
    int acceleration = 0; //ускорение
    int route = 0; // весь путь

    int x = 100;
    int y = 400;
    int dy = 0;

    int coord1 = 0;
    int coord2 = 1920;

    public void move() {
        route += speed;
        speed += acceleration;

        if (speed <= 0)
            speed = 0;
        if (speed >= max_speed)
            speed = max_speed;

        y -= dy;

        if (y <= max_top)
            y = max_top;
        if (y >= max_bottom)
            y = max_bottom;

        if (coord2 - speed <= 0) {
            coord1 = 0;
            coord2 = 1920;
        }
        else {
            coord1 -= speed;
            coord2 -= speed;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            acceleration = 1;
        }
        if (key == KeyEvent.VK_LEFT) {
            acceleration = -1;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 20;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = -20;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
            acceleration = 0;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }

    }
}
