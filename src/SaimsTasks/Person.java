package SaimsTasks;

import java.time.LocalDate;

public class Person { // zadaem parametri cheloveka class
    private String firstNAme;
    private String lastName;
    private LocalDate dateOfBirth;
    private char gender;

    public void SetInfo(String firstNAme,String lastName, LocalDate dateOfBirth,char gender) {
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;

    }

    public String getFirstNAme() {
        return firstNAme;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public static void main(String[] args) {
        Person p1= new Person();;

    }

}
