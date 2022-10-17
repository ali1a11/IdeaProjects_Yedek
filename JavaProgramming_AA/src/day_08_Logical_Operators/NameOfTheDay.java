package day_08_Logical_Operators;

public class NameOfTheDay {
    public static void main(String[] args) {

        int number =7;
        boolean birMi = number ==1;
        boolean ikiMi = number ==2;
        boolean ucMu = number ==3;
        boolean dortMu = number ==4;
        boolean besMi = number ==5;
        boolean altiMi = number ==6;
        boolean yediMi = number ==7;

        if (birMi){
            System.out.println("Pazartesi");
        }
        if (ikiMi){
            System.out.println("Sali");
        }
        if (ucMu){
            System.out.println("Carsamba");
        }
        if (dortMu){
            System.out.println("Persembe");
        }
        if (besMi){
            System.out.println("Cuma");
        }
        if (altiMi){
            System.out.println("Cumartesi");
        }
        if (yediMi){
            System.out.println("Pazar");
        }

    }
}
