package TogetherWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DOGGOD {
    /*
     Print all permutations of String: Write a Java program to print all permutations of a given String.
     For example, if given String is "GOD" then your program should print all 6 permutations of this string, e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."
     */
   public static void main(String[] args) {
       String word = "masha";
       String[] wordArr = word.split("");
       for (int i = 0; i < wordArr.length; i++) { //d
           String letter = wordArr[i];
           String letter2 = wordArr[i];
           for (int j = 0, k = wordArr.length - 1; j < wordArr.length; j++, k--) {
               if (wordArr[i] != wordArr[j]) {
                   letter += wordArr[j];

               }
               if (wordArr[i] != wordArr[k]) {

                   letter2 += wordArr[k];
               }
           }

           System.out.println(letter);
           System.out.println(letter2);
       }
   }



        }


