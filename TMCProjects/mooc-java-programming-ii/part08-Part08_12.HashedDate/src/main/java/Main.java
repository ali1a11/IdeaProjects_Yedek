
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.hashCode());

        SimpleDate d2 = new SimpleDate(31, 7, 2022);
        System.out.println(d2.hashCode());

    }
}
