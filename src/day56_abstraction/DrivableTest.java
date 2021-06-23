package day56_abstraction;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.start();
        model3.cost(25);
        model3.hi();
        model3.autoPiloting();
        model3.transportPeople();
        model3.bye();

        Plane plane = new Plane ();
        plane.autoPiloting();
        plane.hi();
        plane.land();
        plane.cost(250);
        plane.transportPeople();
        plane.autoPiloting();
        plane.stop();
        plane.bye();


        //Polymorphism
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();
    }
}
