/**
 * This Calculator program, 
 * it help you to calculate number.
 * The result have two decimal.
 * Use x for multiply operator
 * it accept three arguments you have to put it inorder
 * First: the operator
 * Second: first number
 * Last: secound number
 * 
 * Author : Sirawitch Butryojantho
 * ID : 643040542-0
 * Sec : 2
 * Date : December 27, 2021
 * */

package butryojantho.sirawitch.lab2 ;

public class Calculator {
    public static void main(String[] args) {
        int numArgs = args.length;
        if (numArgs == 3) {
            String operand1 = args[1];  //determine the first number(args1) to enter the mathematical process.
            String operand2 = args[2];  //determine the secound number(args2) to enter the mathematical process.
            Double oper1 = Double.parseDouble(operand1); //convert String to Double
            Double oper2 = Double.parseDouble(operand2); //convert String to Double
            switch (args[0]) {
                case "+":
                    Double plus = oper1 + oper2;      //define variable for add operlate
                    System.out.format(oper1 + " + " + oper2 + " = " + "%.2f",plus);   //output and format double to two decimal
                    System.out.println();   //empty line
                    break;
                case "-":
                    Double minus = oper1 - oper2;     //define variable for subtract operlate
                    System.out.format(oper1 + " - " + oper2 + " = " + "%.2f",minus);  //output and format double to two decimal
                    System.out.println(); //empty line
                    break;
                case "x":
                    Double multiply = oper1 * oper2;  //define variable for multiply operlate
                    System.out.format(oper1 + " x " + oper2 + " = " + "%.2f",multiply);   //output and format double to two decimal
                    System.out.println(); //empty line
                    break;
                case "/":
                    Double divide = oper1 / oper2;    //define variable for divide operlate
                    if (oper2 == 0) {        //if divisor is zero, it cannot divide (Mathematical principles)
                        System.out.println("The second operand cannot be zero");
                    } else {
                        System.out.format(oper1 + " / " + oper2 + " = " + "%.2f",divide); //output and format double to two decimal
                        System.out.println(); //empty line
                    }
                    break;
                default:
                    break;
            }
        } else {       //the amount of arguments quantity has to be 3 if not the program won't work
                System.out.println("Calculator <operator> <operand1> <operand2>");
        }


    }

}