package day48__construction__static;


public class Bus {
    Driver driver;
    Engine engine;

    public String toString(){
        return driver.getName() + " | " + engine.getCylinders();
    }
}



