package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

public class Constructor_vs_StaticBlock {
    static {
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock() {
        System.out.println("Constructor");
    // execution of the constructor depends on object
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

    }
}
