/**
 * MobileDeviceFormV15
 * 
 * Check error when model and weight textfield entered incorrect
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 */

package butryojantho.sirawitch.lab11;

import java.awt.event.*;
import javax.swing.*;

public class MobileDeviceFormV15 extends MobileDeviceFormV14 {

    protected final double MIN_WEIGHT = 0.01, MAX_WEIGHT = 1.00;

    public MobileDeviceFormV15(String title) {
        super(title);
    }
    //set the title of the window

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    // run GUI

    public static void createAndShowGUI() {
        MobileDeviceFormV15 msw = new MobileDeviceFormV15("Mobile Device Form V15");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI

    @Override
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource().equals(okButton)) { //the action will happen when selected OK Button
            if (modelText.getText().isEmpty()) { //the action happen when model textfield is empty
                JOptionPane.showMessageDialog(null, "Please enter model number"); //show dialog "Please enter model number"
            } else if (weightText.getText().isEmpty()) { //the action happen when weight textfield is empty
                JOptionPane.showMessageDialog(null, "Please enter weight"); //show dialog "Please enter weight"
            } else if (!weightText.getText().isEmpty()) { //the action happen when  textfield isn't empty
                try {
                    double dbValueWeightText = Double.parseDouble(weightText.getText());
                    //get text form weight's textfield and parse to double
                    if (MIN_WEIGHT > dbValueWeightText) { //the action happen when user enter weight lower and MIN_WEIGHT
                        JOptionPane.showMessageDialog(null,
                                "Too light: valid weight is [" + MIN_WEIGHT + "," + MAX_WEIGHT + "]");
                                //show dialog "Too light: valid weight is [" + MIN_WEIGHT + "," + MAX_WEIGHT + "]"
                    } else if (MAX_WEIGHT < dbValueWeightText) { //the action happen when user enter weight higher and MAX_WEIGHT
                        JOptionPane.showMessageDialog(null,
                                "Too heavy: valid weight is [" + MIN_WEIGHT + "," + MAX_WEIGHT + "]");
                                //show dialog "Too heavy: valid weight is [" + MIN_WEIGHT + "," + MAX_WEIGHT + "]"
                    } else {
                        super.actionPerformed(e);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter only number for weight");
                    //if user hasn't enter number
                }
                //try catch for an error input
            }
        } else {
            super.actionPerformed(e);
        }
    }

}
