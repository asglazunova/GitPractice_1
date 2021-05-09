package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
    MethodOverLoading.sum(10,5);
    sum ( 15.5,23.99);
    sum ("Hello", "Anna");
    sum(90,15,6);
    sum (10,5.4);
    sum ( (int)4.2 , 1 , 2);

    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int , int ");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void sum(int num1, int num2 , int num3) {
        System.out.println("sum(int , int, int");
        System.out.println("Result = " + (num1 + num2 + num3));

}

    public static void sum(double num1, double num2) {
        System.out.println("sum(double, double");
        System.out.println("Result = " + (num1 + num2));

    }
    public static void sum(String str1, String str2) {
        System.out.println("sum(String, String");
        System.out.println("Result = " + (str1 + str2 ));

    }
}


