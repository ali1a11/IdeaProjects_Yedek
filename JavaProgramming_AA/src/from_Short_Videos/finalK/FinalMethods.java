package from_Short_Videos.finalK;

public class FinalMethods {
    public final void method(){
        System.out.println("final method cannot be overriden");
    }
}

class B extends FinalMethods{

    /* final method cannot be overriden
    @Override
    public void method(){
        System.out.println("Final method override test");
    }

     */

}