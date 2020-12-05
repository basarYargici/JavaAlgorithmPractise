package Q17;

/**
 * Project: DataStructuresMidterm
 * Package: Q17
 * <p>
 *
 * @author Ibrahim Basar YARGICI* Date 12/1/2020
 * <p>
 * Q17) Suppose you would like to print a two dimensional array in which all
 * numbers are between 0 and 999. The normal way of outputting each
 * number might leave the array misaligned.
 * <p>
 * For instance:
 * 54  4 12  366 512
 * 756 192 18  27  4
 * 14  18 99  300 18
 * <p>
 * Examine the documentation for the format method in the String class
 * and write a routine that outputs the two-dimensional array in a nicer
 * format, such as
 *  54   4 12 366 512
 * 756 192 18  27   4
 *  14  18 99 300  18
 */
public class Format {
    /**
     * This is the main function which makes use of crateRandomizeArray and printArray methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        int[][] randomArray = createRandomizeArray(4, 4, 0, 999);
        printArray(randomArray);
    }

    /**
     * This function prints the function in formatted way.
     *
     * @param twoDimensionalArray This is the array wh,ch will be printed.
     */
    public static void printArray(int[][] twoDimensionalArray) {
        System.out.println("Before formatting:");
        for (int[] i : twoDimensionalArray) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nAfter formatting:");
        for (int[] i : twoDimensionalArray) {
            for (int j = 0; j < i.length; j++) {
                //All numbers will have 4 empty space to be printed, - means start printing from left,
                //unsigned means start printing from right.
                System.out.format("%4d", i[j]);
            }
            System.out.println();
        }
    }

    /**
     * This method creates two dimensional randomized array with specified row, column counts and smallest, biggest elements.
     * @param rowCount This is the row count of two dimensional array.
     * @param columnCount This is the column count of two dimensional array.
     * @param smallestValue This is the smallest value of two dimensional array.
     * @param biggestValue This is the biggest value of two dimensional array.
     * @return int[][] This is the randomized array with rowCount x columnCount size.
     */
    public static int[][] createRandomizeArray(int rowCount, int columnCount, int smallestValue, int biggestValue) {
        int[][] twoDimensionalArray = new int[rowCount][columnCount];
        int range = biggestValue - smallestValue + 1;

        for (int[] i : twoDimensionalArray) {
            for (int j = 0; j < i.length; j++) {
                //Math.random() returns between 0.0 and 1.0 which are double.
                int rand = (int) (Math.random() * range) + smallestValue;
                i[j] = rand;
            }
        }
        return twoDimensionalArray;
    }
}
