package SaimsTasks.practice_05_05_21;

import java.util.ArrayList;
import java.util.*;

public class LookAtArrayList {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>(Arrays.asList("one","two","three"));

        for(String each: list){
            System.out.println(each);
            if(each.length() == 3){
                list.remove(each);
            }
        }
    }
    public static ArrayList<Integer> method(){
        return new ArrayList<>();


    }
    public static int method2 (ArrayList<String> words){
        return 0;
    }
}
