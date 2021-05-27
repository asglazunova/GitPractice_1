package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("CybertekStudent", "abc123"); // POSITIVE TEST/ SUNNY DAY
        loginVoid("cybertek", "answer"); // negative test / rainy day scenario
        loginVoid("", "");
        //System.out.println(loginVoid("cybertekStudent", "abc123")); ERROR -VOID - no return value
        System.out.println(login("cybertekStudent","abc123"));

        if (login("cybertekStudent","abc123")){
            System.out.println("Login successful , welcome to Canvas");
            System.out.println("Select the course to continue");
        } else {
            System.out.println("Something wrong with your credentials");
        }
         boolean isLoginSuccess = login("Nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("Nadir", "mountain")) {
            System.out.println("welcome to Canvas , select course or credentials");
        }else{
            System.out.println("Something wrong with your credentials");
        }
    }

    public static void loginVoid(String userName, String password) {


        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login successful , welcome CybertekStudent!!");
        } else {
            System.out.println("Incorrect username or password");
        }

    }

    public static boolean login(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        //return userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword); -->
        // we cna do it by using one line --> short method

        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true; //return true, and exit method here. return false will not run
        }
            return false;
        }
    }


