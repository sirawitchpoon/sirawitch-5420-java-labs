package butryojantho.sirawitch.lab9;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import butryojantho.sirawitch.lab8.MobileDeviceFormV6;

public class MobileDeviceFormV7 extends MobileDeviceFormV6 {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MobileDeviceFormV7 msw = new MobileDeviceFormV7("Mobile Device Form V7");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    public MobileDeviceFormV7(String title) {
        super(title);
    }


}
