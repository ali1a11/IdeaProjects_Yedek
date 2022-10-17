package week07_08_26_06_2022;

public class WhileHungry {
    public static void main(String[] args) {
        int bananasEaten = 0;
        int countToFull = 3;

        while(true){
            if(bananasEaten==countToFull){
                System.out.println("Full");
                System.out.println("Number of bananas eaten: " + countToFull);
                break;
            }
            bananasEaten++;
        }
    }
}
