package butryojantho.sirawitch.lab11;

import java.awt.event.*;
import javax.swing.*;

public class MobileDeviceFormV15 extends MobileDeviceFormV14 {

    protected final double MIN_WEIGHT = 0.01, MAX_WEIGHT = 1.00;

    public MobileDeviceFormV15(String title) {
        super(title);
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
        MobileDeviceFormV15 msw = new MobileDeviceFormV15("Mobile Device Form V15");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(okButton)) {
            if (modelText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter model number");
            } else if (weightText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter weight");
            } else if (!weightText.getText().isEmpty()) {
                try {
                    double dbValueWeightText = Double.parseDouble(weightText.getText());
                    if (MIN_WEIGHT > dbValueWeightText) {
                        JOptionPane.showMessageDialog(null,
                                "Too light: valid weight is [" + MIN_WEIGHT + "," + MAX_WEIGHT + "]");
                    } else if (MAX_WEIGHT < dbValueWeightText) {
                        JOptionPane.showMessageDialog(null,
                                "Too heavy: valid weight is [" + MIN_WEIGHT + "," + MAX_WEIGHT + "]");
                    } else {
                        super.actionPerformed(e);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter only number for weight");
                }
            }
        } else {
            super.actionPerformed(e);
        }
    }

}
