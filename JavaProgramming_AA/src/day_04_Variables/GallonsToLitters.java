package day_04_Variables;
/*
	5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
							1000
							10000

 */

public class GallonsToLitters {
    public static void main(String[] args) {
        int gallon = 1000;
        double total_Litters = 3.79 * gallon;
        System.out.println("gallon = " + gallon);
        System.out.println("total_Litters = " + total_Litters);

        System.out.println(gallon + " gallon " + total_Litters + " litreye esittir.");
    }

}

