package day39_wrapper_classes;

public class AutoboxingUnBoxing {
    public static void main(String[] args) {
        /*
         auto-boxing : primitive > wrapper class
         what is the purpose of wrapper classes :
         ability to convert  fromm primitive into object (wrapper class)
         collections use objects and cannot use primitives , so we can use
         primitives , so we can use wrapper cases with them
        */
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

/*
ArrayList cannot hold a primitive ,
 it needs an object so we can use wrapper class object.
 */
        // Un-boxing : object > primitive
        Double d1 = new Double (100.5);
        double d2 = d1;
        double d3 = new Double(345.3);

    }
}
