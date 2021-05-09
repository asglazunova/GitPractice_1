package day36_methods_with_return;

public class Return {
    public static void main(String[] args) {
        System.out.println(add(2.55 , 3.99));
        System.out.println(minus(3.99,2.99));
        System.out.println(divide(16,2.99));
        System.out.println(multiplication(15.99,2.99));
        System.out.println(remainder(3.99,2.99));
    }
    public static double add (double num1 , double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static double minus ( double num1 , double num2 ) {
        double sum = num1 - num2;
        return sum;
    }
    public static double divide (double num1 , double num2) {
        double result = num1 / num2;
        return result;
    }
    public static double remainder ( double num1 , double num2) {
        double result = num1 % num2;
        return result;
    }
    public static double multiplication  ( double num1 , double num2) {
        double result = num1 * num2;
        return result;
    }
}
