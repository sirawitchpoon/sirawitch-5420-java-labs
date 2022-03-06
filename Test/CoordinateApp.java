import java.awt.*;
import javax.swing.*;

public class CoordinateApp {
    
    public static void main(String[] args) {
    
    JFrame window = new JFrame("643040542-0");
    CoordinatePanel content = new CoordinatePanel();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setContentPane(content);
    window.setLocation(500,400);
    window.setPreferredSize(new Dimension(1200,200));
    window.pack();
    window.setVisible(true);
    }
}

class CoordinatePanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int w = width / 2;
        int h = height / 2;
        String myName = "Sirawitch Butrojantho";
        Font f = new Font("SanSerif", Font.BOLD, 48);
        g.setFont(f);
        g.setColor(Color.GREEN);
        g.drawString(myName, w, h);
    }
}
