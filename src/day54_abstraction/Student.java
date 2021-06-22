package day54_abstraction;

/**
 * We add abstract keyword to a class to make it an abstract class
 * We cannot create of Student class - meaning:
 * Student student = new Student(); will show ERROR
 * what can we do with this Student class ?  We can extend this class by su class
 */
public abstract class  Student {

       public void code (String language) {
        System.out.println("Student is coding using " + language);
    }

    /**
     *we can add abstract method into abstract class
     * abstract method ->
     */
    public abstract void attendClass();
}
