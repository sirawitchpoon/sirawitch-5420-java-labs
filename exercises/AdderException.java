package exercises;

/**
 * AdderException 
 * This Adder is supposed to add two integers
 * It can handle when inputs are not integers
 * It can handle when the number of input arguments is not two
 * 
 * Author: Sirawitch Butryojantho
 * Sec: 2
 * ID: 643040542-0
 * 
 * 
 */

public class AdderException {
    
    public static void main(String[] args) {
        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int sum = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + sum);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Please provide two arguments");
        } catch (NumberFormatException ex) {
            System.err.println("Please provide two integers");
        }
    }

}
