package day56_abstraction;

public class Plane extends  Transportation implements  SelfDrivable , Greeting{

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Ato - pilot mode ");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another ");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 25.0) + " to fly " + mile + " miles " );
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for choosing us");
    }

    public void land() {
        System.out.println("landing in Florida ");
    }
}
