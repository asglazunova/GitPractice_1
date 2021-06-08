package SaimsTasks.Practice_6_8_2021;

public class Shape {
    //1. Create a class called Shape
    //- variables: area, perimeter
    //- methods: calculateArea(), calculatePerimeter()
    //
    //2. Create sub classes of Shape: Circle, Rectangle, Square
    //- give the instance variables that are needed to calculate the Area, perimeter, of those shapes
    double area;
    double perimeter;

    public void calculateArea(){

        System.out.println("Shape area");
    }
    public void calculatePerimeter(){

        System.out.println("Shape perimeter");
    }
    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
