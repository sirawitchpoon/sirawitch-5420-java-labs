/**
 * MobileDeviceFormV14
 * 
 * Add Display menu item to display added devices
 * Add Sort menu item to sort the added devices 
 * Add Search menu iten to display an input dialog by enter it's model name
 * Add Remove menu item to remove device by enter it's model name
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 */

package butryojantho.sirawitch.lab11;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

import butryojantho.sirawitch.lab6.*;

public class MobileDeviceFormV14 extends MobileDeviceFormV13 {

    protected JMenu deviceMenu;
    protected JMenuItem displayMenuItem, sortMenuItem, searchMenuItem, removeMenuItem;

    public MobileDeviceFormV14(String title) {
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
        MobileDeviceFormV14 msw = new MobileDeviceFormV14("Mobile Device Form V14");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI

    protected void addMenus() {
        super.addMenus();
        deviceMenu = new JMenu("Devices");
        displayMenuItem = new JMenuItem("Display");
        sortMenuItem = new JMenuItem("Sort");
        searchMenuItem = new JMenuItem("Search");
        removeMenuItem = new JMenuItem("Remove");
        deviceMenu.add(displayMenuItem);
        deviceMenu.add(sortMenuItem);
        deviceMenu.add(searchMenuItem);
        deviceMenu.add(removeMenuItem);
        menuBar.add(deviceMenu);
    }
    //add menu Devices
    //add menu item Display,Sort,Search,Remove

    protected void addListeners() {
        super.addListeners();
        displayMenuItem.addActionListener(this);
        sortMenuItem.addActionListener(this);
        searchMenuItem.addActionListener(this);
        removeMenuItem.addActionListener(this);
    }
    //add Actionlistener to these menuitem

    @Override
    public void actionPerformed(ActionEvent e){
        super.actionPerformed(e);
        String displayDevice = ""; //create empty string
        if(e.getSource().equals(displayMenuItem)) { //the action will happen when selected Display menuitem
            for(int i=0;i<deviceList.size();i++){
                displayDevice = displayDevice + deviceList.get(i) + "\n";
            } //for loop to get input from ArrayList "displayDevice"
            JOptionPane.showMessageDialog(null,displayDevice);
            //show a dialog of displayDevice
        }
        else if(e.getSource().equals(sortMenuItem)){ //the action will happen when selected Sort menuitem
            Collections.sort(deviceList, new SortMobileDevicesByPrice()); //sort ArrayList deviceList by using method SortMobileDevicesByPrice from the previous lab
            for(int i=1;i<deviceList.size();i++){
                displayDevice = displayDevice + deviceList.get(i) + "\n";
            } //for loop to get input from sorted ArrayList "displayDevice"
            JOptionPane.showMessageDialog(null,displayDevice);
            //show a dialog of displayDevice
        }
        else if(e.getSource().equals(searchMenuItem)){ //the action will happen when selected Search menuitem
            String searchText = JOptionPane.showInputDialog(null, "Enter model name to serch"); //define String variable to take it as to entered for search model name
            for(int i=0 ;i < deviceList.size();i++) {
                if(deviceList.get(i).getModel().equals(searchText)) {
                    JOptionPane.showMessageDialog(null, deviceList.get(i) + " is found");
                } //if the device has the same model name as user enter show dialog that device is found
                else {
                    JOptionPane.showMessageDialog(null, searchText + " is not found");
                } //if the device doesn't have the same model name as user enter show dialog that device is not found
            }
        }
        else if(e.getSource().equals(removeMenuItem)){ //the action will happen when selected Remove menuitem
            String removeText = JOptionPane.showInputDialog(null, "Enter model name to remove"); //define String variable to take it as to entered for search model name
            for(int i=0 ;i < deviceList.size();i++) {
                if(deviceList.get(i).getModel().equals(removeText)) {
                    deviceList.remove(i);
                    JOptionPane.showMessageDialog(null, deviceList.get(i) + " is removed");
                } //if the device has the same model name as user enter, remove it and show dialog that device is removed
                else {
                    JOptionPane.showMessageDialog(null, removeText + " is not found");
                } //if the device doesn't have the same model name as user enter show dialog that device is not found
            }
        }
    }

}
