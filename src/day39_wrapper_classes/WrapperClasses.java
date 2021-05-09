package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);
        num += 10;
        System.out.println(num);

        Integer n = new Integer (500);
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(n + 300);

        Integer n2  = 1000;
        System.out.println(n2 / 50);
        // convert n2 to String
        String numStr = n2 +""; // add concatenate empty string
        String numSt = n2.toString();

        System.out.println("numSt = " + numSt);
        System.out.println("numStr = " + numStr);



    }
}
