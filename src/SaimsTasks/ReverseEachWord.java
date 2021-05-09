package SaimsTasks;

import day38_methods.StringUnits.ReturnMethod;

public class ReverseEachWord {

    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }
    public static String reverseEachWord (String str){
        String reverse = "";

        for(String each: str.split(" ")){
            //String eachReverse = "";
//We don't need to eachReverse -> we have method from 38 day
            // Here we would reverse each String with a for loop
            // going from the last index to the first index

            reverse += ReturnMethod.reverse(each) + " ";
        }

        return reverse.trim();
    }
}
