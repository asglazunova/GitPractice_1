package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {


        //0  1  2    3    4    5   6  7  8
        int[] data = {32, 25, 586, 4587, 9526, 1254, 12, 496, 2};
        // array collection
        for (int eachNum : data) {
            System.out.print(eachNum + " ");
        }

        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

// data.length - 9 -1 = 8
        System.out.println("last value: " + data[data.length - 1]);

        System.out.println();
        // print all number backward in same line
        for (int idx = data.length - 1; idx > 0; idx--) {
            System.out.print(data[idx] + " ");
        }
    }
}


