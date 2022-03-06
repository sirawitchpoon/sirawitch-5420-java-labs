/**
 * MobileDeviceFormV3 program
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

public class MobileDeviceFormV3 extends MobileDeviceFormV2 {

    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu, colorMenu, sizeMenu;
    protected JMenuItem newItem, openItem, saveItem, exitItem;

    public MobileDeviceFormV3(String title) {
        super(title);
    }

    // set title of this frame
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    // run GUI

    public static void createAndShowGUI() {
        MobileDeviceFormV3 msw = new MobileDeviceFormV3("Mobile Device Form V3");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }
    // add components,frame and set title name

    protected void addMenus() {
        menuBar = new JMenuBar(); // create menubar
        fileMenu = new JMenu("File"); // create menu call "File"
        configMenu = new JMenu("Config"); // create menu call "Config"
        newItem = new JMenuItem("New"); // create menuitem call "New"
        openItem = new JMenuItem("Open"); // create menuitem call "Open"
        saveItem = new JMenuItem("Save"); // create menuitem call "Save"
        exitItem = new JMenuItem("Exit"); // create menuitem call "Exit"
        colorMenu = new JMenu("Color"); // create menuitem call "Color"
        sizeMenu = new JMenu("Size"); // create menuitem call "Size"

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);
        // add each Menuitem to menu

        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        // add menu to menu bar

        this.setJMenuBar(menuBar); // set menubar for this frame

    }

    protected void setFrameFeatures() {
        super.setFrameFeatures();
    }
    // using super for less coding

    @Override
    protected void addComponents() {
        super.addComponents();
    }
    // using super for less coding

}
