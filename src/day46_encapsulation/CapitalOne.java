package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount capitalOne = new CheckingAccount();

        capitalOne.setBalance(1000.00);
        System.out.println("Balance " + capitalOne.getBalance());

        capitalOne.setAccountNumber(123456789L);
        System.out.println("Account number " + capitalOne.getAccountNumber());

        capitalOne.setType("saving");
        System.out.println("type of account " + capitalOne.getType());

        capitalOne.setAccountHolder("Bob Marley");
        System.out.println("account  holder name " + capitalOne.getAccountHolder());

        System.out.println(capitalOne);


    }
}
