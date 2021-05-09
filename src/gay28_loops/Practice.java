package gay28_loops;

import java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long result = 1L;

        for ( int num= n; num >= 1 ; num-- ){
            result = result * n ;
        }

        System.out.println (result);


    }
}