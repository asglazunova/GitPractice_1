package day56_abstraction;

public class Tesla extends Transportation implements SelfDrivable , Greeting{
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.10)+ " to drive "+ mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving on autonomous mode ");
    }

    @Override
    public void hi() {
        System.out.println("Welcome on board ");
    }

    @Override
    public void bye() {
        System.out.println("Bye I need a rest lazy man ");
    }
}
