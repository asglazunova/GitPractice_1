package day40_arrayList;

import java.util.*;

public class ArrayListethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty,keep coding java");
        } else {
            System.out.println("List is not empty , code java then goo mall ");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        System.out.println("shoppingList = " + shoppingList);
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty,keep coding java");
        } else {
            System.out.println("List is not empty , code java then goo mall ");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));

        if (shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        } else{
            System.out.println("Shoes is not in the list");
        }

        System.out.println("Buying shoes ....$80 ");

        shoppingList.remove("shoes"); //remove returns boolean if it's not in the list its showing just false

        System.out.println("list = " + shoppingList);

        System.out.println("Done shopping , get back coding");
        shoppingList.clear(); // clear the list , remove  all items
        System.out.println(shoppingList);

    }
}
