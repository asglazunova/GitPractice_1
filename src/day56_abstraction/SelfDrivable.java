package day56_abstraction;

public interface SelfDrivable {

void autoPiloting ();
// void selfPark(); this cause error in sub classes , because they must override abstract method

public  default void selfPark() { // if add default method it will prevent error
    System.out.println("performing self park steps");
}

}
