package day31_arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class ArraysUtil { // don't named Arrays program will think it's
    public static void main(String[] args) {

        int[] nums = {100, 5, 1, 7, 0,-4 ,44,33};
        //print nums in one line
        System.out.println(Arrays.toString(nums)); // IF YOU WANT DELETE brackets you need to add .replace("{","")

        //sort nums
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums , Collections.reverseOrder());

        String[] words = {"Java" , "C++" , "Kotlin" , "Python"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(" ," , words ) +"]");
        // sort words in alphabetic and Ascii order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words , Collections.reverseOrder());

        System.out.println(Arrays.toString(words));





    }
}
