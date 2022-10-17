package day_15_ForLoop;
/*
	2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */


public class ReplaceX {
    public static void main(String[] args) {
        String str = "xcodeX";

        String result = str.replace("x","a").replace("X","a"); // replace method are called two times

        System.out.println("result = " + result);







    }
}
