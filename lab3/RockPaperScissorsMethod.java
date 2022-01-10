/** RockPaperScissorsMethod Program
* This program produces the same result as the program RockPaperScissors in Problem 1. 
* The program defines three methods, namely acceptInput(), genCompChoice() and displayWinner() described below. 
* The program also contains one static String variable, namely human, and one local String variable, namely computer to be used in the program methods.
* 
* <Note> RockPaperScissors Program
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
* Date: January 10, 2022
*
*/

package butryojantho.sirawitch.lab3;

import java.util.Scanner;

public class RockPaperScissorsMethod {

    static String human;

    public static void main(String[] args) {
        acceptInput();
        String computer = getCompChoice();
        displayWinner(computer);
    }

    public static void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Rock or Paper or Scissors: ");
        human = scan.nextLine();
        human = human.toLowerCase();
    }

    public static String getCompChoice() {
        int max = 2;
        int min = 0;
        int range = max - min + 1;
        int randNum = (int) (Math.random() * range) + min;
        String comChoice = "";
        if (randNum == 0) {
            comChoice = "rock";
        }
        if (randNum == 1) {
            comChoice = "paper";
        }
        if (randNum == 2) {
            comChoice = "scissors";
        }
        return comChoice;
    }

    public static void displayWinner(String comChoice) {
        if (!human.equalsIgnoreCase("rock") && !human.equalsIgnoreCase("paper")
                && !human.equalsIgnoreCase("scissors")) {
            System.out.println("Incorrect input. Rock, Paper or Scissors only.");
        } else {
            System.out.println("Computer's choice is " + comChoice);
            if (human.equalsIgnoreCase(comChoice)) {
                System.out.println("It's a tie");
            } else {
                if (((human.equalsIgnoreCase("rock") && comChoice.equalsIgnoreCase("scissors"))
                        || (human.equalsIgnoreCase("paper")) && comChoice.equalsIgnoreCase("rock"))
                        || (human.equalsIgnoreCase("scissors") && comChoice.equalsIgnoreCase("paper"))) {
                    System.out.println(human + " beats " + comChoice + ". You win.");
                } else {
                    System.out.println(comChoice + " beats " + human + ". Computer wins.");
                }
            }
        }
    }
}
