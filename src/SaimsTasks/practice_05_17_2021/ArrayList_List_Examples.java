package SaimsTasks.practice_05_17_2021;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_List_Examples {
    public static void main(String[] args) {

        // List<String> test = Arrays.asList("1","2","3","4"); --> immutable

        List<String> test = new ArrayList<>();

        test.add("5");
        test.add("6");
        test.add(0,"7");

        for(String s: test){
            System.out.println(s);
        }
    }
}


