package day_20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i = 'a', j = 0; i <= 'z' && j < letters.length; i++, j++) { // letters.length = 26
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters)); //[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]

        //

        char[] letters2 = new char[26];

        for (int i = 0, j = 'A'; i < letters2.length && j <= 'Z'; i++, j++) {
            letters2[i] = (char) j;
        }
        System.out.println(Arrays.toString(letters2)); //[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

        //

        char[] letters3 = new char[26];
        char ch = 'a';

        for (int i = 0; i < letters3.length ; i++) {
            letters3[i] = ch++;
        }
        System.out.println(Arrays.toString(letters3)); //[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]

        //

        char[] letters4 = new char[26];
        char ch1 = 'A';

        for (int i = 0; i < letters4.length; i++, ch1++) {
            letters4[i] = ch1;
        }
        System.out.println(Arrays.toString(letters4)); //[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

        //

        char[] letters5 = new char[26];
        char ch2 = 'Z';

        for (int i = 0; i < letters2.length ; i++) { //[Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]
            letters5[i] = ch2;
            ch2--;
        }
        System.out.println(Arrays.toString(letters5));


    }
}
