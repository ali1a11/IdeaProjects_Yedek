package week_18_04_09_2022.polymorphismDemo;

public class InputFields implements WebElement{
    @Override
    public void click() {
        System.out.println("clicking the input field");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println("");
    }

    @Override
    public String getText() {
        return "Input field";
    }
}
