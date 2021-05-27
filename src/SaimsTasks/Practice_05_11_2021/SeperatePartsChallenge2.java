package SaimsTasks.Practice_05_11_2021;

import java.util.ArrayList;
import java.util.Scanner;

public class SeperatePartsChallenge2 {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> all = new ArrayList<>();

        for(int i=0; i < str.length(); i++){
            all.add(str.charAt(i));
        }

        ArrayList<Character> letter = new ArrayList<>(all);
        ArrayList<Character> digits = new ArrayList<>(all);
        ArrayList<Character> special = new ArrayList<>(all);

        letter.removeIf(eachChar -> !Character.isLetter(eachChar));
        digits.removeIf(eachChar -> !Character.isDigit(eachChar));
        special.removeIf(eachChar -> Character.isDigit(eachChar) || Character.isLetter(eachChar));

        System.out.println("digits = " + digits);
        System.out.println("letter = " + letter);
        System.out.println("special = " + special);
    }
}
