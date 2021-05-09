package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 657);
        System.out.println("nums = " + nums);
        //nums.add(100);
        //nums.remove(0); // we cannot do removing or adding
        //nums.clear(); //when we use Arrays,asList it will return immutable list,that size connot do any other operations

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 6, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList " + numsList);

        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);

        /**
         * List string drinkWithCaffeine -> coffee, tea, monster , red bull, coke ,pepsi ,mdew , kambucha, celsium
         * int caffeineAmount =0;
         *  monster, red bull,celsius:
         *      caffeineAmount = 150;
         *          coffee, kambucha :
         *              caffeineAmount = 112;
         *              tea,coke,pepsi,mdew:
         *                  caffeineAmount = 35;
         *
         */

        List<String> drinkWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi",
                "mdew", "kambucha", "celsius"));

        System.out.println("List drinks with caffeine " + drinkWithCaffeine);

        int caffeineAmount = 0;
        for (String eachDrink : drinkWithCaffeine) {
            if (eachDrink.equals("monster") || eachDrink.equals("red bull") || eachDrink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(eachDrink + " --> " + caffeineAmount);
            } else if (eachDrink.equals("coffee") || eachDrink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(eachDrink + " --> " + caffeineAmount);
            } else if (eachDrink.equals("tea") || eachDrink.equals("coke") || eachDrink.equals("pepsi") || eachDrink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(eachDrink + " --> " + caffeineAmount);
            }
        }

        for (String drink : drinkWithCaffeine) {
            switch (drink) {
                case "monster":
                case "red bull":
                case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "coffee":
                case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "tea":
                case "coke":
                case "pepsi":
                case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
            }
        }
        drinkWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));


        drinkWithCaffeine.forEach(each -> {
            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("-------");
        });

    }
}
