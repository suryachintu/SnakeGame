import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * Created by surya on 31-05-2016.
 */
/*public class Points extends JPanel {

   public Rectangle ch;
    int w=24,h=24;
    private boolean right = false;
    private boolean left = false;
    private boolean up = false;
    private boolean down = false;
    static int x=180,y=180;
    public  Points(JFrame frame){
        ch = new Rectangle(x,y,w,h);
        //f
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_D){
                    right = true;
                    ch.x=x++;
                }
                if (e.getKeyCode() == KeyEvent.VK_A){
                    left = true;
                    ch.x=x-1;
                }
                if (e.getKeyCode() == KeyEvent.VK_S){
                    down = true;
                    ch.y=y+1;
                }
                if (e.getKeyCode() == KeyEvent.VK_W){
                    up = true;
                    ch.y=y-1;
                }

            }
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            if (e.getKeyCode() == KeyEvent.VK_D){
                right = false;
            }
                if (e.getKeyCode() == KeyEvent.VK_A){
                left = false;
            }
                if (e.getKeyCode() == KeyEvent.VK_S){
                down = false;
            }if (e.getKeyCode() == KeyEvent.VK_W){
                up = false;
            }
            }
        });
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        food aw = new food();
        aw.paint(g);
        g.fillRect(ch.x,ch.y,w,h);
        if (ch.x - food.x<0||food.y - ch.y<0||food.x<0-ch.x||ch.y - food.y<0){
            food.x=0;food.y=0;food.w=0;food.h=0;
        }
        if (right)
            ch.x=x++;
        if (left)
            ch.x=x--;
        if (up)
            ch.y=y--;
        if (down)
            ch.y=y++;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Points");
        Points points = new Points(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(points);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}*/