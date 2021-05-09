package day29_nestedloop_arrays;
import java.util.*;
public class ArraysIntro {
    public static void main(String[] args) {
        int[] nums = new int [3]; // array variable
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println("Yay stuff added");
        System.out.println( "value at index 0 = " + nums[0]);
        System.out.println( "value at index 0 = " + nums[1]);
        System.out.println( "value at index 0 = " + nums[2]);
        //System.out.println( "value at index 0 = " + nums[3]);
        // we can use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); // 10

        //how to find out the size of the array
        System.out.println("number of elements = " + nums.length);

        // store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in the array ;
        nums[0] = 100;
        nums[1] = 300;
        // read the value of index 1 and assign same to index 2
        nums [2] = nums[1];

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);







    }
}
