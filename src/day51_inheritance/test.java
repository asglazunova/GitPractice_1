package day51_inheritance;

public class test {
  static int a;
  int b;

    public static void main(String[] args) {
        test obj1 = new test();
        obj1.b = 10;
        obj1.a=20;

        test obj2 = new test();
        obj2.b = 30;
        obj2.a = 40;
        System.out.println( obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }
    }


