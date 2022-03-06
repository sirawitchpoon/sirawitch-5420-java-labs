package butryojantho.sirawitch.lab3;

/** TypingTest Program
* The program has the following properties: 
* a) TypingTest is a program that tests whether a user types faster or slower than an average person. An average person types at the speed of 40 words per minute. 
* b) The program randoms 8 colors from a list of rainbow colors (VIOLET, BLUE, INDIGO, GREEN, YELLOW, ORANGE, RED).
* c) A user must type in the same list ignoring the case. If the user types in incorrectly, he needs to type in again until he correctly types in the colors
* d) After the correct input is entered, the time used for typing in will be calculated and if the user types in less than or equal to 12 seconds, the user types faster than average. 
*    Otherwise the user types slower than the average.
* e) In case of the user type in incorrectly, the typing test time restart for a new type in.
*
*
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: January 10, 2022
*
*/

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class TypingTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();
        String[] rainbowRandom = new String[8];
        int correct = 0;
        long startTime = 0;

        for (int counter = 0; counter < 8; counter++) {
            String[] rainbow = { "VIOLET", "BLUE", "INDIGO", "GREEN", "YELLOW", "ORANGE", "RED" };
            int index = dice.nextInt(rainbow.length);
            rainbowRandom[counter] = rainbow[index];
            System.out.print(rainbowRandom[counter] + " ");
        }

        String[] userInput = new String[8];
        while ((userInput.length != 8 || correct != 8)) {
            startTime = 0;
            correct = 0;
            startTime = System.currentTimeMillis();
            System.out.println("");
            System.out.println("Type your answer: ");
            userInput = null;
            userInput = scanner.nextLine().replaceAll("\\s+:", " ").split(" ");
            if (userInput.length == 8) {
                for (int i = 0; i < userInput.length; i++) {
                    if (userInput[i].equalsIgnoreCase(rainbowRandom[i])) {
                        correct = correct + 1;
                    }
                }
            }
        }
        long stopTime = System.currentTimeMillis();
        long userTime = (stopTime - startTime) / 1000;
        DecimalFormat formater = new DecimalFormat("#.000");
        String formatedTime = formater.format(userTime);
        System.out.println("Your time is " + formatedTime);
        float averagetime = 12;
        if (userTime < averagetime) {
            System.out.println("You type faster than average person");
        } else {
            System.out.println("You type slower than average person");
        }
        scanner.close();
    }
}