/**
 * MobileDeviceFormV12
 * 
 * Set background color and foreground color by select foreground and background menuitem in Area menu
 * User can set custom color by using CustomColor... menu items
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec: 2
 * 
 */

package butryojantho.sirawitch.lab10;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class MobileDeviceFormV12 extends MobileDeviceFormV11 {

    protected JMenu areaMenu;
    protected JRadioButtonMenuItem foreRBMenuItem, backRBMenuItem;
    protected ButtonGroup areaBTGroup;

    public MobileDeviceFormV12(String title) {
        super(title);
    }
    // set the title of this window

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    // run GUI

    public static void createAndShowGUI() {
        MobileDeviceFormV12 msw = new MobileDeviceFormV12("Mobile Device Form V12");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI

    protected void addMenus() {
        super.addMenus();
        // implement all the features and abilities MobileDeviceFormV11 has

        areaMenu = new JMenu("Area");
        // create new JMenu and set the title as "Area"

        foreRBMenuItem = new JRadioButtonMenuItem("Foreground");
        backRBMenuItem = new JRadioButtonMenuItem("Background");
        // create new two JRadioButtonMenuItems and
        // set the title as"Foreground" and "Background"

        areaBTGroup = new ButtonGroup();
        // create new ButtonGroup for Foreground and background area

        areaBTGroup.add(foreRBMenuItem);
        areaBTGroup.add(backRBMenuItem);
        // grouped foreground and background RadioButtonMenuItem to Area Buttongroup

        menuBar.add(areaMenu);
        // add Area menu to menubar

        areaMenu.add(foreRBMenuItem);
        areaMenu.add(backRBMenuItem);
        // add foreground and background RadioButtonMenuItem to Area menu

        foreRBMenuItem.setSelected(true);
        // set Foreground Area is selected by default
    }

    @Override
    protected void addListeners() {
        customColorItem.addActionListener(this);
        redMI.addActionListener(this);
        greenMI.addActionListener(this);
        blueMI.addActionListener(this);
    }
    // add Actionlistener for each menu and menu items

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (foreRBMenuItem.isSelected()) {
            if (e.getSource().equals(customColorItem)) {
                Color customColor = JColorChooser.showDialog(this, "Choose Color", brandText.getForeground());
                // The color chooser opens with the preview color as current foreground color

                brandText.setForeground(customColor);
                modelText.setForeground(customColor);
                colorText.setForeground(customColor);
                weightText.setForeground(customColor);
                priceText.setForeground(customColor);
                android.setForeground(customColor);
                ios.setForeground(customColor);
                typeCb.setForeground(customColor);
                reviewTextArea.setForeground(customColor);
                featureList.setForeground(customColor);
                // set foreground color for each components to Custom color that user choose

            } // action performed when user select CustomColor... menu item
            else if (e.getSource().equals(redMI)) {
                brandText.setForeground(Color.red);
                modelText.setForeground(Color.red);
                colorText.setForeground(Color.red);
                weightText.setForeground(Color.red);
                priceText.setForeground(Color.red);
                android.setForeground(Color.red);
                ios.setForeground(Color.red);
                typeCb.setForeground(Color.red);
                reviewTextArea.setForeground(Color.red);
                featureList.setForeground(Color.red);
                // set foreground color for each components to red

            } // action performed when user select Red menu item
            else if (e.getSource().equals(greenMI)) {
                brandText.setForeground(Color.green);
                modelText.setForeground(Color.green);
                colorText.setForeground(Color.green);
                weightText.setForeground(Color.green);
                priceText.setForeground(Color.green);
                android.setForeground(Color.green);
                ios.setForeground(Color.green);
                typeCb.setForeground(Color.green);
                reviewTextArea.setForeground(Color.green);
                featureList.setForeground(Color.green);
                // set foreground color for each components to green

            } // action performed when user select Green menu item
            else if (e.getSource().equals(blueMI)) {
                brandText.setForeground(Color.blue);
                modelText.setForeground(Color.blue);
                colorText.setForeground(Color.blue);
                weightText.setForeground(Color.blue);
                priceText.setForeground(Color.blue);
                android.setForeground(Color.blue);
                ios.setForeground(Color.blue);
                typeCb.setForeground(Color.blue);
                reviewTextArea.setForeground(Color.blue);
                featureList.setForeground(Color.blue);
                // set foreground color for each components to blue

            } // action performed when user select Blue menu item

        } // action performed when Foreground radio button menu item is selected

        else if (backRBMenuItem.isSelected()) {
            if (e.getSource().equals(customColorItem)) {
                Color customColor = JColorChooser.showDialog(this, "Choose Color", brandText.getBackground());
                // The color chooser opens with the preview color as current background color

                brandText.setBackground(customColor);
                modelText.setBackground(customColor);
                colorText.setBackground(customColor);
                weightText.setBackground(customColor);
                priceText.setBackground(customColor);
                android.setBackground(customColor);
                ios.setBackground(customColor);
                typeCb.setBackground(customColor);
                reviewTextArea.setBackground(customColor);
                featureList.setBackground(customColor);
                // set background color for each components to Custom color that user choose

            } // action performed when user select CustomColor... menu item
            else if (e.getSource().equals(redMI)) {
                brandText.setBackground(Color.red);
                modelText.setBackground(Color.red);
                colorText.setBackground(Color.red);
                weightText.setBackground(Color.red);
                priceText.setBackground(Color.red);
                android.setBackground(Color.red);
                ios.setBackground(Color.red);
                typeCb.setBackground(Color.red);
                reviewTextArea.setBackground(Color.red);
                featureList.setBackground(Color.red);
                // set background color for each components to red

            } // action performed when user select Red menu item
            else if (e.getSource().equals(greenMI)) {
                brandText.setBackground(Color.green);
                modelText.setBackground(Color.green);
                colorText.setBackground(Color.green);
                weightText.setBackground(Color.green);
                priceText.setBackground(Color.green);
                android.setBackground(Color.green);
                ios.setBackground(Color.green);
                typeCb.setBackground(Color.green);
                reviewTextArea.setBackground(Color.green);
                featureList.setBackground(Color.green);
                // set background color for each components to green

            } // action performed when user select Green menu item

            else if (e.getSource().equals(blueMI)) {
                brandText.setBackground(Color.blue);
                modelText.setBackground(Color.blue);
                colorText.setBackground(Color.blue);
                weightText.setBackground(Color.blue);
                priceText.setBackground(Color.blue);
                android.setBackground(Color.blue);
                ios.setBackground(Color.blue);
                typeCb.setBackground(Color.blue);
                reviewTextArea.setBackground(Color.blue);
                featureList.setBackground(Color.blue);
                // set background color for each components to blue

            } // action performed when user select Blue menu item

        } // action performed when Foreground radio button menu item is selected

    }
}
