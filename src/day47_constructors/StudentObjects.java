package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Anna");
        Student st4 = new Student ("Zlata");

        Student st5 = new Student (32);
        Student st6 = new Student ("Zlata",4);

    }
}
