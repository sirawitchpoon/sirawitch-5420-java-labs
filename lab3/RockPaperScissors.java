/** RockPaperScissors Program
* This program simulates a rock-paper-scissors game. 
* The program reads in a choice (Rock, Paper, or Scissors) from a user 
* then compares that choice with a randomly generated choice from a computer.
* The winner is decided by the following rule: 
* i. rock beats scissors ii. paper beats rock iii. scissors beats paper.
* If the user’s choice and the computer’s choice are the same, the result is a tie. 
*
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: January 7, 2022
*
*/

package butryojantho.sirawitch.lab3;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rock or Paper or Scissors: ");
        String obj = scanner.nextLine();
        obj = obj.toLowerCase();
        int max = 2;
        int min = 0;
        int range = max - min + 1;
        if (obj.equals("rock") || obj.equals("paper") || obj.equals("scissors")) {
            while (obj.equals("rock")) {
                System.out.println("Rock");
                int randNum = (int) (Math.random() * range) + min;
                if (randNum == 0) {
                    System.out.println("Computer's choice is: Rock");
                    System.out.println("It's a tie");
                    System.exit(0);
                } else if (randNum == 1) {
                    System.out.println("Computer's choice is: Paper");
                    System.out.println("Paper beats Rock. Computer wins");
                    System.exit(0);
                } else if (randNum == 2) {
                    System.out.println("Computer's choice is: Scissors");
                    System.out.println("Rock beats Paper. You win.");
                    System.exit(0);
                }
            }
            while (obj.equals("paper")) {
                System.out.println("Paper");
                int randNum = (int) (Math.random() * range) + min;
                if (randNum == 0) {
                    System.out.println("Computer's choice is: Rock");
                    System.out.println("Paper beats Rock. You win.");
                    System.exit(0);
                } else if (randNum == 1) {
                    System.out.println("Computer's choice is: Paper");
                    System.out.println("It's a tie.");
                    System.exit(0);
                } else if (randNum == 2) {
                    System.out.println("Computer's choice is: Scissors");
                    System.out.println("Scissors beats Paper. Computer wins.");
                    System.exit(0);
                }
            }
            while (obj.equals("scissors")) {
                System.out.println("Scissors");
                int randNum = (int) (Math.random() * range) + min;
                if (randNum == 0) {
                    System.out.println("Computer's choice is: Rock");
                    System.out.println("Rock beats Scissors. Computer wins.");
                    System.exit(0);
                } else if (randNum == 1) {
                    System.out.println("Computer's choice is: Paper");
                    System.out.println("Scissors beats Paper. You win.");
                    System.exit(0);
                } else if (randNum == 2) {
                    System.out.println("Computer's choice is: Scissors");
                    System.out.println("It's a tie.");
                    System.exit(0);
                }
            }
        }
        System.out.println("Incorrect scanner. Rock, Paper or Scissors only.");
    }
}