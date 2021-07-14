package day62_collections;
import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();

        states.add("MD");
        states.add("VA");
        states.add("PA");
        states.add("NY");
        states.add("CO");
        states.add("MD");
        states.add("TX");

        System.out.println(states);
        // Vector is synchronized


    }
}
