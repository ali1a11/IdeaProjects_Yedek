package week_18_04_09_2022.interfaceDemoPolymorphism;

public class Mother extends Parent{
    @Override
    public void raiseKid() {
        System.out.println("Mom raising kid");
    }

    @Override
    public void playWithKid() {
        System.out.println("Mom playing with kid");
    }

    @Override
    public void feedKid() {
        System.out.println("Mom feeding kid");
    }
}
