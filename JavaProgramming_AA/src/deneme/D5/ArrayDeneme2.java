package deneme.D5;

public class ArrayDeneme2 {
    public static void main(String[] args) {

        int count = 0;
        int countDuplicated = 0;
        String duplicated = "";
        String[] arr2 = {"1","2","aa", "aa", "7","7","2","aa","7"};

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr2[i].equals(arr2[j])) {
                    count++;
                }
            }
            if (count > 1 && !duplicated.contains(arr2[i])) {
                duplicated += arr2[i];
                countDuplicated += count;
            }
            count = 0;

        }
        System.out.println("duplicated = " + duplicated);
        System.out.println("countDuplicated = " + countDuplicated);
    }
}
