package SaimsTasks;

public class CountJava2 {
    public static void main(String[] args) {

        String str = " java is fun. java class today, not javascript";
        int count = 0;


        for (int i = 0 ; i < str.length(); i++){
            String eachFoutletter = str.substring (i , i+4);
            System.out.println(eachFoutletter);
        }


    }
}
