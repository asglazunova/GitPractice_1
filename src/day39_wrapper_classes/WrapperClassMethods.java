package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT : " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("Min Double: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,45));

        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("it is uppercase");
        }
        String word = "Java Is FuN";
        for(int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);




    }
}
