/**
 * MobileDeviceFormV9
 * 
 * add ListSelectionListener to Feature's List
 * 
 * Author: Sirawitch Butryojantho
 * Sec: 2
 * ID: 643040542-0
 */


package butryojantho.sirawitch.lab9;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.event.*;

public class MobileDeviceFormV9 extends MobileDeviceFormV8 implements ListSelectionListener {
    

    public MobileDeviceFormV9(String title) {
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
        MobileDeviceFormV9 msw = new MobileDeviceFormV9("Mobile Device Form V9");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    //create GUI

    @Override
    protected void addListeners() {
        super.addListeners();
        featureList.addListSelectionListener(this);

    }
    //add ListSelectionListener to Feature's List

    @Override
    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting(); //create boolean isAdjust to get sorce when the value is adjusting
        if(!isAdjusting) { //isAdjust condition
            List<String> userSelected = featureList.getSelectedValuesList(); // create the list of feature that user selected
            int numberSelected = userSelected.size(); //defind variable for how many list user selected
            ArrayList<String> featureSelectedArray = new ArrayList<String>(); //create ArrayList of feature that user selected
            for(int i = 0; i< numberSelected; i++) { //for loop to fill the featureSelectedArray 
                featureSelectedArray.add(userSelected.get(i));
            }
            String featureSelected = String.join(", ", featureSelectedArray); //rearrange them into new sentences
            JOptionPane.showMessageDialog(null, "Feature: " + featureSelected); //show message
        }
        
    }

}
