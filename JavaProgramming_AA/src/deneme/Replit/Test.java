package deneme.Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    //create your method below
    public static String search(ArrayList<String> r, String find) {
//
        String result = "";
        for (String each : r) {
            if(each.contains(find)|| each.equalsIgnoreCase(find)){
                result = each;
            } else {
                result = "search failed";
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        //in.nextLine();
        String find = in.next();
        in.close();

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i < size; i++) {
            Scanner scan = new Scanner(System.in);

            list.add(scan.nextLine());
            System.out.println("list" + list);
        }
        System.out.println(search(list, find));

    }
}
