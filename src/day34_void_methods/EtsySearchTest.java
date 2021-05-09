package day34_void_methods;


public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("___Starting Etsy search smoke testing ___ ");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

        System.out.println("___ Etsy Search Smoke Test completed pass ___ ");
    } public static void openBrowser() {
        System.out.println("Launching Chrome browser");

    }public static void navigateToEtsyUrl() {
        System.out.println("Navigating to https://www.etsy.com");

    }public static void searchForWoodenSpoon() {
        System.out.println("PASS : Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search fiels and click search ");
    }public static void verifyResultsAreDisplayed() {
        System.out.println("PASS : search result are successfully displayed");
        System.out.println("Result will be displaying in your screen ");
    }
}
