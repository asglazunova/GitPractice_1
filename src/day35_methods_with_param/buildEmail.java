package day35_methods_with_param;

import java.util.Locale;

public class buildEmail {
    public static void main(String[] args) {
        buildEmail("anna", "gmail");
        buildEmail("John Ward III", "VERIZON");
    }
    public static void buildEmail (String name , String domain){

        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();

        String email = name + "@"+domain+ ".com";
        System.out.println(email);

    }
}
