package deneme.MOOC_12.typeParameters;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Locker<String> string = new Locker<>();
        string.setValue(":)");

        System.out.println(string.getValue());

        System.out.println("-----------------------------------------");

        Locker<Integer> integerLocker = new Locker<>();

        integerLocker.setValue(11);

        System.out.println(integerLocker.getValue());

        System.out.println("-----------------------------------------");

        Locker<Random> random = new Locker<>();
        random.setValue(new Random());

        System.out.println(random.getValue().nextDouble());


        System.out.println("-----------------------------------------");

        Pair<Integer, String> pair = new Pair<>();
        pair.setValues(101, "Second");

        System.out.println("pair.getFirst() = " + pair.getFirst());
        System.out.println("pair.getSecond() = " + pair.getSecond());

        System.out.println("-----------------------------------------");
        Info<String, Integer> i1 = new Info<>("Pow", 3);
        Info<Object, Object> i2 = new Info<>("Hey", i1);
        System.out.println(i1);
        System.out.println(i2);

    }
}
