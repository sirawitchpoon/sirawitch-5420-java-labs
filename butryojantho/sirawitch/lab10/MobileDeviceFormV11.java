/**
 * MobileDeviceFormV11
 * 
 * Set Mnemonic and Accelerator keys for these menus or menu items
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec: 2
 * 
 */

package butryojantho.sirawitch.lab10;

import java.awt.event.*;
import javax.swing.*;

public class MobileDeviceFormV11 extends MobileDeviceFormV10 {

    protected JMenuItem customColorItem;
    
    public MobileDeviceFormV11(String title) {
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
        MobileDeviceFormV11 msw = new MobileDeviceFormV11("Mobile Device Form V11");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI
    
    protected void addMenus() {
        super.addMenus();

        customColorItem = new JMenuItem("Custom ...");
        //create new JMenuItem

        colorMenu.add(customColorItem);
        //add CustomColor JMenuItem to ColorMenu

        fileMenu.setMnemonic(KeyEvent.VK_F);
        newItem.setMnemonic(KeyEvent.VK_N);
        openItem.setMnemonic(KeyEvent.VK_O);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_X);
        configMenu.setMnemonic(KeyEvent.VK_C);
        colorMenu.setMnemonic(KeyEvent.VK_L);
        blueMI.setMnemonic(KeyEvent.VK_B);
        greenMI.setMnemonic(KeyEvent.VK_M);
        redMI.setMnemonic(KeyEvent.VK_R);
        customColorItem.setMnemonic(KeyEvent.VK_U);
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        blueMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        greenMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        redMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        customColorItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
        //set Mnemonic and Accelerator key for these menus or menu items
    }

}
