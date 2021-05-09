package SaimsTasks;

public class MaxAndMin {
    public static void main(String[] args) {

                     //     0    1   2    3   4
        int [] numbers = { 23, 256 , 99 , 45, 2};

        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers ){
            if (each > max){
                max = each;
            } if  (each < min){
                min = each;
            }

        }
        System.out.println( "Maximum number = " + max );
        System.out.println( "Minimum number = " + min);
    }
}
