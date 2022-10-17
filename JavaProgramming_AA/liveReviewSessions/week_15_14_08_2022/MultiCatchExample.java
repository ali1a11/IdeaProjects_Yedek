package week_15_14_08_2022;

public class MultiCatchExample {
    public static void main(String[] args) {

        String word = "Java";

        word = null;

        try{
            System.out.println(word.substring(20));
        } catch (StringIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e){
            System.out.println(e.getClass().getSimpleName());
        }

        System.out.println("++++++++++++++++++++++");


    }
}
