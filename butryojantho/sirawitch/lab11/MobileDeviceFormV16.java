package butryojantho.sirawitch.lab11;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.*;

public class MobileDeviceFormV16 extends MobileDeviceFormV15 {

    protected String enteredDevice;
    File saveMenu;

    public MobileDeviceFormV16(String title) {
        super(title);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource().equals(saveItem)) {
            File saveFile = saveFileChooser.getSelectedFile();
            enteredDevice = "";
            for (int i = 0; i < deviceList.size(); i++) {
                enteredDevice += (i + 1) + "." + deviceList.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, enteredDevice);
            try {
                String fileName = saveFile.getPath();
                FileWriter fileWriter = new FileWriter(fileName);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.print(enteredDevice + "\n");
                printWriter.close();
            } catch (IOException ex) {
                System.err.println("Error in reading file");
            } catch (NullPointerException ex) {
                System.err.println("Haven't save file");
            }
        } else if (e.getSource().equals(openItem)) {
            File openFile = openFileChooser.getSelectedFile();
            try {
                String fileName = openFile.getPath();
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                deviceList.clear();
                while ((line = bufferedReader.readLine()) != null) {
                    String[] splittedLine = line.split(",", -1);
                    String branedOpenedFile = ((splittedLine[0].split(":", -1))[1].trim());
                    String modelOpenedFile = ((splittedLine[1].split(":", -1))[1].trim());
                    String colorOpenedFile = ((splittedLine[2].split(":", -1))[1].trim());
                    double weightOpenedFile = Double.parseDouble(((splittedLine[3].split(":", -1))[1].trim()));
                    double priceOpenedFile = Double.parseDouble(((splittedLine[4].split(":", -1))[1].trim()));
                    String osMobileOpenedFile = ((splittedLine[5].split(":", -1))[1].trim());
                    String typeOpenedFile = ((splittedLine[6].split(":", -1))[1].trim());
                    MobileDeviceV2 mobileDeviceV2 = new MobileDeviceV2(branedOpenedFile, modelOpenedFile,
                            colorOpenedFile, weightOpenedFile, priceOpenedFile, osMobileOpenedFile, typeOpenedFile);
                    deviceList.add(mobileDeviceV2);
                }
                fileReader.close();
                bufferedReader.close();
                System.out.println(deviceList);
                String displayDevice = "";
                for (int i = 0; i < deviceList.size(); i++) {
                    displayDevice = displayDevice + deviceList.get(i) + "\n";
                }
                JOptionPane.showMessageDialog(null, displayDevice);
            } catch (IOException ex) {
                System.err.println("An I/O exception of some sort has occurred.");
                ex.printStackTrace(System.err);
            } catch (NullPointerException ex) {
                System.err.println("An application attempts to use null in a case where an object is required. ");
            }
        }
    }

}
