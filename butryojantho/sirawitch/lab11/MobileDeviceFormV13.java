/**
 * MobileDeviceFormV13
 * 
 * Output the information of all the added devices to the terminal window
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 */

package butryojantho.sirawitch.lab11;

import java.util.ArrayList;

import java.awt.event.*;
import javax.swing.*;

import butryojantho.sirawitch.lab10.MobileDeviceFormV12;

public class MobileDeviceFormV13 extends MobileDeviceFormV12 {

    protected ArrayList<MobileDeviceV2> deviceList;
    protected int deviceCount;

    public MobileDeviceFormV13(String title) {
        super(title);
        deviceList = new ArrayList<MobileDeviceV2>();
    }
    //set the title of the window
    //create new ArrayList for MobileDeviceV2 object

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    // run GUI

    public static void createAndShowGUI() {
        MobileDeviceFormV13 msw = new MobileDeviceFormV13("Mobile Device Form V13");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        android.setActionCommand("Android"); //set action command for Android
        ios.setActionCommand("iOS"); //set action command for iOS
        if (e.getSource().equals(okButton)) { //the action will happen when selected OK Button

            MobileDeviceV2 dummyDevice = new MobileDeviceV2(
                    brandText.getText(), //get text from brand's textfield
                    modelText.getText(), //get text from model's textfield
                    colorText.getText(), //get text from color's textfield

                    Double.parseDouble(weightText.getText()), 
                    //get text from weight's textfield then parse string to double

                    Double.parseDouble(priceText.getText()), 
                    //get text from price's textfield then parse string to double

                    (String) os.getSelection().getActionCommand(), //get selection from MobileOS's buttongroup
                    (String) typeCb.getSelectedItem()); //get selection from Type's combo box
            //get MobileDeviceV2 information from any textfield that user entered

            deviceList.add(dummyDevice);
            //add these information to ArrayList "deviceList"
            System.out.println(deviceList + "\n");
            //print ArrayList "deviceList"
        }
    }

}
