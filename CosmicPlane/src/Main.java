import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cosmic Plane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.add(new Cosmos());
        frame.setVisible(true);
    }
}

/*class Cosmos extends JPanel implements ActionListener, Runnable{

    Timer mainTimer = new Timer(20, this);

    Image background = new ImageIcon("Cosmos1.png").getImage();

    Player p = new Player();

    Thread MeteoritesCreator = new Thread(this);

    java.util.List<Meteorite> meteorites = new ArrayList<>();

    public Cosmos() {
        mainTimer.start();
        MeteoritesCreator.start();
        addKeyListener(new MyKeyAdapter());
        setFocusable(true);
    }

    private class MyKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            p.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            p.keyReleased(e);
        }
    }

    public void paint(Graphics g) {
        g.drawImage(background, p.coord1, 0, null);
        g.drawImage(background, p.coord2, 0, null);
        g.drawImage(p.plane, p.x, p.y, null);

        Iterator<Meteorite> i = meteorites.iterator();
        while(i.hasNext()) {
            Meteorite m = i.next();

            if(m.x >= 2400 || m.x <= -2400) {
                i.remove();
            }
            else {
                m.move();
                g.drawImage(m.Meteorite, m.x, m.y, null);

            }
        }

    }

    private void IntersectsEnemies() {
        for (Meteorite m : meteorites) {
            if (p.r().intersects(m.r())) {
                JOptionPane.showMessageDialog(null, "Вы проиграли!");

                System.exit(1);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        p.move();
        repaint();
        IntersectsEnemies();
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(5000));
                meteorites.add(new Meteorite(1920, random.nextInt(1080), random.nextInt(50), this));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}*/