package SaimsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerAnaLongerWordFromArray {
    public static void main(String[] args) {
// get dynamic values from the user and store them in array
        Scanner scan = new Scanner (System.in);
        System.out.println("Hom Many words will you enter ");
        String [] words = new String [scan.nextInt()];


        for (int i=0 ; i < words.length ; i++){
            System.out.println ("Enter word : " + (i+1));
            words [i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(words));
        //String smallest, largest;

        String [] smallAndLarge = new String [2]; // null null
        // 0 smallest
        // 1 largest

        for (String eachWord : words){
            if (eachWord.length() < smallAndLarge[0].length()){

            }
        }



    }
}
