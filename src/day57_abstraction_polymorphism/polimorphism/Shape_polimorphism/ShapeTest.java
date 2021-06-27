package day57_abstraction_polymorphism.polimorphism.Shape_polimorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();

        List<Shape> shapes= new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Circle());

        //System.out.println(shapes); prints Hashcodes of objects
        for ( Shape eachShape  : shapes){
           eachShape.draw();
        }

    }
}
