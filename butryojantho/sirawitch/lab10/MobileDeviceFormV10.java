package butryojantho.sirawitch.lab10;

import butryojantho.sirawitch.lab9.MobileDeviceFormV9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MobileDeviceFormV10 extends MobileDeviceFormV9 {

    protected Font font16Plain = new Font("SansSerif", Font.PLAIN, 16);
    protected Font font20Plain = new Font("SansSerif", Font.PLAIN, 20);
    protected Font font24Plain = new Font("SansSerif", Font.PLAIN, 24);

    public MobileDeviceFormV10(String title) {
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
        MobileDeviceFormV10 msw = new MobileDeviceFormV10("Mobile Device Form V10");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
    // create GUI

    @Override
    protected void addListeners() {
        super.addListeners();
        redMI.addActionListener(this);
        greenMI.addActionListener(this);
        blueMI.addActionListener(this);
        size16MI.addActionListener(this);
        size20MI.addActionListener(this);
        size24MI.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(redMI)) {
            brandText.setForeground(Color.red);
            modelText.setForeground(Color.red);
            colorText.setForeground(Color.red);
            weightText.setForeground(Color.red);
            priceText.setForeground(Color.red);
            android.setForeground(Color.red);
            ios.setForeground(Color.red);
            typeCb.setForeground(Color.red);
            reviewTextArea.setForeground(Color.red);
            featureList.setForeground(Color.red);
        } else if (e.getSource().equals(greenMI)) {
            brandText.setForeground(Color.green);
            modelText.setForeground(Color.green);
            colorText.setForeground(Color.green);
            weightText.setForeground(Color.green);
            priceText.setForeground(Color.green);
            android.setForeground(Color.green);
            ios.setForeground(Color.green);
            ;
            typeCb.setForeground(Color.green);
            reviewTextArea.setForeground(Color.green);
            featureList.setForeground(Color.green);
        } else if (e.getSource().equals(blueMI)) {
            brandText.setForeground(Color.blue);
            modelText.setForeground(Color.blue);
            colorText.setForeground(Color.blue);
            weightText.setForeground(Color.blue);
            priceText.setForeground(Color.blue);
            android.setForeground(Color.blue);
            ios.setForeground(Color.blue);
            typeCb.setForeground(Color.blue);
            reviewTextArea.setForeground(Color.blue);
            featureList.setForeground(Color.blue);
        } else if (e.getSource().equals(size16MI)) {
            brandText.setFont(font16Plain);
            modelText.setFont(font16Plain);
            colorText.setFont(font16Plain);
            weightText.setFont(font16Plain);
            priceText.setFont(font16Plain);
            android.setFont(font16Plain);
            ios.setFont(font16Plain);
            typeCb.setFont(font16Plain);
            reviewTextArea.setFont(font16Plain);
            featureList.setFont(font16Plain);
        } else if (e.getSource().equals(size20MI)) {
            brandText.setFont(font20Plain);
            modelText.setFont(font20Plain);
            colorText.setFont(font20Plain);
            weightText.setFont(font20Plain);
            priceText.setFont(font20Plain);
            android.setFont(font20Plain);
            ios.setFont(font20Plain);
            typeCb.setFont(font20Plain);
            reviewTextArea.setFont(font20Plain);
            featureList.setFont(font20Plain);
        } else if (e.getSource().equals(size24MI)) {
            brandText.setFont(font24Plain);
            modelText.setFont(font24Plain);
            colorText.setFont(font24Plain);
            weightText.setFont(font24Plain);
            priceText.setFont(font24Plain);
            android.setFont(font24Plain);
            ios.setFont(font24Plain);
            typeCb.setFont(font24Plain);
            reviewTextArea.setFont(font24Plain);
            featureList.setFont(font24Plain);
        } else if (e.getSource().equals(openItem)) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getName());
                JOptionPane.showMessageDialog(null, "Opening: " + file);
            } else if (response == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Open command is canceled by user.");
            }
        } else if (e.getSource().equals(saveItem)) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                JOptionPane.showMessageDialog(null, "Save file as: " + file);
            } else if (response == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Save command is canceled by user.");
            }
        }
    }
}
