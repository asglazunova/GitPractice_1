package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle ="Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor SDETContractor = new Contractor();
        SDETContractor.jobTitle = "SDET Contractor";
        System.out.println("SDETContractor.calculateSalary(55.0) = " + SDETContractor.calculateSalary(65.0));


        System.out.println(developer.toString());
        System.out.println(SDETContractor.toString());
    }
}
