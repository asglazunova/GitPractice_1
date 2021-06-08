package SaimsTasks.Practice_6_8_2021;

import java.awt.*;

public class Circle extends Shape{

    double radius;
    double diameter = radius * 2;


    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
       // Math.pow(radius,2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
