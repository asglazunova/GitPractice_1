package day60_exceptions;

public class ThrowingExeption {
    public static void main(String[] args) {
        System.out.println("lets create exceptions");
       // RuntimeException e = new RuntimeException();
       // throw e;

       // throw new RuntimeException();

        String usrName= "";
        if(usrName.isEmpty()){
            throw new RuntimeException("User cannot be empty ");
        }

    }
}
