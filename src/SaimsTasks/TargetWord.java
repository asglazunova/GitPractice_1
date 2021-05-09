package SaimsTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java","html","javascript","java","word"));

        String targetWord = "java";

        int count = 0;

        for (String eachWord: words){
            if (eachWord.equals(targetWord)) {
                count++;
            }
        }
        System.out.println(targetWord + " was found " + count + " times ");
        //get(i) -> traditional loop ("for")
    }
}
