package day50_inheritance;

/**
 * Super class
 * Parent class
 * Based class
 */
public class Person {
    String name;
    int age;


    public void walk() {
        System.out.println("person is walking");
    }
    public void talk(){
        System.out.println("Person is talking");
    }
    public void work (String job){
        System.out.println("Person is working as " + job );
    }

}
