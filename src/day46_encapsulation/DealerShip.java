package day46_encapsulation;

public class DealerShip {
    public static void main(String[] args) {
 Car car1 = new Car();
 //ERROR below, model and year are PRIVATE and cannot be access
 //car1.model = "Honda";
// car1.year = "2021";
        car1.setModel("Honda");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(22_000);
        System.out.println("car1 mileage = " + car1.getMileage());
        System.out.println("car1 to string = " + car1.toString());
        System.out.println(car1); // automatically calls toString

        Car car2 = new Car();
        car2.setModel("BMW");
        car2.setYear(2020);
        car2.setMileage(5_000);

        /* System.out.println("car2.getModel = " + car2.getModel());
        System.out.println("car2.getYear = " + car2.getYear());
        System.out.println("car2.getMileage = " + car2.getMileage());

        INSTEAD OF TYPING ALL ABOVE --> USE toString() method (see below)*/

        System.out.println(car2.toString());
        System.out.println(car2);

    }
}
