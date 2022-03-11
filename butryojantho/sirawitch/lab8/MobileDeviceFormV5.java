/**
 * MobileDeviceFormV5 program
 * In this program, It will
 * set Mobile OS as iOS and type as Tablet,
 * Set the font of all labels to "SansSerif", plain, and size 14,
 * Set the font for values in the text fields, the text area, the radio buttons, and the combo box to "SansSerif", bold, and size 14,
 * Set the foreground color of the “Cancel” button to red and the “OK” button to blue.
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

public class MobileDeviceFormV5 extends MobileDeviceFormV4 {
    protected Font font14Plain = new Font("SansSerif", Font.PLAIN, 14);
    protected Font font14Bold = new Font("SansSerif", Font.BOLD, 14);
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MobileDeviceFormV5 msw = new MobileDeviceFormV5("Mobile Device Form V5");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    public MobileDeviceFormV5(String title) {
        super(title);
    }

    protected void setFrameFeatures() {
        super.setFrameFeatures();
    }

    protected void addMenus() {
        super.addMenus();
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        this.setFormValues();
        this.setFontsColor();
    }

    protected void setFontsColor() {
        cancelButton.setForeground(Color.red);
        okButton.setForeground(Color.blue);
        brandLabel.setFont(font14Bold);
        modelLabel.setFont(font14Bold);
        colorLabel.setFont(font14Bold);
        priceLabel.setFont(font14Bold);
        weightLabel.setFont(font14Bold);
        osLabel.setFont(font14Bold);
        typeLabel.setFont(font14Bold);
        reviewLabel.setFont(font14Bold);
        android.setFont(font14Bold);
        ios.setFont(font14Bold);
    }

    protected void setFormValues() {
        typeCb.setSelectedItem("Tablet");
        ios.setSelected(true);
        reviewTextArea.setText("The iPad Air is Apple's mid-range tablet and the current model features a new design with flat edges, the A14 Bionic chip,a USB-C port, Touch ID, a range of color options, and more.");
        reviewTextArea.setFont(font14Bold);
    }

}
