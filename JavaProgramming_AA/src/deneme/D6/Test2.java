package deneme.D6;

public class Test2 {
    public static void main(String[] args) {
        
        /*
        int a = 0;
        do{
            a = a++ + --a -(a%3);
        } while (++a<4);

        System.out.println("a = " + a);
        
         */



        byte[] b = new byte[5];
        for (int i = 0; i < b.length; i++) {
            b[i] =(byte)(b[i]*2);
        }

        System.out.println(b);
        
        
    }
}
