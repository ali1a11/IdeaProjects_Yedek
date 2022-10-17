package week_18_04_09_2022.polymorphismDemo;

public class Links implements WebElement {

    public void getLinkHref(){
        System.out.println("http://www.eee.com");
    }


    @Override
    public void click() {
        System.out.println("Clicking the link");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println("Unsupported action");
    }

    @Override
    public String getText() {
        System.out.println("Getting link text");
        return "Oracke Java";
    }
}
