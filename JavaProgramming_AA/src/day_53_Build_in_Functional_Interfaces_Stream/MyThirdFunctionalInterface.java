package day_53_Build_in_Functional_Interfaces_Stream;

//2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes
// one argument of any type and returns the same type

@FunctionalInterface
public interface MyThirdFunctionalInterface <T>{
    T method(T data); // default public abstract // return T !!!
}
