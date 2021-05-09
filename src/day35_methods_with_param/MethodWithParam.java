package day35_methods_with_param;

public class MethodWithParam {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(99);
        int count = 55;
        displayValue(count);
        greetByName ("Anna");
        greetByName("Saim");
        String name = "Zenya";
        greetByName(name);
    }
        public static void displayValue (int num){
            System.out.println(" Value num = " + num);

        }
        public static void greetByName (String name){
            System.out.println("Hello " + name + " , how are you today ?");
        }
    }
