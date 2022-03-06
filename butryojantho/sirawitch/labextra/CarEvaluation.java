/**
* This is CarEvaluation program.
* It's takes user’s evaluations from the standard input, and then calculates 
* and displays an average score for each category being evaluated to the standard output.
* A car is evaluated in five categories: Appearance, Braking, Comfort, Handling, and Reliability.
* For each category, a score of 1, 2, 3, 4, or 5 will be used, 
* where 1 represents the lowest possible score, and 5 represents the highest possible score.
* The program starts by calling the function getEvaluations() to get inputs from the user. 
* The program first asks the user how many submissions he/she wants to enter.
* Then, for each submission, the program asks the user to enter a score for each category in the same line 
* Which in the order of Appearance, Braking, Comfort, Handling, and Reliability respectively.  
* After the program finishes obtaining inputs from the user, the program calls the function displayStats().
* In the function, displayStats(), for each evaluated category, 
* the program calculates the average score in that category, and displays the results to the user.
*
*
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: January 21, 2022
*
**/

package butryojantho.sirawitch.labextra;

import java.util.Scanner;

public class CarEvaluation {

    static int NUM_CATEGORIES = 5; // for maximum category of car evaluate
    static int[][] scores; // the scores that user enter
    static double[] finalavg; // average point for each category
    static int input; // define variable for using outside functions (sorry for my bad english)

    public static void main(String[] args) { // main class
        getEvaluations(); // get input
        displayStats(); // calculate an average scores for each category
    }

    static void getEvaluations() {
        int i = 0, j; // define integers
        Scanner sc = new Scanner(System.in); // run the scanner
        System.out.print("Please enter the number of submissions: "); // ask the user for input
        input = sc.nextInt(); // use scanner for collect input
        scores = new int[input][NUM_CATEGORIES]; // create 2d array
        do { // using loop "do"
            System.out.println(
                    "Submission #" + (i + 1) + ", please enter a score for each of the " + NUM_CATEGORIES
                            + " categories");
            for (j = 0; j < NUM_CATEGORIES; j++) { // use the "for" loop to store data for each submission up to the
                                                   // number of categories we want.
                scores[i][j] = sc.nextInt();
                if ((scores[i][j] > 5) || (scores[i][j] < 0)) { // in case the user enters a score greater than 5 or
                                                                // less than 1, the user must re-enter.
                    System.out.println(
                            "Each score should be a positive integer and the maximum score is 5. Please enter a score for this type of category again");
                    j--;
                    continue;
                    // invalid inputs are not counted because j- makes the loop backwards.
                }
            }
            i++; // for making the condition of loop "do" reach the end
        } while (i < input); // in case the submission is more than 1, the condition of loop do.
    }

    static void displayStats() {
        int i = 0, j = 0; // define integers
        finalavg = new double[NUM_CATEGORIES]; // create array
        do {
            double count = 0; // define double
            double sum = 0; // define double
            for (i = 0; i < input; i++) { // loop to find the average for each column which mean the average score for
                                          // each category
                sum = sum + scores[i][j]; // sum all number in any column
                count++; // to turn into the divisor to find an average
            }
            finalavg[j] = (sum / count); // find the average number in any column
            j++; // to do the same for every column, for making the condition of loop "do" reach
                 // the end
        } while (j < 5); // to do the same for every column, the condition of loop do.
        System.out.print("The average value of each category:"); // print out the average for each category
        for (int a = 0; a < NUM_CATEGORIES; a++) { // using loop "for" to make the code less
            System.out.print(" " + Double.valueOf(finalavg[a]) + " ");
        }
    }

}