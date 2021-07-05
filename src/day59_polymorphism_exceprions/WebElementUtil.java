package day59_polymorphism_exceprions;

public class WebElementUtil {

    /**
     * method with polymorphic parameter
     * @param WebElement element and can accept any child class object
     *                   link Link , InputField etc
     *                   clickElement (new Link());
     *                   clickElement (new InputField());
     *                   WebElement element = new Link();
     *                   WebElement element - new InputField();
     *
     */
    public static void clickElement(WebElement element){
        System.out.println("Clicking on Element");
        element.click();

    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Serching for a link with txt = " + txt);
        return new Link();
    }
}
