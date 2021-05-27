package SaimsTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Rectangle {
    public double width;
   public double height;
   public  double area;

    public void setDimensions(double w, double h ) {
        width = w;
        height = h;
        //area = w * h;
    }

    public double getArea() {
        area = width * height;
        return area ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
// instance == object
    public static void main(String[] args) {
        ArrayList<Rectangle> rlist = new ArrayList<>();
        Rectangle r1 = new Rectangle();
        r1.setDimensions(10.0 , 5.0);
        double area = r1.getArea();
        System.out.println(area);
        System.out.println(r1.toString());




    }

}
