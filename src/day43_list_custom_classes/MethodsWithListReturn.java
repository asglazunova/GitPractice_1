package day43_list_custom_classes;

import java.util.*;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 second = 1_000_000_000 nanosecond
        long start = System.nanoTime(); // start counting time for time for arrayList
        //System.out.println(System.nanoTime());
        List<Integer> mlnNums = getIntegerList(); // returns ready ArrayList object . no need new Array
        long end = System.nanoTime(); // end counting time
        double listSeconds = (end - start) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + (end - start));
        System.out.println("ArrayList seconds = " + listSeconds);


        long st = System.nanoTime();
        //System.out.println(mlnNums);
        int[] arr= getIntegerArray();
        long ed = System.nanoTime();
        double seconds = (ed-st) / 1_000_000_000.0;
        System.out.println("Array time = " + (ed - st));
        System.out.println("Array time seconds = " + seconds);

    }
    /**
     * getIntegerList
     *No params
     * return List<Integer>
     *     Loop from 0 - 1 000_000
     *     and add to arrayList then return it
     */
    /** getIntegerList ... */
    public static List<Integer> getIntegerList () {  // from line 18-23 -> method ,
        List<Integer> nums = new ArrayList<>(); // new ArraList<>() -> new object created
        for (int i = 0; i <= 1_000_000; i++) { // loop counts numbers from 0- 100000
            nums.add(i); // nums added in to list to line number 19
        }
        return nums;
    }

        /**
         *  getIntegerArray
         *      *No params
         *      * return int[]
         *      *     Loop from 0 - 1 000_000
         *      *     and add to int[] then return it
         */

        public static int[] getIntegerArray(){
            //declare empty array with 1_000_001
            int [] nums = new int [1_000_001];
            // loop and assign numbers
            for (int i=0; i<= 1_000_000 ; i++) {
                nums[i] = i ;
            }
            return nums; //return
        }
    /**
     *
     */
}



