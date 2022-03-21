/**
 * MobileDeviceFormV7
 * 
 * add action listener to cancel and ok button
 * 
 * Author: Sirawitch Butryojantho
 * Sec: 2
 * ID: 643040542-0
 */

package butryojantho.sirawitch.lab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import butryojantho.sirawitch.lab8.MobileDeviceFormV6;

public class MobileDeviceFormV7 extends MobileDeviceFormV6 implements ActionListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    //run GUI

    public static void createAndShowGUI() {
        MobileDeviceFormV7 msw = new MobileDeviceFormV7("Mobile Device Form V7");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    //create GUI

    protected void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }
    //add actionlistener to cancel and ok button

    public MobileDeviceFormV7(String title) {
        super(title);
    }
    //set the title of this window

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource(); //get source from user
        if (src == okButton) { //condition for ok button
            String brandMs = brandLabel.getText() + " " + brandText.getText(); 
            String modelMs = modelLabel.getText() + " " + modelText.getText();
            String colorMs = colorLabel.getText() + " " + colorText.getText();
            String weightMs = weightLabel.getText() + " " + weightText.getText();
            String priceMs = priceLabel.getText() + " " + priceText.getText();
            android.setActionCommand("Android");
            ios.setActionCommand("iOS");
            String osMs = osLabel.getText() + " " + os.getSelection().getActionCommand();
            String typeMs = typeLabel.getText() + " " + typeCb.getSelectedItem();
            String reviewMs = reviewLabel.getText() + " " + reviewTextArea.getText();
            String featureMs = featureLabel.getText();
            String featureSelected = featureList.getSelectedValuesList().toString();
            //get the result from user
            JOptionPane.showMessageDialog(null,
                    brandMs + "\n"
                            + modelMs + "\n"
                            + colorMs + "\n"
                            + weightMs + "\n"
                            + priceMs + "\n"
                            + osMs + "\n"
                            + typeMs + "\n"
                            + reviewMs + "\n"
                            + featureMs + "\n"
                            + featureSelected);
            //show message dialog
        } else if (src == cancelButton) {//condition for cancel button
            brandText.setText("");
            modelText.setText("");
            colorText.setText("");
            weightText.setText("");
            priceText.setText("");
            android.setSelected(true);
            typeCb.setSelectedItem("Phone");
            reviewTextArea.setText("");
            featureList.clearSelection();
        }
        //restore everything
    }

}
