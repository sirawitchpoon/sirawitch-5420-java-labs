/**
 * This program is to compute and display the factorial numbers
 * @author Sirawitch Butryojantho
 * @version 1.0. 25/1/2022
 * 
 */
public class ComputeFactorialNum {
   
    static int smallNum;
    static int largeNum;

    public static void main(String[] args) {

        readInputNums(args);
        computeFactUsingNestedLoops();
        computeFactUsingRecursive();
    }

    /**
     * This method users have to input 2 numbers
     * those 2 numbers will be compared which one has more value
     * These two numbers are compared to find out which one is more valuable.
     * 
     * @param args user have to input 2 number
     * numArgs is the length of the args user input
     * n1 is first number
     * n2 is second number
     * largeNum is the bigger number
     * smallNum is the smaller number
     * 
     */
    public static void readInputNums(String[] args) {
        int numArgs = args.length;
        if (numArgs != 2) {
            System.out.println("Usage: ComputeFactorialNum <n1> <n2>");
            System.exit(0);
        } else {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            if (n1 > n2) {
                smallNum = n2;
                largeNum = n1;
            } else {
                smallNum = n1;
                largeNum = n2;
            }
        }
    }

    /**
     * This method using loop "for" to calculate the factorial
     * 
     * i will be using in loop "for" to repeat for the factorial progress
     * j will be using in loop "for" to repeat and find the value
     * result will be the factorial
     */
    public static void computeFactUsingNestedLoops() {
        System.out.println("=== Computiong factorial numbers using nested loops ===");
        for (int i = smallNum; i <= largeNum; i++) {
            int result = 1;
            for (int j = i; j > 0; j--) {
                result *= j;
            }
            System.out.println("Factorial (" + i + ") is " + result);
        }
    }

    /**
     * This method has a recursive call to the computeFace function.
     * 
     * i will be using in loop "for" for the factorial progress
     */
    public static void computeFactUsingRecursive() {
        System.out.println("=== Computiong factorial numbers using the recursive method ===");
        for (int i = smallNum; i <= largeNum; i++) {
            System.out.printf("Factorial (" + i + ") is " + computeFact(i) + "\n", i);
        }
    }
    
    /**
     * This method is decrease the number till it reach 1 then the program will be stop
     * 
     * @param n is the integer you want to find the factorial of it
     * @return new integer to back to computeFaceUsingRecursive() again 
     */
    public static long computeFact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * computeFact(n-1);
        }
    }
    
}

