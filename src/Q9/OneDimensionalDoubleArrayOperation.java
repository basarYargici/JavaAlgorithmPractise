package Q9;

import java.util.Arrays;

/**
 * Project: DataStructuresMidterm
 * Package: Q9
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/30/2020
 * <p>
 * Q9) Implement the following methods, that accept an array of double and
 * return the sum, average, and mode (most common item) in the array.
 * <p>
 * public static double sum( double [ ] arr )
 * public static double average( double [ ] arr )
 * public static double mode( double [ ] arr )
 */
public class OneDimensionalDoubleArrayOperation {
    /**
     * This is the main function which makes use of sum, average and mode methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        double sum, average, mode;
        double[] arr = {9.58, 1, 5, 2.4, 4.2, 9.58, 0, 1.65, 7};
        System.out.print("The elements of arr :");
        for (double d :arr ) {
            System.out.print(" "+d);
        }
        sum = sum(arr);
        average = average(arr);
        mode = mode(arr);
        System.out.printf("\n%s \t= %.2f\n%s = %.2f\n%s \t= %.2f", "Sum", sum, "Average", average, "Mode", mode);
    }

    /**
     * This method will take double array and return the sum of each elements.
     *
     * @param arr This is the double array.
     * @return double This is the sum of each elements of arr.
     */
    public static double sum(double[] arr) {
        double sum = 0;
        for (double element : arr) {
            sum += element;
        }
        return sum;
    }

    /**
     * This method will take double array and return the average of each elements.
     *
     * @param arr This is the double array.
     * @return double This is the average of each elements of arr.
     */
    public static double average(double[] arr) {
        double sum = sum(arr);
        return sum / arr.length;
    }

    /**
     * This method will take double array and return the mode of each elements.
     *
     * @param arr This is the double array.
     * @return double This is the mode of arr.
     */
    public static double mode(double[] arr) {
        double maxValue = arr[0];
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
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}


