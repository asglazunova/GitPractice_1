package SaimsTasks;

import java.util.*;

public class Replit {
    public static void main(String[] args) {
        /**
         * Given an array nums with 7 integers every element is repeated twice -
         * except one. Find that element and print it to console.
         *
         * Example:
         *
         * nums -> [1, 1, 2, 3, 4, 3, 4] -> 2

         Scanner input = new Scanner(System.in);
         System.out.print("type 7 numbers ");
         int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
         input.nextInt(), input.nextInt(), input.nextInt()};

         //TODO: write your code below


         for (int i = 0; i < nums.length; i++) {  // index count
         int count = 0;

         for (int eachNum : nums) {  // array numbers
         if (eachNum == nums[i]){
         count++;
         }
         }
         if (count == 1){
         System.out.println(nums[i]);
         }
         }
         */

       /* Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:

       boolean has55 = false;
        for (int i = 0; i < nums.length -1 ; i++) { // 12345 count length for 1 to 5 , but indexes starting from 0
            if (nums[i] == 5 && nums[i+1] == 5){
                has55 = true;
                break;
            }
        }
        System.out.println(has55);*/


       /* Scanner scan = new Scanner(System.in);
        System.out.println(" enter the size of the array : ");
        int size = scan.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter numbers : ");
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int [] leftShiftedArray = new int [nums.length]; // put our array to new array

        leftShiftedArray [leftShiftedArray.length-1] = nums[0];

        for (int i = 0; i < leftShiftedArray.length -1; i++){
            leftShiftedArray[i] += nums[i+1];
        }
        System.out.println(Arrays.toString(leftShiftedArray));*


        */

/*int [] nums = {14,1,84,97,1243,46};
int total = 0 ;


for (int i = 0 ; i < nums.length ; i++){
    if (nums[i] % 2 != 0 ){
       total+=5;
    }else{
        total+=10;
    }
}
        System.out.println(total);*/


                Scanner input = new Scanner(System.in);
                String[] arr = new String[8];
                for (int i=0;i<8;i++)
                {
                    arr[i] = input.nextLine();
                }

                // DO NOT TOUCH ABOVE
                for(int i=0;i<arr.length-1;i+=2){
                    System.out.println(arr[i]+", "+arr[i+1]);
                }
            }
        }









