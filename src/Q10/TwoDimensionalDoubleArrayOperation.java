package Q10;

import java.util.Arrays;

/**
 * Project: DataStructuresMidterm
 * Package: Q10
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/30/2020
 * <p>
 * Q10) Implement the following methods, that accept a two-dimensional
 * array of double and return the sum, average, and mode (most common
 * item) in the two-dimensional array.
 * <p>
 * public static double sum( double [ ][ ] arr )
 * public static double average( double [ ][ ] arr )
 * public static double mode( double [ ][ ] arr )
 */
public class TwoDimensionalDoubleArrayOperation {
    /**
     * This is the main function which makes use of sum, average and mode methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        double sum, average, mode;
        double[][] arr = {{1.6, 4.2, 2.4, 2.4, 3.2, 1, 2.4, 4.2},
                {4.2, 2.4, 4.2, 1.6, 1.6, 1.8},
                {1, 3, 2.4, 2.6, 2.4, 1.8, 4.2, 4.2, 4.2}};

        System.out.println("The array:");
        for (double[] doubles : arr) {
            for (int j = 0; j < doubles.length; j++) {
                if (j == doubles.length - 1) {
                    System.out.printf("%.2f", doubles[j]);
                    System.out.println();
                } else {
                    System.out.printf("%.2f ", doubles[j]);
                }
            }
        }
        sum = sum(arr);
        average = average(arr);
        mode = mode(arr);

        System.out.printf("\n%s \t= %.2f\n%s = %.2f\n%s \t= %.2f", "Sum of each elements of array", sum,
                "Average of each elements of arr", average, "Mode of each elements of arr", mode);
    }

    /**
     * This method will take two dimensional double array and return the sum of each elements.
     *
     * @param arr This is the two dimensional double array.
     * @return double This is the sum of each elements of arr.
     */
    public static double sum(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    /**
     * This method will take two dimensional double array and return the average of each elements.
     *
     * @param arr This is the two dimensional double array.
     * @return double This is the average of each elements of arr.
     */
    public static double average(double[][] arr) {
        int len = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                len++;
            }
        }
        return sum / len; //We could do sum(arr)/len, but it will be slower.
    }

    /**
     * This method will take two dimensional double array , convert it to one dimensional
     * array and return the mode of each elements.
     *
     * @param arr This is the two dimensional double array.
     * @return double This is the mode of arr.
     */
    public static double mode(double[][] arr) {
        // arr.length will give you the row count, arr[0].length will give you column count
        double[] oneDimensionalDoubleArray = new double[arr.length * arr[0].length];

        for (int i = 0; i < arr.length; i++) { // Copy process. Two dimension to one dimension array
            for (int j = 0, aLength = arr[i].length; j < aLength; j++) {
                oneDimensionalDoubleArray[i] = arr[i][j];
            }
        }

        double mode = oneDimensionalDoubleArray[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) { // Counting process of which elements how many times repeated
                    count++;
                }
            }
            if (count > maxCount) { // Process of finding max repeated number which is mode of arr
                maxCount = count;
                mode = oneDimensionalDoubleArray[i];
            }
        }
        return mode;
    }
}
