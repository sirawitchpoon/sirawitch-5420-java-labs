/**
 * This VowelsCounter program, 
 * it help you to count the amount vowel letters in any word.
 * if you input two words or have a space bar in the word you must use double quotes.
 * the output is the amount vowel letters in any word you put in.
 * 
 * Author : Sirawitch Butryojantho
 * ID : 643040542-0
 * Sec : 2
 * Date : December 27, 2021
 * */

package butryojantho.sirawitch.lab2;

public class VowelsCounter {
    public static void main(String[] args) {

        int words = args.length;
        if (words == 0) {
            System.out.println("VowelsCounter <String Input>");
        } else {
            int count = 0;              // difind variable for count vovel start 0
            String word = args[0];      // difind variable for get anything you input in argument 0
            String wordLower = word.toLowerCase();      //convert all String to lower
            for (int i = 0; i < word.length(); i++) {   // function loop for check each word
                char vowels = wordLower.charAt(i);           // difind variable and use charAt use to check position of string
                if (vowels == 'a' ||  vowels == 'e' ||  vowels == 'i' ||  vowels == 'o' ||  vowels == 'u') {
                    count++;    // if word you input have vowel, it will count and get value in variable count
                }
            }
            System.out.println("Total number of vowels is " + count);   //display and output numbers of vowels
        }

    }
}