/**
 * MobileDeviceFormV6 program
 * In this program, It will
 * add a  panel that contains the label “Features:” which its font is set to font family as “SansSerif”, size as 14, and style as plain,
 * Add a panel that extends from JPanel that draws an image read from the specified file.
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 * Date: 11/03/2022
 * 
 */

package butryojantho.sirawitch.lab8;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class MobileDeviceFormV6 extends MobileDeviceFormV5 {

    protected JPanel featurePanel;
    protected JLabel featureLabel;
    protected JList featureList;
    protected String[] featureArray = {"10.9-inch display", "12MP rear camera", "next-generation Touch ID sensor"};

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MobileDeviceFormV6 msw = new MobileDeviceFormV6("Mobile Device Form V6");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }


    protected void addComponents() {
        super.addComponents();
        ReadImage ipadAirImage = new ReadImage();
        featurePanel = new JPanel();
        GridLayout layout = new GridLayout(3,1);
        featurePanel.setLayout(new GridLayout(3,1));
        infoPanel.setLayout(new GridLayout(2, 1));
        featureLabel = new JLabel("Features:");
        featureLabel.setFont(font14Bold);
        featureList = new JList(featureArray);
        featureList.setFont(font14Bold);
        featurePanel.add(featureLabel);
        featurePanel.add(featureList);
        featurePanel.add(ipadAirImage);
        infoPanel.add(featurePanel);
    }

    public MobileDeviceFormV6(String title) {
        super(title);
    }
    
    protected class ReadImage<BufferedImage> extends JPanel {
        java.awt.image.BufferedImage img;
        String ipadAirFile = "images/ipadair.jpg";
        protected void paintComponent(Graphics g) { g.drawImage(img, 0, 0, null);}
        protected ReadImage() {
            try {
                URL url = new URL ("https://drive.google.com/file/d/1zvkEgIKmtVfSfaw-t1fsy6MJBbCJBt7D/view");
                img = ImageIO.read(new File(ipadAirFile));
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
        public Dimension getPreferredSize() {
            if (img == null)
            return new DimensionUIResource(100, 100);
            else 
                return new DimensionUIResource(img.getWidth(), img.getHeight());
        }
    }

}
