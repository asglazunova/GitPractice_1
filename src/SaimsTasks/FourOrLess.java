package SaimsTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        // remove in ArrayList
        // remove(0)

        //  2 3

        ArrayList<String> list= new ArrayList<>(Arrays.asList("apples","java", "tree", "cat", "animal", "shortcut"));

        ArrayList<String> list2 = new ArrayList<>();

        for (String each : list ) {
            if (each.length() <=4){
                list2.add(each);

            }
        }

        System.out.println(list2);

    }
}
