package day40_arrayList;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); // Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());
        
        nums.add(34); nums.add(25); nums.add(3) ; nums.add(88);
        nums.add(354); nums.add(525); nums.add(13) ; nums.add(988);
        nums.add(354); nums.add(525); nums.add(13) ; nums.add(988);

        System.out.println("nums = " + nums);
        
        nums.remove(0);
        System.out.println("nums = " + nums);

        //nums.remove(88); // index 88 -> IndexOutOfBoundsException

        nums.remove(new Integer(88));
        System.out.println("nums= " + nums);

        nums.remove(new Integer(5));
        System.out.println("nums = " +nums);

        //for loop - iterate through all values and print
        for(int i = 0 ; i < nums.size(); i++){ // nums.size() -> to show arraysList
            System.out.println(nums.get(i));
        }

        // for each loop , and print all in same line
        for(int each :nums){
            System.out.print(each + " ");
        }
        

    }

}
