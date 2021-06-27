package TogetherWork;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;
        boolean prime = false;
        for (int i = 2; i <= num; i++) {
            if (i == num){
                prime = true;
            }
            if (num % i == 0) {
                break;
            }
        }
        System.out.println(prime);
    }
}
