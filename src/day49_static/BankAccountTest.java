package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "husband";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "wife";
        wife.showBalance();
        wife.spend(400);
        wife.showBalance();

        husband.showBalance();
        System.out.println(MyBankAccount.balance);
    }
}
