package SaimsTasks;

import java.util.*;

class Practice {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                    {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
            int result = 0;

            int number =0;
            int number2 = 0;

            for (int i=0 ; i < matrix.length ; i++){
                number += matrix [i][i];
                number2 += matrix [i][2-i];
            }
            result = number - number2;






            // FINAL PRINT
            System.out.println(Math.abs(result));
        }
    }