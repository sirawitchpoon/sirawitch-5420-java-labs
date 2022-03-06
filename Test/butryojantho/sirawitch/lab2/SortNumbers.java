/**
 * This SortNumbers program, 
 * it help you to sort the numbers from low to high.
 * this program can sort 5 numbers maximum.
 * the output is the amount vowel letters in any word you put in.
 * 
 * Author : Sirawitch Butryojantho
 * ID : 643040542-0
 * Sec : 2
 * Date : December 27, 2021
 * */

package butryojantho.sirawitch.lab2;

import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        int numArgs = args.length;      // difine variable for count arguments
        if (numArgs == 1) {
            String num_1 = args[0];
            Double nd1 = Double.parseDouble(num_1);   //convert String to Double
            System.out.println("For the input numbers :\n" + nd1);
            Double[] dArray = {nd1};                 //difine variable for get Double value
            Arrays.sort(dArray);                    //sort value form aArray
            System.out.printf("Sorted Numbers :\n%s \n", Arrays.toString(dArray));  //display sorted numbers
        } else if (numArgs == 2) {
            String num_1 = args[0];
            String num_2 = args[1];
            Double nd1 = Double.parseDouble(num_1);   //convert String to Double
            Double nd2 = Double.parseDouble(num_2);
            System.out.println("For the input numbers :\n" + nd1 + " " + nd2);
            Double[] dArray = {nd1, nd2};             //difine variable for get Double value
            Arrays.sort(dArray);                    //sort value form aArray
            System.out.printf("Sorted Numbers :\n%s \n", Arrays.toString(dArray));  //display sorted numbers
        } else if (numArgs == 3) {
            String num_1 = args[0];
            String num_2 = args[1];
            String num_3 = args[2];
            Double nd1 = Double.parseDouble(num_1);   //convert String to Double
            Double nd2 = Double.parseDouble(num_2);
            Double nd3 = Double.parseDouble(num_3);
            System.out.println("For the input numbers :\n" + nd1 + " " + nd2 + " " + nd3);
            Double[] dArray = {nd1, nd2, nd3};         //difine variable for get Double value
            Arrays.sort(dArray);                    //sort value form aArray
            System.out.printf("Sorted Numbers :\n%s \n", Arrays.toString(dArray));  //display sorted numbers
        } else if (numArgs == 4) {
            String num_1 = args[0];
            String num_2 = args[1];
            String num_3 = args[2];
            String num_4 = args[3];
            Double nd1 = Double.parseDouble(num_1);   //convert String to Double
            Double nd2 = Double.parseDouble(num_2);
            Double nd3 = Double.parseDouble(num_3);
            Double nd4 = Double.parseDouble(num_4);
            System.out.println("For the input number :\n" + nd1 + " " + nd2 + " " + nd3 + " " + nd4);
            Double[] dArray = {nd1, nd2, nd3, nd4};     //difine variable for get Double value
            Arrays.sort(dArray);                    //sort value form aArray
            System.out.printf("Sorted Numbers :\n%s \n", Arrays.toString(dArray));  //display sorted numbers
        } else if (numArgs == 5) {
            String num_1 = args[0];
            String num_2 = args[1];
            String num_3 = args[2];
            String num_4 = args[3];
            String num_5 = args[4];
            Double nd1 = Double.parseDouble(num_1);   //convert String to Double
            Double nd2 = Double.parseDouble(num_2);
            Double nd3 = Double.parseDouble(num_3);
            Double nd4 = Double.parseDouble(num_4);
            Double nd5 = Double.parseDouble(num_5);
            System.out.println("For the input number :\n" + nd1 + " " + nd2 + " " + nd3 + " " + nd4 + " " + nd5);
            Double[] dArray = {nd1, nd2, nd3, nd4, nd5}; //difine variable for get Double value
            Arrays.sort(dArray);                    //sort value form aArray
            System.out.printf("Sorted Numbers :\n%s \n", Arrays.toString(dArray));  //display sorted numbers
        } else {
            System.out.println("Please provide at least 1 argument and at most 5 arguments");
        }

    }
}