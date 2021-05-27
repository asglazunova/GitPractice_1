package day45_oop;

import javax.naming.NameAlreadyBoundException;

public class Coffee {
    double amount ;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    // can be 0 to 100 %
    public void refill() {

        amount = 100 ;
    }
    public void drinkSomeAmount ( int someAmount) {

        amount -= someAmount;
    }
    public double getAmount() {

        return amount;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType(){
        return type;
    }

}
