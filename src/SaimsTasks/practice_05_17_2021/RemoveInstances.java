package SaimsTasks.practice_05_17_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstances {
    public static void main(String[] args) {
        ArrayList<Integer>source = new ArrayList<>();
        source.addAll(Arrays.asList(1,2,3,4,5,6));
        removeInst(source, 1);

    }
        private static ArrayList<Integer> removeInst(ArrayList<Integer> list, Integer number) {
             list.removeIf(e -> e.equals(number));
             return list;

        }
    }

