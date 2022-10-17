package deneme.MOOC_10.recap;

public class String_Builder {
    public static void main(String[] args) {

        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < 10; i++) {

            numbers.append(i+" ");

        }

        System.out.println(numbers.toString());

    }
}
