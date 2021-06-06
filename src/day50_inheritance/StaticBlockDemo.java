package day50_inheritance;

public class StaticBlockDemo {
    static {
        System.out.println("static initialize block");
    }


    public StaticBlockDemo (){
        System.out.println("Constructor method");
    }
}
