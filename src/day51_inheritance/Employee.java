package day51_inheritance;
//Employee
//String jobTitle
//-> calculateSalary(double hourlyRate)
//    returns annual salary plus 10% bonus
//
//-> Contractor
//    -> calculateSalary(double hourlyRate)
//    return annual working hours * hourlyRate
public class Employee extends  Object{
    String jobTitle;


    public double calculateSalary(double hourlyRate){
        return 52 * 40 * hourlyRate + 1.1;
    }
//toString method is inherited from Object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
