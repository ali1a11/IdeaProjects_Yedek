package deneme.D6;

class Main {



    public static void printHollowRect(){
        // write your codes here
        for (int i=0; i<5; i++){
            for (int j =0; j<5; j++){
                if (i ==0 || i== 4){
                    System.out.print("*");
                } else {
                    if (j ==0 || j== 4){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }



    }

    public static void main(String[] args) {
        printHollowRect();
    }

}