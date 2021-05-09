package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println("full name = " + fullName());
        System.out.println("is Married = " + isMarried());
        System.out.println("age = " + getAge());
        System.out.println("Birth year = " + getRandomYear()); // dynamic different year each time

        String name = fullName();
        boolean isMarried = isMarried();
        int age = getAge();
        int year = getRandomYear();

    }
    public static String fullName(){
        System.out.println("inside fullName method");
        return "Mike Smith";
    }
    public static boolean isMarried() {
        return true;
    }
    public static int getAge() {
        return 24;
    }
    public static int getRandomYear() {
        Random random = new Random ();
        int randomYear = random.nextInt (2021);
        return randomYear;
    }
}
