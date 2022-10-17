package day_45_Abstraction_Cont;

class C{

}
class A{

}

class B extends A{ // no multiple inheritance from class

}

interface X {

}

interface Y {

}

interface Z extends X, Y{ // multiple inheritance between interfaces

}


class D implements X, Y, Z {

}

// interface cannot inherit from class

public class Extends_vs_Implements extends A implements X, Y, Z{
}
