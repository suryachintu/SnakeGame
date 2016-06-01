import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.util.Random;

/**
 * Created by surya on 31-05-2016.
 */
public class food extends JPanel {

    Random rg = new Random();
    public Rectangle a1;
    static int w=10,h=10;
    public static int choice = 4,x1=10,y1=10,x2=20,y2=10;
    public food (JFrame frame){
        //ch = new Rectangle(200,200,w,h);
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
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(10));
        g2.draw(new Line2D.Float(x1,y2,x2,y2));
        //g.fillRect(ch.x,ch.y,w,h);
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
        points.draws();
    }

   public boolean overlap(Rectangle r){
        return x2 < r.x + r.width && x2 + w > r.x && y2 < r.y + r.height && y2 + h > r.y;
    }

    private void draws() {
    for (int i=0;i<100000;i++){
        if(!overlap(a1)){
        try {
            Thread.sleep(10);
            if (choice==4){
            x2+=1;
            x1+=1;
            }
            if (choice==3) {
                x1 -= 1;
                x2 -= 1;
            }
            if (choice==2) {
                y1 -= 1;
                y2-=1;
            }
            if (choice==1) {
                y1 += 1;
                y2+=1;
            }
            repaint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        else{
            a1.x = rg.nextInt(400);
            a1.y = rg.nextInt(400);
            x1-=5;
            x2+=5;
            repaint();
        }

        }
    }

}