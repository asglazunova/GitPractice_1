package SaimsTasks.practice_6_15_2021;

public class EmailObject {
    public static void main(String[] args) {
        Email email = new Email ("Anna@cybertekschool.com",43);
        //email.ADDRESS = "email"; --> ADDRESS is final , so cannot be changed
        System.out.println(email);

        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();

        Gmail gmail = new Gmail ("Kamron@gmail.com", 25);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("Galina@yahoo.com", 144);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Email email2 = new Email("random@email.com", 4);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);



    }


}
