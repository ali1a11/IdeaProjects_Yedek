package week24_07_2022.fieldTypes;

public class LocalvsInstance {
    public int a = 10; // instance variable -- belongs to the obj created from this class

    public void showDifferences() {
        int a = 5; // local variable
        System.out.println(a);
    }

    public void showDifferences(int num){
        a = num;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalvsInstance obj = new LocalvsInstance();
        System.out.println("Obj "+ obj.a);
        obj.showDifferences();

        obj.a = 1;
        System.out.println("Obj "+ obj.a);

        obj.showDifferences(9);


    }
}
