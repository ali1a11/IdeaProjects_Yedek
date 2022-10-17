package day_40_Protected_Access_Modifier_Final;

public final class Cat extends Animal{ // Cat class cannot inherit Dog class because Dog class is final class
    // Also Cat class cannot be inherited because it is final class

    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
}
