package week_18_04_09_2022.polymorphismDemo;

public class ElementsTest {
    public static void main(String[] args) {

        Links links = new Links();

        links.click();
        links.getText();
        links.sendKeys("EU9");
        links.getLinkHref();

        InputFields inputFields1 = new InputFields();
        inputFields1.getText();

        WebElement links2 = new Links();
        ((Links)links2).getLinkHref(); // downcasting


    }
}
