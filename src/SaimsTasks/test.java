package SaimsTasks;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int [] array1 = {1, 2, 3, 4};
        int [] array2 = {10, 20, 30};


        int [] newArr = new int [array1.length + array2.length];
        int i = 0;
        for (int each : array1){
            newArr [i] = each;
            i++;
        }

        for (int each : array2){
            newArr [i] = each;
            i++;
        }

        System.out.println(Arrays.toString(newArr));

    }
  }
