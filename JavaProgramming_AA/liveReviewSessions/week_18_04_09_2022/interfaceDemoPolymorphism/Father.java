package week_18_04_09_2022.interfaceDemoPolymorphism;

public class Father extends Parent implements Worker{
    @Override
    public void raiseKid() {
        System.out.println("Dad raising kid");
    }

    @Override
    public void playWithKid() {
        System.out.println("Dad playing with kid");

    }

    @Override
    public void feedKid() {
        System.out.println("Dad feeding children");
    }

    @Override
    public void work(String work) {
        System.out.println("Dad working as " + work);
    }

    @Override
    public double getPaid() {
        return 100000.89;
    }
}
