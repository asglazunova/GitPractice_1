package day49_static;

public class MyBankAccount {
    static double balance = 500.0;
    String user;

    public void spend (double amount){
        System.out.println(user + " is spending $ "+ amount);
        balance -= amount;
    }

    public void showBalance(){

        System.out.println("current balance = " + balance );
    }
}
