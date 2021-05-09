package day30_arrays;

public class StudentArrays {
    public static void main(String[] args) {

        String [] student1 = new String [5];
        String [] student2 = {"12345ag", "Anna", "Glazunova", "batch22", "410-9797985"};

        student1[0] = "AG123";
        student1[1] = "Zlata";
        student1[2] = "Glazunov";
        student1[3] = "B22";
        student1[4] = "202-22-2222";


        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num  = " + student1[4]+ "\n");

        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 firstname = " + student2[1]);
        System.out.println("student2 lastname = " + student2[2]);
        System.out.println("student2 batch num = " + student2[3]);
        System.out.println("student2 mobile num  = " + student2[4]);

        System.out.println("student data length: "+ student1.length);


        if (student1.length ==5 ){
            System.out.println("Pass :data array  has correct length");
        } else {
            System.out.println("Fail: data arrays incorrect length ");
        }


        if (student1.length == student2.length){
            System.out.println("Pass:data arrays length match" );
        } else {
            System.out.println("Failed:data arrays length mismatch");
        }

        System.out.println((student1[1] + " " + student1[2]).toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum);


    }
}
