package SaimsTasks.practice_05_17_2021;

import java.util.Arrays;
import java.util.Locale;

public class Panagramm {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog.";
        //char [] a = s.replace (" " , "").toLowerCase(Locale.ROOT).toCharArray();
        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        System.out.println(isPanagram(s));
    }

    public static boolean isPanagram(String str) {

        str = str.toLowerCase();

        String alp = "abcdefghijklmnoprstuvwxyz";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                alp = alp.replace("" + str.charAt(i), "");
                System.out.println(str.charAt(i) + " " + alp);
            }
            if(alp.isEmpty()){
                break;
            }
        }
        //for(int i = 'a' ; i< 'z'; i++){
        //  System.out.println((char)i);


        return alp.isEmpty();
    }
}

