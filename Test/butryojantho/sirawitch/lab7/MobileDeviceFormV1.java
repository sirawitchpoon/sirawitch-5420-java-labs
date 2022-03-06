/**
 * MobileDeviceFormV1 program
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

public class MobileDeviceFormV1 extends MySimpleWindow {

    protected JPanel mainPanel, osPanel;
    protected JLabel brandLabel, modelLabel, colorLabel, priceLabel, weightLabel, osLabel;
    protected JTextField brandText, modelText, colorText, weightText, priceText;
    protected JRadioButton android, ios;
    protected ButtonGroup os;

    public MobileDeviceFormV1(String title) {
        super(title);
    }
    // set title of this frame

    @Override
    protected void addComponents() {

        super.addComponents(); // call method addComponents() for this superclass

        os = new ButtonGroup(); // create buttongroup of os
        osPanel = new JPanel(); // create panel for os
        android = new JRadioButton("Android"); // create android radiobutton
        ios = new JRadioButton("iOS"); // create ios radiobutton
        mainPanel = new JPanel(); // create mainpanel
        mainPanel.setLayout(new GridLayout(6, 2)); // set mainpanel's layout
        brandLabel = new JLabel("Brand Name:"); // create brand label set the label as"Brand Name:"
        modelLabel = new JLabel("Model Name:"); // create model label set the label as"Model Name:"
        colorLabel = new JLabel("Color:"); // create color label set the label as"Color Name:"
        weightLabel = new JLabel("Weight (kg.):"); // create weight label set the label as"Weight (kg.):"
        priceLabel = new JLabel("Price (Baht):"); // create price label set the label as"Price (Baht):"
        osLabel = new JLabel("Mobile OS:"); // create os label set the label as "Mobile OS:"
        brandText = new JTextField(15); // create Jtextfield for brand
        modelText = new JTextField(15); // create Jtextfield for model
        colorText = new JTextField(15); // create Jtextfield for color
        weightText = new JTextField(15); // create Jtextfield for weight
        priceText = new JTextField(15); // create Jtextfield for price

        mainPanel.add(brandLabel);
        mainPanel.add(brandText);
        mainPanel.add(modelLabel);
        mainPanel.add(modelText);
        mainPanel.add(colorLabel);
        mainPanel.add(colorText);
        mainPanel.add(weightLabel);
        mainPanel.add(weightText);
        mainPanel.add(priceLabel);
        mainPanel.add(priceText);
        mainPanel.add(osLabel);
        // add components to panel

        os.add(android);
        os.add(ios);
        // add radiobutton to buttongroup

        osPanel.add(android);
        osPanel.add(ios);
        // add components to sub-panel

        mainPanel.add(osPanel);
        // add sub-panel to panel

        this.add(mainPanel, BorderLayout.NORTH);
        // add panel to frame and set it to north
    }

    protected void setFrameFeatures() {
        super.setFrameFeatures();
        // using super for less coding
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        // run GUI
    }

    public static void createAndShowGUI() {
        MobileDeviceFormV1 msw = new MobileDeviceFormV1("Mobile Device Form V1");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    // add components,frame and set title name
}
