package day44_custom_classes;

public class app {
String name = "Motorola";
int version = 9;

public void open() {
    System.out.println("model " + name + " version " + version);
}

} class AppObject {
    public static void main(String[] args) {
        app Application = new app();
        Application.open();
        System.out.println(Application.name);
        System.out.println(Application.version);
    }
}
