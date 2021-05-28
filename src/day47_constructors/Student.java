package day47_constructors;

public class Student {
    public Student() {
        System.out.println("No- args constructor");
    }
    //constructor with 1 param : String name
    public Student (String name){
        System.out.println("name param constructor | name = " + name);
    }

    public Student (int age){
        System.out.println("Age param constructor | age = " + age );
        //constructor only work we call new object
    }
    public Student (String name , int age ) {
        System.out.println("Student name: " + name + ", student age "+age);
        //constructor only work we call new object
    }
}
