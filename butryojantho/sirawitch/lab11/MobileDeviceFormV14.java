package butryojantho.sirawitch.lab11;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

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

    @Override
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
        String str = "";
        if(e.getSource().equals(displayMenuItem)) {
            for(int i=1;i<deviceList.size();i++){
                str = str + deviceList.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null,str);
        }
        else if(e.getSource().equals(sortMenuItem)){
            JOptionPane.showMessageDialog(null);
        }
        else if(e.getSource().equals(searchMenuItem)){

        }
        else if(e.getSource().equals(removeMenuItem)){

        }
    }

}
