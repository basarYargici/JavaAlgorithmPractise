package Q13;

/**
 * Project: DataStructuresMidterm
 * Package: Q13
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/30/2020
 * <p>
 * Q13) Method isIncreasing returns true if in each row of the two-dimensional
 * array, all entries monotonically increase, and in each column all entries
 * also monotonically increase. Implement isIncreasing.
 * <p>
 * public static boolean isIncreasing( int [ ] [ ] arr )
 */
public class Increase {
    /**
     * This is the main function which makes use isIncreasing and printArray methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        int[][] firstArray = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] secondArray = {{1, 2, 3, 4}, {5, 6, 6, 8}};
        int[][] thirdArray = {{1, 2, 3, 4}, {5, 6, 0, 9}};
        System.out.println("!!!Monotonically Increasing : true if pattern like {1,2,3} or {1,2,2}, else false!!!");
        printArray(firstArray);
        printArray(secondArray);
        printArray(thirdArray);
    }

    /**
     * This method will take two dimensional boolean array and return true if elements are monotonically increasing.
     *
     * @param arr This is the two dimensional boolean array.
     * @return boolean true if elements of arr is monotonically increasing, else false.
     */
    public static boolean isIncreasing(int[][] arr) {
        for (int[] i : arr) {
            for (int j = 0; j < i.length - 1; j++) {
                if (i[j] > i[j + 1]) { // This is fully searching in i[].
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * This method will take two dimensional int array and print it. If the array monotonically increasing,
     * it will print yes, otherwise false.
     *
     * @param arr This is the one dimensional int array.
     */
    public static void printArray(int[][] arr) {
        System.out.println("Two Dimensional Array:");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("Is the array monotonically increasing?");
        if (isIncreasing(arr)) {
            System.out.println("Yes!\n");
        } else {
            System.out.println("No.\n");
        }
    }

}
