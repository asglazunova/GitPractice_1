package day59_polymorphism_exceprions;


import SaimsTasks.Practice_6_8_2021.Circle;
import SaimsTasks.Practice_6_8_2021.Shape;
import SaimsTasks.Practice_6_8_2021.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Square();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if (shape instanceof Circle) {
            System.out.println("It is a Circle object");
        } else if (shape instanceof Square) {
            System.out.println("It is a Square object");
        }


        /**
         * java reflection API : https://docs.oracle.com/javase/tutorial/reflect/index.html
         */

        System.out.println(shape.getClass().getSimpleName()); //just class name of object
        System.out.println(shape.getClass().getName()); // class name of object and package name

        if(shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is a square object ");
        }

        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable "  + el.getClass().getSimpleName());
       // System.out.println(el.getClass().getDeclaredFields());
    }
}
