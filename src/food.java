import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

/**
 * Created by surya on 31-05-2016.
 */
public class food extends JPanel {

    Random rg = new Random();
    public Rectangle ch,a1;
    static int w=10,h=10;
    static int choice = 4;
    public food (JFrame frame){
        ch = new Rectangle(200,200,w,h);
        a1 = new Rectangle(250,250,10,10);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_S&&choice!=2)
                    choice=1;
                else if (e.getKeyCode() == KeyEvent.VK_W&&choice!=1)
                    choice=2;
                else if (e.getKeyCode() == KeyEvent.VK_A&&choice!=4)
                    choice=3;
                else if (e.getKeyCode() == KeyEvent.VK_D&&choice!=3)
                    choice=4;
            }
        });
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.fillRect(ch.x,ch.y,w,h);
        g.fillRect(a1.x,a1.y,10,10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Points");
        food points = new food(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(points);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        points.draw();
    }

    public boolean overlap(Rectangle r){
        return ch.x < r.x + r.width && ch.x + w > r.x && ch.y < r.y + r.height && ch.y + h > r.y;
    }

    private void draw() {
    for (int i=0;i<100000;i++){
        if (!overlap(a1)){
        try {
            Thread.sleep(20);
            if (choice==4)
            ch.x+=1;
            if (choice==3)
            ch.x-=1;
            if (choice==2)
            ch.y-=1;
            if (choice==1)
            ch.y+=1;
            repaint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
        else{
            a1.x = rg.nextInt(400);
            a1.y = rg.nextInt(400);
            w+=w;
            repaint();
        }

        }
    }

}