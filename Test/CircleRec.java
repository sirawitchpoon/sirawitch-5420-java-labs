import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class CircleRec extends JPanel {
    
    private Ellipse2D.Double circle = new Ellipse2D.Double(10, 10, 100, 100);

    private Rectangle2D.Double square = new Rectangle2D.Double(55, 55, 10, 10);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.RED);
        g2d.draw(circle);
        g2d.setColor(Color.BLUE);
        g2d.fill(square);;
    }


    public static void main(String[] args) {
    
        JFrame window = new JFrame("643040542-0");
        CircleRec content = new CircleRec();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(content);
        window.setLocationRelativeTo(null);
        window.setPreferredSize(new Dimension(140,150));
        window.pack();
        window.setVisible(true);
        }
}
