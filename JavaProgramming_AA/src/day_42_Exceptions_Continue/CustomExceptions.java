package day_42_Exceptions_Continue;

class FadyException extends RuntimeException{  // custom unchecked exception
    public FadyException(String message){

        super(message);

    }

    public FadyException(){
        System.out.println("There is a FadyException");
    }
}

class NoBreakException extends Exception{ // custom checked exception

}

public class CustomExceptions {
    public static void main(String[] args) {
        // throw new FadyException(); //throw new FadyException("There is a FadyException");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();//throw new RuntimeException(e);
        }


    }
}
