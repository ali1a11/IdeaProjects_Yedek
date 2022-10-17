package week_18_04_09_2022.interfaceDemoPolymorphism;

public class Test {
    public static void main(String[] args) {

        Father father1 = new Father();

        father1.work("SDET");
        father1.getPaid();

        System.out.println("Makes " + father1.getPaid());

        //polymorphism
        Parent father2 = new Father();
        father2.feedKid();
        father2.playWithKid();
        father2.raiseKid();
        ((Father) father2).work("QA"); // downcasting

        //polymorphism
        Worker father3 = new Father();
        father3.getPaid();
        father3.work("developer");
        ((Father)father3).playWithKid(); // downcasting

        //
        father2 = new Mother(); // now our object reference can point to another object from the faily
        father2.playWithKid();

        //polymorphism
        Parent father4 = new SuperFather();
        father4.playWithKid();



    }
}
