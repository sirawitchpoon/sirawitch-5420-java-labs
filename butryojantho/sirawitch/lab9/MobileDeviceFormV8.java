package butryojantho.sirawitch.lab9;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MobileDeviceFormV8 extends MobileDeviceFormV7 implements ItemListener {
    
    protected Checkbox osCheck;

    public MobileDeviceFormV8(String title) {
        super(title);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MobileDeviceFormV8 msw = new MobileDeviceFormV8("Mobile Device Form V8");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    protected void addListeners() {
        super.addListeners();
        android.addItemListener(this);
        ios.addItemListener(this);
        typeCb.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            Object sorce = e.getSource();
            if(sorce == android) {
                JOptionPane.showMessageDialog(null, 
                osLabel.getText() + " is updated to Android");
            } else if (sorce == ios) {
                JOptionPane.showMessageDialog(null, 
                osLabel.getText() + " is updated to iOS");
            } else if (sorce == typeCb) {
                if (typeCb.getSelectedItem().equals("Phone")) {
                    JOptionPane.showMessageDialog(null, "Type is updated to Phone");
                } else if (typeCb.getSelectedItem().equals("Tablet")) {
                    JOptionPane.showMessageDialog(null, "Type is updated to Tablet");
                } else if (typeCb.getSelectedItem().equals("Smart Watch")) {
                    JOptionPane.showMessageDialog(null, "Type is updated to Smart Watch");
                }
            }
        }

        // if (android.isSelected()) {
        //     JOptionPane.showMessageDialog(null, osLabel.getText() + "is updated to Android");
        // } else if (ios.isSelected()) {
        //     JOptionPane.showMessageDialog(null, osLabel.getText() + "is updated to iOS");
        // } else if (typeCb.getSelectedItem().equals("Phone")) {
        //     JOptionPane.showMessageDialog(null, "Type is updated to Phone");
        // } else if (typeCb.getSelectedItem().equals("Tablet")) {
        //     JOptionPane.showMessageDialog(null, "Type is updated to Tablet");
        // } else if (typeCb.getSelectedItem().equals("Smart Watch")) {
        //     JOptionPane.showMessageDialog(null, "Type is updated to Smart Watch");
        // }
        
    }
    
}
