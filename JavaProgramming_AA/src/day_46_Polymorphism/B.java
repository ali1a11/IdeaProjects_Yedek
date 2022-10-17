package day_46_Polymorphism;

public interface B {
    default void Bmethod1(){
        System.out.println("public void Bmethod1()");
    }

    public static void Bmethod2(){
        System.out.println("public static void Bmethod2");
    }

    void Bmethod3();



}
