package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Anna");
            el1.setAge(23);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); // print error stack trace and continue . does not stop code
        }

        System.out.println("---EXECUTION COMPLETED ---");
    }
}
