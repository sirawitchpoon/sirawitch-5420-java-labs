/**
 * MobileDeviceFormV2 program
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

public class MobileDeviceFormV2 extends MobileDeviceFormV1 {

    protected JComboBox typeCb;
    protected JPanel reviewPanel;
    protected JTextArea reviewTextArea;
    protected JLabel typeLabel, reviewLabel;

    public MobileDeviceFormV2(String title) {
        super(title);
    }
    // set title of this frame

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    // run GUI

    public static void createAndShowGUI() {
        MobileDeviceFormV2 msw = new MobileDeviceFormV2("Mobile Device Form V2");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    // add components,frame and set title name

    protected void setFrameFeatures() {
        super.setFrameFeatures();
    }
    // using super for less coding

    @Override
    protected void addComponents() {
        super.addComponents(); // call method addComponents() for this superclass
        mainPanel.setLayout(new GridLayout(7, 2)); // set new layout for main panel
        reviewPanel = new JPanel(); // create review panel
        reviewPanel.setLayout(new GridLayout(2, 1)); // set review panel layout
        typeLabel = new JLabel("Type:"); // create type label and set label as "Type:"
        reviewLabel = new JLabel("Review:"); // create review label and set label as "Review:"
        typeCb = new JComboBox(); // create combobox for type
        typeCb.addItem("Phone"); // add String to combobox
        typeCb.addItem("Tablet"); // add String to combobox
        typeCb.addItem("Smart Watch"); // add String to combobox
        reviewTextArea = new JTextArea(5, 30); // create textarea for review
        reviewTextArea.setText(
                "The iPhone 13’s brighter display, longer battery life and powerful cameras make it the best iPhone for the money. But we wish it had faster charging and the iPhone 13 Pro’s adaptive 120Hz display.");
        // set text for textarea
        reviewTextArea.setLineWrap(true); // if line that is too long will be “wrapped” onto the next line
        reviewTextArea.setWrapStyleWord(true); // make it only wrap when there is a space or something
        mainPanel.add(typeLabel); // add type's label to main panel
        mainPanel.add(typeCb); // add type's combobox to main panel
        reviewPanel.add(reviewLabel); // add review's label to review's panel
        reviewPanel.add(reviewTextArea); // add review's textarea to review's panel
        this.add(reviewPanel, BorderLayout.CENTER); // add review panel to frame set it to Center
    }

}
