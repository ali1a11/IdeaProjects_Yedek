package week03_22_05_2022;

public class LogicalOperators {
    public static void main(String[] args) {
        int apples =20;
        int oranges = 30;
        int pears = 30;

        boolean comp = apples<oranges|| oranges>=pears;
        System.out.println("comp = " + comp);

        boolean comp2 = apples<oranges|| --oranges>=pears; //eger birinci staement true ise digerini kontrol etmiyor Nu nedenle --oranges islemiini yapmiyor
        System.out.println("comp = " + comp);
        System.out.println("oranges = " + oranges);

        boolean comp3 = apples>oranges|| --oranges>=pears; // first statement is not true therefore it check the other side
        System.out.println("comp = " + comp);
        System.out.println("oranges = " + oranges);

        boolean comp4 = apples>oranges && --oranges>=pears; // && ise first statement is not true therefore it does not check the other side
        System.out.println("comp = " + comp);
        System.out.println("oranges = " + oranges);


    }
}
