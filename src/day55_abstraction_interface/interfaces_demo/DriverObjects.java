package day55_abstraction_interface.interfaces_demo;

public class DriverObjects {
    public static void main(String[] args) {
       // WebDriver driver3 = new WebDriver(); Error : cannot create object of interface
        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();
       // WebDriver driver2 =new ChromeDriver();

        driver1.get("https://www.google.com");
        driver1.findElement("//input[@name='q']");
        System.out.println("title = spoon");
    }
}
