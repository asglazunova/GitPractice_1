package day43_list_custom_classes;

import java.util.*;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size()= " + getDays().size()); //7
        System.out.println("getDays().size()= " + getDays().get(0)); //Monday
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
        //lambda
        // removeIf method - java8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf (day ->  day.length() == 6); // works like if condition
        System.out.println("dayNames after removeIf = " + dayNames);

        //System.out.println(getRandomList(10));
//        System.out.println("numsRandom.size() = " + numsRandom.size());
        //System.out.println("numsRandom = " + numsRandom);
       // numsRandom.removeIf(n -> n < 90); //remove nums less than 90
        //System.out.println("numsRandom = " + numsRandom);
    }


    public static List<String> getDays() {
        // shorter way to add in ArrayList
        //List<String> days = new ArrayList<>(Arrays.asList("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday"));
       List<String> days = new ArrayList<>();
       days.add("Monday") ; days.add ("Tuesday") ; days.add ("Wednesday"); days.add("Thursday"); days.add("Friday"); days.add ("Saturday");
       days.add ("Sunday");
       return days;

        /**
         * getRandomList
         * param : int size
         * return List<Integer>
         *     generate random numbers (0-100) the count of size , and assign to List then return
         *     getRandomList(3) -> 43, 12, 54
         *     getRandomList(2) -> 1, 4
         */
        /*public static List<Integer> getRandomList(int size){
            Random random = new Random(); // new Random object  with 0-100 limit
            List<Integer> numsRandom = new ArrayList<>();

            for (int i = 1; i <= size; i++) {
                int n = random.nextInt(101);
                if(!numsRandom.contains(n)) {
                    numsRandom.add(n);
                }
                //numsRandom.add(random.nextInt(101)); // generate random 0-100 limit number and add to list
            }
            return numsRandom;
*/
        }
    }

