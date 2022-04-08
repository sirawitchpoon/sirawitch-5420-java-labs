package butryojantho.sirawitch.lab11;

import java.awt.event.*;
import javax.swing.*;

public class MobileDeviceFormV16 extends MobileDeviceFormV15 {

    public MobileDeviceFormV16(String title) {
        super(title);
        //TODO Auto-generated constructor stub
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
        MobileDeviceFormV16 msw = new MobileDeviceFormV16("Mobile Device Form V16");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    
    
}
