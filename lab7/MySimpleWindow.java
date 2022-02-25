/**
 * MySimpleWindow program
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 * Date: 25/02/2022
 * 
 */

package butryojantho.sirawitch.lab7;

import java.awt.*;
import javax.swing.*;

public class MySimpleWindow extends JFrame { // extends from class JFrame

    protected JPanel buttonPanel;
    protected JButton okButton, cancelButton;
    // declare variables for panel and two buttons

    public MySimpleWindow(String title) {
        super(title);
    }
    // set title of this frame

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    // add components,frame and set title name

    protected void addComponents() {
        buttonPanel = new JPanel(); // create panel for button
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // set button's panel layout by FlowLayout and set to
                                                                  // center
        okButton = new JButton("OK"); // create ok button
        cancelButton = new JButton("Cancel"); // create cancel button
        buttonPanel.add(cancelButton); // add cancel button to button's panel
        buttonPanel.add(okButton); // add ok button to botton's panel
        this.setLayout(new BorderLayout()); // set frame's layout by Borderlayout
        this.add(buttonPanel, BorderLayout.SOUTH); // add button's panel to frame and set it to button by set using
                                                   // BorderLayout.SOUTH
    }

    protected void setFrameFeatures() {
        this.pack(); // to sizes the frame
        this.setLocationRelativeTo(null); // set frame's location to center
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application option
        this.setVisible(true); // makes the frame appear on the screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    // run GUI
}
