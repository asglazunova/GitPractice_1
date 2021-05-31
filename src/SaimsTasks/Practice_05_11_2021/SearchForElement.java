package SaimsTasks.Practice_05_11_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {

    public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>(Arrays.asList ("one","two","three","two"));

        System.out.println(findIndex(list,"one" ));

    }
    /**
     *
     * @param words - List of elements given
     * @param element - The element that we are looking for
     * @return - The method returns the index where the element is found in the given ArrayList
     *              and if the element does not exist the method returns -1
     */

    public static int findIndex (ArrayList<String> words, String element) {

        int index = -1;

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(element)) {
                index = i; // return i;
                break;
            }
        }
        return index;
    }
    /**
     * Overloading findIndex method to have a starting point
     * @param words - List of elements given
     * @param element - The element that we are looking for
     * @param startIndex - the index number where the search starts from
     * @return - The method returns the index where the element is found in the given ArrayList
     *              and if the element does not exist the method returns -1
     * @return
     */


    }
