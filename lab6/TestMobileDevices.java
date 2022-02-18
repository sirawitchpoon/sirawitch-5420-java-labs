/**
* This is TestMobileDevices class.
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: Febuary 18, 2022
*
**/

package butryojantho.sirawitch.lab6;

public class TestMobileDevices {
    public static void main(String[] args) {
        IPadAir ipadAir1 = new IPadAir("Rose Gold", 19900.0, 64.0); // create an object call "ipadAir1" which in an
                                                                    // IPadAir's type
        IPadAir ipadAir2 = new IPadAir("Silver", 24900.0, 256.0); // create an object call "ipadAir2" which in an
                                                                  // IPadAir's type
        AppleWatch appleWatch1 = new AppleWatch("Silver", 9400.0, "Apple Watch Nike SE GPS"); // create an object call
                                                                                              // "applewatch1" which in
                                                                                              // an AppleWatch's type
        System.out.println("iPadAir chip name is " + IPadAir.getChipName()); // print out IPadAir chip name
        if (ipadAir2.isWatch()) { // check if this object is watch
            System.out.println(ipadAir2 + " is a watch"); // print that this object is a watch
        } else {
            System.out.println(ipadAir2 + " is not a watch"); // print that this object isn't a watch
        }
        comparePrice(ipadAir1, ipadAir2); // comparing price of two objects
        comparePrice(ipadAir1, appleWatch1); // comparing price of two objects
    }

    private static void comparePrice(MobileDevice md1, MobileDevice md2) {
        if (md1.getPrice() > md2.getPrice()) {
            System.out.println(md2 + " is cheaper than " + md1);
        } else if (md1.getPrice() < md2.getPrice()) {
            System.out.println(md1 + " is cheaper than " + md2);
        } else {
            System.out.println("Their price are the same price");
        }
    }
}
