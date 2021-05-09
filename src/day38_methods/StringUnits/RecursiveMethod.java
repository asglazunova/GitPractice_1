package day38_methods.StringUnits;

public class RecursiveMethod {
    public static void main(String[] args) {
        printNums(1);
    }

    public static void printNums(int num) {
        System.out.print(num + " ");
        if (num <= 100) {
            num++;
            printNums(num);
        }
    }
}
