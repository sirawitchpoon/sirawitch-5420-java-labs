/**
 * This DiceGame program
 * It's simulates a game of two players 
 * where one player (a human player) guesses a score 
 * that another player (a computer player) will get from rolling dice.
 * The computer player rolls a dice (for numbers between 1 to 6)
 * If computer roll 1-3 you have to guess low for win
 * If computer roll 4-6 you have to guess high for win
 * 
 * 
 * Author: Sirawitch Butryojantho
 * Date: 25 January 2022
 * Sec: 2
 */

package butryojantho.sirawitch.lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiceGame {

    static double userWin;

    static double playedTime;

    static String human; 

    static int diceNumber;

    public static void main(String[] args) {
        playGames();
        displayStats();
    }

    public static void playGames() {
        Scanner scan = new Scanner(System.in);
        userWin = 0;
        playedTime = 0;
        while (true) {
            System.out.print("Enter your guess (l, L, h, or H): ");
            human = "";
            human = scan.nextLine();
            human = human.toLowerCase();
            if (human.equals("q")) {
                break;
            } else {
                int max = 6;
                int min = 1;
                int range = max - min + 1;
                diceNumber = (int) (Math.random() * range) + min;
                determineResult(diceNumber, human);
            }
        }
    }

    public static void determineResult(int diceNumber, String human) {
        System.out.println("Computer rolls the number " + diceNumber);
        System.out.println("Your guess " + human);
        if ((!human.equalsIgnoreCase("l")) && (!human.equalsIgnoreCase("h"))) {
            System.out.println("Please enter only l, L, h, or H");
        } else if ((human.equalsIgnoreCase("l")) && (diceNumber <= 3)
                || (human.equalsIgnoreCase("h")) && (diceNumber > 3)) {
            System.out.println("You win!");
            userWin = userWin + 1;
            playedTime = playedTime + 1;
        } else {
            System.out.println("Computer win!");
            playedTime = playedTime + 1;
        }
    }

    public static void displayStats() {
        DecimalFormat df = new DecimalFormat("0.00");
        Double percentWin = (userWin / playedTime) * 100;
        System.out.println("The number of times that you win is " + userWin + " and it is about "
                + df.format(percentWin) + "% out of all number of wins");
        System.exit(0);
    }
}