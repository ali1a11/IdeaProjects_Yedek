package deneme.D5;

public class ArrayDeneme {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 5, 2};

/*
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }
            System.out.println(arr1[i] + " count= " + count);
            count = 0;
        }
*/
        int count = 0;
        int count2 = 0;
        int countDuplicated = 0;
        String Removeduplicates = "";
        String duplicated = "";
        String[] arr2 = {"1","g","aabb","7","7","2","aa","7"};

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr2[i].equals(arr2[j])) {

                    count2++;

                }

                if (!Removeduplicates.contains(arr2[i])) {

                    Removeduplicates += arr2[i];
                    count++;
                }
            }
            if (count2 > 1 && !duplicated.contains(arr2[i])) {
                duplicated += arr2[i];
                countDuplicated += count2;
            }
            System.out.println("count2 = " + count2);
            count2 = 0;

        }

        System.out.println("Removeduplicates = " + Removeduplicates);
        System.out.println("duplicated = " + duplicated);
        System.out.println("countDuplicated = " + countDuplicated);

    }
}

