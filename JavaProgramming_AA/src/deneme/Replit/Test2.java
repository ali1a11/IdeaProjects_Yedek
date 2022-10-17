package deneme.Replit;

import java.util.*;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int[] reverse = new int[nums.length];

        for(int i = nums.length-1, j = 0; i>=0; i--, j++){
            reverse[j] = nums[i];
        }



        //Do not change below statement:
        System.out.println(Arrays.toString(reverse));

    }

}
