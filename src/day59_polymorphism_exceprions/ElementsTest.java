package day59_polymorphism_exceprions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt );
        //loginLink.getLinkHref(); ERROR

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);
       // WebElementUtil.clickElement(new String("Hello")); String is not child of WebElement

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();
    }
}
