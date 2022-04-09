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
        deviceList = new ArrayList<MobileDeviceV2>();
        // TODO Auto-generated constructor stub
    }

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

    protected void addListeners() {
        super.addListeners();
        displayMenuItem.addActionListener(this);
        sortMenuItem.addActionListener(this);
        searchMenuItem.addActionListener(this);
        removeMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        super.actionPerformed(e);
        String displayDevice = "";
        if(e.getSource().equals(displayMenuItem)) {
            for(int i=0;i<deviceList.size();i++){
                displayDevice = displayDevice + deviceList.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null,displayDevice);
        }
        else if(e.getSource().equals(sortMenuItem)){
            Collections.sort(deviceList, new SortMobileDevicesByPrice());
            for(int i=1;i<deviceList.size();i++){
                displayDevice = displayDevice + deviceList.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null,displayDevice);
        }
        else if(e.getSource().equals(searchMenuItem)){
            String searchText = JOptionPane.showInputDialog(null, "Enter model name to serch");
            for(int i=0 ;i < deviceList.size();i++) {
                if(deviceList.get(i).getModel().equals(searchText)) {
                    JOptionPane.showMessageDialog(null, deviceList.get(i) + " is found");
                }
                else {
                    JOptionPane.showMessageDialog(null, searchText + " is not found");
                }
            }
        }
        else if(e.getSource().equals(removeMenuItem)){
            String removeText = JOptionPane.showInputDialog(null, "Enter model name to remove");
            for(int i=0 ;i < deviceList.size();i++) {
                if(deviceList.get(i).getModel().equals(removeText)) {
                    deviceList.remove(i);
                    JOptionPane.showMessageDialog(null, deviceList.get(i) + " is removed");
                }
                else {
                    JOptionPane.showMessageDialog(null, removeText + " is not found");
                }
            }
        }
    }

}
