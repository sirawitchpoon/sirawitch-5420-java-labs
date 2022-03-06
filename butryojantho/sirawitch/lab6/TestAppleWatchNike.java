/**
* This is TestAppleWatchNike class.
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: Febuary 18, 2022
*
**/

package butryojantho.sirawitch.lab6;

public class TestAppleWatchNike {
    public static void main(String[] args) {
        AppleWatch appleWatch1 = new AppleWatch("Silver", 9400.0, "Apple Watch Nike SE GPS"); // create an object call
                                                                                              // "appleWatch1" which in
                                                                                              // an Applewatch's type
        AppleWatchNike appleWatch2 = new AppleWatchNike("Black", 10000, "Apple Watch Nike SE 7"); // create an object
                                                                                                  // call "appleWatch2"
                                                                                                  // which in an
                                                                                                  // ApplewatchNike's
                                                                                                  // type
        AppleWatchNike appleWatch3 = new AppleWatchNike("Navy", 12000, "Apple Watch Nike SE 8", 6, 8, 48, 140, 150, 8); // create
                                                                                                                        // an
                                                                                                                        // object
                                                                                                                        // call
                                                                                                                        // "appleWatch3"
                                                                                                                        // which
                                                                                                                        // in
                                                                                                                        // an
                                                                                                                        // ApplewatchNike's
                                                                                                                        // type
        System.out.println(appleWatch1); // print appleWatch1's info
        System.out.println(appleWatch2); // print appleWatch2's info
        appleWatch2.displayRunningStats(); // print appleWatch2's pace, distance, time
        appleWatch2.displayHeartRates(); // print appleWatch2's Avg/max heart rate
        appleWatch2.displaySleepHours(); // print appleWatch2's sleep hours
        System.out.println(appleWatch3); // print appleWatch3's info
        appleWatch3.displayRunningStats(); // print appleWatch3's pace, distance, time
        appleWatch3.displayHeartRates(); // print appleWatch3's Avg/max heart rate
        appleWatch3.displaySleepHours(); // print appleWatch3's sleep hours
    }

    public interface RunnerStatsCollector {
        public void displayRunningStats();

        public void displayHeartRates();
    }

    public interface HealthMonitorer {
        public void displaySleepHours();
    }
}
