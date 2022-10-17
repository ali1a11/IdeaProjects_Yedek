package week07_08_26_06_2022;

/*
rowCount: 5
colCount: 5
1
2 "4" 6                         rowCount-1
3 "4" 7 "3" 10                  rowCount-1  rowCount-2
4 "4" 8 "3" 11 "2" 13           rowCount-1  rowCount-2  rowCount-3
5 "4" 9 "3" 12 "2" 14 "1" 15    rowCount-1  rowCount-2  rowCount-3  rowCount-4
 */
// outer loop >rows
// inner loop >columns

public class TaskNestedLoop01 {
    public static void main(String[] args) {
        int rowCount = 5;
        for(int row = 1; row<=rowCount; row++){
            int value = row;
            for(int col = 1; col<=row; col++){
                System.out.print(value + " ");
                value += rowCount - col;
            }
            System.out.println();
        }
    }
}
