package SaimsTasks;

import java.util.Random;

public class RandomSixDigitNumber {
    public static void main(String[] args) {
        /**
         *CHALLENGE – THIS WILL MAY BE DIFFICILT BUT TRY IT. DON’T SPEND TOO MUCH TIME
         * Generate a random number that is six digits long. Each digit in this number should be unique,
         * meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
         * HINTS: Loops, Strings, Random
         */

        Random randomNum = new Random();
        String randomNumber = "";
                    //0              == 6 - false but if 0!=6 true
        while (randomNumber.length() != 6 ) {
            int numUnique = randomNum.nextInt(10); // to make it unique characters we can generation
               //if the String does not contains  any number that add that number to a String
            if (!randomNumber.contains(numUnique + "")){ // empty "" converting int to String
                randomNumber += numUnique  ;

            }
        }
        System.out.println(randomNumber );




    }
}
