package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {

        //for (int hours = 1; hours <= 12; hours++) {
            //System.out.println(" \n hours = " + hours);

            for (int minutes = 1; minutes <= 60; minutes++) {
                System.out.println("\n minutes = " + minutes);

                for (int seconds = 1; seconds <= 60; seconds++) {
                    System.out.print(seconds + " ");
                }
            }

            for (int minutes = 0 ; minutes <= 2 ; minutes ++ ){
                for (int seconds = 0; seconds <= 59; seconds++) {
                    System.out.println ( minutes + ":" + seconds);
                }
            }
        }
    }

