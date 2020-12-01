package Q13;

/**
 * Project: DataStructuresMidterm
 * Package: Q13
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * <p>
 * Q13) Method isIncreasing returns true if in each row of the two-dimensional
 * array, all entries monotonically increase, and in each column all entries
 * also monotonically increase. Implement isIncreasing.
 * <p>
 * public static boolean isIncreasing( int [ ] [ ] arr )
 */
public class Increase {
    public static void main(String[] args) {
        int[][] firstArray = {{1,2,3,4},{5,6,7,8}};
        int[][] secondArray = {{1,2,3,4},{5,6,6,8}};
        int[][] thirdArray = {{1,2,3,4},{5,6,0,9}};
        System.out.println("!!!Monotonically Increasing : true if pattern like {1,2,3} or {1,2,2}, else false!!!");
        printArray(firstArray);
        printArray(secondArray);
        printArray(thirdArray);
    }

    public static boolean isIncreasing(int[][] arr) {
        for (int[] i :arr ) {
            for (int j = 0; j <i.length-1 ; j++) {
                if (i[j]>i[j+1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printArray(int[][] arr){
        System.out.println("Two Dimensional Array:");
        for (int[] i : arr ) {
            for (int j :i ) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("Is the array monotonically increasing?");
        if (isIncreasing(arr)){
            System.out.println("Yes!\n");
        }else{
            System.out.println("No.\n");
        }
    }

}
