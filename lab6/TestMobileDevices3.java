/**
* This is TestMobileDevices3 class.
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: Febuary 18, 2022
*
**/

package butryojantho.sirawitch.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestMobileDevices3 {
    public static void main(String[] args) {
        ArrayList<MobileDevice> mobileDevices = new ArrayList<MobileDevice>(); //create empthy arraylist call "mobileDevices" which in MobileDevice's type
        mobileDevices.add(new IPadAir("Rose Gold", 19900.0, 64.0)); // add an object in to mobileDivices's list
        mobileDevices.add(new IPadAir("Silver", 24900.0, 256.0)); // add an object in to mobileDivices's list
        mobileDevices.add(new IPadAir("Black", 24900.0, 256.0)); // add an object in to mobileDivices's list
        mobileDevices.add(new AppleWatch("Silver", 9400.0, "Apple Watch Nike SE GPS")); // add an object in to mobileDivices's list
        mobileDevices.add(new AppleWatch("Silver", 9400.0, "Apple Watch Nike SE")); // add an object in to mobileDivices's list
        System.out.println("=== Before sorting ==="); //print message
        System.out.println(mobileDevices);  //print mobileDevices's list(unsorted)
        Collections.sort(mobileDevices, new SortMobileDevicesByMultipleAttrs()); //sort an object in mobileDevice's list by multiple condition
        System.out.println("=== After sorting ==="); //print message
        System.out.println(mobileDevices); //print mobileDevices's list(sorted)
    }
}

class SortMobileDevicesByMultipleAttrs implements Comparator<MobileDevice> {

    public int compare(MobileDevice a, MobileDevice b) {
        int priceCompare = (int) (a.getPrice() - b.getPrice());
        if (priceCompare != 0) {
            return (int) (a.getPrice() - b.getPrice());
        } else {
            if (a instanceof IPadAir && b instanceof IPadAir) {
                int storageCompare = (int) (((IPadAir) a).getStorage() - ((IPadAir) b).getStorage());
                if (storageCompare != 0) {
                    return (int) (((IPadAir) a).getStorage() - ((IPadAir) b).getStorage());
                } else {
                    return a.getColor().compareTo(b.getColor());
                }
            } else if (a instanceof AppleWatch && b instanceof AppleWatch) {
                int modelName = ((AppleWatch) a).getModelName().compareTo(((AppleWatch) b).getModelName());
                if (modelName != 0) {
                    return ((AppleWatch) a).getModelName().compareTo(((AppleWatch) b).getModelName());
                } else {
                    return a.getColor().compareTo(b.getColor());
                }
            } else {
                return a.getColor().compareTo(b.getColor());
            }
        }
    }
}