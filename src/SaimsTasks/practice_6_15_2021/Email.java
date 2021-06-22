package SaimsTasks.practice_6_15_2021;

public class Email {

    final String ADDRESS; // instance variable
    int numberOfEmail;
    static String domain;

    static{
        domain = "generic";
    }

   //object
    public Email(String address, int numberOfEmail){
        this.ADDRESS = address;
        this.numberOfEmail = numberOfEmail;

    }

    @Override
    public String toString() {
        return "Email{" +
                "ADDRESS='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain=" + domain +
                '}';
    }
}
