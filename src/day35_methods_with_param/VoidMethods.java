package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        for ( int i = 1 ; i < 10; i++){
            printAtoZ();
        }

        displayUSAFlag();

        //System.out.println("-----------FLAG OF USA------------");
        displayUSAFlag();

    }

        public static void printAtoZ(){
            for ( char i = 'A' ; i <= 'Z'; i++){
                System.out.print(i + " ");


                //System.out.println("A B C D E F G H I K L M N O P Q R S T V X Y Z");
            }
            System.out.println();
        }
        public static void displayUSAFlag(){
            System.out.println("-----------FLAG OF USA------------");
                String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
                String p2 = "==============================================";
                for (int i = 0; i < 4; i++) {
                    System.out.println(p1);
                }
                System.out.println("* * * * * * ==================================");
                for (int i = 0; i < 6; i++) {
                    System.out.println(p2);
                }
            }
        }


