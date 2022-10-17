package day_46_Polymorphism;




public class MultiClass extends A implements B{

    public static void main(String[] args) {

        A a = new A();
        a.Amethod1();

        A.Amethod2();

        System.out.println("-----------------------------");


        B.Bmethod2();

        MultiClass multiClass = new MultiClass();

        multiClass.Amethod1();
        multiClass.Bmethod1();
        multiClass.Bmethod3();


    }

    @Override
    public void Bmethod1() {
        B.super.Bmethod1();
    }

    @Override
    public void Bmethod3() {
        System.out.println("Overriden Bmethod3()");
    }
}
