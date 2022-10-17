package deneme.D5;

public class GetDuplicates {
    public static void main(String[] args) {

        int count = 0;
        int countDuplicated = 0;
        String duplicated = "";
        String[] arr2 = {"1", "2", "aa", "aa", "7", "7", "2", "aa", "7"};

        for (String each1 : arr2) {

            for (String each2 : arr2) {
                if (each1.equals(each2)) {
                    count++;
                }
            }
            if (count > 1 && !duplicated.contains(each1)) {
                duplicated += each1;
                countDuplicated += count;
            }
            count = 0;
        }

        System.out.println("duplicated = " + duplicated);
        System.out.println("countDuplicated = " + countDuplicated);
    }
}
