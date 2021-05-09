package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 5 rows
            for (int j = 1; j <= 10; j++) { // 10 arrays
                System.out.print("*");
            }
            System.out.println(); // go to the next line
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // 1 rount ->1 star ->2 round ->2star
            }
            System.out.println();  // go to the next line
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("* "); // 1 rount ->1 star ->2 round ->2star
            }
            System.out.println();
        }
    }
}
