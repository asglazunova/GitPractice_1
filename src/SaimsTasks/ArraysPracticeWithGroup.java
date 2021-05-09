package SaimsTasks;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class ArraysPracticeWithGroup {
    public static void main(String[] args) {
        char [] letters = {'j', 'a', 'b','c', 'p', 'r'};
        // print in same line
        // first way - using for loop :
        for (char each : letters){
            System.out.print(each + " , ");
        }
        System.out.println();
        System.out.print(letters);

        System.out.println();
        String sentence = new String(letters); // print as a string
        System.out.print(sentence);

        System.out.println(Arrays.toString(letters)); // it will print as Array []

        // ------------------------------ //
        // length of String Vs length Array:
        // length = int
        String item = "wooden spoon ";
        System.out.println(item);
        // toCharArray();
        System.out.println("length of String = " + item.length());
        char [] itemArray = item.toCharArray();
        System.out.println((itemArray)); // ==> as String
        System.out.println(Arrays.toString(itemArray)); //as Array
        System.out.println("size of array = "+itemArray.length);




    }
}
