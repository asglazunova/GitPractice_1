package day55_abstraction_interface.interfaces_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigation to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quitting the driver ");
    }

    @Override
    public String getTitle() {
        return "Wooden spoon title";
    }
}
