package day55_abstraction_interface.exercise;

public abstract class exercise {
    public void start() { // non-abstract method
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * purpose : letting sub classes implement / override their own way
     */

    public abstract void perform(); // abstract method - method without body , just signature

    /**
     * another abstract method -method without bofy/impl , just signature ...
     * @param minutes -how long is exercise is performed
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);

}
