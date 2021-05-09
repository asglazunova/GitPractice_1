package day38_methods.StringUnits;

public class ReturnMethod {
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
