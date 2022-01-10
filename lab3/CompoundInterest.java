/** CompoundInterest Program
* The program has the following properties:
* a) The program read in two doubles: initialInvest and interest. 
* b) The program displays each year the total investment until the total is twice the initial money invested. 
* c) The total investment each year can be computed from the previous year’s investment plus the additional income from interest. 
*    (current invest = previous investment + interest*previous investment). 
* d) All output numbers should be displayed with 2 digit precision.
* e) The program outputs an error message when either initialInvest or interest, or both are negative
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
import java.text.DecimalFormat;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial investment: ");
        double iniInvest = scanner.nextDouble();
        System.out.print("Enter compound interest: ");
        double interest = scanner.nextDouble();

        Double prev = iniInvest;
        double current = 0;
        double year = 1;
        DecimalFormat formater = new DecimalFormat("#.00");
        if (iniInvest > 0 && interest > 0) {
            while (current < iniInvest * 2) {
                current = prev + ((interest / 100) * prev);
                year++;
                current = Double.valueOf(formater.format(current));
                System.out.println("Year " + year + " : " + current);
                prev = current;
            }
            scanner.close();
        } else {
            System.out.println("Initial investment and interest should be positive");
        }
    }
}