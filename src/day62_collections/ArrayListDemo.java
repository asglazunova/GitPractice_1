package day62_collections;
import java.util.*; // start with that import in the interview
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); // because List interface // polymorphism
        Collection<String> school = new ArrayList<>();

        cities.add("McLean");
        cities.add("Vienna");
        cities.add("New York");
        System.out.println(cities);
        System.out.println("First city is " + cities.get(0));
        System.out.println("Count of cities = " + cities.size());



    }
}
