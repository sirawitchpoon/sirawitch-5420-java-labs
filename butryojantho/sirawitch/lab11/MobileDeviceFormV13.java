package butryojantho.sirawitch.lab11;

import java.util.ArrayList;

import java.awt.event.*;
import javax.swing.*;

import butryojantho.sirawitch.lab10.MobileDeviceFormV12;
import butryojantho.sirawitch.lab6.MobileDevice;

public class MobileDeviceFormV13 extends MobileDeviceFormV12 {

    protected ArrayList<MobileDeviceV2> deviceList;

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

class MobileDeviceV2 extends MobileDevice {

    protected String brand, model, mobileOS, type;
    protected double weight;

    public MobileDeviceV2(String brand, String model, String color, double weight, double price, String mobileOS,
            String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mobileOS = mobileOS;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public boolean isWatch() {
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMobileOS() {
        return mobileOS;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMobileOS(String mobileOS) {
        this.mobileOS = mobileOS;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Brand Name : " + brand
                + ", Model Name : " + model
                + ", Color : " + color
                + ", Weight : " + weight
                + ", Price : " + price
                + ", Mobile OS : " + mobileOS
                + ", Type : " + type;
    }

}
