package week12_06_2022;

public class Check {
    public static void main(String[] args) {

        boolean check = true;

        for (int i = 0; check; i+=10) {
            System.out.print( i + " ");
            if (i == 1000) {
                check = false;
            }

        }

    }
}
