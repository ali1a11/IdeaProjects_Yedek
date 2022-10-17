package deneme.MOOC7.Clock_OOP;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();

        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }
}
