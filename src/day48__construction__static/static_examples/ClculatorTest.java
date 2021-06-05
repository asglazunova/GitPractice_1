package day48__construction__static.static_examples;

public class ClculatorTest {
    public static void main(String[] args) {
        // add is static method can be called using Classname.staticMethodName
        Calculator.add(5,6);


      //  Calculator.multiply(3,2); ERROR : multiply is not static . need object to call it
        //miltiply is instance method , and we are creating object then calling it
        Calculator calculator = new Calculator();
        calculator.multiply(5,3);
        //Static method can also be called using an object
        calculator.add(5,2);

    }
}
