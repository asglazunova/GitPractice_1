package day35_methods_with_param;

import java.sql.SQLOutput;

public class Counters {
    public static void main(String[] args) {
        counterMethod(5);
        counterMethod(7);
        counterMethod(2);
        int num = 999;
        counterMethod (num);
        printAge(1988);
printAge(2017);
int birthYear = 2001;
printAge(birthYear);

        String word = "wooden spoon";
        counterMethod(word.length());
    }
    public static void counterMethod(int num) {
        for (int i = 0; i <= num ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
        public static void printAge (int year){
        int age = 2021 - year;// calculate age
            System.out.println("Birth year "  + year+". "+"Age: "+ age);

        }
    }

