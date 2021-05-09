package SaimsTasks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringNumbersToSum {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "20", "15"));

        for (int i =0; i <list.size(); i++) {
int totalSum = 0;

            for (char digit : list.get(i).toCharArray()) { //[1,2,3]
                totalSum += Integer.parseInt(""+ digit);
            }
            list.set(i, "" + totalSum);

        }
        System.out.println(list);
    }
}

