package day37_methods_overloading;

public class VarArgs {

    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(23,45,56,96,56,1,12,53,63,96,632,552,49,16,15,65,987,81);
        addNumbers();

        //int... myNumber = 10 , 4 ; ERROR , war-args can ONLY be used as a method parameter
    }

    // var args
    public static void addNumbers(int ... nums) {
        // inside the method ,it is used as regular array
        int sum = 0 ;
        for (int n : nums){
            sum += n ;

        }
        System.out.println("sum = "+ sum );

    }
}
