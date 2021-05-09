package SaimsTasks;

public class PrimeInRange {
    public static void main(String[] args) {
        int number = 5;
        boolean isPrime = true;

        for (int i = 2 ; i < number ; i++){

            if(number % i == 0) {
                isPrime = false;
                break;
            }


        }
        System.out.println(number + " " + isPrime);
    }
}
