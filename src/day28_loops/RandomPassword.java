package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

        Random random = new Random(); // need to import new class
        String password = "";

        for( int n= 1; n <= 8 ; n++){

            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            //System.out.print(random.nextInt(source.length()));
            // add the char to password variBLE using +=
            password += source.charAt(index);
        }

        System.out.println("\n You password = " + password);





    }
}
