package from_Short_Videos.OOP_abstraction_interface;

interface C {

}

interface B {

}

interface A1 extends B, C { // interface can extend more than one interface

}

abstract class X1{

}

class Y extends X1 { // a class can extend only one class

}

// only class use implement

class Z implements B, C {

}


public class Extends_vs_Implements extends X1 implements B, C {
}
