package SaimsTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));

        char targetLetter = 'i';

        int count = 0;

       /* for (String eachWord: words){

            for(int i = 0 ; i < eachWord.length(); i++){
                if (eachWord.charAt(i)== targetLetter){
                    count++;
                }
            }

        }*/

        for (String word : words) {
            count += letterInWord(word, targetLetter);
        }
        System.out.println(targetLetter + " was found " + count + " times ");
    }


    public static int letterInWord(String word, char target) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
