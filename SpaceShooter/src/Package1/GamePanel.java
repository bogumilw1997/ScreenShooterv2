package Package1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.Key;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
    private BufferedImage image;
    Timer t = new Timer(5, this);

    private double x =0, y=0, velx=0, vely=0;

    public GamePanel() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        try {
            image = ImageIO.read(new File("pic/ship.png"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,(int)x, (int)y,this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += velx;
        y += vely;

        // Tu jest pewien problem z rozmiarem, otóż nie chce się dobrze rozciągnąc pole obszaru
        if(x <= 0)
            x = 0;
        if(x >= 1800)
            x= 1800;
        if(y <= 0)
            y = 0;
        if(y >= 1000)
            y = 1000;
        repaint();
    }

    public void up() {
        velx = 0;
        vely = -10;
    }

    public void down() {
        velx = 0;
        vely = 10;
    }

    public void left() {
        velx = -10;
        vely = 0;
    }

    public void right() {
        velx = 10;
        vely = 0;
    }

    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setvelx(double velx){
        this.velx=velx;
    }
    public void setvely(double vely){
        this.vely=vely;
    }


   public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            up();
        }
        if (code == KeyEvent.VK_DOWN){
            down();
        }
        if (code == KeyEvent.VK_LEFT){
            left();
        }
        if (code == KeyEvent.VK_RIGHT){
            right();
        }
    }



    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}


