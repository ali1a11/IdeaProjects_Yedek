package week07_08_26_06_2022;

import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {

        int [] nums = {5, 4, 10, 100, 50, 35};

        int [] nums2 = nums;

        // the real object that holds space in memory is {5, 4, 10, 100, 50, 35};
        // nums and nums2 are just reference to the same object
        // There is one object with two references to same object

        // Arrays.equals(nums, nums2));

        System.out.println("nums.equals(nums2) " + Arrays.equals(nums, nums2)); // true
        System.out.println("nums == nums2 "+ (nums == nums2)); // true

        int [] nums3 = {5, 4, 10, 100, 50, 35}; // num3 is different object with same values
        System.out.println("nums.equals(nums3) " + Arrays.equals(nums, nums2)); // true
        System.out.println("nums == nums3 "+ (nums == nums3)); // false

        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums)); // [4, 5, 10, 35, 50, 100] // nums is also sorted

        nums[0] = 1000;

        System.out.println("nums2[0]: "+ nums2[0]);

        // want to create a copy of num3, however I want it to be a different object

        int[] nums4 = Arrays.copyOf(nums3, nums3.length);

        System.out.println(Arrays.toString(nums4));

        Arrays.sort(nums3);

        System.out.println("Arrays.toString(nums3):" + Arrays.toString(nums3));
        System.out.println("Arrays.toString(nums4):" + Arrays.toString(nums4));


    }
}
