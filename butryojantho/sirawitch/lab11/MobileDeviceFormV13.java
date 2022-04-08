package butryojantho.sirawitch.lab11;

import java.util.ArrayList;

import java.awt.event.*;
import javax.swing.*;

import butryojantho.sirawitch.lab10.MobileDeviceFormV12;

public class MobileDeviceFormV13 extends MobileDeviceFormV12 {

    protected ArrayList<MobileDeviceV2> deviceList;
    protected int deviceCount;

    public MobileDeviceFormV13(String title) {
        super(title);
        deviceList = new ArrayList<MobileDeviceV2>();
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
        MobileDeviceFormV13 msw = new MobileDeviceFormV13("Mobile Device Form V13");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI

    @Override
    protected void addListeners() {
        super.addListeners();
        okButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        android.setActionCommand("Android");
        ios.setActionCommand("iOS");
        if (e.getSource().equals(okButton)) {
            MobileDeviceV2 dummyDevice = new MobileDeviceV2(
                    brandText.getText(),
                    modelText.getText(),
                    colorText.getText(),
                    Double.parseDouble(weightText.getText()),
                    Double.parseDouble(priceText.getText()),
                    (String) os.getSelection().getActionCommand(),
                    (String) typeCb.getSelectedItem());
            deviceList.add(dummyDevice);
            System.out.println(deviceList + "\n");
        }
    }

}
