package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(2.55 , 3.99));
        double sum = add(3,1);
        System.out.println("sum = " + sum);
        System.out.println("100.0 + 200.0 = " + add(100,200));
        System.out.println(minus(3.99,2.99));
        System.out.println(divide(16,4));
        System.out.println(multiplication(2,10));
        System.out.println(remainder(15,2));
    }
    public static double add (double num1 , double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static double minus ( double num1 , double num2 ) {
        double subtraction = num1 - num2;
        return subtraction;
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
