package SaimsTasks;

import java.util.*;

public class ReverseYourName {
    public static void main(String[] args) {

        String name = "Anna Glazunova";
        System.out.println("before reverse = " + name);
        String reversName = "";

        for (int i = name.length() ; i >0 ; i--){
                reversName += name.charAt(i-1);

        }
        System.out.println();
        System.out.println("name after reverse = " + reversName  );


 //         replace 'a' to 'b'  *
        String name2 = "Azamat Marifat";

        //String firstName = (name2.substring(0,7));

        //String change = (name2.substring(7,9).replace('a','b'));

        //String lastPartLastName = (name2.substring(9));

        //System.out.println(firstName + change + lastPartLastName);

        //char [] nameArray = name2.toCharArray(); // this line makes out String to array for each char

        String[] nameArray = name2.split(" ");

        nameArray[1] = nameArray[1].replaceFirst("a","b");

        for( String each : nameArray){
            System.out.print(each + " ");
        }







    }
}
