package SaimsTasks.practice_05_17_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 5, 7, 4, 3));
        System.out.println(removeDup(list));
        System.out.println(removeDup2(list));
    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> list) {

        ArrayList<Integer> uniques = new ArrayList<>();
        String checked = "";

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            if (!checked.contains("" + list.get(i))) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }

                if (count == 1) {
                    uniques.add(list.get(i));
                }
                checked +=list.get(i) + " ";
            }
            }
            return uniques;

        }
        public static ArrayList<Integer> removeDup2(ArrayList<Integer> list){
        list.removeIf( e -> Collections.frequency(list,e) > 1); // lambda method and second method collections and this method frequency remove duplicate numbers
        return list;

        //for (int each : list)
        }
    }
