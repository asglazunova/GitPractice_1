package day59_polymorphism_exceprions.exception_handling;

/**
 * RUNTIMEEXEPTION happens in below code, code complies fine and during execution it fails and throws
 *   ArithmeticException
 */
public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0); //ArithmeticException: cannot / by zero
        System.out.println(10/3);
    }
}
