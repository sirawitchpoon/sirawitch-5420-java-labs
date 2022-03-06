import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        JLabel label = new JLabel("Sirawitch");
        label.setBounds(50,20,120,30);


        JButton button1 = new JButton("Sushi");
        JButton button2 = new JButton("Ramen");
        JButton button3 = new JButton("Pizza");
        button1.setBounds(150,20,120,30);
        button2.setBounds(300,20,120,30);
        button3.setBounds(450,20,120,30);

        window.setSize(650,100);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("643040542-0");
        window.add(label);
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.setLayout(null);

    }

}
