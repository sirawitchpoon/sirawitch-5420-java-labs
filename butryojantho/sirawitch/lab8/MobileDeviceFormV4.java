/**
 * MobileDeviceFormV4 program
 * In this program, it add an icon for File and menu and add submenu of color and size
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 * Date: 11/03/2022
 * 
 */

package butryojantho.sirawitch.lab8;

import java.awt.*;
import javax.swing.*;
import butryojantho.sirawitch.lab7.MobileDeviceFormV3;

public class MobileDeviceFormV4 extends MobileDeviceFormV3 {

    protected ImageIcon newMenuIcon, openMenuIcon, saveMenuIcon, exitMenuIcon, colorMenuIcon, sizeMenuIcon;
    protected JMenuItem redMI, greenMI, blueMI, size16MI, size20MI, size24MI;

    public MobileDeviceFormV4(String title) {
        super(title);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
    }

    public static void createAndShowGUI() {
        MobileDeviceFormV4 msw = new MobileDeviceFormV4("Mobile Device Form V4");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    protected void setFrameFeatures() {
        super.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected void addMenus() {
        super.addMenus();
        updateMenuIcon();
        addSubMenus();
    }

    protected void addSubMenus() {
        redMI = new JMenuItem("Red");
        greenMI = new JMenuItem("Green");
        blueMI = new JMenuItem("Blue");
        size16MI = new JMenuItem("16");
        size20MI = new JMenuItem("20");
        size24MI = new JMenuItem("24");
        colorMenu.add(redMI);
        colorMenu.add(greenMI);
        colorMenu.add(blueMI);
        sizeMenu.add(size16MI);
        sizeMenu.add(size20MI);
        sizeMenu.add(size24MI);
    }

    protected void updateMenuIcon() {
        newMenuIcon = new ImageIcon("Images/new.png");
        openMenuIcon = new ImageIcon("Images/open.png");
        saveMenuIcon = new ImageIcon("Images/save.png");
        exitMenuIcon = new ImageIcon("Images/exit.png");
        newItem.setIcon(newMenuIcon);
        openItem.setIcon(openMenuIcon);
        saveItem.setIcon(saveMenuIcon);
        exitItem.setIcon(exitMenuIcon);
    }
}
