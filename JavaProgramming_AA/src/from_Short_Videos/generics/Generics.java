package from_Short_Videos.generics;

import java.util.List;


// class also be generic


public class Generics <T> {

    // prints elements of array no matter variable type (it should be nonPrimitive)
    public void printEach(T[] array) {

        for (T each : array) {
            System.out.println(each);
        }

    }

    //
    public void printEach(List<T> list) {

        for (T each : list) {
            System.out.println(each);
        }

    }

}

/*
public class Generics {

    // prints elements of array no matter variable type (it should be nonPrimitive)
    public static <T> void printEach(T[] array){

        for (T each : array) {
            System.out.println(each);
        }

    }

    //
    public static <T> void printEach(List<T> list){

        for (T each : list) {
            System.out.println(each);
        }

    }

}


 */