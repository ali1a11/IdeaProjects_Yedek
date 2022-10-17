package week_18_04_09_2022.polymorphismDemo;

public class WebElementUtility {

    // we also have polymorphism used here
    public static void clickElement(WebElement element){
        System.out.println("Clicking on the element");
        element.click(); // object referance decides which method is reachable
    }

    public static WebElement getLinkWithText (String text){
        System.out.println("searching for a link with txt " + text);
        return new Links();
    }
}
