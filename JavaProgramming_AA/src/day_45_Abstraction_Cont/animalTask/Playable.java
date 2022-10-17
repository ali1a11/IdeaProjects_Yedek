package day_45_Abstraction_Cont.animalTask;

public interface Playable {

    // no static block in interface

    boolean isFriendly = true; // noo need to write static

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    void play(); // no need to write public abstract // abstract by default



}
