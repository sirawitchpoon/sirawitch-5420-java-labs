/**
 * MobileDeviceFormV16
 * 
 * Save file of input devices and read it
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 */

package butryojantho.sirawitch.lab11;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class MobileDeviceFormV16 extends MobileDeviceFormV15 {

    protected String enteredDevice;
    File saveMenu;

    public MobileDeviceFormV16(String title) {
        super(title);
    }
    //set the title of the window

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
    //create and show GUI

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource().equals(saveItem)) { //the action will happen when selected Save menuitem
            File saveFile = saveFileChooser.getSelectedFile(); //define File variable to get selected file from user
            enteredDevice = ""; // define empty string variable
            for (int i = 0; i < deviceList.size(); i++) {
                enteredDevice += (i + 1) + "." + deviceList.get(i) + "\n";
            } // using for loop to create string by getting input devices from deviceList
            JOptionPane.showMessageDialog(null, enteredDevice);
            // show dialog of the input devices
            try {
                String fileName = saveFile.getPath(); //get path from the selected file
                FileWriter fileWriter = new FileWriter(fileName); //write character-oriented data to a file.
                PrintWriter printWriter = new PrintWriter(fileWriter); //print the formatted representation of objects to the text-output stream.
                printWriter.print(enteredDevice + "\n"); //print input device
                printWriter.close(); //close PrintWritter
            } catch (IOException ex) {
                System.err.println("An I/O exception of some sort has occurred.");
                //catch error from user 
            }  catch (NullPointerException ex) {
                System.err.println("An application attempts to use null in a case where an object is required.");
            }   //catch error from user 
        } else if (e.getSource().equals(openItem)) {
            File openFile = openFileChooser.getSelectedFile(); //define File variable to get selected file from user
            try {
                String fileName = openFile.getPath(); //get path from the selected file
                FileReader fileReader = new FileReader(fileName); //write character-oriented data to a file.
                BufferedReader bufferedReader = new BufferedReader(fileReader); //read the text from a character-based input stream
                String line; //define string variable
                deviceList.clear(); //Removes all of the elements from this list.
                while ((line = bufferedReader.readLine()) != null) { //the action is happen when the reads line of text isn't null

                    String[] splittedLine = line.split(",", -1); 
                    String branedOpenedFile = ((splittedLine[0].split(":", -1))[1].trim());
                    String modelOpenedFile = ((splittedLine[1].split(":", -1))[1].trim());
                    String colorOpenedFile = ((splittedLine[2].split(":", -1))[1].trim());
                    double weightOpenedFile = Double.parseDouble(((splittedLine[3].split(":", -1))[1].trim()));
                    double priceOpenedFile = Double.parseDouble(((splittedLine[4].split(":", -1))[1].trim()));
                    String osMobileOpenedFile = ((splittedLine[5].split(":", -1))[1].trim());
                    String typeOpenedFile = ((splittedLine[6].split(":", -1))[1].trim());
                    //Splits this string and arrange it seperate line
                    MobileDeviceV2 mobileDeviceV2 = new MobileDeviceV2(branedOpenedFile, modelOpenedFile,
                            colorOpenedFile, weightOpenedFile, priceOpenedFile, osMobileOpenedFile, typeOpenedFile);
                    //create MobileDeviceV2 object from the spllitted string
                    deviceList.add(mobileDeviceV2);
                    //add it to ArrayList
                }
                fileReader.close(); //close FileReader
                bufferedReader.close(); //close BufferedReade
                System.out.println(deviceList); //print ArrayList
                String displayDevice = ""; //create empty string
                for (int i = 0; i < deviceList.size(); i++) {
                    displayDevice = displayDevice + deviceList.get(i) + "\n";
                } //for loop to get input from ArrayList "displayDevice"
                JOptionPane.showMessageDialog(null, displayDevice);
                //show dialog of the input devices
            } catch (IOException ex) {
                System.err.println("An I/O exception of some sort has occurred.");
                ex.printStackTrace(System.err);
                //catch error from user
            } catch (NullPointerException ex) {
                System.err.println("An application attempts to use null in a case where an object is required.");
            } //catch error from user
        }
    }

}
