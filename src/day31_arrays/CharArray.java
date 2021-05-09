package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        /**
         * char array with following values:
         * 'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'
         */
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for ( char charArrays : letters ){
            System.out.print(charArrays+" ");
        }

        String sentence = new String(letters); // convert char array into String
        System.out.println( "\nSentence = " + sentence);

        String item = "wooden spoon" ;
        char[] itemArray = item.toCharArray();
        System.out.println ("itemArray.length = "+itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "kiwi","mango","apples","strawberry"};

        //bananas", "kiwi","mango","apples","strawberry
        String fruitsStr = "";

        for (String each : fruits){
            System.out.print(each + "-");
            fruitsStr += each +"-";

        }

    System.out.println("\n fruitStr = " + fruitsStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join ("<>", languages);
        System.out.println("joinedLanguages = "+ joinedLanguages);

    }
}
