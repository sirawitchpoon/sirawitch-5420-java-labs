/**
 * MobileDeviceFormV8
 * 
 * add item listener to Mobile OS and type combobox
 * 
 * Author: Sirawitch Butryojantho
 * Sec: 2
 * ID: 643040542-0
 */

package butryojantho.sirawitch.lab9;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MobileDeviceFormV8 extends MobileDeviceFormV7 implements ItemListener {

    public MobileDeviceFormV8(String title) {
        super(title);
    }
    //set the title of this window

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    //run GUI

    public static void createAndShowGUI() {
        MobileDeviceFormV8 msw = new MobileDeviceFormV8("Mobile Device Form V8");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    //create GUI

    
    protected void addListeners() {
        super.addListeners();
        android.addItemListener(this);
        ios.addItemListener(this);
        typeCb.addItemListener(this);
    }
    //add Itemlistener to JRadiobutton and combobox

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) { //if component selected
            Object sorce = e.getSource(); //get source from user
            if (sorce == android) { //if user selected Mobile OS "android"
                JOptionPane.showMessageDialog(null,
                        osLabel.getText() + " is updated to Android");
                        //show message that user have updated to Android
            } else if (sorce == ios) { //if user selected Mobile OS "iOS"
                JOptionPane.showMessageDialog(null,
                        osLabel.getText() + " is updated to iOS");
                        //show message that user have updated to iOS
            } else if (sorce == typeCb) { //if user selected type of Type's Combobox
                if (typeCb.getSelectedItem().equals("Phone")) { //if user seleceted "Phone"
                    JOptionPane.showMessageDialog(null, "Type is updated to Phone"); //show message that Type is updated to "Phone"
                } else if (typeCb.getSelectedItem().equals("Tablet")) { //if user seleceted "Tablet"
                    JOptionPane.showMessageDialog(null, "Type is updated to Tablet"); //show message that Type is updated to "Tablet"
                } else if (typeCb.getSelectedItem().equals("Smart Watch")) { //if user seleceted "Smart Watch"
                    JOptionPane.showMessageDialog(null, "Type is updated to Smart Watch"); //show message that Type is updated to "Smart Watch"
                }
            }
        }

    }

}
