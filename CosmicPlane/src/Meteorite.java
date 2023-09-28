import javax.swing.*;
import java.awt.*;

public class Meteorite {
    int x;
    int y;
    int speed=-1;

    Image Meteorite = new ImageIcon("meteoriteee.png").getImage();
    Cosmos cosmos;





    public Rectangle r() {
        return new Rectangle(x, y, 270, 258);
    }

    public Meteorite(int x, int y, Cosmos cosmos) {
        this.x = x;
        this.y = y;
        //this.speed = speed;
        this.cosmos = cosmos;
    }

    public void move() {
        x = x - cosmos.p.speed + speed;
    }
}
