package day47_constructors;

public class AddressAssigning {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("524 Gwynnwest Rd");
        cybertekAddress.setCity("Baltimore");
        cybertekAddress.setState("MD");
        cybertekAddress.setZipCode("21136");
//topic for read JAVA reflection API--> never used for us
        System.out.println("CybertekSchool address: "+ cybertekAddress.toString());
        cybertekAddress.setStreet("235 Phillip St");
        System.out.println("Address after update: " + cybertekAddress);
        System.out.println("street info: " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("524 Gwynnwest Rd ");
        newAddress.setCity("McLean");
        newAddress.setZipCode("21220");
        newAddress.setState("MD");
        System.out.println(newAddress.toString());


        Address papaJon = new Address("38 Main St", "Reisterstown", "MD", "21136");
        System.out.println("Papa JOhn pizza = " + papaJon.toString());

    }

}
